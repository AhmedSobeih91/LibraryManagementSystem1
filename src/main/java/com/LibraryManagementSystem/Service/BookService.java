package com.LibraryManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.LibraryManagementSystem.DTO.Books_DTO_Request;
import com.LibraryManagementSystem.Entity.Books;
import com.LibraryManagementSystem.Repository.BookRepository;

import jakarta.transaction.Transactional;

@Service
public class BookService {

	private final BookRepository bookRepo;

	public BookService(BookRepository bookRepo) {

		this.bookRepo = bookRepo;
	}

	public List<Books> FindAllBooks() {

		List<Books> books = bookRepo.findAll();
		return books;
	}

	public Books FindBook(int id) {
		Optional<Books> book = bookRepo.findById(id);
		Books BK = null;
		if (book.isPresent()) {
			BK = book.get();
		}
		return BK;
	}

	@Transactional
	public void NewBook(Books_DTO_Request DtoRequest) {
		Books books = new Books();
		books.setTitle(DtoRequest.getTitle());
		books.setAuthor(DtoRequest.getAuthor());
		books.setPublication_Year(DtoRequest.getPublication_Year());
		bookRepo.save(books);
	}

	@Transactional
	public void UpdateBook(Books_DTO_Request DtoRequest) {
		Books books = new Books();
		books.setID(DtoRequest.getID());
		books.setTitle(DtoRequest.getTitle());
		books.setAuthor(DtoRequest.getAuthor());
		books.setPublication_Year(DtoRequest.getPublication_Year());
		bookRepo.save(books);
	}

	@Transactional
	public void DeleteBook(int id) {
		Books book = FindBook(id);
		bookRepo.delete(book);
	}

}
