/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual;

import com.github.eddyosos.e_sus_ab_factory.cds.common.IHeaderCdsCadastro;

/**
 *
 * @author eddyosos
 */
public interface ICadastroIndividual {

    /**
     * Formulário referente as condições de saúde do cidadão.
     * @return
     */
    ICondicoesDeSaude getCondicoesDeSaude();

    /**
     * Dados referentes ao profissional e a data do cadastro.
     * @return
     */
    IHeaderCdsCadastro getDadosGerais();

    /**
     * Formulário referente a informações de situação de rua (se o cidadão se encontrar nessa situação).
     * @return
     */
    IEmSituacaoDeRua getEmSituacaoDeRua();

    /**
     * Dados que identificam o cidadão.
     * @return
     */
    IIdentificacaoUsuarioCidadao getIdentificacaoUsuarioCidadao();

    /**
     * Informações sócio-demográficas fornecidas pelo cidadão.
     * @return
     */
    IInformacoesSocioDemograficas getInformacoesSocioDemograficas();

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return
     */
    String getUuid();

    String getUuidCidadao();

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @return
     */
    String getUuidFichaOriginadora();

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @return
     */
    boolean isFichaAtualizada();

    /**
     * Marcador que indica se o termo de recusa foi assinalado.
     * @return
     */
    boolean isStatusTermoRecusaCadastroIndividualAtencaoBasica();

    /**
     * Formulário referente as condições de saúde do cidadão.
     * @param condicoesDeSaude
     */
    void setCondicoesDeSaude(ICondicoesDeSaude condicoesDeSaude);

    /**
     * Dados referentes ao profissional e a data do cadastro.
     * @param dadosGerais
     */
    void setDadosGerais(IHeaderCdsCadastro dadosGerais);

    /**
     * Formulário referente a informações de situação de rua (se o cidadão se encontrar nessa situação).
     * @param emSituacaoDeRua
     */
    void setEmSituacaoDeRua(IEmSituacaoDeRua emSituacaoDeRua);

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @param fichaAtualizada
     */
    void setFichaAtualizada(boolean fichaAtualizada);

    /**
     * Dados que identificam o cidadão.
     * @param identificacaoUsuarioCidadao
     */
    void setIdentificacaoUsuarioCidadao(IIdentificacaoUsuarioCidadao identificacaoUsuarioCidadao);

    /**
     * Informações sócio-demográficas fornecidas pelo cidadão.
     * @param informacoesSocioDemograficas
     */
    void setInformacoesSocioDemograficas(IInformacoesSocioDemograficas informacoesSocioDemograficas);

    /**
     * Marcador que indica se o termo de recusa foi assinalado.
     * @param statusTermoRecusaCadastroIndividualAtencaoBasica
     */
    void setStatusTermoRecusaCadastroIndividualAtencaoBasica(boolean statusTermoRecusaCadastroIndividualAtencaoBasica);

    /**
     * Tipo de origem dos dados do registro.
     * @param tpCdsOrigem
     */
    void setTpCdsOrigem(int tpCdsOrigem);

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param uuid
     */
    void setUuid(String uuid);

    void setUuidCidadao(String uuidCidadao);

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @param uuidFichaOriginadora
     */
    void setUuidFichaOriginadora(String uuidFichaOriginadora);

    /**
     * Tipo de origem dos dados do registro.
     */
    void unsetTpCdsOrigem();

    /**
     * Valida a instancia
     * @return true se válido
     *          false se inválido
     */
    boolean validate();

    /**
     * Valida o campo condições de saúde.
     * Para ser válido deve, caso inserido:
     * 1- Regras: Não deve ser preenchido se o campo statusTermoRecusaCadastroIndividualAtencaoBasica = true.
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateCondicoesDeSaude();

    /**
     * Valida DadosGerais
     * Para ser válido deve ter sido inserido préviamente
     * @return true se válido
     *          false se inválido
     */
    boolean validateDadosGerais();

    /**
     * Valida o campo emSituacaoDeRua
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateEmSituacaoDeRua();

    /**
     * Valida se a ficha foi atualizada
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateFichaAtualizada();

    /**
     * Valida o header
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateHeaderTransport();

    /**
     * Valida o campo indentificacaoUsuarioCidadao
     * @return true se for válido
     *          false se for inválido
     */
    boolean validateIndetificacaoUsuarioCidadao();

    /**
     * Valida o campo informacoesSocioDemografica
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateInformacoesSocioDemografica();

    /**
     * Valida o saidaCidadaoCadastro
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateSaidaCidadaoCadastro();

    //Não á validações para o statusTermoRecusaCadastroIndividualAtencaoBasica
    /**
     * Valida o tipo de origem do cadastro de registro
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateTpCdsOrigem();

    /**
     * Valida o uuid
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateUuid();

    boolean validateUuid(String var);

    /**
     * Valida o uuid da ficha originadora
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateUuidFichaOriginadora();
    
}
