/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.CondicoesDeSaudeThrift;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface ICondicoesDeSaude {

    /**
     * Valida MaternidadeDeReferencia.
     * Para ser válido, caso inserido deve:
     * 1- Ter tamanho entre 0 e 100
     * 2- StatusEhGestante != false
     * @return true se válido
     *          false se inválido
     */
    boolean ValidaMaternidadeDeReferencia();
    //Não á validações possiveis para statusEhGestante

    /**
     * Descrição da causa de internação do cidadão.
     * @return
     */
    String getDescricaoCausaInternacaoEm12Meses();

    /**
     * Condição de saúde informada pelo cidadão.
     * @return
     */
    String getDescricaoOutraCondicao1();

    /**
     * Condição de saúde informada pelo cidadão.
     * @return
     */
    String getDescricaoOutraCondicao2();

    /**
     * Condição de saúde informada pelo cidadão.
     * @return
     */
    String getDescricaoOutraCondicao3();

    /**
     * Descrição das plantas medicinais utilizadas.
     * @return
     */
    String getDescricaoPlantasMedicinaisUsadas();

    /**
     * Código das doenças cardíacas que o cidadão informou.
     * @return
     */
    List<Long> getDoencaCardiaca();

    /**
     * Código d as doenças respiratórias que o cidadão informou.
     * @return
     */
    List<Long> getDoencaRespiratoria();

    /**
     * Código das doenças renais que o cidadão informou.
     * @return
     */
    List<Long> getDoencaRins();

    CondicoesDeSaudeThrift getInstance();

    /**
     * Nome da maternidade de referência.
     * @return
     */
    String getMaternidadeDeReferencia();

    /**
     * Código da situação referente ao peso corporal.
     * @return
     */
    long getSituacaoPeso();

    /**
     * Marcador se o cidadão é dependente de álcool.
     * @return
     */
    boolean isStatusEhDependenteAlcool();

    /**
     * Marcador se o cidadão é dependente de outras drogas.
     * @return
     */
    boolean isStatusEhDependenteOutrasDrogas();

    /**
     * Marcador se o cidadão é fumante.
     * @return
     */
    boolean isStatusEhFumante();

    /**
     * Marcador se o cidadão está gestante.
     * @return
     */
    boolean isStatusEhGestante();

    /**
     * Marcador se o cidadão está acamado.
     * @return
     */
    boolean isStatusEstaAcamado();

    /**
     * Marcador se o cidadão está domiciliado.
     * @return
     */
    boolean isStatusEstaDomiciliado();

    /**
     * Marcador se o cidadão tem diabetes.
     * @return
     */
    boolean isStatusTemDiabetes();

    /**
     * Marcador se o cidadão tem doença respiratória.
     * @return
     */
    boolean isStatusTemDoencaRespiratoria();

    /**
     * Marcador se o cidadão tem hanseníase.
     * @return
     */
    boolean isStatusTemHanseniase();

    /**
     * Marcador se o cidadão tem hipertensão arterial.
     * @return
     */
    boolean isStatusTemHipertensaoArterial();

    /**
     * Marcador se o cidadão tem ou teve câncer.
     * @return
     */
    boolean isStatusTemTeveCancer();

    /**
     * Marcador se o cidadão tem ou teve doenças nos rins.
     * @return
     */
    boolean isStatusTemTeveDoencasRins();

    /**
     * Marcador se o cidadão tem tuberculose.
     * @return
     */
    boolean isStatusTemTuberculose();

    /**
     * Marcador se o cidadão teve AVC.
     * @return
     */
    boolean isStatusTeveAvcDerrame();

    /**
     * Marcador se o cidadão teve doença cardíaca.
     * @return
     */
    boolean isStatusTeveDoencaCardiaca();

    /**
     * Marcador se o cidadão teve infarto.
     * @return
     */
    boolean isStatusTeveInfarto();

    /**
     * Marcador se o cidadão esteve internado nos últimos 12 meses.
     * @return
     */
    boolean isStatusTeveInternadoEm12Meses();

    /**
     * Marcador se o cidadão está em tratamento psiquico ou tem problema mental.
     * @return
     */
    boolean isStatusTratamentoPsiquicoOuProblemaMental();

    /**
     * Marcador se o cidadão utiliza outras práticas integrativas complementares.
     * @return
     */
    boolean isStatusUsaOutrasPraticasIntegrativasOuComplementares();

    /**
     * Marcador se o cidadão utiliza plantas medicinais.
     * @return
     */
    boolean isStatusUsaPlantaMedicinais();

    /**
     * Descrição da causa de internação do cidadão.
     * @param descricaoCausaInternacaoEm12Meses
     */
    void setDescricaoCausaInternacaoEm12Meses(String descricaoCausaInternacaoEm12Meses);

    /**
     * Condição de saúde informada pelo cidadão.
     * @param descricaoOutraCondicao1
     */
    void setDescricaoOutraCondicao1(String descricaoOutraCondicao1);

    /**
     * Condição de saúde informada pelo cidadão.
     * @param descricaoOutraCondicao2
     */
    void setDescricaoOutraCondicao2(String descricaoOutraCondicao2);

    /**
     * Condição de saúde informada pelo cidadão.
     * @param descricaoOutraCondicao3
     */
    void setDescricaoOutraCondicao3(String descricaoOutraCondicao3);

    /**
     * Descrição das plantas medicinais utilizadas.
     * @param descricaoPlantasMedicinaisUsadas
     */
    void setDescricaoPlantasMedicinaisUsadas(String descricaoPlantasMedicinaisUsadas);

    /**
     * Código das doenças cardíacas que o cidadão informou.
     * @param doencaCardiaca
     */
    void setDoencaCardiaca(List<Long> doencaCardiaca);

    /**
     * Código d as doenças respiratórias que o cidadão informou.
     * @param doencaRespiratoria
     */
    void setDoencaRespiratoria(List<Long> doencaRespiratoria);

    void setDoencaRins(List<Long> doencaRins);

    /**
     * Nome da maternidade de referência.
     * @param maternidadeDeReferencia
     */
    void setMaternidadeDeReferencia(String maternidadeDeReferencia);

    /**
     * Código da situação referente ao peso corporal.
     * @param situacaoPeso
     */
    void setSituacaoPeso(long situacaoPeso);

    /**
     * Marcador se o cidadão é dependente de álcool.
     * @param statusEhDependenteAlcool
     */
    void setStatusEhDependenteAlcool(boolean statusEhDependenteAlcool);

    /**
     * Marcador se o cidadão é dependente de outras drogas.
     * @param statusEhDependenteOutrasDrogas
     */
    void setStatusEhDependenteOutrasDrogas(boolean statusEhDependenteOutrasDrogas);

    /**
     * Marcador se o cidadão é fumante.
     * @param statusEhFumante
     */
    void setStatusEhFumante(boolean statusEhFumante);

    /**
     * Marcador se o cidadão está gestante.
     * @param statusEhGestante
     */
    void setStatusEhGestante(boolean statusEhGestante);

    /**
     * Marcador se o cidadão está acamado.
     * @param statusEstaAcamado
     */
    void setStatusEstaAcamado(boolean statusEstaAcamado);

    /**
     * Marcador se o cidadão está domiciliado.
     * @param statusEstaDomiciliado
     */
    void setStatusEstaDomiciliado(boolean statusEstaDomiciliado);

    /**
     * Marcador se o cidadão tem diabetes.
     * @param statusTemDiabetes
     */
    void setStatusTemDiabetes(boolean statusTemDiabetes);

    /**
     * Marcador se o cidadão tem doença respiratória.
     * @param statusTemDoencaRespiratoria
     */
    void setStatusTemDoencaRespiratoria(boolean statusTemDoencaRespiratoria);

    /**
     * Marcador se o cidadão tem hanseníase.
     * @param statusTemHanseniase
     */
    void setStatusTemHanseniase(boolean statusTemHanseniase);

    /**
     * Marcador se o cidadão tem hipertensão arterial.
     * @param statusTemHipertensaoArterial
     */
    void setStatusTemHipertensaoArterial(boolean statusTemHipertensaoArterial);

    /**
     * Marcador se o cidadão tem hipertensão arterial.
     * @param value
     */
    void setStatusTemHipertensaoArterialIsSet(boolean value);

    /**
     * Marcador se o cidadão tem ou teve câncer.
     * @param statusTemTeveCancer
     */
    void setStatusTemTeveCancer(boolean statusTemTeveCancer);

    /**
     * Marcador se o cidadão tem ou teve doenças nos rins.
     * @param statusTemTeveDoencasRins
     */
    void setStatusTemTeveDoencasRins(boolean statusTemTeveDoencasRins);

    /**
     * Marcador se o cidadão tem tuberculose.
     * @param statusTemTuberculose
     */
    void setStatusTemTuberculose(boolean statusTemTuberculose);

    /**
     * Marcador se o cidadão teve AVC.
     * @param statusTeveAvcDerrame
     */
    void setStatusTeveAvcDerrame(boolean statusTeveAvcDerrame);

    /**
     * Marcador se o cidadão teve doença cardíaca.
     * @param statusTeveDoencaCardiaca
     */
    void setStatusTeveDoencaCardiaca(boolean statusTeveDoencaCardiaca);

    /**
     * Marcador se o cidadão teve infarto.
     * @param statusTeveInfarto
     */
    void setStatusTeveInfarto(boolean statusTeveInfarto);

    /**
     * Marcador se o cidadão esteve internado nos últimos 12 meses.
     * @param statusTeveInternadoEm12Meses
     */
    void setStatusTeveInternadoEm12Meses(boolean statusTeveInternadoEm12Meses);

    /**
     * Marcador se o cidadão está em tratamento psiquico ou tem problema mental.
     * @param statusTratamentoPsiquicoOuProblemaMental
     */
    void setStatusTratamentoPsiquicoOuProblemaMental(boolean statusTratamentoPsiquicoOuProblemaMental);

    /**
     * Marcador se o cidadão utiliza outras práticas integrativas complementares.
     * @param statusUsaOutrasPraticasIntegrativasOuComplementares
     */
    void setStatusUsaOutrasPraticasIntegrativasOuComplementares(boolean statusUsaOutrasPraticasIntegrativasOuComplementares);

    /**
     * Marcador se o cidadão utiliza plantas medicinais.
     * @param statusUsaPlantaMedicinais
     */
    void setStatusUsaPlantaMedicinais(boolean statusUsaPlantaMedicinais);

    boolean validate();

    /**
     * Valida a descrição da causaInternacao
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateDescricaoCausaInternacaoEm12Meses();

    /**
     * Valida descricaoOutraCondicao1
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateDescricaoOutraCondicao1();

    /**
     * Valida descricaoOutraCondicao2
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateDescricaoOutraCondicao2();

    /**
     * Valida descricaoOutraCondicao3
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateDescricaoOutraCondicao3();

    /**
     * Valida a descrição das plantas medicinais usadas
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateDescricaoPlantasMedicinaisUsadas();

    /**
     * Valida doencaCardiaca
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateDoencaCardiaca();

    /**
     * Valida doencaRespiratoria
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateDoencaRespiratoria();

    /**
     * Valida doencaRins
     * @return true se for válido
     * @return false se for inválido
     */
    boolean validateDoencaRins();
    
}
