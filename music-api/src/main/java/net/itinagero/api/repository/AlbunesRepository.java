package net.itinagero.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.itinagero.api.entity.Album;

public interface AlbunesRepository extends JpaRepository<Album, Integer> {

}
