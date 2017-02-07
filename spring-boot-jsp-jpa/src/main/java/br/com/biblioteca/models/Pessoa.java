/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.models;

import java.io.Serializable;
import java.util.Date;
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
@Table (name = "pessoa", schema = "testedsl")
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "idpessoa")
    private Long idPessoa;

    @Max(100)
    @NotEmpty(message = "O Campo Nome não pode estar vazio.")
    private String nome;

    @Column(name = "datanascimento")
    private Date dataNascimento;

    @Max(14)
    private String cpf;

    /**
     * @return the idPessoa
     */
    public Long getIdPessoa() {
        return idPessoa;
    }

    /**
     * @param idPessoa the idPessoa to set
     */
    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
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
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
