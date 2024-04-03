package com.LibraryManagementSystem.DTO;

public class Patrons_DTO_Request {

	private int ID;
	private String Name;
	private String Contact_Info;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getContact_Info() {
		return Contact_Info;
	}

	public void setContact_Info(String contact_Info) {
		Contact_Info = contact_Info;
	}

	@Override
	public String toString() {
		return "Patrons [ID=" + ID + ", Name=" + Name + ", Contact_Info=" + Contact_Info + "]";
	}

}
