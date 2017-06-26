/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.transport;

import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.procedimento.*;
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
    public IDadoInstalacao getInstanceOfIDadoInstalacao() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IDadoInstalacao) Class.forName(mapping.get(IDadoInstalacao.class)).newInstance();
    }
    
     /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IDadoTransporte getInstanceOfIDadoTransporte() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IDadoTransporte) Class.forName(mapping.get(IDadoTransporte.class)).newInstance();
    }
}
