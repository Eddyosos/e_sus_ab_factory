/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift;

/**
 *
 * @author eddyosos
 */
public interface IPerguntaQuestionarioCriancasDeSeisVinteTresMeses {

    PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift getInstance();

    /**
     * Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.
     * @return Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.
     * Obrigatório caso a dataNascimento seja menos que 23 meses e mais que 6 meses anterior à DataAtendimento
     */
    boolean isSetPergunta();

    /**
     * Resposta referente à pergunta
     * @return Resposta referente à pergunta
     * Obrigatório caso a dataNascimento seja menos que 24 meses e mais que 6 meses anterior à DataAtendimento
     */
    boolean isSetRespostaUnicaEscolha();

    /**
     * Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.
     * @param value
     * Obrigatório caso a dataNascimento seja menos que 23 meses e mais que 6 meses anterior à DataAtendimento
     */
    void setPerguntaIsSet(boolean value);

    /**
     * Resposta referente à pergunta
     * @param value
     * Obrigatório caso a dataNascimento seja menos que 24 meses e mais que 6 meses anterior à DataAtendimento
     */
    void setRespostaUnicaEscolhaIsSet(boolean value);

    void unsetPergunta();

    void unsetRespostaUnicaEscolha();

    /**
     * Valida pergunta referente ao questionário para cidadãos menores de seis meses
     * @return questionário para cidadãos menores de seis meses
     * É condicional
     * Obrigatório caso a dataNascimento seja menos que 23 meses e mais que 6 meses anterior à DataAtendimento
     */
    boolean validaPergunta();

    /**
     * Resposta referente a pergunta ao questionário para cidadãos menores de seis meses
     * @return Resposta referente a pergunta
     * É Condiconal
     * Obrigatório caso a dataNascimento seja menos que 24 meses e mais que 6 meses anterior à DataAtendimento
     */
    boolean validaRespostaUnicaEscolha();

    /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação
     * Valida validaPergunta() e validaRespostaUnicaEscolha()
     */
    boolean validades();
    
}
