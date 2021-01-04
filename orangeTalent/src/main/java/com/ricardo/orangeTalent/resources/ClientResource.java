package com.ricardo.orangeTalent.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ricardo.orangeTalent.dto.ClientDTO;
import com.ricardo.orangeTalent.services.ClientService;

@RestController
@RequestMapping(value= "/clients")
public class ClientResource {
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public ResponseEntity<List<ClientDTO>> findAll() {
		List<ClientDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

	@GetMapping(value= "/{Id}")
	public ResponseEntity<ClientDTO> findById(@PathVariable Long Id) {
		ClientDTO dto = service.findById(Id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<ClientDTO> insert(@RequestBody ClientDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{Id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping(value= "/{Id}")
	public ResponseEntity<ClientDTO> update(@PathVariable Long Id, @RequestBody ClientDTO dto) {
		dto = service.update(Id, dto);
		return ResponseEntity.ok().body(dto);
	}
	

	@DeleteMapping(value= "/{Id}")
	public ResponseEntity<ClientDTO> delete(@PathVariable Long Id) {
		service.delete(Id);
		return ResponseEntity.noContent().build();
	}
}
