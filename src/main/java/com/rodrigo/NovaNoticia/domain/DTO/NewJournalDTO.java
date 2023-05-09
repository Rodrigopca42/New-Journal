package com.rodrigo.NovaNoticia.domain.DTO;

import java.io.Serializable;

import com.rodrigo.NovaNoticia.domain.NewJournal;
import com.rodrigo.NovaNoticia.domain.enums.Categoria;


	public class NewJournalDTO implements Serializable{
		private static final long serialVersionUID = 1L; 
		
		
		private Integer id;
		private String titulo;
		private String noticia;
		private Integer categorias;
		
		public NewJournalDTO() {
			super();
		}

		public NewJournalDTO(Integer id, String titulo, String noticia, Categoria categorias) {
			super();
			this.id = id;
			this.titulo = titulo;
			this.noticia = noticia;
			this.categorias = categorias.getCodigo();
		}
		
		public NewJournalDTO(NewJournal newJournal) {
			super();
			id = newJournal.getId();
			titulo = newJournal.getTitulo();
			noticia = newJournal.getNoticia();
			categorias = newJournal.getCategorias().getCodigo();
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
	}


