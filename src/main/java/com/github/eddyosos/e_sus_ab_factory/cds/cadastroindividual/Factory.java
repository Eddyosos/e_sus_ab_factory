/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual;

import com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual.*;
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
    public ICadastroIndividual getInstanceOfICadastroIndividual() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (ICadastroIndividual) Class.forName(mapping.get(ICadastroIndividual.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public ICondicoesDeSaude getInstanceOfICondicoesDeSaude() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (ICondicoesDeSaude) Class.forName(mapping.get(ICondicoesDeSaude.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IEmSituacaoDeRua getInstanceOfIEmSituacaoDeRua() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IEmSituacaoDeRua) Class.forName(mapping.get(IEmSituacaoDeRua.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IIdentificacaoUsuarioCidadao getInstanceOfIIdentificacaoUsuarioCidadao() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IIdentificacaoUsuarioCidadao) Class.forName(mapping.get(IIdentificacaoUsuarioCidadao.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IInformacoesSocioDemograficas getInstanceOfIInformacoesSocioDemograficas() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IInformacoesSocioDemograficas) Class.forName(mapping.get(IInformacoesSocioDemograficas.class)).newInstance();
    }
}
