package com.online.banking.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class PrimaryTransaction {

	private Long primaryTranId;
	private Date date;
	private String description;
	private String primaryTranType;
	private String primaryTranStatus;
	private Double primaryTrnAmount;
	private BigDecimal availableBalance;

	@ManyToOne
	@JoinColumn(name = "primaryAccId")
	private PrimaryAccount primaryAccount;

	public PrimaryTransaction() {
	}

	public PrimaryTransaction(Date date2, String string, String string2, String string3, double parseDouble,
			BigDecimal accountBalance, PrimaryAccount primaryAccount2) {
		// TODO Auto-generated constructor stub
	}

	public Long getPrimaryTranId() {
		return primaryTranId;
	}

	public void setPrimaryTranId(Long primaryTranId) {
		this.primaryTranId = primaryTranId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrimaryTranType() {
		return primaryTranType;
	}

	public void setPrimaryTranType(String primaryTranType) {
		this.primaryTranType = primaryTranType;
	}

	public String getPrimaryTranStatus() {
		return primaryTranStatus;
	}

	public void setPrimaryTranStatus(String primaryTranStatus) {
		this.primaryTranStatus = primaryTranStatus;
	}

	public Double getPrimaryTrnAmount() {
		return primaryTrnAmount;
	}

	public void setPrimaryTrnAmount(Double primaryTrnAmount) {
		this.primaryTrnAmount = primaryTrnAmount;
	}

	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}

	public PrimaryAccount getPrimaryAccount() {
		return primaryAccount;
	}

	public void setPrimaryAccount(PrimaryAccount primaryAccount) {
		this.primaryAccount = primaryAccount;
	}

	@Override
	public String toString() {
		return "PrimaryTransaction [primaryTranId=" + primaryTranId + ", date=" + date + ", description=" + description
				+ ", primaryTranType=" + primaryTranType + ", primaryTranStatus=" + primaryTranStatus
				+ ", primaryTrnAmount=" + primaryTrnAmount + ", availableBalance=" + availableBalance
				+ ", primaryAccount=" + primaryAccount + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
