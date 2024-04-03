package com.LibraryManagementSystem.DTO;

public class Books_DTO_Request {

	private int ID;
	private String Title;
	private String Author;
	private String Publication_Year;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublication_Year() {
		return Publication_Year;
	}

	public void setPublication_Year(String publication_Year) {
		Publication_Year = publication_Year;
	}

	@Override
	public String toString() {
		return "Books [ID=" + ID + ", Title=" + Title + ", Author=" + Author + ", Publication_Year=" + Publication_Year
				+ "]";
	}

}
