package com.LibraryManagementSystem.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Borrowing_Record")
public class BorrowingRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id")
	private Books book;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patron_id")
	private Patrons patron;
	@Column
	private String BorrwingDate;
	@Column
	private String ReturnDate;
	@Column
	private boolean returned;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}

	public Patrons getPatron() {
		return patron;
	}

	public void setPatron(Patrons patron) {
		this.patron = patron;
	}

	public String getBorrwingDate() {
		return BorrwingDate;
	}

	public void setBorrwingDate(String borrwingDate) {
		BorrwingDate = borrwingDate;
	}

	public String getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(String returnDate) {
		ReturnDate = returnDate;
	}

	public boolean isReturned() {
		return returned;
	}

	public void setReturned(boolean returned) {
		this.returned = returned;
	}

	@Override
	public String toString() {
		return "BorrowingRecord [ID=" + ID + ", book=" + book + ", patron=" + patron + ", BorrwingDate=" + BorrwingDate
				+ ", ReturnDate=" + ReturnDate + ", returned=" + returned + "]";
	}

}
