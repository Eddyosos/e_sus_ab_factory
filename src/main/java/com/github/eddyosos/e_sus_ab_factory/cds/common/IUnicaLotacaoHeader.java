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
public interface IUnicaLotacaoHeader {

    /**
     * Código do CBO do profissional.
     * @return
     */
    String getCboCodigo_2002();

    /**
     * Código do CNES da unidade de saúde que o profissional está lotado.
     * @return
     */
    String getCnes();

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
     * Código INE da equipe do profissional.
     * @return
     */
    String getIne();

    /**
     * CNS do profissional.
     * @return
     */
    String getProfissionalCNS();

    /**
     * Código do CBO do profissional.
     * @param cboCodigo_2002
     */
    void setCboCodigo_2002(String cboCodigo_2002);

    /**
     * Código do CNES da unidade de saúde que o profissional está lotado.
     * @param cnes
     */
    void setCnes(String cnes);

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
     * Código INE da equipe do profissional.
     * @param ine
     */
    void setIne(String ine);

    /**
     * CNS do profissional.
     * @param profissionalCNS
     */
    void setProfissionalCNS(String profissionalCNS);
    
}
