package com.LibraryManagementSystem.DTO;

public class BorrowingRecord_DTO_Request {

	private int ID;
	private int Book_ID;
	private int Patron_ID;
	private String BorrwingDate;
	private String ReturnDate;
	private boolean returned;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getBook_ID() {
		return Book_ID;
	}

	public void setBook_ID(int book_ID) {
		Book_ID = book_ID;
	}

	public int getPatron_ID() {
		return Patron_ID;
	}

	public void setPatron_ID(int patron_ID) {
		Patron_ID = patron_ID;
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
		return "BorrowingRecord_DTO_Request [ID=" + ID + ", Book_ID=" + Book_ID + ", Patron_ID=" + Patron_ID
				+ ", BorrwingDate=" + BorrwingDate + ", ReturnDate=" + ReturnDate + "]";
	}

}
