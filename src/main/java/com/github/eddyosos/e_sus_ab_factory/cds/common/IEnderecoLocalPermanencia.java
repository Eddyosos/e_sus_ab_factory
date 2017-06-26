/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.common;

import br.gov.saude.esus.cds.transport.generated.thrift.common.EnderecoLocalPermanenciaThrift;

/**
 *
 * @author eddyosos
 */
public interface IEnderecoLocalPermanencia {

    /**
     * Retorna o objeto incapsulado thrift
     * Quebra do encapsulamento
     * @return
     */
    @Deprecated
    EnderecoLocalPermanenciaThrift getInstance();

    /**
     * Bairro onde está localizado o domicílio
     * @return nome do bairro
     */
    String getBairro();
    
    /**
     * CEP do logradouro do domicílio.
     * @return Cep em string
     */
    String getCep();

    /**
     * Código IBGE do município.
     * @return código
     */
    String getCodigoIbgeMunicipio();

    /**
     * Complemento do endereço do domicílio.
     * @return o complemento
     */
    String getComplemento();

    /**
     * Nome do logradouro.
     * @return nome
     */
    String getNomeLogradouro();

    /**
     * Número do domicílio.
     * @return número
     */
    String getNumero();

    /**
     * Código indexador referente a Unidade Federativa.
     * @return código
     */
    String getNumeroDneUf();

    /**
     * Telefone de referência.
     * @return telefone
     */
    String getTelReferencial();

    /**
     * Telefone residencial.
     * @return
     */
    String getTelResidencial();

    /**
     * Tipo do logradouro onde está o domicílio.
     * @return
     */
    String getTipoLogradouroNumeroDne();

    // Não á regras para validate isStSemNumero, por isso método não foi criado
    /**
     * Marcador que indica que o domicílio não possui número.
     * @return
     */
    boolean isStSemNumero();

    /**
     * Insere o nome do bairro
     * @param bairro nome do bairro
     */
    void setBairro(String bairro);

    /**
     * CEP do logradouro do domicílio.
     * @param cep
     */
    void setCep(String cep);

    /**
     * Código IBGE do município
     * @param codigoIbgeMunicipio o código
     */
    void setCodigoIbgeMunicipio(String codigoIbgeMunicipio);

    /**
     * Complemento do endereço do domicílio.
     * @param complemento
     *
     */
    void setComplemento(String complemento);

    /**
     * Nome do logradouro.
     * @param nomeLogradouro Nome do logradouro
     */
    void setNomeLogradouro(String nomeLogradouro);

    /**
     * Número do domicílio.
     * @param numero
     */
    void setNumero(String numero);

    /**
     * Código indexador referente a Unidade Federativa.
     * @param numeroDneUf
     */
    void setNumeroDneUf(String numeroDneUf);

    /**
     * Marcador que indica que o domicílio não possui número.
     * @param stSemNumero
     */
    void setStSemNumero(boolean stSemNumero);

    /**
     * Telefone de referência.
     * @param telReferencial
     */
    void setTelReferencial(String telReferencial);

    /**
     * Telefone residencial.
     * @param telResidencial
     */
    void setTelResidencial(String telResidencial);

    /**
     * Tipo do logradouro onde está o domicílio.
     * @param tipoLogradouroNumeroDne
     */
    void setTipoLogradouroNumeroDne(String tipoLogradouroNumeroDne);
    
}
