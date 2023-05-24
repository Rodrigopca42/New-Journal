package com.rodrigo.NovaNoticia.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.NovaNoticia.domain.NewJournal;
import com.rodrigo.NovaNoticia.domain.enums.Categoria;
import com.rodrigo.NovaNoticia.reporitories.NewJournalRepository;

@Service
public class DBService {
	
	@Autowired
	private NewJournalRepository repository;
	
	
	public void instanciaDB() {
		
		NewJournal nj1 = new NewJournal(null, "A vida a dois","Muitas pessoas não estão prontas para casar, quem dirá formar família.",
				Categoria.COMPORTAMENTO,null);
		
		NewJournal nj2 = new NewJournal(null, "Basket brasileiro cresce a cada ano",
				"Muitos brasileiros tem o sonho de se tornar jogadores de bascketboll.", 
				Categoria.ESPORTE,null);
		
		
		repository.saveAll(Arrays.asList(nj1, nj2));
	}
		
}