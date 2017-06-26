/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory;

import com.github.eddyosos.e_sus_ab_factory.cds.atendimentodomiciliar.IFichaAtendimentoDOmiciliarMaster;
import com.github.eddyosos.e_sus_ab_factory.cds.atendimentodomiciliar.IFichaAtendimentoDomiciliarChild;
import com.github.eddyosos.e_sus_ab_factory.cds.atendimentoodontologico.IFichaAtendimentoOdontologicoChild;
import com.github.eddyosos.e_sus_ab_factory.cds.atendimentoodontologico.IFichaAtendimentoOdontologicoMaster;
import com.github.eddyosos.e_sus_ab_factory.cds.atendimentoodontologico.IProcedimentoQuantidade;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual.IFichaAtendimentoIndividualChild;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual.IFichaAtendimentoIndividualMaster;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual.IOutrosSia;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual.IProblemaCondicaoAvaliacaoAI;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IEnderecoLocalPermanencia;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IHeaderCdsCadastro;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IUnicaLotacaoHeader;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IVariasLotacoesHeader;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.avaliacaoelegibilidade.IFichaAvaliacaoElegibilidade;
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
    
    //Avaliacao Elegibilidade
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IFichaAvaliacaoElegibilidade getInstanceOfIFichaAvaliacaoElegibilidade() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IFichaAvaliacaoElegibilidade) Class.forName(mapping.get(IFichaAvaliacaoElegibilidade.class)).newInstance();
    }
    
    //atividade individual
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IFichaAtendimentoIndividualChild getInstanceOfIFichaAtendimentoIndividualChild() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IFichaAtendimentoIndividualChild) Class.forName(mapping.get(IFichaAtendimentoIndividualChild.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IFichaAtendimentoIndividualMaster getInstanceOfIFichaAtendimentoIndividualMaster() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IFichaAtendimentoIndividualMaster) Class.forName(mapping.get(IFichaAtendimentoIndividualMaster.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IOutrosSia getInstanceOfIOutrosSia() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IOutrosSia) Class.forName(mapping.get(IOutrosSia.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IProblemaCondicaoAvaliacaoAI getInstanceOfIProblemaCondicaoAvaliacaoAI() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IProblemaCondicaoAvaliacaoAI) Class.forName(mapping.get(IProblemaCondicaoAvaliacaoAI.class)).newInstance();
    }
    
    //atendimento odontologico
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IFichaAtendimentoOdontologicoChild getInstanceOfIFichaAtendimentoOdontologicoChild() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IFichaAtendimentoOdontologicoChild) Class.forName(mapping.get(IFichaAtendimentoOdontologicoChild.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IFichaAtendimentoOdontologicoMaster getInstanceOfIFichaAtendimentoOdontologicoMaster() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IFichaAtendimentoOdontologicoMaster) Class.forName(mapping.get(IFichaAtendimentoOdontologicoChild.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IProcedimentoQuantidade getInstanceOfIProcedimentoQuantidade() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IProcedimentoQuantidade) Class.forName(mapping.get(IProcedimentoQuantidade.class)).newInstance();
    }
    
    //atendimento domiciliar
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IFichaAtendimentoDomiciliarChild getInstanceOfFichaAtendimentoDomiciliarChild() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IFichaAtendimentoDomiciliarChild) Class.forName(mapping.get(IFichaAtendimentoDomiciliarChild.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IFichaAtendimentoDOmiciliarMaster getInstanceOfIFichaAtendimentoDOmiciliarMaster() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IFichaAtendimentoDOmiciliarMaster) Class.forName(mapping.get(IFichaAtendimentoDOmiciliarMaster.class)).newInstance();
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
