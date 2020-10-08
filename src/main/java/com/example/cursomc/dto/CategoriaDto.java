package com.example.cursomc.dto;

import java.io.Serializable;

import com.example.cursomc.domain.Categoria;

public class CategoriaDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String nome;

	public CategoriaDto() {

	}

	public CategoriaDto(Categoria categoria) {
		this.Id = categoria.getId();
		this.nome = categoria.getNome();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
