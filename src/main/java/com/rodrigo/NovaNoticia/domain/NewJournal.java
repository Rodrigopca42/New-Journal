package com.rodrigo.NovaNoticia.domain;

import java.io.Serializable;
import java.util.Objects;

import com.rodrigo.NovaNoticia.domain.enums.Categoria;

public class NewJournal implements Serializable{
	private static final long serialVersionUID = 1L; 
	
	private Integer id;
	private String titulo;
	private String noticia;
	
	private Categoria categorias;
	
	public NewJournal() {
		super();
	}

	public NewJournal(Integer id, String titulo, String noticia, Categoria categorias) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.noticia = noticia;
		this.categorias = categorias;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNoticia() {
		return noticia;
	}

	public void setNoticia(String noticia) {
		this.noticia = noticia;
	}

	public Categoria getCategorias() {
		return categorias;
	}

	public void setCategorias(Categoria categorias) {
		this.categorias = categorias;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewJournal other = (NewJournal) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
