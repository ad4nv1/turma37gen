package com.example.postagem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.postagem.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	
	public List<Tema> findAllByDescricaoConteiningIgoreCase(String descricao);
	

}