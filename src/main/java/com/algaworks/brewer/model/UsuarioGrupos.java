package com.algaworks.brewer.model;

public enum UsuarioGrupos {
	
	ADMINISTRADOR("Administrador"),
	VENDEDOR("Vendedor");
	
	private String descricaoGrupos;

	UsuarioGrupos(String descricaoGrupos) {
		this.descricaoGrupos = descricaoGrupos;
	}

	public String getDescricaoGrupos() {
		return descricaoGrupos;
	}
}
