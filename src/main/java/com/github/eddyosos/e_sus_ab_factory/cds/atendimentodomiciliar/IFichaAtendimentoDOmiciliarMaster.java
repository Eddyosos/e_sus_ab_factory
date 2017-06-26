/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.atendimentodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar.FichaAtendimentoDomiciliarMasterThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.atendimentodomiciliar.IFichaAtendimentoDomiciliarChild;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IUnicaLotacaoHeader;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IFichaAtendimentoDOmiciliarMaster {

    /**
     * Instancia encapsulada do thrift
     * @return 
     */
    FichaAtendimentoDomiciliarMasterThrift getInstance();
    
    /**
     * Todos os atendimentos realizados pelo profissional.
     * @return Uma lista contendo todos os atendimentos realizados pelo profissional
     */
    List<IFichaAtendimentoDomiciliarChild> getAtendimentosDomiciliares();

    /**
     * Lista dos atendimentos realizados pelo profissional.
     * @return uma lista contendo os atendimentos realizados pelo profissional
     */
    Iterator<IFichaAtendimentoDomiciliarChild> getAtendimentosDomiciliaresIterator();

    /**
     * Quantidade dos atendimentos realizados pelo profissional.
     * @return A quantidade de atendimentos realizada pelo profissional.
     */
    int getAtendimentosDomiciliaresSize();

    /**
     * Profissional que realizou a visita.
     * @return Intancia de UnicaLotacaoHeader contendo informações sobre o profissional que realizou a visita.
     */
    IUnicaLotacaoHeader getHeaderTransport();

    /**
     * Tipo de origem dos dados do registro.
     * @return TpCdsOrigem
     */
    int getTpCdsOrigem();

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return uuidFicha
     */
    String getUuidFicha();

    /**
     * Adiciona varios atendimentos a lista de atendimentos do profissional.
     * @param atendimentosDomiciliares Lista contendo os atendimentos a serem adicionados ao profissional.
     */
    void setAtendimentosDomiciliares(List<IFichaAtendimentoDomiciliarChild> atendimentosDomiciliares);

    /**
     * Define o profissional que realizou a visita.
     * Presença Obrigatora.
     * @param headerTransport Profissional que realizou a visita.
     */
    void setHeaderTransport(IUnicaLotacaoHeader headerTransport);

    /**
     * Tipo de origem dos dados do registro.
     * Presença obrigatória.
     * Observações: Utilizar valor 3 (sistemas terceiros).
     * @param tpCdsOrigem Tipo de origem dos dados
     */
    void setTpCdsOrigem(int tpCdsOrigem);

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * Presença obrigatória
     * @param uuidFicha
     */
    void setUuidFicha(String uuidFicha);
    
}
