package net.itinagero.api.service;

import java.util.List;

import net.itinagero.api.entity.Album;

public interface IAlbumService {

	List<Album> buscarTodos();
	void guarda(Album album);
}
