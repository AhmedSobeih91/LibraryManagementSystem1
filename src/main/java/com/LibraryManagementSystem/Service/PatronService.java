package com.LibraryManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.LibraryManagementSystem.DTO.Patrons_DTO_Request;
import com.LibraryManagementSystem.Entity.Patrons;
import com.LibraryManagementSystem.Repository.PatronRepository;

import jakarta.transaction.Transactional;

@Service
public class PatronService {

	private final PatronRepository PatronRepo;

	public PatronService(PatronRepository PatronRepo) {

		this.PatronRepo = PatronRepo;
	}

	public List<Patrons> FindAllPatrons() {

		List<Patrons> patrons = PatronRepo.findAll();
		return patrons;
	}

	public Patrons FindPatron(int id) {
		Optional<Patrons> patron = PatronRepo.findById(id);
		Patrons PT = null;
		if (patron.isPresent()) {
			PT = patron.get();
		}
		return PT;
	}

	@Transactional
	public void NewPatron(Patrons_DTO_Request DtoRequest) {
		Patrons patrons = new Patrons();
		patrons.setName(DtoRequest.getName());
		patrons.setContact_Info(DtoRequest.getContact_Info());
		PatronRepo.save(patrons);
	}

	@Transactional
	public void Updatepatron(Patrons_DTO_Request DtoRequest) {
		Patrons patrons = new Patrons();
		patrons.setID(DtoRequest.getID());
		patrons.setName(DtoRequest.getName());
		patrons.setContact_Info(DtoRequest.getContact_Info());
		PatronRepo.save(patrons);
	}

	@Transactional
	public void DeletePatron(int id) {
		Patrons patron = FindPatron(id);
		PatronRepo.delete(patron);
	}

}
