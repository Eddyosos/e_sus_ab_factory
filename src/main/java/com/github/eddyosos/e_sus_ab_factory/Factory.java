/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory;

import com.github.eddyosos.e_sus_ab_factory.cds.atendimentodomiciliar.IFichaAtendimentoDomiciliarChild;
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
}
