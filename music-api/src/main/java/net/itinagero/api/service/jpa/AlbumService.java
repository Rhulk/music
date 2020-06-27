package net.itinagero.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.itinagero.api.entity.Album;
import net.itinagero.api.repository.AlbunesRepository;
import net.itinagero.api.service.IAlbumService;

@Service
public class AlbumService implements IAlbumService {
	
	@Autowired
	private AlbunesRepository repoAlbums;

	@Override
	public List<Album> buscarTodos() {
		return repoAlbums.findAll();
	}

	@Override
	public void guarda(Album album) {
		repoAlbums.save(album);
		
	}

	@Override
	public void borrar(int idAlbum) {
		repoAlbums.deleteById(idAlbum);
	}

}
