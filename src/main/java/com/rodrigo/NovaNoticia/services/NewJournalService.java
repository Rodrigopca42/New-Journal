package com.rodrigo.NovaNoticia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.NovaNoticia.domain.NewJournal;
import com.rodrigo.NovaNoticia.reporitories.NewJournalRepository;

@Service
public class NewJournalService {

	@Autowired
	private NewJournalRepository repository;

	public List<NewJournal> findAll() {
		return repository.findAll();
	}
	
}
