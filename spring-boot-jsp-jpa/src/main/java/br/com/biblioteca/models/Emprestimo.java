/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author paulo
 */
@Entity
@Table (name = "emprestimo", schema = "testedsl")
public class Emprestimo {
    
    @Id
    @Column(name = "idemprestimo")
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long idEmprestimo;
    
    @NotNull
    @Column(name = "dataemprestimo")
    private Date dataEmprestimo;
      
    @Column(name = "datahoradevolucao")
    private Date dataHoraDevolucao;
    
    @OneToMany(mappedBy = "idlivro", targetEntity = Livro.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Livro livro;
    
    @OneToMany(mappedBy = "idpessoa", targetEntity = Pessoa.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Pessoa pessoa;
    
    
}
