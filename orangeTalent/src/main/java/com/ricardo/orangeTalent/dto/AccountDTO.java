package com.ricardo.orangeTalent.dto;

import java.io.Serializable;

import com.ricardo.orangeTalent.entities.Account;

public class AccountDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long accountNumber;
	private String typeAccount;
	private float balence;
	
	public AccountDTO(){
	}

	public AccountDTO(Long accountNumber, String typeAccount, float balence) {
		this.accountNumber = accountNumber;
		this.typeAccount = typeAccount;
		this.balence = balence;
	}

	public AccountDTO(Long accountNumber, String typeAccount) {
		this.accountNumber = accountNumber;
		this.typeAccount = typeAccount;
	}
	
	public AccountDTO(Account entity) {
		this.accountNumber = entity.getAccountNumber();
		this.typeAccount = entity.getTypeAccount();
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getTypeAccount() {
		return typeAccount;
	}

	public void setTypeAccount(String typeAccount) {
		this.typeAccount = typeAccount;
	}

	public float getBalence() {
		return balence;
	}

	public void setBalence(float balence) {
		this.balence = balence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountDTO other = (AccountDTO) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		return true;
	}

}
