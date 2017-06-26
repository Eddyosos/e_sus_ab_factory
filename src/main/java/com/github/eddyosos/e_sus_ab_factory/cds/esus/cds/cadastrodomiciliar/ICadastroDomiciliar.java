/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.cadastrodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.CadastroDomiciliarThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IEnderecoLocalPermanencia;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IHeaderCdsCadastro;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;

/**
 *
 * @author eddyosos
 */
public interface ICadastroDomiciliar {

    CadastroDomiciliarThrift getInstance();
    
    /**
     * Lista de código dos animais no domicílio.
     * @param elem
     * Adiciona Elemento
     */
    void addToAnimaisNoDomicilio(long elem);

    /**
     * Lista das famílias que residem no domicílio.
     * Tamanho máximo = 4
     * @param elem
     */
    void addToFamilias(IFamiliaRow elem);

    /**
     * Lista de código dos animais no domicílio.
     * @return List<Long>
     */
    List<Long> getAnimaisNoDomicilio();

    /**
     * Lista de código dos animais no domicílio.
     * @return Iterator<Long>
     */
    Iterator<Long> getAnimaisNoDomicilioIterator();

    /**
     * Lista de código dos animais no domicílio.
     * @return value
     */
    int getAnimaisNoDomicilioSize();

    /**
     * Condições de moradia do domicílio
     * @return ondicaoMoradia
     * Não devem ser preenchidos se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true
     */
    ICondicaoMoradia getCondicaoMoradia();

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @return value
     */
    IHeaderCdsCadastro getDadosGerais();

    /**
     * Informações sobre o endereço do domicílio.
     * @return EnderecoLocalPermanencia
     * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false
     */
    IEnderecoLocalPermanencia getEnderecoLocalPermanencia();

    /**
     * Lista das famílias que residem no domicílio.
     * Tamanho máximo = 4
     * @return List<FamiliaRow>
     */
    List<IFamiliaRow> getFamilias();

    /**
     * Lista das famílias que residem no domicílio.
     * @return Iterator<FamiliaRow>
     */
    Iterator<IFamiliaRow> getFamiliasIterator();

    /**
     * Lista das famílias que residem no domicílio.
     * @return FamiliasSize
     * Tamanho máximo = 4
     */
    int getFamiliasSize();

    /**
     * Número de animais no domicílio
     * @return QuantosAnimaisNoDomicilio
     * Não pode ser preenchido se o campo stAnimaisNoDomicilio = false.
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    String getQuantosAnimaisNoDomicilio();

    /**
     * Tipo de origem dos dados do registro.
     * @return tpCdsOrigem
     * Tamanho máximo = 1
     */
    int getTpCdsOrigem();

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return uuid
     */
    String getUuid();

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @return uuidFichaOriginadora
     */
    String getUuidFichaOriginadora();

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @return FichaAtualizada
     * Caso seja uma ficha de atualização, o campo uuidFichaOriginadora deve ser preenchido com o UUID da ficha que deu origem ao registro.
     * É COndicional e tem tamanho máximo = 2
     */
    boolean isFichaAtualizada();

    /**
     * Lista de código dos animais no domicílio.
     * @return animaisNoDomicilio
     */
    boolean isSetAnimaisNoDomicilio();

    /**
     * Condições de moradia do domicílio.
     * @return CondicaoMoradia
     */
    boolean isSetCondicaoMoradia();

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @return  DadosGerais
     */
    boolean isSetDadosGerais();

    /**
     * Informações sobre o endereço do domicílio.
     * @return EnderecoLocalPermanencia
     * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false
     */
    boolean isSetEnderecoLocalPermanencia();

    /**
     * Lista das famílias que residem no domicílio.
     * @return Familias
     * Não pode ser preenchido caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    boolean isSetFamilias();

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @return FichaAtualizada
     */
    boolean isSetFichaAtualizada();

    /**
     * Número de animais no domicílio
     * @return quantosAnimaisNoDomicilio
     * Não pode ser preenchido se o campo stAnimaisNoDomicilio = false.
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    boolean isSetQuantosAnimaisNoDomicilio();

    /**
     * Marcador que indica se existem animais no domicílio.
     * @return stAnimaisNoDomicilio
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    boolean isSetStAnimaisNoDomicilio();

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @return statusTermoRecusaCadastroDomiciliarAtencaoBasica
     */
    boolean isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica();

    /**
     * Tipo de origem dos dados do registro.
     * @return tpCdsOrigem
     */
    boolean isSetTpCdsOrigem();

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return uuid
     */
    boolean isSetUuid();

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @return uuidFichaOriginadora
     */
    boolean isSetUuidFichaOriginadora();

    /**
     * Marcador que indica se existem animais no domicílio.
     * @return StAnimaisNoDomicilio
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    boolean isStAnimaisNoDomicilio();

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @return StatusTermoRecusaCadastroDomiciliarAtencaoBasica
     */
    boolean isStatusTermoRecusaCadastroDomiciliarAtencaoBasica();

    /**
     * Lista de código dos animais no domicílio.
     * @param animaisNoDomicilio
     */
    void setAnimaisNoDomicilio(List<Long> animaisNoDomicilio);

    /**
     * Lista de código dos animais no domicílio.
     * @param value
     */
    void setAnimaisNoDomicilioIsSet(boolean value);

    /**
     * Condições de moradia do domicílio.
     * @param condicaoMoradia
     * Não devem ser preenchidos se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true
     */
    void setCondicaoMoradia(ICondicaoMoradia condicaoMoradia);

    /**
     * Condições de moradia do domicílio.
     * @param value
     */
    void setCondicaoMoradiaIsSet(boolean value);

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @param dadosGerais
     */
    void setDadosGerais(IHeaderCdsCadastro dadosGerais);

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @param value
     */
    void setDadosGeraisIsSet(boolean value);

    /**
     * Informações sobre o endereço do domicílio.
     * @param enderecoLocalPermanencia
     * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false
     */
    void setEnderecoLocalPermanencia(IEnderecoLocalPermanencia enderecoLocalPermanencia);

    /**
     * Informações sobre o endereço do domicílio.
     * @param value
     */
    void setEnderecoLocalPermanenciaIsSet(boolean value);

    /**
     * Lista das famílias que residem no domicílio.
     * Tamanho máximo = 4
     * @param familias
     * ão pode ser preenchido caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    void setFamilias(List<IFamiliaRow> familias);

    /**
     * Lista das famílias que residem no domicílio.
     * @param value
     */
    void setFamiliasIsSet(boolean value);

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @param fichaAtualizada
     */
    void setFichaAtualizada(boolean fichaAtualizada);

    void setFichaAtualizadaIsSet(boolean value);

    /**
     * Número de animais no domicílio
     * @param quantosAnimaisNoDomicilio
     * Não pode ser preenchido se o campo stAnimaisNoDomicilio = false.
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    void setQuantosAnimaisNoDomicilio(String quantosAnimaisNoDomicilio);

    /**
     * Número de animais no domicílio
     * @param value
     */
    void setQuantosAnimaisNoDomicilioIsSet(boolean value);

    /**
     * Marcador que indica se existem animais no domicílio.
     * @param stAnimaisNoDomicilio
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    void setStAnimaisNoDomicilio(boolean stAnimaisNoDomicilio);

    /**
     * Marcador que indica se existem animais no domicílio.
     * @param value
     */
    void setStAnimaisNoDomicilioIsSet(boolean value);

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @param statusTermoRecusaCadastroDomiciliarAtencaoBasica
     */
    void setStatusTermoRecusaCadastroDomiciliarAtencaoBasica(boolean statusTermoRecusaCadastroDomiciliarAtencaoBasica);

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @param value
     */
    void setStatusTermoRecusaCadastroDomiciliarAtencaoBasicaIsSet(boolean value);

    /**
     * Tipo de origem dos dados do registro.
     * @param tpCdsOrigem
     * Tamanho máximo = 1
     */
    void setTpCdsOrigem(int tpCdsOrigem);

    /**
     * Tipo de origem dos dados do registro.
     * @param value
     */
    void setTpCdsOrigemIsSet(boolean value);

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param uuid
     */
    void setUuid(String uuid);

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro
     * @param uuidFichaOriginadora
     */
    void setUuidFichaOriginadora(String uuidFichaOriginadora);

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @param value
     */
    void setUuidFichaOriginadoraIsSet(boolean value);

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param value
     */
    void setUuidIsSet(boolean value);

    void unsetAnimaisNoDomicilio();

    void unsetCondicaoMoradia();

    void unsetDadosGerais();

    void unsetEnderecoLocalPermanencia();

    void unsetFamilias();

    void unsetFichaAtualizada();

    void unsetQuantosAnimaisNoDomicilio();

    void unsetStAnimaisNoDomicilio();

    void unsetStatusTermoRecusaCadastroDomiciliarAtencaoBasica();

    void unsetTpCdsOrigem();

    void unsetUuid();

    void unsetUuidFichaOriginadora();

    /**
     * Lista de código dos animais no domicílio.
     * @return List<long>
     * É Condicional
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    boolean validaAnimaisNoDomicilio();

    /**
     * Condições de moradia do domicílio.
     * @return CondicaoMoradia
     * É Condicional
     * Não devem ser preenchidos se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true
     */
    boolean validaCondicaoMoradia();

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @return HeaderCdsCadastro
     * É Obrigatório
     */
    boolean validaDadosGerais();

    /**
     * Informações sobre o endereço do domicílio.
     * @return EnderecoLocalPermanencia
     * É Condicional
     * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false.
     */
    boolean validaEnderecoLocalPermanencia();

    /**
     * Lista das famílias que residem no domicílio.
     * @return List<FamiliaRow>
     * É Condicional
     * Não pode ser preenchido caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    boolean validaFamilias();

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @return FichaAtualizada
     * É Obrigatório
     * Caso seja uma ficha de atualização, o campo uuidFichaOriginadora deve ser preenchido com o UUID da ficha que deu origem ao registro.
     */
    boolean validaFichaAtualizada();

    /**
     * Número de animais no domicílio.
     * @return value
     * É Condicional
     * Não pode ser preenchido se o campo stAnimaisNoDomicilio = false.
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    boolean validaQuantosAnimaisNoDomicilio();

    /**
     * Marcador que indica se existem animais no domicílio.
     * @return StAnimaisNoDomicilio
     * É Condicional
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true
     */
    boolean validaStAnimaisNoDomicilio();

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @return StatusTermoRecusaCadastroDomiciliarAtencaoBasica
     * Não é Obrigatório
     */
    boolean validaStatusTermoRecusaCadastroDomiciliarAtencaoBasica();

    /**
     * Tipo de origem dos dados do registro.
     * @return TpCdsOrigem
     * É obrigatório
     * Tamanho minimo e máximo igual a 1
     */
    boolean validaTpCdsOrigem();

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return  Uuid
     * É Obrigatório
     * tamanho mínimo = 3
     * tamanho maximo = 44
     */
    boolean validaUuid();

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @return UuidFichaOriginadora
     * tamanho mínimo = 3
     * tamanho maximo = 44
     */
    boolean validaUuidFichaOriginadora();

    /**
     *
     * @throws TException
     */
    void validate() throws TException;

    /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação
     *          validaAnimaisNoDomicilio() && validaCondicaoMoradia() && validaDadosGerais() &&
    validaEnderecoLocalPermanencia() && validaFamilias() && validaFichaAtualizada() && validaQuantosAnimaisNoDomicilio() &&
    validaStAnimaisNoDomicilio() && validaStatusTermoRecusaCadastroDomiciliarAtencaoBasica() && validaTpCdsOrigem() && validaUuid() && validaUuidFichaOriginadora();
     */
    boolean validates();
    
}
