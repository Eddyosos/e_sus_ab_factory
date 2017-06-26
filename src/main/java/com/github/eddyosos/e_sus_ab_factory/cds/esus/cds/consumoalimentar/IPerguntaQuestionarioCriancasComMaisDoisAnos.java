/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasComMaisDoisAnosThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.RespostaMultiplaEscolhaEnumThrift;
import java.util.Iterator;

/**
 *
 * @author eddyosos
 */
public interface IPerguntaQuestionarioCriancasComMaisDoisAnos {

    PerguntaQuestionarioCriancasComMaisDoisAnosThrift getInstance();

    /**
     * Resposta referente à pergunta do registro.
     * @return List
     */
    Iterator<RespostaMultiplaEscolhaEnumThrift> getRespostaMultiplaEscolhaIterator();

    /**
     * Resposta referente à pergunta do registro acima.
     * @return getRespostaMultiplaEscolhaSize
     */
    int getRespostaMultiplaEscolhaSize();

    /**
     * Pergunta do questionário de cidadãos que tem vinte e quatro meses ou mais.
     * @return questionário de cidadãos que tem vinte e quatro meses ou mais.
     * Obrigatório caso a dataNascimento seja mais que 24 meses anterior à DataAtendimento
     */
    boolean isSetPergunta();

    /**
     * Resposta referente à pergunta do registro acima(RespostaUnicaEscolha).
     * @return Resposta referente à pergunta do registro acima.
     * Deve respeitar as regras das respostas referentes à pergunta
     * Pode ser preenchido somente se a pergunta for 12L.
     */
    boolean isSetRespostaMultiplaEscolha();

    /**
     * Resposta referente a pergunta do registro.
     * @return Resposta referente a pergunta do registro.
     * Obrigatório caso a dataNascimento seja mais que 24 meses anterior à DataAtendimento.
     */
    boolean isSetRespostaUnicaEscolha();

    /**
     * Pergunta do questionário de cidadãos que tem vinte e quatro meses ou mais.
     * @param value
     */
    void setPerguntaIsSet(boolean value);

    /**
     * Resposta referente à pergunta do registro acima(RespostaUnicaEscolha).
     * @param value
     */
    void setRespostaMultiplaEscolhaIsSet(boolean value);

    /**
     * Resposta referente a pergunta do registro.
     * @param value
     * Obrigatório caso a dataNascimento seja mais que 24 meses anterior à DataAtendimento.
     */
    void setRespostaUnicaEscolhaIsSet(boolean value);

    void unsetPergunta();

    void unsetRespostaMultiplaEscolha();

    void unsetRespostaUnicaEscolha();

    /**
     * Valida Pergunta do questionário de cidadãos que tem vinte e quatro meses ou mais.
     * @return questionário de cidadãos que tem vinte e quatro meses ou mais
     * É condicional
     * Obrigatório caso a dataNascimento seja mais que 24 meses anterior à DataAtendimento
     */
    boolean validaPergunta();

    /**
     * Valida Resposta referente à pergunta do registro acima
     * @return Resposta referente à pergunta do registro acima
     * É Condicional
     * Deve respeitar as regras das respostas referentes à pergunta .
     * Pode ser preenchido somente se a pergunta for 12L.
     */
    boolean validaRespostaMultiplaEscolha();

    /**
     * Valida Resposta referente a pergunta do Registro
     * @return Resposta referente a pergunta do registro
     * É Condiconal
     * Obrigatório caso a dataNascimento seja mais que 24 meses anterior à DataAtendimento.
     */
    boolean validaRespostaUnicaEscolha();

    /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação
     * Valida validaPergunta(), validaRespostaUnicaEscolha() e validaRespostaMultiplaEscolha()
     */
    boolean validades();
    
}
