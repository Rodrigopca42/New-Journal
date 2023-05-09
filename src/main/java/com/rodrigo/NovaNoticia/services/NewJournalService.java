package com.rodrigo.NovaNoticia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.NovaNoticia.domain.NewJournal;
import com.rodrigo.NovaNoticia.reporitories.NewJournalRepository;
import com.rodrigo.NovaNoticia.services.exceptions.ObjectNotFoundException;

@Service
public class NewJournalService {

	@Autowired
	private NewJournalRepository repository;

	public List<NewJournal> findAll() {
		return repository.findAll();
	}

	public NewJournal findById(Integer id) {
		Optional<NewJournal> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id: "+ id));
	}
	
}
