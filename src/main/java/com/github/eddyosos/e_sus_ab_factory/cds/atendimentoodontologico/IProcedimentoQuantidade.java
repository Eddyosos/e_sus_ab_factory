/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.atendimentoodontologico;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.ProcedimentoQuantidadeThrift;

/**
 *
 * @author eddyosos
 */
public interface IProcedimentoQuantidade {

    /**
     * Código do procedimento no MS.
     *
     * @return Código do procedimento no MS.
     */
    String getCoMsProcedimento();

    /**
     * Retorna a instância thrift da classe.
     *
     * @return Instância thrift
     */
    ProcedimentoQuantidadeThrift getInstance();

    /**
     * Quantidade de procedimentos realizados
     *
     * @return Quantidade de procedimentos realizados
     */
    int getQuantidade();

    /**
     * Define o código do procedimento no MS.
     *
     * Presença obrigatória.
     *
     * @param coMsProcedimento Código do procedimento no MS.
     */
    void setCoMsProcedimento(String coMsProcedimento);

    /**
     * Define a quantidade de procedimentos realizados.
     *
     * Regra: valor máximo 99.
     *
     * @param quantidade Quantidade de procedimentos realizados.
     */
    void setQuantidade(int quantidade);
    
}
