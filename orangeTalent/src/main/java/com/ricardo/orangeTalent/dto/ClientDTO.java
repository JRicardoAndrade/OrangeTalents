package com.ricardo.orangeTalent.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.ricardo.orangeTalent.entities.Account;
import com.ricardo.orangeTalent.entities.Client;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String email;
	private Long cpf;
	private Date birth;

	private List<AccountDTO> accounties = new ArrayList<>();
	
	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String email, Long cpf, Date birth) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.birth = birth;
	}
	
	public ClientDTO(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.cpf = entity.getCpf();
		this.birth = entity.getBirth();
	}
	
	public ClientDTO(Client entity, Set<Account> accounties) {
		this(entity);
		accounties.forEach(acc -> this.accounties.add(new AccountDTO(acc)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public List<AccountDTO> getAccounties() {
		return accounties;
	}

	public void setAccounties(List<AccountDTO> accounties) {
		this.accounties = accounties;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
