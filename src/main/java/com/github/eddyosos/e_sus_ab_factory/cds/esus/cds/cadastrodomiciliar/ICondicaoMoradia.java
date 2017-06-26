/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.cadastrodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.CondicaoMoradiaThrift;
import org.apache.thrift.TException;

/**
 *
 * @author eddyosos
 */
public interface ICondicaoMoradia {

    void clear();

    /**
     * Código do tipo de abastecimento de água.
     * @return abastecimentoAgua
     */
    long getAbastecimentoAgua();

    /**
     * Código da condição de posse e uso da terra.
     * @return areaProducaoRural
     */
    long getAreaProducaoRural();

    /**
     * Código do destino do lixo
     * @return destinoLixo
     */
    long getDestinoLixo();

    /**
     * Código da forma de escoamento do banheiro ou sanitário
     * @return formaEscoamentoBanheiro
     */
    long getFormaEscoamentoBanheiro();

    CondicaoMoradiaThrift getInstence();

    /**
     * Código do localização do domicílio
     * @return localizacao
     */
    long getLocalizacao();

    /**
     * Código do tipo de material predominante nas paredes externas do domicílio.
     * @return materialPredominanteParedesExtDomicilio
     */
    long getMaterialPredominanteParedesExtDomicilio();

    /**
     * Número de cômodos do domicílio
     * @return nuComodos
     */
    String getNuComodos();

    /**
     * Número de moradores do domicílio.
     * @return nuMoradores
     */
    String getNuMoradores();

    /**
     * Código da situação de moradia ou de posse da terra
     * @return situacaoMoradiaPosseTerra
     */
    long getSituacaoMoradiaPosseTerra();

    /**
     * Código do tipo de acesso ao domicílio.
     * @return tipoAcessoDomicilio
     */
    long getTipoAcessoDomicilio();

    /**
     * Código do tipo de domicílio
     * @return tipoDomicilio
     */
    long getTipoDomicilio();

    /**
     * Código do tipo do tratamento de água do domicílio.
     * @return tratamentoAguaDomicilio
     */
    long getTratamentoAguaDomicilio();

    /**
     * Código do tipo de abastecimento de água.
     * @return abastecimentoAgua
     */
    boolean isSetAbastecimentoAgua();

    /**
     * Código da condição de posse e uso da terra.
     * @return areaProducaoRural
     */
    boolean isSetAreaProducaoRural();

    /**
     * Código do destino do lixo
     * @return destinoLixo
     */
    boolean isSetDestinoLixo();

    /**
     * Código da forma de escoamento do banheiro ou sanitário
     * @return formaEscoamentoBanheiro
     */
    boolean isSetFormaEscoamentoBanheiro();

    /**
     * Código do localização do domicílio
     * @return localizacao
     */
    boolean isSetLocalizacao();

    /**
     * Código do tipo de material predominante nas paredes externas do domicílio.
     * @return materialPredominanteParedesExtDomicilio
     */
    boolean isSetMaterialPredominanteParedesExtDomicilio();

    /**
     * Número de cômodos do domicílio
     * @return nuComodos
     */
    boolean isSetNuComodos();

    /**
     * Número de moradores do domicílio.
     * @return nuMoradores
     */
    boolean isSetNuMoradores();

    /**
     * Código da situação de moradia ou de posse da terra
     * @return situacaoMoradiaPosseTerra
     */
    boolean isSetSituacaoMoradiaPosseTerra();

    /**
     * Marcador que indica se existe disponibilidade de energia elétrica
     * @return stDiponibilidadeEnergiaeletrica
     */
    boolean isSetStDiponibilidadeEnergiaeletrica();

    /**
     * Código do tipo de acesso ao domicílio.
     * @return tipoAcessoDomicilio
     */
    boolean isSetTipoAcessoDomicilio();

    /**
     * Código do tipo de domicílio
     * @return tipoDomicilio
     */
    boolean isSetTipoDomicilio();

    /**
     * Código do tipo do tratamento de água do domicílio.
     * @return tratamentoAguaDomicilio
     */
    boolean isSetTratamentoAguaDomicilio();

    /**
     * Marcador que indica se existe disponibilidade de energia elétrica.
     * @return stDiponibilidadeEnergiaeletrica
     */
    boolean isStDiponibilidadeEnergiaeletrica();

    /**
     * Código do tipo de abastecimento de água.
     * @param abastecimentoAgua
     */
    void setAbastecimentoAgua(long abastecimentoAgua);

    /**
     * Código do tipo de abastecimento de água.
     * @param value
     */
    void setAbastecimentoAguaIsSet(boolean value);

    /**
     * Código da condição de posse e uso da terra.
     * @param areaProducaoRural
     */
    void setAreaProducaoRural(long areaProducaoRural);

    /**
     * Código da condição de posse e uso da terra.
     * @param value
     */
    void setAreaProducaoRuralIsSet(boolean value);

    /**
     * Código do destino do lixo
     * @param destinoLixo
     */
    void setDestinoLixo(long destinoLixo);

    /**
     * Código do destino do lixo
     * @param value
     */
    void setDestinoLixoIsSet(boolean value);

    /**
     * Código da forma de escoamento do banheiro ou sanitário
     * @param formaEscoamentoBanheiro
     */
    void setFormaEscoamentoBanheiro(long formaEscoamentoBanheiro);

    /**
     * Código da forma de escoamento do banheiro ou sanitário
     * @param value
     */
    void setFormaEscoamentoBanheiroIsSet(boolean value);

    /**
     * Código do localização do domicílio
     * @param localizacao
     */
    void setLocalizacao(long localizacao);

    /**
     * Código do localização do domicílio
     * @param value
     */
    void setLocalizacaoIsSet(boolean value);

    /**
     * Código do tipo de material predominante nas paredes externas do domicílio.
     * @param materialPredominanteParedesExtDomicilio
     */
    void setMaterialPredominanteParedesExtDomicilio(long materialPredominanteParedesExtDomicilio);

    /**
     * Código do tipo de material predominante nas paredes externas do domicílio.
     * @param value
     */
    void setMaterialPredominanteParedesExtDomicilioIsSet(boolean value);

    /**
     * Número de cômodos do domicílio
     * @param nuComodos
     */
    void setNuComodos(String nuComodos);

    /**
     * Número de cômodos do domicílio
     * @param value
     */
    void setNuComodosIsSet(boolean value);

    /**
     * Número de moradores do domicílio.
     * @param nuMoradores
     */
    void setNuMoradores(String nuMoradores);

    /**
     * Número de moradores do domicílio.
     * @param value
     */
    void setNuMoradoresIsSet(boolean value);

    /**
     * Código da situação de moradia ou de posse da terra
     * @param situacaoMoradiaPosseTerra
     */
    void setSituacaoMoradiaPosseTerra(long situacaoMoradiaPosseTerra);

    /**
     * Código da situação de moradia ou de posse da terra
     * @param value
     */
    void setSituacaoMoradiaPosseTerraIsSet(boolean value);

    /**
     * Marcador que indica se existe disponibilidade de energia elétrica
     * @param stDiponibilidadeEnergiaeletrica
     */
    void setStDiponibilidadeEnergiaeletrica(boolean stDiponibilidadeEnergiaeletrica);

    /**
     * Marcador que indica se existe disponibilidade de energia elétrica
     * @param value
     */
    void setStDiponibilidadeEnergiaeletricaIsSet(boolean value);

    /**
     * Código do tipo de acesso ao domicílio.
     * @param tipoAcessoDomicilio
     */
    void setTipoAcessoDomicilio(long tipoAcessoDomicilio);

    /**
     * Código do tipo de acesso ao domicílio.
     * @param value
     */
    void setTipoAcessoDomicilioIsSet(boolean value);

    /**
     * Código do tipo de domicílio
     * @param tipoDomicilio
     */
    void setTipoDomicilio(long tipoDomicilio);

    /**
     * Código do tipo de domicílio
     * @param value
     */
    void setTipoDomicilioIsSet(boolean value);

    /**
     * Código do tipo do tratamento de água do domicílio.
     * @param tratamentoAguaDomicilio
     */
    void setTratamentoAguaDomicilio(long tratamentoAguaDomicilio);

    /**
     * Código do tipo do tratamento de água do domicílio.
     * @param value
     */
    void setTratamentoAguaDomicilioIsSet(boolean value);

    void unsetAbastecimentoAgua();

    void unsetAreaProducaoRural();

    void unsetDestinoLixo();

    void unsetFormaEscoamentoBanheiro();

    void unsetLocalizacao();

    void unsetMaterialPredominanteParedesExtDomicilio();

    void unsetNuComodos();

    void unsetNuMoradores();

    void unsetSituacaoMoradiaPosseTerra();

    void unsetStDiponibilidadeEnergiaeletrica();

    void unsetTipoAcessoDomicilio();

    void unsetTipoDomicilio();

    void unsetTratamentoAguaDomicilio();

    /**
     * Código do tipo de abastecimento de água.
     * @return abastecimentoAgua
     * Não é Obrigatório
     */
    boolean validaAbastecimentoAgua();

    /**
     * Código da condição de posse e uso da terra
     * @return areaProducaoRural
     */
    boolean validaAreaProducaoRural();

    /**
     * Código do destino do lixo.
     * @return destinoLixo
     */
    boolean validaDestinoLixo();

    /**
     * Código da forma de escoamento do banheiro ou sanitário.
     * @return formaEscoamentoBanheiro
     */
    boolean validaFormaEscoamentoBanheiro();

    /**
     * Código do localização do domicílio.
     * @return localizacao
     */
    boolean validaLocalizacao();

    /**
     * Código do tipo de material predominante nas paredes externas do domicílio.
     * @return materialPredominanteParedesExtDomicilio
     */
    boolean validaMaterialPredominanteParedesExtDomicilio();

    /**
     * Número de cômodos do domicílio
     * @return nuComodos
     */
    boolean validaNuComodos();

    /**
     * Número de moradores do domicílio.
     * @return nuMoradores
     */
    boolean validaNuMoradores();

    /**
     * Código da situação de moradia ou de posse da terra
     * @return situacaoMoradiaPosseTerra
     */
    boolean validaSituacaoMoradiaPosseTerra();

    /**
     * Marcador que indica se existe disponibilidade de energia elétrica.
     * @return stDiponibilidadeEnergiaeletrica
     */
    boolean validaStDisponibilidadeEnergiaeletrica();

    /**
     * Código do tipo de acesso ao domicílio.
     * @return tipoAcessoDomicilio
     */
    boolean validaTipoAcessoDomicilio();

    void validate() throws TException;

    /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação
     */
    boolean validates();

    /**
     * Código do tipo de domicílio.
     * @return tipoDomicilio
     */
    boolean validatipoDomicilio();

    /**
     * Código do tipo do tratamento de água do domicílio.
     * @return tratamentoAguaDomicilio
     */
    boolean validatratamentoAguaDomicilio();
    
}
