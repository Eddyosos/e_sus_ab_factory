/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.consumoalimentar;

import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.avaliacaoelegibilidade.*;
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
    public IFichaConsumoAlimentar getInstanceOfIFichaConsumoAlimentar() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IFichaConsumoAlimentar) Class.forName(mapping.get(IFichaConsumoAlimentar.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IPerguntaQuestionarioCriancasComMaisDoisAnos getInstanceOfIPerguntaQuestionarioCriancasComMaisDoisAnos() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IPerguntaQuestionarioCriancasComMaisDoisAnos) Class.forName(mapping.get(IPerguntaQuestionarioCriancasComMaisDoisAnos.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IPerguntaQuestionarioCriancasDeSeisVinteTresMeses getInstanceOfIPerguntaQuestionarioCriancasDeSeisVinteTresMeses() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IPerguntaQuestionarioCriancasDeSeisVinteTresMeses) Class.forName(mapping.get(IPerguntaQuestionarioCriancasDeSeisVinteTresMeses.class)).newInstance();
    }
    
    /**
     * Intancia e retorna 
     * @return instancia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public IPerguntaQuestionarioCriancasMenoresSeisMeses getInstanceOfIPerguntaQuestionarioCriancasMenoresSeisMeses() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IPerguntaQuestionarioCriancasMenoresSeisMeses) Class.forName(mapping.get(IPerguntaQuestionarioCriancasMenoresSeisMeses.class)).newInstance();
    }
}
