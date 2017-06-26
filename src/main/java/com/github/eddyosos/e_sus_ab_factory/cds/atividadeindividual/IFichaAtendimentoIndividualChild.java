/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.FichaAtendimentoIndividualChildThrift;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IFichaAtendimentoIndividualChild {

    /**
     * Código do marcador referente ao aleitamento materno.
     * @return
     */
    long getAleitamentoMaterno();

    /**
     * Altura do cidadão em centímetros.
     * @return
     */
    double getAlturaAcompanhamentoNutricional();

    /**
     * Código do modalidade AD do cidadão atendido.
     * @return
     */
    long getAtencaoDomiciliarModalidade();

    /**
     * CNS do cidadão.
     * @return
     */
    String getCns();

    /**
     * Código das condutas adotadas no atendimento.
     * @return
     */
    List<Long> getCondutas();

    /**
     * Data de nascimento do cidadão.
     * @return
     */
    long getDataNascimento();

    /**
     * Data da última menstruação da gestante.
     * @return
     */
    long getDumDaGestante();

    /**
     * Lista de exames avaliados que são apresentados na ficha.
     * @return
     */
    List<String> getExamesAvaliados();

    /**
     * Lista de exames solicitados que são apresentados na ficha.
     * @return
     */
    List<String> getExamesSolicitados();

    /**
     * Idade gestacional em semanas.
     * @return
     */
    int getIdadeGestacional();

    FichaAtendimentoIndividualChildThrift getInstance();

    /**
     * Código do local onde o atendimento foi realizado.
     * @return
     */
    long getLocalDeAtendimento();

    /**
     * Código das ações realizadas pelo Núcleo de Atenção a Saúde da Família
     * @return
     */
    List<Long> getNasfs();

    /**
     * Número de gestações prévias.
     * @return
     */
    int getNuGestasPrevias();

    /**
     * Número de partos que a mulher já teve.
     * @return
     */
    int getNuPartos();

    /**
     * Número do prontuário
     * @return
     */
    String getNumeroProntuario();

    /**
     * Lista de outros exames.
     * @return
     */
    List<IOutrosSia> getOutrosSia();

    /**
     * Peso do cidadão em Kilogramas.
     * @return
     */
    double getPesoAcompanhamentoNutricional();

    /**
     * Código das Práticas Integrativas e Complementares.
     * @return
     */
    long getPic();

    /**
     * Situações de saúde avaliadas no atendimento.
     * @return
     */
    IProblemaCondicaoAvaliacaoAI getProblemaCondicaoAvaliada();

    /**
     * Código do sexo do cidadão.
     * @return
     */
    long getSexo();

    /**
     * Código do tipo de atendimento realizado.
     * @return
     */
    long getTipoAtendimento();

    /**
     * Código do turno em que o atendimento foi realizado.
     * @return
     */
    long getTurno();

    // Não á validações para FicouEmObservação
    /**
     * Marcador referente se o cidadão ficou em observação no atendimento.
     * @return
     */
    boolean isFicouEmObservacao();

    /**
     * Marcador que indica se a gravidez é planejada.
     * @return
     */
    boolean isStGravidezPlanejada();

    // Não existem validações para VacinaEmDia
    /**
     * Marcador referente a vacinação em dia do cidadão.
     * @return
     */
    boolean isVacinaEmDia();

    /**
     * Código do marcador referente ao aleitamento materno.
     * @param aleitamentoMaterno
     */
    void setAleitamentoMaterno(long aleitamentoMaterno);

    /**
     * Altura do cidadão em centímetros.
     * @param alturaAcompanhamentoNutricional
     */
    void setAlturaAcompanhamentoNutricional(double alturaAcompanhamentoNutricional);

    /**
     * Código do modalidade AD do cidadão atendido.
     * @param atencaoDomiciliarModalidade
     */
    void setAtencaoDomiciliarModalidade(long atencaoDomiciliarModalidade);

    /**
     * CNS do cidadão.
     * @param cns
     */
    void setCns(String cns);

    /**
     * Código das condutas adotadas no atendimento.
     * @param condutas
     */
    void setCondutas(List<Long> condutas);

    /**
     * Data de nascimento do cidadão.
     * @param dataNascimento
     */
    void setDataNascimento(long dataNascimento);

    /**
     * Data da última menstruação da gestante.
     * @param dumDaGestante
     */
    void setDumDaGestante(long dumDaGestante);

    /**
     * Lista de exames avaliados que são apresentados na ficha.
     * @param examesAvaliados
     */
    void setExamesAvaliados(List<String> examesAvaliados);

    /**
     * Lista de exames solicitados que são apresentados na ficha.
     * @param examesSolicitados
     */
    void setExamesSolicitados(List<String> examesSolicitados);

    /**
     * Marcador referente se o cidadão ficou em observação no atendimento.
     * @param ficouEmObservacao
     */
    void setFicouEmObservacao(boolean ficouEmObservacao);

    /**
     * Idade gestacional em semanas.
     * @param idadeGestacional
     */
    void setIdadeGestacional(int idadeGestacional);

    /**
     * Código do local onde o atendimento foi realizado.
     * @param localDeAtendimento
     */
    void setLocalDeAtendimento(long localDeAtendimento);

    /**
     * Código das ações realizadas pelo Núcleo de Atenção a Saúde da Família
     * @param nasfs
     */
    void setNasfs(List<Long> nasfs);

    /**
     * Número de gestações prévias.
     * @param nuGestasPrevias
     */
    void setNuGestasPrevias(int nuGestasPrevias);

    /**
     * Número de partos que a mulher já teve.
     * @param nuPartos
     */
    void setNuPartos(int nuPartos);

    /**
     * Número do prontuário
     * @param numeroProntuario
     */
    void setNumeroProntuario(String numeroProntuario);

    /**
     * Lista de outros exames.
     * @param outrosSia
     */
    void setOutrosSia(List<IOutrosSia> outrosSia);

    /**
     * Peso do cidadão em Kilogramas.
     * @param pesoAcompanhamentoNutricional
     */
    void setPesoAcompanhamentoNutricional(double pesoAcompanhamentoNutricional);

    /**
     * Código das Práticas Integrativas e Complementares.
     * @param pic
     */
    void setPic(long pic);

    /**
     * Situações de saúde avaliadas no atendimento.
     * @param problemaCondicaoAvaliada
     */
    void setProblemaCondicaoAvaliada(IProblemaCondicaoAvaliacaoAI problemaCondicaoAvaliada);

    /**
     * Código do sexo do cidadão.
     * @param sexo
     */
    void setSexo(long sexo);

    /**
     * Marcador que indica se a gravidez é planejada.
     * @param stGravidezPlanejada
     */
    void setStGravidezPlanejada(boolean stGravidezPlanejada);

    /**
     * Código do tipo de atendimento realizado.
     * @param tipoAtendimento
     */
    void setTipoAtendimento(long tipoAtendimento);

    /**
     * Código do turno em que o atendimento foi realizado.
     * @param turno
     */
    void setTurno(long turno);

    /**
     * Marcador referente a vacinação em dia do cidadão.
     * @param vacinaEmDia
     */
    void setVacinaEmDia(boolean vacinaEmDia);

    /**
     * Valida AleitamentoMaterno
     * Para ser válido, caso tenha sido inserido deve:
     * Ter valor entre 1 e 4 (inclusivo)
     * @return
     */
    boolean validateAleitamentoMaterno();

    /**
     * Valida AlturaAcompanhamentoNutricional.
     * Para ser válido deve:
     * 1- Máximo de 2 números após a vírgula.
     * 2- Se tiver vírgula, tamanho máximo = 5.
     * 3- Valor mínimo 20 e máximo 250.
     * @return true se válido
     *         false se inválido
     */
    boolean validateAlturaAcompanhamentoNutricional();

    /**
     * Valida AtencaoDomiciliarModalidade
     * Para ser válido, caso tenha sido inserido, deve:
     * 1- Ter valor 1 a 3
     * @return true se válido
     *          false se inválido
     */
    boolean validateAtencaoDomiciliarModalidade();

    /**
     * Valida CNS
     * De acordo com com.github.Eddyosos.intregracao20171.utils.IDS.CNS
     * @return
     */
    boolean validateCns();

    /**
     * Valida Condutas
     * Para ser válido, deve:
     * 1- Ter sido setado préviamente
     * 2- Ter entre 1 e 12 itens
     * 3- Cada valor deve ser entre 1 e 12
     * @return
     */
    boolean validateCondutas();

    /**
     * Valida DataNascimento.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter menos de 130 anos ao ser atendido(dataAtendimento) (Não implementado)
     * @return true se válido
     *          false se inválido
     */
    boolean validateDataNascimento();

    /**
     * Valida DumDaGestante.
     * Para ser válido, caso tenha sido inserido, deve:
     * 1- Não pode ser superior a dataAtendimento (não implementado),
     * nem inferior a data de nascimento.
     * 2- Não pode ser preenchido quando Sexo = 0 (masculino).
     * @return true se válido
     *          false se inválido
     */
    boolean validateDumDaGestante();

    /**
     * Valida ExamesAvaliados.
     * Para ser válido, caso inserido, deve:
     * 1- Não pode ter exames iguais
     * 2- Não pode ter mais do que 23 exames
     * @return true se válido
     *          false se inválido
     */
    boolean validateExamesAvaliados();

    /**
     * Valida ExamesSolicitados.
     * Para ser válido, caso inserido, deve:
     * 1- Não pode ter exames iguais
     * 2- Não pode ter mais do que 23 exames
     * @return true se válido
     *          false se inválido
     */
    boolean validateExamesSolicitados();

    /**
     * Valida IdadeGestacional.
     * Para ser válido, caso tenha sido inserido, deve:
     * 1- Valor mínimo 1 e máximo 42.
     * 2- Não pode ser preenchido quando Sexo = 0 (masculino).
     * @return true se válido
     *          false se inválido
     */
    boolean validateIdadeGestacional();

    /**
     * Valida LocalDeAtendimento.
     * Para ser válido deve:
     * 1- Préviamente inserido
     * 2- Valor entre 1 e 10 (inclusivo)
     * @return
     */
    boolean validateLocalDeAtendimento();

    /**
     * Valida Nasfs
     * Para ser válido, caso inserido, deve ter no máximo 3 itens
     * @return true se válido
     *          false se inválido
     */
    boolean validateNasfs();

    /**
     * Valida NuGestasPrevias
     * Para ser válido, caso inserido, deve:
     * 1- Não ter sexo = 0 (masculino)
     * 2- Valor entre 0 e 2
     * @return true se válido
     *          False se inválido
     */
    boolean validateNuGestasPrevias();

    /**
     * Valida NuPartos
     * Para ser válido, caso inserido, deve:
     * 1- Não ter sexo = 0 (masculino)
     * 2- Valor entre 0 e 2
     * @return true se válido
     *          False se inválido
     */
    boolean validateNuPartos();

    /**
     * Valida NumeroProntuario
     * Para ser válida, caso tenha sido inserida, deve ser ter entre 0 e 30
     * (inclusivo) caracteres alfanuméricos
     * @return
     */
    boolean validateNumeroProntuario();

    /**
     * Valida OutrosSia
     * Para ser válido, caso inserido, deve ter no máximo 3 itens
     * @return
     */
    boolean validateOutrosSia();

    /**
     * Valida PesoAcompanhamentoNutricional.
     * Para ser valido, caso tenha sido inserido, deve:
     * 1- Máximo de 2 números após a vírgula.
     * 2- Se tiver vírgula, tamanho máximo = 7.
     * 3- Valor mínimo 0,5 e máximo 500.
     * @return true se válido
     *         false se inválido
     */
    boolean validatePesoAcompanhamentoNutricional();

    /**
     * Valida Pic
     * Para ser válido, caso inserido, deve ter valor de 1 a 8
     * @return true se válido
     *          false se inválido
     */
    boolean validatePic();

    /**
     * Valida ProblemaCondicaoAvaliada
     * Para ser valido deve ter sido préviamente inserido
     * @return true se válido
     *          false se inválido
     */
    boolean validateProblemaCondicaoAvaliada();

    /**
     * Valida Sexo
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter valor 0 ou 1
     * @return
     */
    boolean validateSexo();

    /**
     * Valida StGravidezPlanejada
     * Para ser válido, não pode ser preenchido quando Sexo = 0 (masculino)
     * @return true se válido
     *          false se inválido
     */
    boolean validateStGravidezPlanejada();

    /**
     * Valida Tipo de atendimento.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter valor entre 1 e 6 (inclusivo)
     * @return
     */
    boolean validateTipoAtendimento();

    /**
     * Valida Turno
     * @return true se válido
     *          false se inválido
     */
    boolean validateTurno();

    /**
     * Valida essa instancia
     * @return true se válido
     *          false se inválido
     */
    boolean validates();
    
}
