/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.IdentificacaoUsuarioCidadaoThrift;

/**
 *
 * @author eddyosos
 */
public interface IIdentificacaoUsuarioCidadao {

    /**
     * Valida o emailCidadao
     *
     * Presença não obrigatória.
     *
     * Tamanho mínimo : 6 Tamanho máximo: 100
     *
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    boolean ValidaEmailCidadao();

    /**
     * Valida nacionalidade cidadao
     *
     * @return True caso nacionalidadeCidadao seja maior ou igual a 1 ou menor
     * igual a 3 False caso este nao seja maior ou igual a 1 ou menor igual a 3
     * False caso nao esteja setado
     */
    boolean ValidaNaciondalidaCidade();

    /**
     * devolve um codigoIbgeMunicipio
     * @return codigoIbgeMunicipio String
     */
    String getCodigoIbgeMunicipioNascimento();

    /**
     * Devolve um dataNascimentoCidadao
     * @return dataNascimentoCidadao long
     */
    long getDataNascimentoCidadao();

    /**
     * Devolve um dataNascimentoResponsavel
     * @return dataNascimentoResponsavel long
     */
    long getDataNascimentoResponsavel();

    /**
     * Devolve o valor de emailCidadao
     * @return emailCidadao String
     */
    String getEmailCidadao();

    /**
     * Devolve uma instancia de identificacaoUsuarioCidadaoThrift
     * @return identificacaoUsuarioCidadaoThrift IdentificacaoUsuarioCidadaoThrift
     */
    IdentificacaoUsuarioCidadaoThrift getInstance();

    /**
     * Devolve o valor de nacionalidadeCidadao
     * @return nacionalidadeCidadao long
     */
    long getNacionalidadeCidadao();

    /**
     * Devolve o valor de nomeCidadao
     * @return nomeCidadao String
     */
    String getNomeCidadao();

    /**
     * Devolve o valor de nomeMaeCidadao
     * @return nomeMaeCidadao String
     */
    String getNomeMaeCidadao();

    /**
     * Devolve um nomeSocialCidadao
     * @return nomeSocialCidadao String
     */
    String getNomeSocialCidadao();

    /**
     * Devolve o valor de numeroCartaoSus
     * @return numeroCartaoSus String
     */
    String getNumeroCartaoSus();

    /**
     * Devolve o valor de numeroCartaoSusResponsavel
     * @return numeroCartaoSusResponsavel String
     */
    String getNumeroCartaoSusResponsavel();

    /**
     * Devolve o valor de numeroCelularCidadao
     * @return numeroCelularCidadao String
     */
    String getNumeroCelularCidadao();

    /**
     * Devolve o valor de numeroNisPisPasep
     * @return numeroNisPisPasep String
     */
    String getNumeroNisPisPasep();

    /**
     * Devolve o valor de paisNascimento
     * @return paisNascimento long
     */
    long getPaisNascimento();

    /**
     * Devolve o valor de racaCorCidadao
     * @return racaCorCidadao long
     */
    long getRacaCorCidadao();

    /**
     * Devolve o valor de sexoCidadao
     * @return sexoCidadao long
     */
    long getSexoCidadao();

    /**
     * Devolve um desconheceNomeMae
     * @return desconheceNomeMae boolean
     */
    boolean isDesconheceNomeMae();

    /**
     * Devolve o valor de StatusEhResponsavel
     * @return StatusEhResponsavel boolean
     */
    boolean isStatusEhResponsavel();

    /**
     * Altera um codigoIbgeMunicipio
     * @param codigoIbgeMunicipioNascimento String
     */
    void setCodigoIbgeMunicipioNascimento(String codigoIbgeMunicipioNascimento);

    /**
     * Altera um dataNascimentoCidadao
     * @param dataNascimentoCidadao long
     */
    void setDataNascimentoCidadao(long dataNascimentoCidadao);

    /**
     * Altera um dataNascimentoResponsavel
     * @param dataNascimentoResponsavel long
     */
    void setDataNascimentoResponsavel(long dataNascimentoResponsavel);

    /**
     * altera o valor de desconheceNomeMae
     * @param desconheceNomeMae boolean
     */
    void setDesconheceNomeMae(boolean desconheceNomeMae);

    /**
     * Altera o valor de emailCidadao
     * @param emailCidadao String
     */
    void setEmailCidadao(String emailCidadao);

    /**
     * Altera o valor de nacionalidadeCidadao
     * @param nacionalidadeCidadao long
     */
    void setNacionalidadeCidadao(long nacionalidadeCidadao);

    /**
     * Altera o valor de nomeCidadao
     * @param nomeCidadao String
     */
    void setNomeCidadao(String nomeCidadao);

    /**
     * Altera o valor de nomeMaeCidadao
     * @param nomeMaeCidadao String
     */
    void setNomeMaeCidadao(String nomeMaeCidadao);

    /**
     * Altera um nomeSocialCidadao
     * @param nomeSocialCidadao String
     */
    void setNomeSocialCidadao(String nomeSocialCidadao);

    /**
     * Altera o valor de numeroCartaoSus
     * @param numeroCartaoSus String
     */
    void setNumeroCartaoSus(String numeroCartaoSus);

    /**
     * Altera o valor de numeroCartaoSusResponsavel
     * @param numeroCartaoSusResponsavel String
     */
    void setNumeroCartaoSusResponsavel(String numeroCartaoSusResponsavel);

    /**
     * Altera o valor de numeroCelularCidadao
     * @param numeroCelularCidadao String
     */
    void setNumeroCelularCidadao(String numeroCelularCidadao);

    /**
     * Altera o valor de numeroNisPisPasep
     * @param numeroNisPisPasep String
     */
    void setNumeroNisPisPasep(String numeroNisPisPasep);

    /**
     * Altera o valor de paisNascimento
     * @param paisNascimento Long
     */
    void setPaisNascimento(long paisNascimento);

    /**
     * Altera o valor de racaCorCidadao
     * @param racaCorCidadao long
     */
    void setRacaCorCidadao(long racaCorCidadao);

    /**
     * Altera o valor de sexoCidadao
     * @param sexoCidadao long
     */
    void setSexoCidadao(long sexoCidadao);

    /**
     * Altera o valor de StatusEhResponsavel
     * @param statusEhResponsavel boolean
     */
    void setStatusEhResponsavel(boolean statusEhResponsavel);

    /**
     * Valida codigo IbgeMunicipioNascimento. Tem q ser preenchido caso
     * NacionalidadeCidadao seja igual à 1. Caso contrario, nao há necessidade
     * de preenchimento.
     *
     * @return true caso valido. False caso invalido
     */
    boolean validaCodigoIbgeMunicipioNascimento();

    /**
     * Valida nome da mae cidadao Condicional Se desconheceMae for igual a true.
     * Não precisa ser preenchido. Caso contrário é necessário Nome da mae
     * precisa ser maior que 4 e menor que 101
     *
     * @return true caso válido, false caso invalido
     */
    boolean validaNomeMaeCidadao();

    /**
     * Valida nomeSocialCidadao
     *
     * @return true caso valido, false caso invalido
     */
    boolean validaNomeSocialCidadao();

    /**
     * Valida numeroCartaoSus Usa as regras definidas por um algoritimo pré
     * definido
     *
     * @return True caso valido. False caso inválido
     */
    boolean validaNumeroCartaoSus();

    /**
     * Valida NumeroCartaoSusResponsavel Usa as regras definidas por um
     * algoritimo pré definido Condicional: StatusEhResponsavel precisa ser True
     * para NumeroCartaoSusResponsavel ser preenchido.
     *
     * @return True caso valido. False caso inválido
     */
    boolean validaNumeroCartaoSusResponsavel();

    /**
     * Valida numero celular Cidadao Deve conter apenas numeros. Tamanho min de
     * 10 e max de 11
     *
     * @return true caso valido. False invalido.
     */
    boolean validaNumeroCelularCidadao();

    /**
     * Valida numero Nis Pis Pasep Deve conter apenas 11 numeros
     *
     * @return true caso valido. False invalido.
     */
    boolean validaNumeroNisPisPasep();

    /**
     * Valida paisNascimento Condiocional: NacionalidadeCidadao deve ser
     * diferente de 1 para esta ser preenchida paisNacimento deve ser maior que
     * 0 e menor q 239
     *
     * @return true caso valido. False caso invalido
     */
    boolean validaPaisNacimento();

    /**
     * Valida racaCorCidadao Obrigatorio Deve ser maior que 0 e menor que 6
     *
     * @return
     */
    boolean validaRacaCorCidadao();

    /**
     * Valida sexoCidadao Obrigatorio Deve ser igual 0 ou 1
     *
     * @return
     */
    boolean validaSexoCidadao();

    /**
     * Valida todos os fields
     * @return True caso todos estejam validos. False caso algum deles nao esteja valido
     */
    boolean validates();
    
}
