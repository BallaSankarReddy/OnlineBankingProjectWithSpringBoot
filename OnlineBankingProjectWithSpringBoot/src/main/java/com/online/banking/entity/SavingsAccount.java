package com.online.banking.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SaveAccountDetails")
public class SavingsAccount {

	private Long saveAccId;
	private int accountNumber;
	private BigDecimal accountBlance;

	@OneToMany(mappedBy = "SaveAccountDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<SavingsTransaction> savingsTransactions;

	public SavingsAccount() {
	}

	public Long getSaveAccId() {
		return saveAccId;
	}

	public void setSaveAccId(Long saveAccId) {
		this.saveAccId = saveAccId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBlance() {
		return accountBlance;
	}

	public void setAccountBlance(BigDecimal accountBlance) {
		this.accountBlance = accountBlance;
	}

	public List<SavingsTransaction> getSavingsTransactions() {
		return savingsTransactions;
	}

	public void setSavingsTransactions(List<SavingsTransaction> savingsTransactions) {
		this.savingsTransactions = savingsTransactions;
	}

	@Override
	public String toString() {
		return "SavingsAccount [saveAccId=" + saveAccId + ", accountNumber=" + accountNumber + ", accountBlance="
				+ accountBlance + ", savingsTransactions=" + savingsTransactions + "]";
	}

}
