package com.LibraryManagementSystem.Controllers;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LibraryManagementSystem.Service.BorrowingService;

@RestController
@RequestMapping("/api")
public class RorrowController {
	private final BorrowingService borrowservice;

	public RorrowController(BorrowingService borrowservice) {
		this.borrowservice = borrowservice;
	}

	@PostMapping("/borrow/{bookid}/patron/{patronid}")
	public String NewBorrow(@PathVariable("bookid") int bookid,@PathVariable("patronid") int patronid) {
		try {
			borrowservice.NewBorrow(bookid,patronid);
		}catch(Exception ex) {return  "this data equal null";}
		
		return "done" ;
	}

	@PutMapping("/return/{bookid}/patron/{patronid}")
	public String UpdateBorrow(@PathVariable("bookid") int bookid,@PathVariable("patronid") int patronid) {
		try {
			borrowservice.UpdateBorrow(bookid, patronid);
		} catch(Exception ex) {
			 return "this data equel null";
		}
		return "done";
	
}
}