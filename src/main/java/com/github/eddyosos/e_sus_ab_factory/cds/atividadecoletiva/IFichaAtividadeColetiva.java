/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.atividadecoletiva;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IFichaAtividadeColetiva {

    /**
     * adiciona elementos à lista de participantes
     * @param elem ParticipanteRowItem
     */
    void addToParticipantes(IParticipanteRowItem elem);

    /**
     * adiciona um elemento à lista praticasTemasParaSaude
     * @param elem long
     */
    void addToPraticasTemasParaSaude(long elem);

    /**
     * Adiciona um elemento à lista profissionais
     *
     * @param elem
     */
    void addToProfissionais(IProfissionalCboRowItem elem);

    /**
     * Adiciona um elemento à lista publicoAlvo
     * @param elem long
     */
    void addToPublicoAlvo(long elem);

    /**
     * Adiciona elementos para temasParaReuniao
     *
     * @param elem long
     */
    void addToTemasParaReuniao(long elem);

    /**
     * Devolve um AtividadeTipo
     *
     * @return AtividadeTipo long
     */
    long getAtividadeTipo();

    /**
     * Devolve o valor de codigoIbgeMunicio
     * @return codigoIbgeMunicio Strng
     */
    String getCodigoIbgeMunicipio();

    /**
     * Devolve um dtAtividadeColetiva
     *
     * @return dtAtividadeColetiva long
     */
    long getDtAtividadeColetiva();

    /**
     * Devolve um HoraFim
     *
     * @return HoraFim long
     */
    long getHoraFim();

    /**
     * Devolve um HoraInicio
     *
     * @return HoraInicio long
     */
    long getHoraInicio();

    /**
     * Devolve um Inep
     *
     * @return Inep long
     */
    long getInep();

    /**
     * Devolve um LocalAtividade
     *
     * @return LocalAtividade String
     */
    String getLocalAtividade();

    /**
     * Devolve um numAvaliacoesAlteradas
     *
     * @return numAvaliacoesAlteradas int
     */
    int getNumAvaliacoesAlteradas();

    /**
     * Devolve um numParticipantes
     *
     * @return numParticipantes int
     */
    int getNumParticipantes();

    /**
     * Devolve um numParticipantesProgramados
     *
     * @return numParticipantesProgramados int
     */
    int getNumParticipantesProgramados();

    /**
     * devolve uma lista de participantes
     * @return participantes List
     */
    List<IParticipanteRowItem> getParticipantes();

    /**
     * Devolve o participantes iterator
     * @return participantesIterator
     */
    Iterator<IParticipanteRowItem> getParticipantesIterator();

    /**
     * retorna o tamanho de participantes
     * @return participantesSize
     */
    int getParticipantesSize();

    /**
     * retorna uma lista de praticasTemasParaSaude
     * @return praticasTemasParaSaude List
     */
    List<Long> getPraticasTemasParaSaude();

    /**
     * Devolve um praticasTemasParaSaude iterator
     * @return praticasTemasParaSaudeIterator Iterator
     */
    Iterator<Long> getPraticasTemasParaSaudeIterator();

    /**
     * devolve o tamanho de praticaTemasParaSaude
     * @return praticaTemasParaSaudeSize
     */
    int getPraticasTemasParaSaudeSize();

    /**
     * Devolve uma lista de profisionais
     *
     * @return ListaProfssionalCboRowItem list
     */
    List<IProfissionalCboRowItem> getProfissionais();

    /**
     * Devolve o iterator de profissionais
     *
     * @return listaProffsionalCboRowItem.iterator Iterator
     */
    Iterator<IProfissionalCboRowItem> getProfissionaisIterator();

    /**
     * Devolve o tamanho de profssionais
     *
     * @return profssionaisSize int
     */
    int getProfissionaisSize();

    /**
     * Retor uma lista publicoAlvo
     * @return publicoAlvo list
     */
    List<Long> getPublicoAlvo();

    /**
     *devolve um iterator para publicoAlvo
     * @return publicoAlvoIterator
     */
    Iterator<Long> getPublicoAlvoIterator();

    /**
     * Devolve o tamanho de publicoAlvoS
     *
     * @return publicoAlvoSize int
     */
    int getPublicoAlvoSize();

    /**
     * Devolve um responsavelCnesUnidade
     *
     * @return responsavelCnesUnidade String
     */
    String getResponsavelCnesUnidade();

    /**
     * Devolve um responsavelCns
     *
     * @return responsavelCns String
     */
    String getResponsavelCns();

    /**
     * Devolve um responsavelNumIne
     *
     * @return responsavelNumIne String
     */
    String getResponsavelNumIne();

    /**
     * Devolve um tbCdsOrigem
     * @return tbCdsOrigem int
     */
    int getTbCdsOrigem();

    /**
     * Devolve uma lista de temasParaReuniao
     *
     * @return temasParaReuniao list
     */
    List<Long> getTemasParaReuniao();

    /**
     * Devolve um iterator para TemasParaReuniao
     *
     * @return temasParaReuniaoIterator
     */
    Iterator<Long> getTemasParaReuniaoIterator();

    /**
     * Devolve um tamanho para temasParaReuniao
     *
     * @return temasParaReuniaoSize int
     */
    int getTemasParaReuniaoSize();

    /**
     * Devolve um uuidFicha
     *
     * @return uuidFicha String
     */
    String getUuidFicha();

    /**
     * Altera o valor de atividadeTipo
     *
     * @param atividadeTipo String
     */
    void setAtividadeTipo(long atividadeTipo);

    /**
     * Altera o valor de codigoIbgeMunicio
     * @param codigoIbgeMunicipio String
     */
    void setCodigoIbgeMunicipio(String codigoIbgeMunicipio);

    /**
     * Altera o valor de dtAtividadeColetiva
     *
     * @param dtAtividadeColetiva long
     */
    void setDtAtividadeColetiva(long dtAtividadeColetiva);

    /**
     * Altera o valor de HoraFim
     *
     * @param horaFim long
     */
    void setHoraFim(long horaFim);

    /**
     * Altera o valor de HoraInicio
     *
     * @param horaInicio long
     */
    void setHoraInicio(long horaInicio);

    /**
     * Altera o valor de Inep
     *
     * @param inep long
     */
    void setInep(long inep);

    /**
     * Altera o valor de LocalAtividade
     *
     * @param localAtividade String
     */
    void setLocalAtividade(String localAtividade);

    /**
     * Altera o valor de numAvaliacoesAlteradas
     *
     * @param numAvaliacoesAlteradas int
     */
    void setNumAvaliacoesAlteradas(int numAvaliacoesAlteradas);

    /**
     * Altera o valor de numParticipantes
     *
     * @param numParticipantes int
     */
    void setNumParticipantes(int numParticipantes);

    /**
     * Altera o valor de NumParticipantesProgramados
     *
     * @param numParticipantesProgramados int
     */
    void setNumParticipantesProgramados(int numParticipantesProgramados);

    /**
     * Altera o valor da lista de participantes
     * @param participantes List
     */
    void setParticipantes(List<IParticipanteRowItem> participantes);

    /**
     * Altera o valor da lista de praticasTemasParaSaude
     * @param praticasTemasParaSaude List
     */
    void setPraticasTemasParaSaude(List<Long> praticasTemasParaSaude);

    /**
     * Altera o valor da lista profssionais
     *
     * @param profissionais List
     */
    void setProfissionais(List<IProfissionalCboRowItem> profissionais);

    /**
     * Altera o valor da lista publicoAlvo
     * @param publicoAlvo List
     */
    void setPublicoAlvo(List<Long> publicoAlvo);

    /**
     * Altera o valor de responsavelCnesUnidade
     *
     * @param responsavelCnesUnidade String
     */
    void setResponsavelCnesUnidade(String responsavelCnesUnidade);

    /**
     * Altera o valor de responsavelCns
     *
     * @param responsavelCns String
     */
    void setResponsavelCns(String responsavelCns);

    /**
     * Altera o valor de responsavelNumIne
     *
     * @param responsavelNumIne String
     */
    void setResponsavelNumIne(String responsavelNumIne);

    /**
     * Altera o valor de tbCdsOrigem
     * @param tbCdsOrigem int
     */
    void setTbCdsOrigem(int tbCdsOrigem);

    /**
     * Altera o valor da lista de temasParaReuniao
     *
     * @param temasParaReuniao list
     */
    void setTemasParaReuniao(List<Long> temasParaReuniao);

    /**
     * Altera o valor de uuidFicha
     *
     * @param uuidFicha String
     */
    void setUuidFicha(String uuidFicha);

    /**
     * valida o field atividadeTipo
     *
     * @return True caso o valor esteja setado e esteja entre os valor de 1 a 7
     * False caso o valor esteja setado e esteja fora os valores de 1 a 7. False
     * caso o valor nao esteja setado
     */
    boolean validaAtividadeTipo();

    /**
     * Valida Código IBGE do município. Para ser válido, a propriedade deve ter
     * sido atribuida préviamente e deve obedecer ao seguinte regex: "\A\d{7}\z"
     *
     * @return true se válido false se inválido
     */
    boolean validaCodigoIbgeMunicipio();

    /**
     * Valida DataAtiviadeColetiva
     *
     * @return False caso o valor nao esteja setado. False caso o valor esteja
     * setado e seja maior que a dataAtual. True caso o valor esteja setado e
     * seja menor ou igual que dataAtual
     */
    boolean validaDtAtividadeColetiva();

    /**
     * Valida o field horaFim
     *
     * @return True caso o valor esteja setado e seja maior que o valor do field
     * horaInicio. True caso o valor nao esteja setado. False caso o valor
     * esteja setado e seja menor ou igual ao valor do field horaInicio
     */
    boolean validaHoraFim();

    /**
     * Valida o field INEP
     *
     * @return True caso o valor esteja setado e seja menor que 100000000. True
     * caso o valor nao esteja setado. False caso o valor esteja setado e seja
     * igual ou maior que 100000000
     */
    boolean validaInep();

    /**
     * Valida o field localAtividade
     *
     * @return True caso o valor esteja setado e a string seja de tamanho de até
     * 250 caractéres. True caso nenhum valor seja setado. False caso a string
     * seja maior que 250 caractéres
     */
    boolean validaLocalAtividade();

    /**
     * Valida o field NumAvaliacoesAlteradas
     *
     * @return True caso o valor esteja setado e esteja entre os intervalos 0 -
     * 999. True caso o valor nao esteja setado. False case o valor esteja
     * setado e fora do intervalo 0 - 999
     */
    boolean validaNumAvaliacoesAlteradas();

    /**
     * Valida o field numParticipantess
     *
     * @return True caso o valor esteja setado e esteja entre os intervalos 0 -
     * 999. True caso o valor nao esteja setado. False case o valor esteja
     * setado e fora do intervalo 0 - 999
     */
    boolean validaNumParticipantes();

    /**
     * Valida o field numParticipantesProgramados
     *
     * @return True caso o valor esteja setado e esteja entre os intervalos 0 -
     * 999. True caso o valor nao esteja setado false case o valor esteja setado
     * e fora do intervalo 0 - 999
     */
    boolean validaNumParticipantesProgramados();

    /**
     * Valida o valor do fiel Participantes
     *
     * @return True caso o valor esteja setado e esteja os valores de 0 a 33.
     * True caso o valor nao esteja setado. False caso o valor esteja setado e
     * esteja fora dos valores de 0 a 33.
     */
    boolean validaParticipantes();

    /**
     * Valida o field validaPraticasTemasParaSaude
     *
     * @return True caso o valor de AtividadeTipo seja de 4 a 7 e o valor de
     * PraticasTemasParaSaude esteja setado e seja de 1 a 28. True caso o valor
     * de atividadeTipo seja diferente de 4 a 7 e o valor de
     * PraticasTemasParaSaude nao esteja setado. False caso o valor de
     * AtividadeTipo seja de 4 a 7 e o valor de PraticasTemasParaSaude esteja
     * setado e seja diferente de 1 a 28. False caso o valor de atividadeTipo
     * seja diferente de 4 a 7 e o valor de PraticasTemasParaSaude esteja setado
     */
    boolean validaPraticasTemasParaSaude();

    /**
     * valida o field Profissionais
     *
     * @return True caso o valor esteja setado e esteja entre os valores 1 - 99
     * False caso o valor esteja setado e esteja fora dos valores 1 - 99. False
     * caso o valor nao esteja setado
     */
    boolean validaProfssionais();

    /**
     * Valida o field ValidaPublicoAlvo
     *
     * @return True caso o valor de AtividadeTipo seja de 4 a 7 e o valor de
     * validaPublicoAlvo esteja setado e seja de 1 a 18. True caso o valor de
     * atividadeTipo seja diferente de 4 a 7 e o valor de validaPublicoAlvo nao
     * esteja setado. False caso o valor de AtividadeTipo seja de 4 a 7 e o
     * valor de validaPublicoAlvo esteja setado e seja diferente de 1 a 18.
     * False caso o valor de atividadeTipo seja diferente de 4 a 7 e o valor de
     * validaPublicoAlvo esteja setado
     */
    boolean validaPublicoAlvo();

    /**
     * Valida o field ResponsavelCnesUnidade
     *
     * @return True caso o valor esteja setado e seu tamanho seja de 7
     * caracteres. False caso o valor esteja setado e seja diferente de 7
     * caracteres. False caso o valor nao esteja setado.
     */
    boolean validaResponsavelCnesUnidade();

    /**
     * Valida o field responsavelCns
     *
     * @return False - Caso o Field não esteja setado. True - caso o numero
     * inicial seja 1 ou 2 ou 7 ou 8 ou 9 e atenda aos padrões do cartao SUS
     * False - caso o número esteja setado e nao atenda aos padrões do cartão
     * SUS.
     */
    boolean validaResponsavelCns();

    /**
     * Valida o field ResponsavelNumIne
     *
     * @return True caso o valor esteja setado e seu tamanho seja de 10
     * caracteres. False caso o valor esteja setado e seja diferente de 10
     * caracteres. True caso o valor nao esteja setado.
     */
    boolean validaResponsavelNumIne();

    /**
     * Valida o field TemasParaReuniao
     *
     * @return True caso o valor de AtividadeTipo seja de 1 a 3 e o valor de
     * temaParaReuniao esteja setado e seja de 1 a 7. True caso o valor de
     * atividadeTipo seja diferente de 1 a 3 e o valor de temaParaReuniao nao
     * esteja setado. False caso o valor de AtividadeTipo seja de 1 a 3 e o
     * valor de temaParaReuniao esteja setado e seja diferente de 1 a 7. False
     * caso o valor de atividadeTipo seja diferente de 1 a 3 e o valor de
     * temaParaReuniao esteja setado
     */
    boolean validaTemasParaReuniao();

    /**
     * Valida o field uuidFicha
     *
     * @return True caso o valor esteja setado e o seu tamanho seja maior que 36
     * e menor que 44. False caso o valor esteja setado e seu tamanho for menor
     * que 36 e maior que 44.False caso nenhum valor esteja setado
     */
    boolean validaUuidFicha();

    /**
     * Valida todos os fields
     *
     * @return True caso todos estejam validos False caso algum deles esteja
     * invalido.
     */
    boolean validates();
    
}
