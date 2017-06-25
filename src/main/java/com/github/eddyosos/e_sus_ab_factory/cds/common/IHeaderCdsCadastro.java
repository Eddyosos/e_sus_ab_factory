/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.common;

/**
 *
 * @author eddyosos
 */
public interface IHeaderCdsCadastro {

    /**
     * CNES da unidade de saúde que o profissional está lotado.
     * @return CNES
     */
    String getCnesUnidadeSaude();

    /**
     * CNS do profissional
     * @return CNS
     */
    String getCnsProfissional();

    /**
     * Código IBGE do município.
     * @return
     */
    String getCodigoIbgeMunicipio();

    /**
     * Data em que está sendo realizada a ação.
     * @return
     */
    long getDataAtendimento();

    /**
     * Código do INE da equipe do profissional.
     * @return
     */
    String getIneEquipe();

    /**
     * Microárea onde está sendo realizada a ação.
     * @return
     */
    long getMicroarea();

    /**
     * CNES da unidade de saúde que o profissional está lotado.
     * @param cnesUnidadeSaude
     */
    void setCnesUnidadeSaude(String cnesUnidadeSaude);

    /**
     * CNS do profissional
     * @param cnsProfissional
     */
    void setCnsProfissional(String cnsProfissional);

    /**
     * Código IBGE do município.
     * @param codigoIbgeMunicipio
     */
    void setCodigoIbgeMunicipio(String codigoIbgeMunicipio);

    /**
     * Data em que está sendo realizada a ação.
     * @param dataAtendimento
     */
    void setDataAtendimento(long dataAtendimento);

    /**
     * Código do INE da equipe do profissional.
     * @param ineEquipe
     */
    void setIneEquipe(String ineEquipe);

    /**
     * Microárea onde está sendo realizada a ação.
     * @param microarea
     */
    void setMicroarea(long microarea);
    
}
