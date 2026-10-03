package jdjdbc_servlet_seperated_statement_crud_operation.dto;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class Employe implements Serializable{

	private int id;
	private String name;
	private String email;
	private long phone;
	private String password;
	private LocalDate dob;
	private LocalDate doj;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password="
				+ password + ", dob=" + dob + ", doj=" + doj + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dob, doj, email, id, name, password, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return Objects.equals(dob, other.dob) && Objects.equals(doj, other.doj) && Objects.equals(email, other.email)
				&& id == other.id && Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& phone == other.phone;
	}
	
	
	
	
}
