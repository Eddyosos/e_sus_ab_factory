/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cidadao;

import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.visitadomiciliar.*;
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
    public ICidadaoTransport getInstanceOfICidadaoTransport() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (ICidadaoTransport) Class.forName(mapping.get(ICidadaoTransport.class)).newInstance();
    }
    
     /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IEnderecoTransport getInstanceOfIEnderecoTransport() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IEnderecoTransport) Class.forName(mapping.get(IEnderecoTransport.class)).newInstance();
    }
}
