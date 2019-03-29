package com.online.banking.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PrimaryAccountDetails")
public class PrimaryAccount {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long primaryAccId;
	private int accountNumber;
	private BigDecimal accountBalance;
	@OneToMany(mappedBy = "PrimaryAccountDetails")
	@JsonIgnore
	private List<PrimaryTransaction> primaryTransactions;

	public PrimaryAccount() {
	}

	public Long getPrimaryAccId() {
		return primaryAccId;
	}

	public void setPrimaryAccId(Long primaryAccId) {
		this.primaryAccId = primaryAccId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public List<PrimaryTransaction> getPrimaryTransactions() {
		return primaryTransactions;
	}

	public void setPrimaryTransactions(List<PrimaryTransaction> primaryTransactions) {
		this.primaryTransactions = primaryTransactions;
	}

	@Override
	public String toString() {
		return "PrimaryAccount [primaryAccId=" + primaryAccId + ", accountNumber=" + accountNumber + ", accountBalance="
				+ accountBalance + ", primaryTransactions=" + primaryTransactions + "]";
	}

}
