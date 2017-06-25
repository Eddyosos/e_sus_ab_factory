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
public interface IVariasLotacoesHeader {

    /**
     * Código do CBO do profissional1.
     * @return
     */
    String getCboCodigo_2002_1();

    /**
     * Código do CBO do profissional2.
     * @return
     */
    String getCboCodigo_2002_2();

    /**
     * Profissional responsável pela ação.
     * @return
     */
    IUnicaLotacaoHeader getLotacaoForm();

    /**
     * CNS do profissional1.
     * @return
     */
    String getProfissionalCNS1();

    /**
     * CNS do profissional2.
     * @return
     */
    String getProfissionalCNS2();

    /**
     * Código do CBO do profissional1.
     * @param cboCodigo_2002_1
     */
    void setCboCodigo_2002_1(String cboCodigo_2002_1);

    /**
     * Código do CBO do profissional2.
     * @param cboCodigo_2002_2
     */
    void setCboCodigo_2002_2(String cboCodigo_2002_2);

    /**
     * Profissional responsável pela ação.
     * @param lotacaoForm
     */
    void setLotacaoForm(IUnicaLotacaoHeader lotacaoForm);

    /**
     * CNS do profissional1.
     * @param profissionalCNS1
     */
    void setProfissionalCNS1(String profissionalCNS1);

    /**
     * CNS do profissional2.
     * @param profissionalCNS2
     */
    void setProfissionalCNS2(String profissionalCNS2);
    
}
