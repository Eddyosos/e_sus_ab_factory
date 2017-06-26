/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual;

import com.github.eddyosos.e_sus_ab_factory.cds.common.IVariasLotacoesHeader;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IFichaAtendimentoIndividualMaster {

    void clear();

    /**
     * Registro individualizado dos atendimentos.
     * @return
     */
    List<IFichaAtendimentoIndividualChild> getAtendimentosIndividuais();

    /**
     * Profissionais que realizaram o atendimento
     * @return
     */
    IVariasLotacoesHeader getHeaderTransport();

    /**
     * Tipo de origem dos dados do registro.
     * @return
     */
    int getTpCdsOrigem();

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return
     */
    String getUuidFicha();

    /**
     * Registro individualizado dos atendimentos.
     * @param atendimentosIndividuais
     */
    void setAtendimentosIndividuais(List<IFichaAtendimentoIndividualChild> atendimentosIndividuais);

    /**
     * Profissionais que realizaram o atendimento
     * @param headerTransport
     */
    void setHeaderTransport(IVariasLotacoesHeader headerTransport);

    /**
     * Tipo de origem dos dados do registro.
     * @param tpCdsOrigem
     */
    void setTpCdsOrigem(int tpCdsOrigem);

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param uuidFicha
     */
    void setUuidFicha(String uuidFicha);

    /**
     * Valida AtendimentosIndividuais.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter entre 1 e 13 atendimentos
     * @return true se válido
     *          false se inválido
     */
    boolean validateAtendimentosIndividuais();

    /**
     * Valida HeaderTransport.
     * Para ser válida deve ter sido inserido préviamente.
     * @return true se válido
     *          false se inválido
     */
    boolean validateHeaderTransport();

    /**
     * Valida TpCdsOrigem.
     * Para ser valido deve ter sido inserido préviamente
     * @return true se válido
     *          false se inválido
     */
    boolean validateTpCdsOrigem();

    /**
     * Valida UuidFicha.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter tamanho entre 36 e 44 (inclusivo)
     * @return true se válido
     *          false se inválido
     */
    boolean validateUuidFicha();

    /**
     * Valida a instancia
     * @return true se válida
     *          false se inválida
     */
    boolean validates();
    
}
