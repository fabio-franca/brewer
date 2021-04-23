package com.algaworks.brewer.controller.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import com.algaworks.brewer.model.Estado;

public class EstadoConverter implements Converter<String, Estado>{

	@Override
	public Estado convert(String codigo) {
		if (!StringUtils.isEmpty(codigo)) {
		Estado Estado = new Estado();
		Estado.setCodigo(Long.valueOf(codigo));
		return Estado;
	}
		return null;
	}

}
