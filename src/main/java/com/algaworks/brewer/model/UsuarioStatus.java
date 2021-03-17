package com.algaworks.brewer.model;

public enum UsuarioStatus {

	ATIVO("Ativo"),
	INATIVO("Inativo");
	
	private String descricaoStatus;

	UsuarioStatus(String descricaoStatus) {
		this.descricaoStatus = descricaoStatus;
	}

	public String getDescricaoStatus() {
		return descricaoStatus;
	}
}
