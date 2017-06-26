/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual;

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
}
