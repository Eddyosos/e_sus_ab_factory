/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.visitadomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarMasterThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IUnicaLotacaoHeader;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IFichaVisitaDomiciliarMaster {

    /**
     * Adiciona um elemento a lista visitaDomiciliares
     * @param elem FichaVisitaDomiciliarChild
     */
    void addToVisitasDomiciliares(IFichaVisitaDomiciliarChild elem);

    /**
     * Retorna o uma instancia de UnicaLotacaoHeader
     * @return UnicaLotacaoHeader UnicaLotacaoHeader
     */
    IUnicaLotacaoHeader getHeaderTransport();

    FichaVisitaDomiciliarMasterThrift getInstance();

    /**
     * Retorna o numero do tpCdsOrigem
     * @return tpCdsOrigem int
     */
    int getTpCdsOrigem();

    /**
     * Retorna o numero UUID
     * @return uuid String
     */
    String getUuidFicha();

    List<IFichaVisitaDomiciliarChild> getVisitasDomiciliares();

    /**
     * Devolve o iterator de visitas domiciliares
     * @return ficha.iterator Iterator
     */
    Iterator<IFichaVisitaDomiciliarChild> getVisitasDomiciliaresIterator();

    /**
     * Retorna o tamanho de visitasDomiciliares
     * @return visitasDomiciliaresSize int
     */
    int getVisitasDomiciliaresSize();

    /**
     * Verifica se HeaderTransport está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */
    boolean isSetHeaderTransport();

    /**
     * Verifica se o field tpCdsOrigem está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */
    boolean isSetTpCdsOrigem();

    /**
     * Verifica se o field uuidFicha está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */
    boolean isSetUuidFicha();

    /**
     * Verifica se o field visitasDomiciliares está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */
    boolean isSetVisitasDomiciliares();

    /**
     * Muda o valor de HeaderTransport
     * @param headerTransport UnicaLotacaoHeader
     */
    void setHeaderTransport(IUnicaLotacaoHeader headerTransport);

    /**
     * Altera o valor do isSet do field HeaderTransport
     * @param value boolean
     */
    void setHeaderTransportIsSet(boolean value);

    /**
     * Muda o valor do numero de tpCdsOrigem
     * @param tpCdsOrigem String
     */
    void setTpCdsOrigem(int tpCdsOrigem);

    /**
     * Altera o valor do isSet do field tpCdsOrigem
     * @param value boolean
     */
    void setTpCdsOrigemIsSet(boolean value);

    /**
     * Muda o valor do numero de UUID
     * @param uuidFicha String
     */
    void setUuidFicha(String uuidFicha);

    /**
     * Altera o valor do isSet do field uuidFicha
     * @param value boolean
     */
    void setUuidFichaIsSet(boolean value);

    /**
     * Muda o valor da lista visitadomiciliares
     * @param visitasDomiciliares List
     */
    void setVisitasDomiciliares(List<IFichaVisitaDomiciliarChild> visitasDomiciliares);

    /**
     * Altera o valor do isSet do field visitasDomiciliares
     * @param value boolean
     */
    void setVisitasDomiciliaresIsSet(boolean value);

    /**
     * Apaga o valor de HeaderTransport
     */
    void unsetHeaderTransport();

    /**
     * Apaga o valor do field tpCdsOrigem
     */
    void unsetTpCdsOrigem();

    /**
     * Apaga o valor do field uuidFicha
     */
    void unsetUuidFicha();

    /**
     * Apaga a lista de visitasDomiciliares
     */
    void unsetVisitasDomiciliares();

    /**
     * Valida se o HeaderTransport está setado
     * @return true caso o valor esteja setado
     * false caso o valor nao esteja setado
     */
    boolean validaHeaderTransport();

    /**
     * Valida o field uuidFicha
     * @return true caso o valor esteja setado e o seu tamanho seja maior que 36 e menor que 44.
     * false caso o valor esteja setado e seu tamanho for menor que 36 e maior que 44
     * false caso nenhum valor esteja setado
     */
    boolean validaUuidFicha();

    /**
     * valida o field Visitas_Domiciliares
     * @return true caso o valor esteja setado e seja igual ou maior que 1 e menor que 23
     * false caso o valor esteja setado e seja menor que um ou maior que 23
     * false case o valor não esteja setado
     */
    boolean validaVisitasDomiciliares();

    /**
     * Valida todos os Fields
     * @return true caso todos os fieds estejam nos padrões aceitos
     * false, caso um atributo nao esteja nos padrões aceitos
     */
    boolean validates();
    
}
