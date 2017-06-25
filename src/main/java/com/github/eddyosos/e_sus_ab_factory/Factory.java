/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory;

import com.github.eddyosos.e_sus_ab_factory.cds.atendimentodomiciliar.IFichaAtendimentoDomiciliarChild;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IEnderecoLocalPermanencia;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IHeaderCdsCadastro;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IUnicaLotacaoHeader;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IVariasLotacoesHeader;
import java.util.Map;

/**
 * Implementação de uma fabrica que separa as interfaces do e-sus-ab de suas implementações
 * @author eddyosos
 */
public class Factory {
    /**
     * Um mapa para encontrar a implementação das classes passadas como chave
     */
    private final Map<Class,String> mapping;

    /**
     * @see Factory#mapping
     * @param mapping 
     */
    public Factory(Map<Class, String> mapping) {
        this.mapping = mapping;
    }
    
    public IFichaAtendimentoDomiciliarChild getInstanceOfFichaAtendimentoDomiciliarChild() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IFichaAtendimentoDomiciliarChild) Class.forName(mapping.get(IFichaAtendimentoDomiciliarChild.class)).newInstance();
    }
    
    
    //Pacote Common
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IEnderecoLocalPermanencia getInstanceOfEnderecoLocalPermanencia() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IEnderecoLocalPermanencia) Class.forName(mapping.get(IEnderecoLocalPermanencia.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IHeaderCdsCadastro getInstanceOfIHeaderCdsCadastro() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
         return (IHeaderCdsCadastro) Class.forName(mapping.get(IHeaderCdsCadastro.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IUnicaLotacaoHeader getInstanceOfIUnicaLotacaoHeader() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
         return (IUnicaLotacaoHeader) Class.forName(mapping.get(IUnicaLotacaoHeader.class)).newInstance();
    }
   
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IVariasLotacoesHeader getInstanceOfIVariasLotacoesHeader() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
         return (IVariasLotacoesHeader) Class.forName(mapping.get(IVariasLotacoesHeader.class)).newInstance();
    }
}
