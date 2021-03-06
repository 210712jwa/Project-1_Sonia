package com.revature.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_role")
public class ERSReimbursementUserRole {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "role", nullable = false, unique = true)
	private String role; // "admin" or "user"

	public ERSReimbursementUserRole() {
		super();
	}

	public ERSReimbursementUserRole( String role) {
		super();
		
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, role);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ERSReimbursementUserRole other = (ERSReimbursementUserRole) obj;
		return id == other.id && Objects.equals(role, other.role);
	}

	@Override
	public String toString() {
		return "ERSReimbursementUserRole [id=" + id + ", role=" + role + "]";
	}

}
