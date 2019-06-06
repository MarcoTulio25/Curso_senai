package com.MarcoTulio.SENAI.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.MarcoTulio.SENAI.domain.enums.TipoCliente;

@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCilente;
	private String nome;
	private String CpfouCnpj;
	private Integer tipo;

	@Column(unique = true)
	private String email;

	@ElementCollection
	@CollectionTable(name = "TELEFONE")
	private Set<String> telefones = new HashSet<>();

	public Cliente() {
	}
	
	@OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL)
	private List<Endereco> enderecos = new ArrayList<>();

	public Cliente(Integer idCilente, String nome, String cpfouCnpj, String email, TipoCliente tipo) {
		super();
		this.idCilente = idCilente;
		this.nome = nome;
		this.CpfouCnpj = cpfouCnpj;
		this.email = email;
		this.tipo = tipo.getCod();
	}

	public Integer getIdCilente() {
		return idCilente;
	}

	public void setIdCilente(Integer idCilente) {
		this.idCilente = idCilente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfouCnpj() {
		return CpfouCnpj;
	}

	public void setCpfouCnpj(String cpfouCnpj) {
		CpfouCnpj = cpfouCnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}
	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCilente == null) ? 0 : idCilente.hashCode());
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
		Cliente other = (Cliente) obj;
		if (idCilente == null) {
			if (other.idCilente != null)
				return false;
		} else if (!idCilente.equals(other.idCilente))
			return false;
		return true;
	}



}
