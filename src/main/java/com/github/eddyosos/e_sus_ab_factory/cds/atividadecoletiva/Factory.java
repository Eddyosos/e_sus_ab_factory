/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.atividadecoletiva;

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
    public IFichaAtividadeColetiva getInstanceOfIFichaAtividadeColetiva() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IFichaAtividadeColetiva) Class.forName(mapping.get(IFichaAtividadeColetiva.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IParticipanteRowItem getInstanceOfIParticipanteRowItem() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IParticipanteRowItem) Class.forName(mapping.get(IParticipanteRowItem.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IProfissionalCboRowItem getInstanceOfIProfissionalCboRowItem() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IProfissionalCboRowItem) Class.forName(mapping.get(IProfissionalCboRowItem.class)).newInstance();
    }
}
