/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cidadao;

import br.gov.saude.esus.thrift.definition.cidadao.EnderecoTransportThrift;

/**
 *
 * @author eddyosos
 */
public interface IEnderecoTransport {

    void clear();

    String getArea();

    String getBairroDne();

    String getBairroNome();

    String getComplemento();

    EnderecoTransportThrift getInstance();

    String getLocalidadeCep();

    String getLocalidadeDne();

    String getLocalidadeIbge();

    String getLogradouro();

    String getLogradouroDne();

    String getMicroArea();

    String getNumero();

    String getPontoReferencia();

    String getUfSigla();

    boolean isSemNumero();

    boolean isSetArea();

    boolean isSetBairroDne();

    boolean isSetBairroNome();

    boolean isSetComplemento();

    boolean isSetLocalidadeCep();

    boolean isSetLocalidadeDne();

    boolean isSetLocalidadeIbge();

    boolean isSetLogradouro();

    boolean isSetLogradouroDne();

    boolean isSetMicroArea();

    boolean isSetNumero();

    boolean isSetPontoReferencia();

    boolean isSetSemNumero();

    boolean isSetUfSigla();

    void setArea(String area);

    void setAreaIsSet(boolean value);

    void setBairroDne(String bairroDne);

    void setBairroDneIsSet(boolean value);

    void setBairroNome(String bairroNome);

    void setBairroNomeIsSet(boolean value);

    void setComplemento(String complemento);

    void setComplementoIsSet(boolean value);

    void setLocalidadeCep(String localidadeCep);

    void setLocalidadeCepIsSet(boolean value);

    void setLocalidadeDne(String localidadeDne);

    void setLocalidadeDneIsSet(boolean value);

    void setLocalidadeIbge(String localidadeIbge);

    void setLocalidadeIbgeIsSet(boolean value);

    void setLogradouro(String logradouro);

    void setLogradouroDne(String logradouroDne);

    void setLogradouroDneIsSet(boolean value);

    void setLogradouroIsSet(boolean value);

    void setMicroArea(String microArea);

    void setMicroAreaIsSet(boolean value);

    void setNumero(String numero);

    void setNumeroIsSet(boolean value);

    void setPontoReferencia(String pontoReferencia);

    void setPontoReferenciaIsSet(boolean value);

    void setSemNumero(boolean semNumero);

    void setSemNumeroIsSet(boolean value);

    void setUfSigla(String ufSigla);

    void setUfSiglaIsSet(boolean value);

    void unsetArea();

    void unsetBairroDne();

    void unsetBairroNome();

    void unsetComplemento();

    void unsetLocalidadeCep();

    void unsetLocalidadeDne();

    void unsetLocalidadeIbge();

    void unsetLogradouro();

    void unsetLogradouroDne();

    void unsetMicroArea();

    void unsetNumero();

    void unsetPontoReferencia();

    void unsetSemNumero();

    void unsetUfSigla();
    
}
