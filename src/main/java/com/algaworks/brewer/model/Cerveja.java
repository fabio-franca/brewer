package com.algaworks.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {
	
	@NotBlank(message = "Código SKU é obrigatório")
	private String sku;
	
	@NotBlank(message = "Nome da cerveja é obrigatório")
	private String nome;
	
	@Size(min = 1, max = 50, message = "Tamanho da descrição entre 1 a 50 caracteres.")
	private String descricao;
	
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
