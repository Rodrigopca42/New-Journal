package com.rodrigo.NovaNoticia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.NovaNoticia.domain.NewJournal;
import com.rodrigo.NovaNoticia.domain.DTO.NewJournalDTO;
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

	public NewJournal create(NewJournalDTO objDTO) {
		objDTO.setId(null);
		NewJournal newObj = new NewJournal(objDTO);
		return repository.save(newObj);
	}

	public NewJournal update(Integer id, NewJournalDTO objDTO) {
		objDTO.setId(id);
		NewJournal oldObj = findById(id);
		oldObj = new NewJournal(objDTO);
		return repository.save(oldObj);
	}

	public void delete(Integer id) {
		NewJournal obj = findById(id);
		repository.deleteById(id);
		
	}
	
}



