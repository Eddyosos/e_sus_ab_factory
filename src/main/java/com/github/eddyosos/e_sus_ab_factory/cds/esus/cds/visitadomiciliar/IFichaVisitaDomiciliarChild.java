/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.visitadomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarChildThrift;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IFichaVisitaDomiciliarChild {

    /**
     * Adiciona um novo elemento a lista motivosVisista
     * @param elem
     */
    void addToMotivosVisita(long elem);

    /**
     * Retorna o valor de desfecho
     * @return desfecho long
     */
    long getDesfecho();

    /**
     * Retorna a data de Nascimento
     * @return dtNascimento Long
     */
    long getDtNascimento();

    FichaVisitaDomiciliarChildThrift getInstance();

    /**
     * Retorna a lista motivosVisista
     * @return MotivosVisita List
     */
    List<Long> getMotivosVisita();

    /**
     * Retorna o iterator de MotivosVisita
     * @return motivosVisitaIterator
     */
    Iterator<Long> getMotivosVisitaIterator();

    /**
     * Retorna o  tamanho de motivos de visita
     * @return motivosVisitaSize int
     */
    int getMotivosVisitaSize();

    /**
     * Retorna o numero de cartão do SuS
     * @return numCartaoSus String
     */
    String getNumCartaoSus();

    /**
     * Retorna o numero de prontuario
     * @return numProntuario String
     */
    String getNumProntuario();

    /**
     * Retorna o valor de sexo
     * @return sexo long
     */
    long getSexo();

    /**
     * Devolve um field turno
     * @return turno
     */
    long getTurno();

    /**
     * Verifica se o field desfecho está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */
    boolean isSetDesfecho();

    /**
     * Verifica se o field dtNascimento está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */
    boolean isSetDtNascimento();

    /**
     * Verifica se o field MotivosVisita está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */
    boolean isSetMotivosVisita();

    /**
     * Verifica se o field numCartaoSus está setado
     * @return true caso o valor esteja setado false caso não esteja setado
     */
    boolean isSetNumCartaoSus();

    /**
     * Verifica se o field numProntuario está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */
    boolean isSetNumProntuario();

    /**
     * Verifica se o field sexo está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */
    boolean isSetSexo();

    /**
     * Verifica se o field statusVisitaCompartilhadaOutroProfissional está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */
    boolean isSetStatusVisitaCompartilhadaOutroProfissional();

    /**
     * Verifica se turno esta setado
     * @return true caso esteja setado
     * false caso nao esteja
     */
    boolean isSetTurno();

    /**
     * Retorna se a visita foi compartilhada com outro profissional
     * @return true caso sim, false caso nao.
     */
    boolean isStatusVisitaCompartilhadaOutroProfissional();

    /**
     * Muda o valor de desfecho
     * @param desfecho String
     */
    void setDesfecho(long desfecho);

    /**
     * Altera o valor do isSet do field desfecho
     * @param value boolean
     */
    void setDesfechoIsSet(boolean value);

    /**
     * Muda o valor do numero de dtNascimento
     * @param dtNascimento String
     */
    void setDtNascimento(long dtNascimento);

    /**
     * Altera o valor do isSet do field dtNascimento
     * @param value boolean
     */
    void setDtNascimentoIsSet(boolean value);

    /**
     * Muda o valor do MotivosVisita
     * @param motivosVisita List
     */
    void setMotivosVisita(List<Long> motivosVisita);

    /**
     * Altera o valor do isSet do field MotivosVisita
     * @param value boolean
     */
    void setMotivosVisitaIsSet(boolean value);

    /**
     * Muda o valor do numero do cartao Sus
     * @param numCartaoSus String
     */
    void setNumCartaoSus(String numCartaoSus);

    /**
     * Altera o valor do isSet do field numCartaoSus
     * @param value boolean
     */
    void setNumCartaoSusIsSet(boolean value);

    /**
     * Muda o valor do numero de prontuario
     * @param numProntuario String
     */
    void setNumProntuario(String numProntuario);

    /**
     * Altera o valor do isSet do field numProntuario
     * @param value boolean
     */
    void setNumProntuarioIsSet(boolean value);

    /**
     * Muda o valor do field sexo
     * @param sexo String
     */
    void setSexo(long sexo);

    /**
     * Altera o valor do isSet do field sexo
     * @param value boolean
     */
    void setSexoIsSet(boolean value);

    /**
     * Altera o valor se a visita foi compartilhada ou nao
     * @param statusVisitaCompartilhadaOutroProfissional boolean
     */
    void setStatusVisitaCompartilhadaOutroProfissional(boolean statusVisitaCompartilhadaOutroProfissional);

    /**
     * Altera o valor do isSet do field statusVisitaCompartilhadaOutroProfissional
     * @param value boolean
     */
    void setStatusVisitaCompartilhadaOutroProfissionalIsSet(boolean value);

    /**
     * Altera o valor de turno
     * @param turno
     */
    void setTurno(long turno);

    /**
     * Seta o valor booleano de isSetTurno
     * @param value boolean
     */
    void setTurnoIsSet(boolean value);

    /**
     * Apaga o valor do field desfecho
     */
    void unsetDesfecho();

    /**
     * Apaga o valor do field dtNascimento
     */
    void unsetDtNascimento();

    /**
     * Apaga o valor do field MotivosVisita
     */
    void unsetMotivosVisita();

    /**
     * Apaga o valor do field numCartaoSus
     */
    void unsetNumCartaoSus();

    /**
     * Apaga o valor do field numProntuario
     */
    void unsetNumProntuario();

    /**
     * Apaga o valor do field sexo
     */
    void unsetSexo();

    /**
     * Apaga o valor do field statusVisitaCompartilhadaOutroProfissional
     */
    void unsetStatusVisitaCompartilhadaOutroProfissional();

    /**
     * Apaga o valor do field turno(null)
     */
    void unsetTurno();

    /**
     * Valida o field DESFECHO
     * @return true caso o valor de DESFECHO esteja setado e esteja entre os valores de 1 a 3
     * false caso o valor de DESFECHO esteja setado e diferente dos valores de 1 a 3
     * false caso o valor de DESFECHO não esteja setado
     */
    boolean validaDesfecho();

    /**
     * Valida o field MOTIVOS_VISITA
     * @return true caso o field DESFECHO seja igual a 1 e MOTIVOS_VISITA tenha o valor de 1 - 33.
     * true caso o field DESFECHO seja igual a 1 e MOTIVOS_VISITA nao tenha valor setado
     * true caso o field DESFECHO seja diferente de 1 e MOTIVOS_VISITA nao tenha sido setado
     * false caso o field DESFECHO seja igual a 1 e MOTIVOS_VISITA tenha valor diferente da faixa de 1 - 33
     * false caso o field DESFECHO seja diferente de 1 e MOTIVOS_VISISTA tenha sido setado
     */
    boolean validaMotivosVisita();

    /**
     * Verifica se o número do cartão Sus é válido
     * @return true - Caso o Field não esteja setado
     * true- caso o numero inicial seja 1 ou 2 ou 7 ou 8 ou 9 e atenda aos padrões do cartao SUS
     * false - caso o número esteja setado e nao atenda aos padrões do cartão SUS.
     */
    boolean validaNumCartaoSus();

    /**
     * Valida o Field NUM_PRONTUARIO.
     * @return True - Caso não tenha nada setado dentro do field NUM_PRONTUARIO.
     * True - Caso tenha setado um valor em NUM_PRONTUARIO e este valor de String seja menor ou igual a 30 caracteres e contenha apenas letras e numeros
     * False - Caso tenha um setado valor me NUM_PRONTUARIO e este valor de String seja maior que 30 caracteres ou contenha caracteres especiais
     */
    boolean validaNumProntuario();

    /**
     * Valida o field SEXO
     * @return true caso o valor esteja setado e seja igual a 0 ou 1
     * false caso nenhum valor esteja setado
     * false caso o valor esteja setado e seja diferente de 0 ou 1
     */
    boolean validaSexo();

    /**
     * valida o field STATUS_VISITA_COMPARTILHADA_OUTRO_PROFISSIONAL
     * @return true caso os valores estejam setados e sejam iguais a true ou false
     * true caso nenhum valor esteja setado
     * false caso os valores estejam setados e não sejam iguais a true ou false
     */
    boolean validaStatusVisitaCompartilhada();

    /**
     * Valida o field TURNO
     * @return true caso nenhuma valor esteja setado, pois nao é um campo obrigatorio
     * true caso o valor de turno esteja setado e seja igual a 1, 2 ou 3
     * false caso o valor de turno esteja setado e seja diferente de 1,2 ou 3.
     */
    boolean validaTurno();

    /**
     * Valida todos os Fields
     * @return true caso todos os fieds estejam nos padrões aceitos
     * false, caso um atributo nao esteja nos padrões aceitos
     */
    boolean validates();
    
}
