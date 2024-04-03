package com.LibraryManagementSystem.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Patrons")
public class Patrons {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column
	private String Name;
	@Column
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
