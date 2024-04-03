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

import com.LibraryManagementSystem.DTO.Patrons_DTO_Request;
import com.LibraryManagementSystem.Entity.Patrons;
import com.LibraryManagementSystem.Service.PatronService;

@RestController
@RequestMapping("/api")
public class PatronsController {
	private final PatronService patronservice;

	public PatronsController(PatronService patronservice) {
		this.patronservice = patronservice;
	}

	@GetMapping("/patrons")
	public List<Patrons> getPatrons() {
		return patronservice.FindAllPatrons();
	}

	@GetMapping("/patrons/{id}")
	public Patrons getPatron(@PathVariable("id") int id) {
		Patrons patron = patronservice.FindPatron(id);
		if (patron != null) {
			return patron;
		}
		return null;

	}
	
	@PostMapping("/patrons")
	public String NewBook(@RequestBody Patrons_DTO_Request patron) {
		if (patron != null) {
			patronservice.NewPatron(patron);
		}else {return  "this data equal null";}
		return "done" ;
	}

	@PutMapping("/patrons")
	public String UpdatePatron(@RequestBody Patrons_DTO_Request patron) {
		if (patron != null) {
			patronservice.Updatepatron(patron);
		} else {
			return "this data equal null";
		}

		return "done";
	}

	@DeleteMapping("/patrons/{id}")
	public String DeletePatron(@PathVariable("id") int id) {
		patronservice.DeletePatron(id);
		return "done";
	}

}
