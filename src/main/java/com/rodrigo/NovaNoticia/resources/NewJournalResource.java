package com.rodrigo.NovaNoticia.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.NovaNoticia.domain.NewJournal;
import com.rodrigo.NovaNoticia.domain.DTO.NewJournalDTO;
import com.rodrigo.NovaNoticia.services.NewJournalService;

@RestController
@RequestMapping(value = "/novasNoticias")
public class NewJournalResource {

	@Autowired
	private NewJournalService service;
	
	
	@GetMapping
	public ResponseEntity<List<NewJournalDTO>> findAll(){
		List<NewJournal> list = service.findAll();
		List<NewJournalDTO> listDTO = list.stream().map(obj -> new NewJournalDTO(obj)).
				collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<NewJournalDTO> findById(@PathVariable Integer id){
		NewJournal obj = service.findById(id);
		return ResponseEntity.ok().body(new NewJournalDTO(obj));
	}
}
















