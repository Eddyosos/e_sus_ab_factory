/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.cadastrodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.FamiliaRowThrift;
import org.apache.thrift.TException;

/**
 *
 * @author eddyosos
 */
public interface IFamiliaRow {

    FamiliaRowThrift getInstance();
    
    void clear();

    /**
     * Data de nascimento, no formato epoch time, do cidadão responsável pela família.
     * @return dataNascimentoResponsavel
     */
    long getDataNascimentoResponsavel();

    /**
     * CNS do responsável familiar.
     * @return numeroCnsResponsavel
     */
    String getNumeroCnsResponsavel();

    /**
     * Quantidade de membros do núcleo familiar.
     * @return numeroMembrosFamilia
     */
    int getNumeroMembrosFamilia();

    /**
     * Código do prontuário familiar na UBS.
     * @return numeroProntuario
     */
    String getNumeroProntuario();

    /**
     * Código da renda familiar em salários mínimos
     * @return rendaFamiliar
     */
    long getRendaFamiliar();

    /**
     * Mês e ano que a família começou a residir no domicílio, no formato epoch time.
     * @return resideDesde
     */
    long getResideDesde();

    /**
     * Data de nascimento, no formato epoch time, do cidadão responsável pela família.
     * @return dataNascimentoResponsavel
     */
    boolean isSetDataNascimentoResponsavel();

    /**
     * CNS do responsável familiar.
     * @return numeroCnsResponsavel
     */
    boolean isSetNumeroCnsResponsavel();

    /**
     * Quantidade de membros do núcleo familiar.
     * @return numeroMembrosFamilia
     */
    boolean isSetNumeroMembrosFamilia();

    /**
     * Código do prontuário familiar na UBS.
     * @return numeroProntuario
     */
    boolean isSetNumeroProntuario();

    /**
     * Código da renda familiar em salários mínimos.
     * @return rendaFamiliar
     */
    boolean isSetRendaFamiliar();

    /**
     * Mês e ano que a família começou a residir no domicílio, no formato epoch time.
     * @return resideDesde
     */
    boolean isSetResideDesde();

    /**
     * Marcador que indica se a familia mudou-se.
     * @return stMudanca
     */
    boolean isSetStMudanca();

    /**
     * Marcador que indica se a familia mudou-se.
     * @return stMudanca
     */
    boolean isStMudanca();

    /**
     * Data de nascimento, no formato epoch time, do cidadão responsável pela família.
     * @param dataNascimentoResponsavel
     */
    void setDataNascimentoResponsavel(long dataNascimentoResponsavel);

    /**
     * Data de nascimento, no formato epoch time, do cidadão responsável pela família.
     * @param value
     */
    void setDataNascimentoResponsavelIsSet(boolean value);

    /**
     * CNS do responsável familiar.
     * @param numeroCnsResponsavel
     */
    void setNumeroCnsResponsavel(String numeroCnsResponsavel);

    /**
     * CNS do responsável familiar.
     * @param value
     */
    void setNumeroCnsResponsavelIsSet(boolean value);

    /**
     * Quantidade de membros do núcleo familiar.
     * @param numeroMembrosFamilia
     */
    void setNumeroMembrosFamilia(int numeroMembrosFamilia);

    /**
     * Quantidade de membros do núcleo familiar.
     * @param value
     */
    void setNumeroMembrosFamiliaIsSet(boolean value);

    /**
     * Código do prontuário familiar na UBS.
     * @param numeroProntuario
     */
    void setNumeroProntuario(String numeroProntuario);

    /**
     * Código do prontuário familiar na UBS.
     * @param value
     */
    void setNumeroProntuarioIsSet(boolean value);

    /**
     * Código da renda familiar em salários mínimos.
     * @param rendaFamiliar
     */
    void setRendaFamiliar(long rendaFamiliar);

    /**
     * Código da renda familiar em salários mínimos.
     * @param value
     */
    void setRendaFamiliarIsSet(boolean value);

    /**
     * Mês e ano que a família começou a residir no domicílio, no formato epoch time.
     * @param resideDesde
     */
    void setResideDesde(long resideDesde);

    /**
     * Mês e ano que a família começou a residir no domicílio, no formato epoch time.
     * @param value
     */
    void setResideDesdeIsSet(boolean value);

    /**
     * Marcador que indica se a familia mudou-se.
     * @param stMudanca
     */
    void setStMudanca(boolean stMudanca);

    /**
     * Marcador que indica se a familia mudou-se.
     * @param value
     */
    void setStMudancaIsSet(boolean value);

    String toString();

    void unsetDataNascimentoResponsavel();

    void unsetNumeroCnsResponsavel();

    void unsetNumeroMembrosFamilia();

    void unsetNumeroProntuario();

    void unsetRendaFamiliar();

    void unsetResideDesde();

    void unsetStMudanca();

    /**
     * Data de nascimento, no formato epoch time, do cidadão responsável pela família.
     * @return dataNascimentoResponsavel
     * Não é Obrigatório
     */
    boolean validaDataNascimentoResponsavel();

    /**
     * CNS do responsável familiar.
     * @return numeroCnsResponsavel
     * É Obrigatório, do tipo String
     * Tamanho máximo e mínimo devem ser = 15
     */
    boolean validaNumeroCNSResponsavel();

    /**
     * Quantidade de membros do núcleo familiar.
     * @return numeroMembrosFamilia
     * Não é Obrigatório
     */
    boolean validaNumeroMembrosFamilia();

    /**
     * Código do prontuário familiar na UBS.
     * @return numeroProntuario
     * Não é obrigatório
     *  Apenas letras e números.
     */
    boolean validaNumeroProntuario();

    /**
     * Código da renda familiar em salários mínimos.
     * @return rendaFamiliar
     * Não é Obrigatório
     */
    boolean validaRendaFamiliar();

    /**
     * Mês e ano que a família começou a residir no domicílio, no formato epoch time.
     * @return resideDesde
     * Não é Obrigatório
     */
    boolean validaResideDesde();

    /**
     * Marcador que indica se a familia mudou-se.
     * @return StMudanca
     */
    boolean validaStMudanca();

    void validate() throws TException;

    /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação
     */
    boolean validates();
    
}
