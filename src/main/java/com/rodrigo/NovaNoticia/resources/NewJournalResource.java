package com.rodrigo.NovaNoticia.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping
	public ResponseEntity<NewJournalDTO>create(@RequestBody NewJournalDTO objDTO, @RequestParam("fileNoticia") MultipartFile file){
		NewJournal newObj = service.create(objDTO);		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
				buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<NewJournalDTO> update(@PathVariable Integer id, @RequestBody NewJournalDTO objDTO ){
		NewJournal obj = service.update(id,objDTO);
		return ResponseEntity.ok().body(new NewJournalDTO(obj));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<NewJournalDTO> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}
















