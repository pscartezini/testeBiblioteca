/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.repository;

import br.com.biblioteca.models.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author paulo
 */

@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Long>{

    public Pessoa findByNome(String nome);

  


}
