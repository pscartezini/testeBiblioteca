package br.com.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.biblioteca.models.Emprestimo;
import br.com.biblioteca.models.Pessoa;

@Repository
public interface EmprestimoDao extends JpaRepository<Emprestimo, Long> {

}
