/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.InformacoesSocioDemograficasThrift;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IInformacoesSocioDemograficas {

    /**
     * Código das deficiências que o cidadão possui.
     * @return
     */
    List<Long> getDeficienciasCidadao();

    //Não á validações para grau
    /**
     * Código do curso mais elevado que o cidadão frequenta ou frequentou.
     * @return
     */
    long getGrauInstrucaoCidadao();

    InformacoesSocioDemograficasThrift getIntence();

    //Não á validações para MotivoSaidaCidadao
    /**
     * Código do motivo da saída do cidadão do cadastro.
     * @return
     */
    long getMotivoSaidaCidadao();

    /**
     * Código do CBO que representa a ocupaçao do cidadão.
     * @return
     */
    String getOcupacaoCodigoCbo2002();

    /**
     * Código da orientação sexual informada pelo cidadão.
     * @return
     */
    long getOrientacaoSexualCidadao();

    /**
     * Nome da comunidade tradicional que o cidadão frequenta.
     * @return
     */
    String getPovoComunidadeTradicional();

    //Não á validações para relacaoParentescoCidadao
    /**
     * Código da relação de parentesco com o responsável familiar.
     * @return
     */
    long getRelacaoParentescoCidadao();

    /**
     * Código do responsável por crianças de até 9 anos.
     * @return
     */
    long getResponsavelPorCrianca();

    /**
     * Código da situação do cidadão no mercado de trabalho.
     * @return
     */
    long getSituacaoMercadoTrabalhoCidadao();

    /**
     * Marcador que indica se o cidadão deseja informar sua orientação sexual.
     * @return
     */
    boolean isStatusDesejaInformarOrientacaoSexual();

    /**
     * Marcador que indica se o cidadão frequenta cuidador tradicional.
     * @return
     */
    boolean isStatusFrequentaBenzedeira();

    /**
     * Marcador que indica se o cidadão frequenta escola ou creche.
     * @return
     */
    boolean isStatusFrequentaEscola();

    /**
     * Marcador que indica se o cidadão é membro de um povo ou comunidade tradicional.
     * @return
     */
    boolean isStatusMembroPovoComunidadeTradicional();

    /**
     * Marcador que indica se o cidadão participa de algum grupo comunitário.
     * @return
     */
    boolean isStatusParticipaGrupoComunitario();

    /**
     * Marcador que indica se o cidadão possui plano de saúde privado.
     * @return
     */
    boolean isStatusPossuiPlanoSaudePrivado();

    /**
     * Marcador que indica se cidadão tem alguma dificiência.
     * @return
     */
    boolean isStatusTemAlgumaDeficiencia();

    /**
     * Código das deficiências que o cidadão possui.
     * @param deficienciasCidadao
     */
    void setDeficienciasCidadao(List<Long> deficienciasCidadao);

    /**
     * Código do curso mais elevado que o cidadão frequenta ou frequentou.
     * @param grauInstrucaoCidadao
     */
    void setGrauInstrucaoCidadao(long grauInstrucaoCidadao);

    /**
     * Código do motivo da saída do cidadão do cadastro.
     * @param motivoSaidaCidadao
     */
    void setMotivoSaidaCidadao(long motivoSaidaCidadao);

    /**
     * Código do CBO que representa a ocupaçao do cidadão.
     * @param ocupacaoCodigoCbo2002
     */
    void setOcupacaoCodigoCbo2002(String ocupacaoCodigoCbo2002);

    /**
     * Código da orientação sexual informada pelo cidadão.
     * @param orientacaoSexualCidadao
     */
    void setOrientacaoSexualCidadao(long orientacaoSexualCidadao);

    /**
     * Nome da comunidade tradicional que o cidadão frequenta.
     * @param povoComunidadeTradicional
     */
    void setPovoComunidadeTradicional(String povoComunidadeTradicional);

    /**
     * Código da relação de parentesco com o responsável familiar.
     * @param relacaoParentescoCidadao
     */
    void setRelacaoParentescoCidadao(long relacaoParentescoCidadao);

    /**
     * Código do responsável por crianças de até 9 anos.
     * @param responsavelPorCrianca
     */
    void setResponsavelPorCrianca(long responsavelPorCrianca);

    /**
     * Código da situação do cidadão no mercado de trabalho.
     * @param situacaoMercadoTrabalhoCidadao
     */
    void setSituacaoMercadoTrabalhoCidadao(long situacaoMercadoTrabalhoCidadao);

    /**
     * Marcador que indica se o cidadão deseja informar sua orientação sexual.
     * @param statusDesejaInformarOrientacaoSexual
     */
    void setStatusDesejaInformarOrientacaoSexual(boolean statusDesejaInformarOrientacaoSexual);

    /**
     * Marcador que indica se o cidadão frequenta cuidador tradicional.
     * @param statusFrequentaBenzedeira
     */
    void setStatusFrequentaBenzedeira(boolean statusFrequentaBenzedeira);

    /**
     * Marcador que indica se o cidadão frequenta escola ou creche.
     * @param statusFrequentaEscola
     */
    void setStatusFrequentaEscola(boolean statusFrequentaEscola);

    /**
     * Marcador que indica se o cidadão é membro de um povo ou comunidade tradicional.
     * @param statusMembroPovoComunidadeTradicional
     */
    void setStatusMembroPovoComunidadeTradicional(boolean statusMembroPovoComunidadeTradicional);

    /**
     * Marcador que indica se o cidadão participa de algum grupo comunitário.
     * @param statusParticipaGrupoComunitario
     */
    void setStatusParticipaGrupoComunitario(boolean statusParticipaGrupoComunitario);

    /**
     * Marcador que indica se o cidadão possui plano de saúde privado.
     * @param statusPossuiPlanoSaudePrivado
     */
    void setStatusPossuiPlanoSaudePrivado(boolean statusPossuiPlanoSaudePrivado);

    /**
     * Marcador que indica se cidadão tem alguma dificiência.
     * @param statusTemAlgumaDeficiencia
     */
    void setStatusTemAlgumaDeficiencia(boolean statusTemAlgumaDeficiencia);

    /**
     * Valida OrientacaoSexualCidadao.
     * Para ser válido, não pode ser preenchido se o campo
     * statusDesejaInformarOrientacaoSexual = false.
     * @return true se válido
     *          false se inválido
     */
    boolean validaOrientacaoSexualCidadao();

    /**
     * Valida PovoComunidadeTradicional
     *
     * @return true se válido
     *          false se inválido
     */
    boolean validaPovoComunidadeTradicional();

    /**
     * Valida DeficienciasCidadao.
     * Para ser válido deve:
     * 1- Requerido preenchimento de pelo menos um item se o campo statusTemAlgumaDeficiencia = true.
     * 2- Não deve ser preenchido se o campo statusTemAlgumaDeficiencia = false.
     * @return true se válido
     *          false se inválido
     */
    boolean validateDeficienciasCidadao();

    /**
     * Valida OcupacaoCodigoCbo2002.
     * Para ser válido, caso inserido, deve atender ao regex: \A\d{6}\z
     * @return True se válido
     *          False se inválido
     */
    boolean validateOcupacaoCodigoCbo2002();

    /**
     * Valida a instancia da classe
     * @return true se válido
     *          false se inválido
     */
    boolean validates();
    
}
