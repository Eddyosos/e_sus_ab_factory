/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ParticipanteRowItemThrift;

/**
 *
 * @author eddyosos
 */
public interface IParticipanteRowItem {

    /**
     * Devolve o valor de altura
     * @return altura double
     */
    double getAltura();

    /**
     * Devolve um cns
     * @return cns String
     */
    String getCns();

    /**
     * Devolve uma dataNascimento
     * @return dataNascimento long
     */
    long getDataNascimento();

    /**
     *  Devolve uma instancia de ParticipanteRowItemThrift
     * @return participanteRowItemThrift ParticipanteRowItemThrift
     */
    ParticipanteRowItemThrift getInstance();

    /**
     * Devolve o valor de peso
     * @return peso double
     */
    double getPeso();

    /**
     * Devolve o valor de abandonouGrupo
     * @return abandonouGrupo boolean
     */
    boolean isAbandonouGrupo();

    /**
     * Retorna o valor de AvaliacaoAlterada
     * @return AvaliacaoAlterada boolean
     */
    boolean isAvaliacaoAlterada();

    /**
     * Devolve o valor de cessouHabitoFumar
     * @return cessouHabitoFumar boolean
     */
    boolean isCessouHabitoFumar();

    /**
     * Altera o valor de abandonouGrupo
     * @param abandonouGrupo boolean
     */
    void setAbandonouGrupo(boolean abandonouGrupo);

    /**
     * Altera o valor de altura
     * @param altura double
     */
    void setAltura(double altura);

    /**
     * Altera o valor de AvaliacaoAlterada
     * @param avaliacaoAlterada boolean
     */
    void setAvaliacaoAlterada(boolean avaliacaoAlterada);

    /**
     * Altera o valor de cessouHabitoFumar
     * @param cessouHabitoFumar boolean
     */
    void setCessouHabitoFumar(boolean cessouHabitoFumar);

    /**
     * Altera o valor de cns
     * @param cns string
     */
    void setCns(String cns);

    /**
     * Altera o valor de dataNascimento
     * @param dataNascimento long
     */
    void setDataNascimento(long dataNascimento);

    /**
     * Altera o valor de peso
     * @param peso double
     */
    void setPeso(double peso);

    /**
     * Valida o fields AvaliacaoAlterada
     *
     * @return True caso o mesmo seja igual a true ou false. False caso nao seja
     * igual a nenhum destes
     */
    boolean validaAvaliacaoAlterada();

    /**
     * Valida o field Cns
     *
     * @return False - Caso o Field não esteja setado. True - caso o numero
     * inicial seja 1 ou 2 ou 7 ou 8 ou 9 e atenda aos padrões do cartao SUS
     * False - caso o número esteja setado e nao atenda aos padrões do cartão
     * SUS.
     */
    boolean validaCns();

    /**
     * Valida Peso. Para ser valido, caso tenha sido inserido, deve: 1- Máximo
     * de 3 números após a vírgula. 2- Se tiver vírgula, tamanho máximo = 7. 3-
     * Valor mínimo 0,5 e máximo 500.
     *
     * @return true se válido false se inválido
     */
    boolean validaPeso();

    /**
     * Valida Altura. Para ser válido deve: 1- Máximo
     * de 3 números após a vírgula. 2- Se tiver vírgula, tamanho máximo = 5. 3-
     * Valor mínimo 20 e máximo 250.
     *
     * @return true se válido false se inválido
     */
    boolean validateAltura();

    /**
     * Valida todos os fields
     * @return True caso todos estejam validos
     * False caso algum deles esteja invalido.
     */
    boolean validates();
    
}
