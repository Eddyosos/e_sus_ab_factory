/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasMenoresSeisMesesThrift;

/**
 *
 * @author eddyosos
 */
public interface IPerguntaQuestionarioCriancasMenoresSeisMeses {

    /**
     * Instance para encapsulamento do Thrifit
     * @return instance
     */
    /**
     * Identificador da pergunta referente ao questionário para cidadãos menores de seis meses
     * @return instance
     */
    PerguntaQuestionarioCriancasMenoresSeisMesesThrift getInstance();

    /**
     * Identificador da pergunta referente ao questionário para cidadãos menores de seis meses
     *
     */
    void getPergunta();

    /**
     * Identificador da pergunta referente ao questionário para cidadãos menores de seis meses
     * @return questionário para cidadãos menores de seis meses
     * caso a dataNascimento seja menos que 6 meses anterior à DataAtendimento
     */
    boolean isSetPergunta();

    /**
     * Resposta referente à pergunta
     * @return Resposta referente à pergunta
     * Caso a dataNascimento seja menos que 6 meses anterior à DataAtendimento
     */
    boolean isSetRespostaUnicaEscolha();

    void setPerguntaIsSet(boolean value);

    /**
     * Resposta referente à pergunta
     * @param value
     */
    void setRespostaUnicaEscolhaIsSet(boolean value);

    void unsetPergunta();

    void unsetRespostaUnicaEscolha();

    /**
     * Valida questionário para cidadãos menores de seis meses
     * @return questionário para cidadãos menores de seis meses
     * É condicinal
     */
    boolean validaPergunta();

    /**
     * Valida Resposta referente à pergunta
     * @return Resposta referente à pergunta
     * Também pode ser Condicional de acordo com dataNascimento
     */
    boolean validaRespostaUnicaEscolha();

    /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação
     * PerguntaQuestionarioCriancasMenoresSeisMeses e respostaUnicaEscolha
     */
    boolean validades();
    
}
