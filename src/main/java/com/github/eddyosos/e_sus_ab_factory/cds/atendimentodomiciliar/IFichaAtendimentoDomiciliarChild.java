/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.atendimentodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar.FichaAtendimentoDomiciliarChildThrift;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IFichaAtendimentoDomiciliarChild {

    /**
     * Retorna instancia encapsulada thrift
     * @return 
     */
    FichaAtendimentoDomiciliarChildThrift getInstance();
    
    /**
     * Retorna a modalidade AD do cidadão atendido.
     * @return Código da modalidade AD do cidadão atendido.
     */
    long getAtencaoDomiciliarModalidade();

    /**
     * Código do CIAP registrado no atendimento.
     * @return código do CIAP registrado no atendimento.
     */
    String getCiap();

    /**
     * Código do CID registrado no atendimento.
     * @return Código do CID registrado no atendimento.
     */
    String getCid();

    /**
     * Retorna o CNS do cidadão que participou da atividade.
     * @return CNS do cidadão que participou da atividade.
     */
    String getCns();

    /**
     * Desfecho do atendimento do cidadão.
     * @return Código do desfecho do atendimento do cidadão.
     */
    long getCondutaDesfecho();

    /**
     * Data de nascimento do cidadão.
     * @return Data de nascimento do cidadão.
     */
    long getDataNascimento();

    /**
     * Retorna o cógido do local onde o atendimento foi realizado.
     * @return Cógido do local onde o atendimento foi realizado.
     */
    long getLocalAtendimento();

    /**
     * Procedimentos SIGTAP registrados no atendimento.
     * @return Lista com os procedimentos SIGTAP do atendimento.
     */
    List<String> getOutrosProcedimentos();

    /**
     * Retorna os procedimentos registrados no atendimento.
     * @return procedimentos registrados no atendimento.
     */
    List<String> getProcedimentos();

    /**
     * Retorna o sexo do cidadão.
     * @return Código do sexo do cidadão.
     */
    long getSexo();

    /**
     * Lista de marcadores das situações presentes.
     * @return Marcadores das situações presentes.
     */
    List<Long> getSituacoesPresentes();

    /**
     * Retorna o ripo de atendimento.
     * @return Código do tipo de atendimento.
     */
    long getTipoAtendimento();

    /**
     * Código do turno onde aconteceu o atendimento.
     * @return O código do turno onde aconteceu o atendimento.
     */
    long getTurno();

    /**
     * Define a modalidade AD do cidadão atendido.
     *
     * Presença obrigatória.
     * Regras: Apenas as opções 1, 2 e 3 são aceitas.
     *
     * @param atencaoDomiciliarModalidade Código da modalidade AD do cidadão atendido.
     */
    void setAtencaoDomiciliarModalidade(long atencaoDomiciliarModalidade);

    /**
     * Define o código do CIAP registrado no atendimento.
     * @param ciap Código do CIAP registrado no atendimento.
     */
    void setCiap(String ciap);

    /**
     * Define o código do CID registrado do atendimento.
     * @param cid Código do CID registrado no atendimento.
     */
    void setCid(String cid);

    /**
     * Define o CNS do cidadão que participou da atividade.
     * Presença Opcional.
     * @param cns CNS do cidadão que participou da atividade.
     */
    void setCns(String cns);

    /**
     * Define o desfecho do atendimento do cidadão.
     *
     * Regras: Não podem conter as opções 7 ou 8.
     *
     * @param condutaDesfecho Código do desfecho do atendimento do cidadão.
     */
    void setCondutaDesfecho(long condutaDesfecho);

    /**
     * Define a data de nascimento do cidadão.
     *
     * Presença obrigatória.
     * Regras: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     *
     * @param dataNascimento Data de nascimento do cidadão.
     */
    void setDataNascimento(long dataNascimento);

    /**
     * Define o local onde o atendimento foi realizado.
     *
     * Presença obrigatória.
     *
     * @param localAtendimento Cógido do local onde o atendimento foi realizado.
     */
    void setLocalAtendimento(long localAtendimento);

    /**
     * Define os procedimentos SIGTAP do atendimento.
     *
     * Não podem conter procedimentos repetidos.
     * Não podem ser iguais aos procedimentos.
     * Máximo: 4
     *
     * @param outrosProcedimentos Lista contendo os códigos dos procedimentos SIGTAP do atendimento.
     */
    void setOutrosProcedimentos(List<String> outrosProcedimentos);

    /**
     * Define os procedimentos do atendimento.
     * Máximo: 21
     * @param procedimentos lista de procedimentos.
     */
    void setProcedimentos(List<String> procedimentos);

    /**
     * Define o sexo do cidadão.
     *
     * Presença obrigatória.
     *
     * @param sexo Código do sexo do cidadão.
     */
    void setSexo(long sexo);

    /**
     * Insere uma lista de marcadores das situações presentes.
     * @param situacoesPresentes Marcadores das situações presentes.
     */
    void setSituacoesPresentes(List<Long> situacoesPresentes);

    /**
     * Define se a família irá receber acompanhamento pós-óbito.
     * @param statusInicioAcompanhamentoPosObito True caso a familia va receber acompanhamento pós-óbito.
     */
    void setStatusInicioAcompanhamentoPosObito(boolean statusInicioAcompanhamentoPosObito);

    /**
     * Define o tipo de atendimento.
     *
     * Presença obrigatória.
     * Regras: Apenas as opções 7 e 8 são aceitas.
     *
     * @param tipoAtendimento Código do tipo de atendimento.
     */
    void setTipoAtendimento(long tipoAtendimento);

    /**
     * Define o turno onde aconteceu o atendimento.
     * Presença obrigatória.
     * @param turno Código do turno onde aconteceu o atendimento.
     */
    void setTurno(long turno);
    
}
