/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cidadao;

import br.gov.saude.esus.thrift.definition.cidadao.CidadaoTransportThrift;
import br.gov.saude.esus.thrift.definition.cidadao.SexoThrift;
import br.gov.saude.esus.thrift.definition.cidadao.TipoSanguineoThrift;

/**
 *
 * @author eddyosos
 */
public interface ICidadaoTransport {

    void clear();

    String getCboNumero();

    String getCns();

    String getCpf();

    long getDataNascimento();

    String getEmail();

    IEnderecoTransport getEndereco();

    long getEscolaridadeId();

    long getEstadoCivilId();

    long getEtniaId();

    CidadaoTransportThrift getIstance();

    String getMunicipioNascimentoCep();

    String getMunicipioNascimentoDne();

    String getMunicipioNascimentoIbge();

    String getNisPisPasep();

    String getNomeCompleto();

    String getNomeMae();

    String getNomeSocial();

    String getNumeroProntuario();

    String getNumeroProntuarioCnes();

    long getRacaCorId();

    SexoThrift getSexo();

    String getTelefoneCelular();

    String getTelefoneContato();

    String getTelefoneResidencial();

    TipoSanguineoThrift getTipoSanguineo();

    boolean isDesconheceNomeMae();

    boolean isEstrangeiro();

    boolean isFaleceu();

    boolean isNaoPossuiCns();

    boolean isSetCboNumero();

    boolean isSetCns();

    boolean isSetCpf();

    boolean isSetDataNascimento();

    boolean isSetDesconheceNomeMae();

    boolean isSetEmail();

    boolean isSetEndereco();

    boolean isSetEscolaridadeId();

    boolean isSetEstadoCivilId();

    boolean isSetEstrangeiro();

    boolean isSetEtniaId();

    boolean isSetFaleceu();

    boolean isSetMunicipioNascimentoCep();

    boolean isSetMunicipioNascimentoDne();

    boolean isSetMunicipioNascimentoIbge();

    boolean isSetNaoPossuiCns();

    boolean isSetNisPisPasep();

    boolean isSetNomeCompleto();

    boolean isSetNomeMae();

    boolean isSetNomeSocial();

    boolean isSetNumeroProntuario();

    boolean isSetNumeroProntuarioCnes();

    boolean isSetRacaCorId();

    boolean isSetSexo();

    boolean isSetTelefoneCelular();

    boolean isSetTelefoneContato();

    boolean isSetTelefoneResidencial();

    boolean isSetTipoSanguineo();

    void setCboNumero(String cboNumero);

    void setCboNumeroIsSet(boolean value);

    void setCns(String cns);

    void setCnsIsSet(boolean value);

    void setCpf(String cpf);

    void setCpfIsSet(boolean value);

    void setDataNascimento(long dataNascimento);

    void setDataNascimentoIsSet(boolean value);

    void setDesconheceNomeMae(boolean desconheceNomeMae);

    void setDesconheceNomeMaeIsSet(boolean value);

    void setEmail(String email);

    void setEmailIsSet(boolean value);

    void setEndereco(IEnderecoTransport endereco);

    void setEnderecoIsSet(boolean value);

    void setEscolaridadeId(long escolaridadeId);

    void setEscolaridadeIdIsSet(boolean value);

    void setEstadoCivilId(long estadoCivilId);

    void setEstadoCivilIdIsSet(boolean value);

    void setEstrangeiro(boolean estrangeiro);

    void setEstrangeiroIsSet(boolean value);

    void setEtniaId(long etniaId);

    void setEtniaIdIsSet(boolean value);

    void setFaleceu(boolean faleceu);

    void setFaleceuIsSet(boolean value);

    void setMunicipioNascimentoCep(String municipioNascimentoCep);

    void setMunicipioNascimentoCepIsSet(boolean value);

    void setMunicipioNascimentoDne(String municipioNascimentoDne);

    void setMunicipioNascimentoDneIsSet(boolean value);

    void setMunicipioNascimentoIbge(String municipioNascimentoIbge);

    void setMunicipioNascimentoIbgeIsSet(boolean value);

    void setNaoPossuiCns(boolean naoPossuiCns);

    void setNaoPossuiCnsIsSet(boolean value);

    void setNisPisPasep(String nisPisPasep);

    void setNisPisPasepIsSet(boolean value);

    void setNomeCompleto(String nomeCompleto);

    void setNomeCompletoIsSet(boolean value);

    void setNomeMae(String nomeMae);

    void setNomeMaeIsSet(boolean value);

    void setNomeSocial(String nomeSocial);

    void setNomeSocialIsSet(boolean value);

    void setNumeroProntuario(String numeroProntuario);

    void setNumeroProntuarioCnes(String numeroProntuarioCnes);

    void setNumeroProntuarioCnesIsSet(boolean value);

    void setNumeroProntuarioIsSet(boolean value);

    void setRacaCorId(long racaCorId);

    void setRacaCorIdIsSet(boolean value);

    void setSexo(SexoThrift sexo);

    void setSexoIsSet(boolean value);

    void setTelefoneCelular(String telefoneCelular);

    void setTelefoneCelularIsSet(boolean value);

    void setTelefoneContato(String telefoneContato);

    void setTelefoneContatoIsSet(boolean value);

    void setTelefoneResidencial(String telefoneResidencial);

    void setTelefoneResidencialIsSet(boolean value);

    void setTipoSanguineo(TipoSanguineoThrift tipoSanguineo);

    void setTipoSanguineoIsSet(boolean value);

    void unsetCboNumero();

    void unsetCns();

    void unsetCpf();

    void unsetDataNascimento();

    void unsetDesconheceNomeMae();

    void unsetEmail();

    void unsetEndereco();

    void unsetEscolaridadeId();

    void unsetEstadoCivilId();

    void unsetEstrangeiro();

    void unsetEtniaId();

    void unsetFaleceu();

    void unsetMunicipioNascimentoCep();

    void unsetMunicipioNascimentoDne();

    void unsetMunicipioNascimentoIbge();

    void unsetNaoPossuiCns();

    void unsetNisPisPasep();

    void unsetNomeCompleto();

    void unsetNomeMae();

    void unsetNomeSocial();

    void unsetNumeroProntuario();

    void unsetNumeroProntuarioCnes();

    void unsetRacaCorId();

    void unsetSexo();

    void unsetTelefoneCelular();

    void unsetTelefoneContato();

    void unsetTelefoneResidencial();

    void unsetTipoSanguineo();
    
}
