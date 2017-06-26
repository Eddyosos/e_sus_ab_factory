/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.procedimento;

import br.gov.saude.esus.cds.transport.generated.thrift.procedimento.FichaProcedimentoChildThrift;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IFichaProcedimentoChild {

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void addToOutrosSiaProcedimentos(String elem);

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    void addToProcedimentos(String elem);

    /**
     * Retorna o valor do atributo
     * @return long
     */
    long getDtNascimento();

    /**
     * @return Objeto thrift para acesso aos metodos do thrift
     * @param fichaProcedimentoChildThrift
     */
    FichaProcedimentoChildThrift getInstance();

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    long getLocalAtendimento();

    /**
     * Retorna o numero do cartao sus
     * @return String
     */
    String getNumCartaoSus();

    /**
     * Retorna o numero de prontuario
     * @return String
     */
    String getNumProntuario();

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    List<String> getOutrosSiaProcedimentos();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    Iterator<String> getOutrosSiaProcedimentosIterator();

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    int getOutrosSiaProcedimentosSize();

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    List<String> getProcedimentos();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    Iterator<String> getProcedimentosIterator();

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    int getProcedimentosSize();

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    long getSexo();

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    long getTurno();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetDtNascimento();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetLocalAtendimento();

    /**
     * Verfica se o numero do cartao foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetNumCartaoSus();

    /**
     * Verfica se o numero de prontuario foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetNumProntuario();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetOutrosSiaProcedimentos();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetProcedimentos();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetSexo();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetStatusEscutaInicialOrientacao();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetTurno();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isStatusEscutaInicialOrientacao();

    /**
     * Atribui o valor do atributo
     * @param data de nascimento
     */
    void setDtNascimento(long dtNascimento);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setDtNascimentoIsSet(boolean value);

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setLocalAtendimento(long localAtendimento);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setLocalAtendimentoIsSet(boolean value);

    /**
     * Atribui o numero de prontuario
     * @param String
     */
    void setNumCartaoSus(String numCartaoSus);

    /**
     * Marca que o atributo foi setado
     * @param value
     */
    void setNumCartaoSusIsSet(boolean value);

    /**
     * Atribui o numero de prontuario
     * @param String
     */
    void setNumProntuario(String numProntuario);

    /**
     * Marca que o numero de prontuario foi setado
     * @param value
     */
    void setNumProntuarioIsSet(boolean value);

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setOutrosSiaProcedimentos(List<String> outrosSiaProcedimentos);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setOutrosSiaProcedimentosIsSet(boolean value);

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setProcedimentos(List<String> procedimentos);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setProcedimentosIsSet(boolean value);

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setSexo(long sexo);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setSexoIsSet(boolean value);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setStatusEscutaInicialOrientacao(boolean statusEscutaInicialOrientacao);

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setStatusEscutaInicialOrientacaoIsSet(boolean value);

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setTurno(long turno);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setTurnoIsSet(boolean value);

    /**
     * Valida todos os campos.
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validate();

    /**
     * Valida os campos com preenchimento condicional.
     * @return True caso ao menos um dos campos esteja válido, false caso todos estejam inválidos
     */
    boolean validateGroup();

    /**
     * Código do local onde o atendimento foi realizado.
     * Obrigatorio
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateLocalAtendimento();

    /**
     * Numero do cartão SUS do cidadão.
     * Opcional
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateNumCartaoSus();

    /**
     * Lista dos códigos dos procedimentos que são registrados na ficha de procedimentos.
     * Condicional
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateOutrosSiaProcedimentos();

    /**
     * Lista dos códigos dos procedimentos que são registrados na ficha de procedimentos.
     * Condicional
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateProcedimentos();

    /**
     * Código do sexo do cidadão.
     * Obrigatorio
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateSexo();

    /**
     * Indica a realização da escuta inicial.
     * Opcional
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateStatusEscutaInicialOrientacao();

    /**
     * Código do turno onde aconteceu o atendimento.
     * Opcional
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateTurno();

    /**
     * Número do prontuário do cidadão na UBS.
     * Opcional
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateUuidFicha();
    
}
