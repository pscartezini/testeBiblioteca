package br.com.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.biblioteca.models.Livro;



@Repository
public interface LivroDao extends JpaRepository<Livro, Long> {
	
}
