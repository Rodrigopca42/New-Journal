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
		private Byte[] image;
		
		public NewJournalDTO() {
			super();
		}


		public NewJournalDTO(NewJournal newJournal) {
			super();
			id = newJournal.getId();
			titulo = newJournal.getTitulo();
			noticia = newJournal.getNoticia();
			categorias = newJournal.getCategorias().getCodigo();
			image = newJournal.getImage();		
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
	}


