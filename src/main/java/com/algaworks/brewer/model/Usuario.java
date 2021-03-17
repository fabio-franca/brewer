package com.algaworks.brewer.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

	@Entity
	@Table(name = "usuario")
	public class Usuario implements Serializable {

		private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotBlank(message= "O nome é obrigatório")
	@Size(min = 1, max = 15, message = "O tamanho do nome deve estar entre 1 e 15 caracteres")
	private String nome;
	
	@NotBlank(message= "O nome é obrigatório")
	private String email;
	
	private LocalDate nascimento;
	
	private String senha;
	
	private String confirmaSenha;
	
	@NotNull(message= "O status é obrigatório")
	@Enumerated(EnumType.STRING)
	private UsuarioStatus status;
	
	@NotNull(message= "O grupo é obrigatório")
	@Enumerated(EnumType.STRING)
	private UsuarioGrupos grupos;

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

	public UsuarioStatus getStatus() {
		return status;
	}

	public void setStatus(UsuarioStatus status) {
		this.status = status;
	}

	public UsuarioGrupos getGrupos() {
		return grupos;
	}

	public void setGrupos(UsuarioGrupos grupos) {
		this.grupos = grupos;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Usuario other = (Usuario) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
}