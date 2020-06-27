package net.itinagero.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.itinagero.api.entity.Album;
import net.itinagero.api.service.IAlbumService;

@RestController
@RequestMapping("/api")
public class AlumnosController {

	@Autowired
	private IAlbumService serviceAlbum;
	
	@GetMapping("/albums")
	public List<Album> buscarTodos(){
		return serviceAlbum.buscarTodos();
	}
	
	@PostMapping("/albums")
	public Album guardar(@RequestBody Album album) {
		serviceAlbum.guarda(album);
		return album;
	}
	
	@PutMapping("/albums")
	public Album modificar(@RequestBody Album album) {
		serviceAlbum.guarda(album);
		return album;
	}
	
	@DeleteMapping("/albums/{id}")
	public String borrar(@PathVariable("id") int idAlbum) {
		serviceAlbum.borrar(idAlbum);
		return "Registro eliminado";
	}
	
}
