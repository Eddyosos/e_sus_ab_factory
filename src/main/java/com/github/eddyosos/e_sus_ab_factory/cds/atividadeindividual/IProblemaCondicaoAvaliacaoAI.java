/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.ProblemaCondicaoAvaliacaoAIThrift;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IProblemaCondicaoAvaliacaoAI {

    /**
     * Código dos CIAPs apresentados na lista.
     * @return
     */
    List<String> getCiaps();

    /**
     * Código do CID10 registrado no atendimento.
     * @return
     */
    String getCid10();

    ProblemaCondicaoAvaliacaoAIThrift getInstance();

    /**
     * Código do CIAP1 registrado no antedimento.
     * @return
     */
    String getOutroCiap1();

    /**
     * Código do CIAP2 registrado no antedimento.
     * @return
     */
    String getOutroCiap2();

    /**
     * Código dos CIAPs apresentados na lista.
     * @param ciaps
     */
    void setCiaps(List<String> ciaps);

    /**
     * Código do CID10 registrado no atendimento.
     * @param cid10
     */
    void setCid10(String cid10);

    /**
     * Código do CIAP1 registrado no antedimento.
     * @param outroCiap1
     */
    void setOutroCiap1(String outroCiap1);

    /**
     * Código do CIAP2 registrado no antedimento.
     * @param outroCiap2
     */
    void setOutroCiap2(String outroCiap2);

    /**
     * Valida Ciaps.
     * Para ser válido deve:
     * 1- Não deve conter dois "Problemas / Condições" iguais.
     * 2- É Requerido o preenchimento de pelo menos um dos itens de #1 a #4
     * 3- Ter entre 0 e 22 itens
     * @return
     */
    boolean validateCiaps();

    /**
     * Valida Cid10.
     * Para ser válido deve:
     * 1- É Requerido o preenchimento de pelo menos um dos itens de #1 a #4.
     * @return true se válido
     *          false se inválido
     */
    boolean validateCid10();

    /**
     * Valida OutroCiap1.
     * Para ser válido, deve:
     * 1- Não pode ser igual a outroCiap2.
     * 2- É Requerido o preenchimento de pelo menos um dos itens de #1 a #4.
     * @return true se válido
     *          false se inválido
     */
    boolean validateOutroCiap1();

    /**
     * Valida OutroCiap2.
     * Para ser válido, deve:
     * 1- Não pode ser igual a outroCiap1.
     * 2- É Requerido o preenchimento de pelo menos um dos itens de #1 a #4.
     * @return true se válido
     *          false se inválido
     */
    boolean validateOutroCiap2();

    /**
     * Valida a instancia
     * @return true se válido
     *          false se inválido
     */
    boolean validates();
    
}
