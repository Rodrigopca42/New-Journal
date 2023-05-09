package com.rodrigo.NovaNoticia.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.NovaNoticia.domain.NewJournal;
import com.rodrigo.NovaNoticia.services.NewJournalService;

@RestController
@RequestMapping(value = "/categorias")
public class NewJournalResource {

	@Autowired
	private NewJournalService service;
	
	
	@GetMapping
	public ResponseEntity<List<NewJournal>> findAll(){
		List<NewJournal> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
