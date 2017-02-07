/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author paulo
 */
@Entity
@Table (name = "livro", schema = "testedsl")
public class Livro implements Serializable{
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO) 
    @Column(name= "idlivro")
    private Long idlivro;
    
    @Max(100)
    @NotEmpty(message ="O campo nome não estar vazio")
    private String nome ;
    
    @Max(100)
    private String escritor;
    
    @Column(name= "anoedicao")
    private Integer anoEdicao;
    
    private Integer classificacao;

    /**
     * @return the idlivro
     */
    public Long getIdlivro() {
        return idlivro;
    }

    /**
     * @param idlivro the idlivro to set
     */
    public void setIdlivro(Long idlivro) {
        this.idlivro = idlivro;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the escritor
     */
    public String getEscritor() {
        return escritor;
    }

    /**
     * @param escritor the escritor to set
     */
    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    /**
     * @return the anoEdicao
     */
    public Integer getAnoEdicao() {
        return anoEdicao;
    }

    /**
     * @param anoEdicao the anoEdicao to set
     */
    public void setAnoEdicao(Integer anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    /**
     * @return the classificacao
     */
    public Integer getClassificacao() {
        return classificacao;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }
    
    
    
    
    
    
}
