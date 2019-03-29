package com.online.banking.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "SavingAccountTransaction")
public class SavingsTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tranId;
	private Date date;
	private String description;
	private String tranType;
	private Double tranAmounnt;
	private BigDecimal availbaleBlance;

	@ManyToOne
	@JoinColumn(name="savings_account_id")
	private SavingsAccount savingsAccount;

	public SavingsTransaction() {
	}

	public SavingsTransaction(Date date2, String string, String string2, String string3, double amount,
			BigDecimal accountBlance, SavingsAccount savingsAccount2) {
		// TODO Auto-generated constructor stub
	}

	public Long getTranId() {
		return tranId;
	}

	public void setTranId(Long tranId) {
		this.tranId = tranId;
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

	public String getTranType() {
		return tranType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	public Double getTranAmounnt() {
		return tranAmounnt;
	}

	public void setTranAmounnt(Double tranAmounnt) {
		this.tranAmounnt = tranAmounnt;
	}

	public BigDecimal getAvailbaleBlance() {
		return availbaleBlance;
	}

	public void setAvailbaleBlance(BigDecimal availbaleBlance) {
		this.availbaleBlance = availbaleBlance;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	@Override
	public String toString() {
		return "SavingsTransaction [tranId=" + tranId + ", date=" + date + ", description=" + description
				+ ", tranType=" + tranType + ", tranAmounnt=" + tranAmounnt + ", availbaleBlance=" + availbaleBlance
				+ ", savingsAccount=" + savingsAccount + "]";
	}

}
