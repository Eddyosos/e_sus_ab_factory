/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.cadastrodomiciliar;

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
    public ICadastroDomiciliar getInstanceOfICadastroDomiciliar() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (ICadastroDomiciliar) Class.forName(mapping.get(ICadastroDomiciliar.class)).newInstance();
    }
    
        /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public ICondicaoMoradia getInstanceOfICondicaoMoradia() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (ICondicaoMoradia) Class.forName(mapping.get(ICondicaoMoradia.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IFamiliaRow getInstanceOfIFamiliaRow() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IFamiliaRow) Class.forName(mapping.get(IFamiliaRow.class)).newInstance();
    }
    
}
