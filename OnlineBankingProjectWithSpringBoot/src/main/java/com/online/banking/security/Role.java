package com.online.banking.security;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Role_Details")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roleeId;
	private String roleName;
	@OneToMany(mappedBy = "Role_Details", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<UserRole> userRoles = new HashSet<UserRole>();

	public Role() {
	}

	public int getRoleeId() {
		return roleeId;
	}

	public void setRoleeId(int roleeId) {
		this.roleeId = roleeId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	@Override
	public String toString() {
		return "Role [roleeId=" + roleeId + ", roleName=" + roleName + ", userRoles=" + userRoles + "]";
	}

}
