package com.rodrigo.NovaNoticia.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

import com.rodrigo.NovaNoticia.domain.DTO.NewJournalDTO;
import com.rodrigo.NovaNoticia.domain.enums.Categoria;

@Entity
public class NewJournal implements Serializable{
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull(message = "O campo Título é requerido" )
	private String titulo;
	
	@NotNull(message = "O campo Notícia é requerido" )
	@Column(length = 1000)
	private String noticia;
	
	private Integer categorias;
	
	@Lob
	private Byte[] image;
	
	public NewJournal() {
		super();
	}
	
	
	
	public NewJournal(Integer id, String titulo, String noticia, Categoria categorias, Byte[] image) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.noticia = noticia;
		this.categorias = categorias.getCodigo();
		this.image = image;
	}


	public NewJournal(NewJournalDTO obj) {
		super();
		this.id = obj.getId();
		this.titulo = obj.getTitulo();
		this.noticia = obj.getNoticia();
		this.categorias = obj.getCategorias().getCodigo();
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
		return Categoria.toEnum(categorias);
	}

	public void setCategorias(Categoria categorias) {
		this.categorias = categorias.getCodigo();
	}
	
	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
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
