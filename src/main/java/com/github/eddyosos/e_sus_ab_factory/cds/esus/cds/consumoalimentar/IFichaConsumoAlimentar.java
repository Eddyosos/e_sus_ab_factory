/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.consumoalimentar;

import com.github.eddyosos.e_sus_ab_factory.cds.common.IUnicaLotacaoHeader;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IFichaConsumoAlimentar {

    void addToPerguntasQuestionarioCriancasComMaisDoisAnos(IPerguntaQuestionarioCriancasComMaisDoisAnos elem);

    void addToPerguntasQuestionarioCriancasDeSeisVinteTresMeses(IPerguntaQuestionarioCriancasDeSeisVinteTresMeses elem);

    void addToPerguntasQuestionarioCriancasMenoresSeisMeses(IPerguntaQuestionarioCriancasMenoresSeisMeses elem);

    /**
     * Data de nascimento do cidadão no formato epoch time.
     * @return Data de nascimento do cidadão
     */
    long getDataNascimento();

    /**
     * Profissional que realizou a visita.
     * @return o profissional
     */
    IUnicaLotacaoHeader getHeaderTransport();

    /**
     * Nome do cidadão
     * @return Nome do cidadão
     */
    String getIdentificacaoUsuario();

    /**
     * Código do local onde o atendimento foi realizado.
     * @return Código do local de atendimento
     */
    long getLocalAtendimento();

    /**
     * CNS do cidadão.
     * @return CNS
     */
    String getNumeroCartaoSus();

    /**
     * Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     * @return List
     */
    List<IPerguntaQuestionarioCriancasComMaisDoisAnos> getPerguntasQuestionarioCriancasComMaisDoisAnos();

    /**
     * Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     * @return Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     */
    Iterator<IPerguntaQuestionarioCriancasComMaisDoisAnos> getPerguntasQuestionarioCriancasComMaisDoisAnosIterator();

    int getPerguntasQuestionarioCriancasComMaisDoisAnosSize();

    List<IPerguntaQuestionarioCriancasDeSeisVinteTresMeses> getPerguntasQuestionarioCriancasDeSeisVinteTresMeses();

    /**
     * Marcadores referentes aos cidadãos que tem entre seis e vinte e três meses de idade.
     * @return Marcadores referentes aos cidadãos que tem entre seis e vinte e três meses de idade.
     */
    Iterator<IPerguntaQuestionarioCriancasDeSeisVinteTresMeses> getPerguntasQuestionarioCriancasDeSeisVinteTresMesesIterator();

    /**
     * Marcadores referentes aos cidadãos menores de seis meses de idade
     * @param value
     */
    int getPerguntasQuestionarioCriancasDeSeisVinteTresMesesSize();

    List<IPerguntaQuestionarioCriancasMenoresSeisMeses> getPerguntasQuestionarioCriancasMenoresSeisMeses();

    /**
     * Marcadores referentes aos cidadãos menores de seis meses de idade
     * @return PerguntasQuestionarioCriancasMenoresSeisMesesSize
     */
    int getPerguntasQuestionarioCriancasMenoresSeisMesesSize();

    /**
     * Código do sexo do cidadão.
     * @return Código do sexo do cidadão.
     */
    long getSexo();

    /**
     * Tipo de origem dos dados do registro.
     * @return Tipo de origem dos dados do registro.
     */
    int getTpCdsOrigem();

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return Código UUID para identificar a ficha na base de dados nacional.
     */
    String getUuidFicha();

    /**
     * Data de nascimento do cidadão no formato epoch time.
     * @return Data de nascimento do cidadão
     */
    boolean isSetDataNascimento();

    /**
     * Profissional que realizou a visita.
     * @return o profissional
     */
    boolean isSetHeaderTransport();

    /**
     * Nome do cidadão
     * @return Nome do cidadão
     */
    boolean isSetIdentificacaoUsuario();

    boolean isSetLocalAtendimento();

    /**
     * Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     * @return Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     */
    boolean isSetPerguntasQuestionarioCriancasComMaisDoisAnos();

    boolean isSetPerguntasQuestionarioCriancasDeSeisVinteTresMeses();

    /**
     * Marcadores referentes aos cidadãos menores de seis meses de idade
     * @return Marcadores referentes aos cidadãos menores de seis meses de idade
     */
    boolean isSetPerguntasQuestionarioCriancasMenoresSeisMeses();

    /**
     * Código do sexo do cidadão
     * @return Sexo
     */
    boolean isSetSexo();

    /**
     * Tipo de origem dos dados do registro.
     * @return Tipo de origem dos dados do registro.
     */
    boolean isSetTpCdsOrigem();

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return
     */
    boolean isSetUuidFicha();

    /**
     * Data de nascimento do cidadão no formato epoch time
     * @param dataNascimento
     */
    void setDataNascimento(long dataNascimento);

    /**
     * Data de nascimento do cidadão no formato epoch time.
     * @param value
     */
    void setDataNascimentoIsSet(boolean value);

    /**
     * Profissional que realizou a visita.
     * UnicaLotacaoHeader
     * @param value
     */
    void setHeaderTransportIsSet(boolean value);

    /**
     * Nome do cidadão
     * @param identificacaoUsuario
     */
    void setIdentificacaoUsuario(String identificacaoUsuario);

    void setIdentificacaoUsuarioIsSet(boolean value);

    /**
     * Código do local onde o atendimento foi realizado
     * @param localAtendimento
     */
    void setLocalAtendimento(long localAtendimento);

    void setLocalAtendimentoIsSet(boolean value);

    /**
     * CNS do cidadão.
     * @param numeroCartaoSus
     * CNS válido de acordo com o algoritmo.
     */
    void setNumeroCartaoSus(String numeroCartaoSus);

    void setNumeroCartaoSusIsSet(boolean value);

    /**
     * Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     * @param perguntasQuestionarioCriancasComMaisDoisAnos
     */
    void setPerguntasQuestionarioCriancasComMaisDoisAnos(List<IPerguntaQuestionarioCriancasComMaisDoisAnos> perguntasQuestionarioCriancasComMaisDoisAnos);

    void setPerguntasQuestionarioCriancasComMaisDoisAnosIsSet(boolean value);

    /**
     * Marcadores referentes aos cidadãos que tem entre seis e vinte e três meses de idade.
     * @param perguntasQuestionarioCriancasDeSeisVinteTresMeses
     */
    void setPerguntasQuestionarioCriancasDeSeisVinteTresMeses(List<IPerguntaQuestionarioCriancasDeSeisVinteTresMeses> perguntasQuestionarioCriancasDeSeisVinteTresMeses);

    void setPerguntasQuestionarioCriancasDeSeisVinteTresMesesIsSet(boolean value);

    /**
     * Marcadores referentes aos cidadãos menores de seis meses de idade
     * @param perguntasQuestionarioCriancasMenoresSeisMeses
     */
    void setPerguntasQuestionarioCriancasMenoresSeisMeses(List<IPerguntaQuestionarioCriancasMenoresSeisMeses> perguntasQuestionarioCriancasMenoresSeisMeses);

    /**
     * Marcadores referentes aos cidadãos menores de seis meses de idade
     * @param value
     */
    void setPerguntasQuestionarioCriancasMenoresSeisMesesIsSet(boolean value);

    /**
     * Código do sexo do cidadão
     * @param sexo
     * 0 Masculino
     * 1 Feminino
     */
    void setSexo(long sexo);

    void setSexoIsSet(boolean value);

    void setTpCdsOrigem(int tpCdsOrigem);

    void setTpCdsOrigemIsSet(boolean value);

    /**
     *
     * @param uuidFicha
     */
    void setUuidFicha(String uuidFicha);

    void setUuidFichaIsSet(boolean value);

    void unsetDataNascimento();

    void unsetHeaderTransport();

    void unsetIdentificacaoUsuario();

    void unsetLocalAtendimento();

    void unsetNumeroCartaoSus();

    void unsetPerguntasQuestionarioCriancasComMaisDoisAnos();

    void unsetPerguntasQuestionarioCriancasDeSeisVinteTresMeses();

    void unsetPerguntasQuestionarioCriancasMenoresSeisMeses();

    void unsetSexo();

    void unsetTpCdsOrigem();

    void unsetUuidFicha();

    /**
     * Valida Data de nascimento do cidadão no formato epoch time.
     * @return Data de nascimento do cidadão no formato epoch time.
     * Valida se o campo é null
     * Valida: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     * Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     */
    boolean validaDataNascimento();

    /**
     * Valida profisional que realizou a visita
     * @return profisional
     * Não pode ser nulo
     */
    boolean validaHeaderTransport();

    /**
     * Valida Nome do cidadão
     * @return Nome do cidadão
     * Deve ter pelo menos 5 caracteres e no maximo 100
     */
    boolean validaIdentificacaoUsuario();

    /**
     * Valida Código do local onde o atendimento foi realizado.
     * @return não pode ser nulo
     */
    boolean validaLocalAtendimento();

    /**
     * Valida numero CNS do cidadão
     * @return CNS
     * Deve ter apenas 15 caracteres
     * CNS válido de acordo com o algoritmo.
     */
    boolean validaNumeroCartaoSus();

    /**
     * Valida cidadãos que tem vinte e quatro meses ou mais.
     * @return Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     * E se dataNascimento >= 24 meses a partir da dataAtendimento.
     */
    boolean validaPerguntasQuestionarioCriancasComMaisDoisAnos();

    /**
     * Valida cidadãos que tem entre seis e vinte e três meses de idade.
     * @return Marcadores referentes aos cidadãos que tem entre seis e vinte e três meses de idade.
     * Se dataNascimento >= 6 meses e <= 23 meses a partir da dataAtendimento.
     */
    boolean validaPerguntasQuestionarioCriancasDeSeisVinteTresMeses();

    /**
     * Valida Questionário de cidadãos menores de seis meses de idade
     * @return Marcadores referentes aos cidadãos menores de seis meses de idade
     * E validação de data de atendimento
     * Se dataNascimento < 6 meses a partir da dataAtendimento.
     */
    boolean validaPerguntasQuestionarioCriancasMenoresSeisMeses();

    /**
     * Valida Código do sexo do cidadão.
     * @return sexo
     * Valida Código se for 0 ou 1 e não pode ser  nulo
     */
    boolean validaSexo();

    /**
     * Valida Tipo de origem dos dados do registro.
     * @return Tipo de origem dos dados do registro.
     */
    boolean validaTpCDsOrigem();

    /**
     * Valida Código UUID para identificar a ficha na base de dados nacional.
     * @return verificação de nulo
     * E capo com minimo de 36 e maximo de 46 caracteres
     */
    boolean validaUuidFicha();

    /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação
     */
    boolean validades();
    
}
