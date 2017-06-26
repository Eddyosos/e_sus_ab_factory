/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.atendimentoodontologico;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.FichaAtendimentoOdontologicoMasterThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IVariasLotacoesHeader;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IFichaAtendimentoOdontologicoMaster {

    /**
     * Adiciona um atendimento a lista de registro.
     *
     * Presença obrigatória.
     *
     * Mínimo: 1
     * Máximo 13
     *
     * @param elem Registro do atendimento.
     */
    void addToAtendimentosOdontologicos(IFichaAtendimentoOdontologicoChild elem);

    /**
     * Remove todos os dados da ficha.
     */
    void clear();

    /**
     * Registro dos atendimentos.
     *
     * @return Registro dos atendimentos.
     */
    List<IFichaAtendimentoOdontologicoChild> getAtendimentosOdontologicos();

    /**
     * Registro dos atendimentos.
     *
     * @return Registro dos atendimentos.
     */
    Iterator<IFichaAtendimentoOdontologicoChild> getAtendimentosOdontologicosIterator();

    /**
     * Quantidade de registros de atendimento.
     *
     * @return Quantidade de registros de atendimento.
     */
    int getAtendimentosOdontologicosSize();

    /**
     * Profissional que realizou a visita.
     * @return Profissional que realizou a visita.
     */
    IVariasLotacoesHeader getHeaderTransport();

    /**
     * Intancia thrift da classe.
     *
     * @return Intancia thrift da classe.
     */
    FichaAtendimentoOdontologicoMasterThrift getInstance();

    /**
     * Tipo de origem dos dados do registro.
     * @return Tipo de origem dos dados do registro.
     */
    int getTpCdsOrigem();

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     *
     * @return Código uuid.
     */
    String getUuidFicha();

    /**
     * Verifica se os atendimentos foram declarados.
     * @return True caso tenham sido declarados.
     */
    boolean isSetAtendimentosOdontologicos();

    /**
     * Verifica se o profissional que realizou a visita foi declarado.
     * @return True caso o profissional que realizou a visita tenha sido inserido.
     */
    boolean isSetHeaderTransport();

    /**
     * Verifica se o tipo de origem dos dados do registro foi declarado.
     * @return True caso o tipo de origem dos dados do registro tenha sido inserido.
     */
    boolean isSetTpCdsOrigem();

    /**
     * Verifica se o código uuid da ficha foi declarado.
     * @return True caso o código uuid da ficha tenha sido declarado.
     */
    boolean isSetUuidFicha();

    /**
     * Adiciona vários atendimentos a lista de registro.
     *
     * Presença obrigatória.
     *
     * Mínimo: 1
     * Máximo 13
     *
     * @param atendimentosOdontologicos Lista de registros de atendimentos.
     */
    void setAtendimentosOdontologicos(List<IFichaAtendimentoOdontologicoChild> atendimentosOdontologicos);

    /**
     * Declara que os atendimentos foram inseridos.
     *
     * @param value True para informar que os atendimentos foram inseridos.
     */
    void setAtendimentosOdontologicosIsSet(boolean value);

    /**
     * Define o profissional que realizou a visita.
     *
     * Presença obrigatória.
     *
     * @param headerTransport Profissional que realizou a visita.
     */
    void setHeaderTransport(IVariasLotacoesHeader headerTransport);

    /**
     * Define se o profissional que realizou a visita doi inserido.
     * @param value True caso profissional que realizou a visita tenha sido inserido.
     */
    void setHeaderTransportIsSet(boolean value);

    /**
     * Define o tipo de origem dos dados do registro.
     *
     * Presenca obrigatória.
     * Observação: Utilizar valor 3 (sistemas terceiros).
     *
     * @param tpCdsOrigem Tipo de origem dos dados do registro.
     */
    void setTpCdsOrigem(int tpCdsOrigem);

    /**
     * Declara se o tipo de origem dos dados do registro foi inserido.
     * @param value True caso o tipo de origem dos dados do registro tenha sido inserido.
     */
    void setTpCdsOrigemIsSet(boolean value);

    /**
     * Define o código uuid da ficha.
     *
     * Presenca obrigatória.
     * Tamanho mínimo: 36
     * Tamanho maximo: 44
     * Regras: É recomendado concatenar o CNES na frente do UUID,
     * de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen)
     * do UUID são a limitação de 44 bytes do campo. Formato canônico.
     *
     * @param uuidFicha Código uuid da ficha.
     */
    void setUuidFicha(String uuidFicha);

    /**
     * Declara o estado do código uuid da ficha.
     * @param value True caso o código uuid da ficha tenha sido inserido.
     */
    void setUuidFichaIsSet(boolean value);

    /**
     * Remove os atendimentos.
     */
    void unsetAtendimentosOdontologicos();

    /**
     * Remove o profissional que realizou a visita.
     */
    void unsetHeaderTransport();

    /**
     * Remove o tipo de origem dos dados do registro.
     */
    void unsetTpCdsOrigem();

    /**
     * Remove o código uuid da ficha.
     */
    void unsetUuidFicha();

    boolean validate();

    /**
     * Valida os registros de atendimento.
     *
     * Presença obrigatória.
     * Mínimo:1
     * Máximo:13
     *
     * @return True caso sejam validos, False caso contrario.
     */
    boolean validateAtendimentosOdontologicos();

    /**
     * Profissional que realizou a visita.
     *
     * @return True caso o header transport seja valido
     */
    boolean validateHeaderTransport();

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * Obrigatório!
     * Regras: É recomendado concatenar o CNES na frente do UUID, de modo que os
     * 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do
     * UUID são a limitação de 44 bytes do campo.
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateUuidFicha();

    /**
     * Valida se o tipo de origem foi declarado.
     *
     * @return True caso o tipo de origem dos dados tenha sido declarado.
     */
    boolean validatetTpCdsOrigem();
    
}
