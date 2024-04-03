package com.LibraryManagementSystem.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LibraryManagementSystem.DTO.Books_DTO_Request;
import com.LibraryManagementSystem.Entity.Books;
import com.LibraryManagementSystem.Service.BookService;

@RestController
@RequestMapping("/api")
public class BooksController {
	private final BookService bookservice;

	public BooksController(BookService bookservice) {
		this.bookservice = bookservice;
	}

	@GetMapping("/books")
	public List<Books> getBooks() {
		return bookservice.FindAllBooks();
	}

	@GetMapping("/books/{id}")
	public Books getBook(@PathVariable("id") int id) {
		Books book = bookservice.FindBook(id);
		if (book != null) {
			return book;
		}
		return null;
	}
	
	@PostMapping("/books")
	public String NewBook(@RequestBody Books_DTO_Request book) {
		if (book != null) {
			bookservice.NewBook(book);
		}else {return  "this data equal null";}
		return "done" ;
	}

	@PutMapping("/books")
	public String UpdateBook(@RequestBody Books_DTO_Request book) {
		if (book!=null) {
			bookservice.UpdateBook(book);
		} else {
			return "this data equal null";
		}
		return "done";
	}

	@DeleteMapping("/books/{id}")
	public String DeleteBook(@PathVariable("id") int id) {
		bookservice.DeleteBook(id);
		return "done";
	}

}
