/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.transport;

import java.nio.ByteBuffer;

/**
 *
 * @author eddyosos
 */
public interface IDadoTransporte {

    ByteBuffer bufferForDadoSerializado();

    /**
     * Remove o conteúdo da instância.
     */
    void clear();

    /**
     * CNES da unidade de saúde.
     *
     * @return Código CNES da unidade de saúde.
     */
    String getCnesDadoSerializado();

    /**
     * Código IBGE do dado serializado.
     *
     * @return Código IBGE do dado serializado através do TBinaryProtocol.
     */
    String getCodIbge();

    /**
     * Dado serializado através do TBinaryProtocol a partir de uma ficha.
     *
     * @return Dado serializado através do TBinaryProtocol a partir de uma ficha.
     */
    byte[] getDadoSerializado();

    /**
     * INE da equipe que gerou a ficha.
     *
     * @return Código INE da equipe que gerou a ficha.
     */
    String getIneDadoSerializado();

    /**
     * Número do lote para controle interno dos arquivos enviados.
     *
     * @return Número do lote para controle interno dos arquivos enviados.
     */
    long getNumLote();

    /**
     * Identifica a instalação que cadastrou/digitou.
     *
     * @return Instalação que cadastrou/digitou
     */
    IDadoInstalacao getOriginadora();

    /**
     * Identifica a instalação que enviou o dado.
     *
     * @return Identifica a instalação que enviou o dado.
     */
    IDadoInstalacao getRemetente();

    /**
     * Tipo/classe do objeto serializado através do TBinaryProtocol.
     *
     * Os tipos podem ser:
     * 2  - Ficha de Cadastro Individual
     * 3  - Ficha de Cadastro Domiciliar
     * 4  - Ficha de Atendimento Individual
     * 5  - Ficha de Atendimento Odontológico
     * 6  - Ficha de Atividade Coletiva
     * 7  - Ficha de Procedimentos
     * 8  - Ficha de Visita Domiciliar
     * 10 - Ficha de Atendimento Domiciliar
     * 11 - Ficha de Avaliação de Elegibilidade
     * 12 - Marcadores de Consumo Alimentar
     *
     * @return Tipo/classe do objeto serializado através do TBinaryProtocol.
     */
    long getTipoDadoSerializado();

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return Código UUID
     */
    String getUuidDadoSerializado();

    /**
     * Verifica se o CNES da unidade de saúde foi declarado.
     * @return True se tiver sido declarado, caso contrario False.
     */
    boolean isSetCnesDadoSerializado();

    /**
     * Verifica se o código IBGE do dado serializado foi declarado.
     *
     * @return True caso tenha sido declarado, caso contrario False.
     */
    boolean isSetCodIbge();

    /**
     * Verifica se o dado serializado  foi declarado.
     *
     * @return True caso tenha sido declarado, caso contrario False.
     */
    boolean isSetDadoSerializado();

    /**
     * Verifica se o INE da equipe que gerou a ficha foi declarado.
     *
     * @return True caso tenha sido declarado, False caso contrario.
     */
    boolean isSetIneDadoSerializado();

    /**
     * Verifica se o número do lote foi declarado.
     *
     * @return True caso tenha sido declarado, caso contrario False.
     */
    boolean isSetNumLote();

    /**
     * Verifica se a instalação que cadastrou/digitou foi declarada.
     *
     * @return True caso tenha sido declarada, False caso contrario.
     */
    boolean isSetOriginadora();

    /**
     * Verifica se a instalação que enviou o dado foi declarada.
     *
     * @return True caso tenha sido declarada.
     */
    boolean isSetRemetente();

    /**
     * Verifica se o tipo/classe do objeto serializado através do TBinaryProtocol foi declarado.
     * @return True se tiver sido declarado, caso contrario False.
     */
    boolean isSetTipoDadoSerializado();

    /**
     * Verifica se a ficha possui um uuid
     * @return True caso possua um uuid
     */
    boolean isSetUuidDadoSerializado();

    /**
     * Define o CNES da unidade de saúde.
     *
     * Presença obrigatória.
     *
     * Tamanho deve ser 7.
     *
     * @param cnesDadoSerializado Código CNES da unidade de saúde.
     */
    void setCnesDadoSerializado(String cnesDadoSerializado);

    /**
     * Declara que o CNES da unidade de saúde foi inserido.
     *
     * @param value True para declarar que foi inserido, False caso contrario.
     */
    void setCnesDadoSerializadoIsSet(boolean value);

    /**
     * Define o código IBGE do dado serializado.
     *
     * Presença obrigatória.
     * O tamanho deve ser 7.
     *
     * @param codIbge Código IBGE do dado serializado através do TBinaryProtocol.
     */
    void setCodIbge(String codIbge);

    /**
     * Declara que o código IBGE do dado serializado foi inserido.
     *
     * @param value True para declarar que foi inserido, False caso o contrario.
     */
    void setCodIbgeIsSet(boolean value);

    /**
     * Define o dado serializado através do TBinaryProtocol a partir de uma ficha
     *
     * Presença obrigatória.
     *
     * @param dadoSerializado Dado serializado através do TBinaryProtocol a partir de uma ficha
     */
    void setDadoSerializado(byte[] dadoSerializado);

    /**
     * define o dado serializado
     *
     * @param dadoSerializado Dado serializado.
     */
    void setDadoSerializado(ByteBuffer dadoSerializado);

    /**
     * Declara que o dado serializado  foi inserido.
     *
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    void setDadoSerializadoIsSet(boolean value);

    /**
     * Define o INE da equipe que gerou a ficha.
     *
     * O tamanho deve ser 10.
     *
     * @param ineDadoSerializado Código INE da equipe que gerou a ficha.
     */
    void setIneDadoSerializado(String ineDadoSerializado);

    /**
     * Declara que o INE da equipe que gerou a ficha foi inserido.
     *
     * @param value True para declarar que foi inserido, False caso o contrario.
     */
    void setIneDadoSerializadoIsSet(boolean value);

    /**
     * Define o número do lote para controle interno dos arquivos enviados.
     *
     * @param numLote Número do lote para controle interno dos arquivos enviados.
     */
    void setNumLote(long numLote);

    /**
     * Declara se o número do lote foi inserido.
     *
     * @param value True para declarar que foi inserido, False caso contrario.
     */
    void setNumLoteIsSet(boolean value);

    /**
     * Define instalação que cadastrou/digitou.
     *
     * @param originadora Instalação que cadastrou/digitou.
     */
    void setOriginadora(IDadoInstalacao originadora);

    /**
     * Declara que a instalação que cadastrou/digitou foi inserida.
     *
     * @param value True para declarar que foi inserida, caso contrario False.
     */
    void setOriginadoraIsSet(boolean value);

    /**
     * Define a instalação que enviou o dado.
     *
     * Presença obrigatória.
     *
     * @param remetente instalação que enviou o dado.
     */
    void setRemetente(IDadoInstalacao remetente);

    /**
     * Declara que a instalação que enviou o dado foi inserida.
     *
     * @param value True para declarar que foi inserida, caso contrario False.
     */
    void setRemetenteIsSet(boolean value);

    /**
     * Define o tipo/classe do objeto serializado através do TBinaryProtocol.
     *
     * Presença obrigatória.
     *
     * Os tipos podem ser:
     * 2  - Ficha de Cadastro Individual
     * 3  - Ficha de Cadastro Domiciliar
     * 4  - Ficha de Atendimento Individual
     * 5  - Ficha de Atendimento Odontológico
     * 6  - Ficha de Atividade Coletiva
     * 7  - Ficha de Procedimentos
     * 8  - Ficha de Visita Domiciliar
     * 10 - Ficha de Atendimento Domiciliar
     * 11 - Ficha de Avaliação de Elegibilidade
     * 12 - Marcadores de Consumo Alimentar
     *
     * @param tipoDadoSerializado Tipo/classe do objeto serializado através do TBinaryProtocol.
     */
    void setTipoDadoSerializado(long tipoDadoSerializado);

    /**
     * Declara que o tipo/classe do objeto serializado através do TBinaryProtocol foi inserido.
     *
     * @param value True para delcarar que foi inserido, caso contrario False.
     */
    void setTipoDadoSerializadoIsSet(boolean value);

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     *
     * Presença obrigatória
     * Regras: É recomendado concatenar o CNES na frente do UUID,
     * de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen)
     * do UUID são a limitação de 44 bytes do campo. Formato canônico
     *
     * Tamanho mínimo: 36
     * Tamanho máximo: 44
     *
     * @param uuidDadoSerializado Código UUID
     */
    void setUuidDadoSerializado(String uuidDadoSerializado);

    /**
     * Define se o uuid da ficha foi definido.
     * @param value True caso o uuid tenha sido definido.
     */
    void setUuidDadoSerializadoIsSet(boolean value);

    /**
     * Remove o CNES da unidade de saúde.
     */
    void unsetCnesDadoSerializado();

    /**
     * Remove o código IBGE do dado serializado.
     */
    void unsetCodIbge();

    /**
     * Remove o dado serializado.
     */
    void unsetDadoSerializado();

    /**
     * Remove o INE da equipe que gerou a ficha.
     */
    void unsetIneDadoSerializado();

    /**
     * Remove o número do lote.
     */
    void unsetNumLote();

    /**
     * Remove a instalação que cadastrou/digitou.
     */
    void unsetOriginadora();

    /**
     * Remove a instalação que enviou o dado.
     */
    void unsetRemetente();

    /**
     * Remove o tipo/classe do objeto serializado através do TBinaryProtocol.
     */
    void unsetTipoDadoSerializado();

    /**
     * Remove o UuidFicha
     */
    void unsetUuidDadoSerializado();

    /**
     * Valida o código CNES da unidade de saúde.
     *
     * Presença obrigatória.
     *
     * tamanho deve ser 7.
     *
     * @return True se estiver de acordo com as regras, caso contrario False.
     */
    boolean validateCnesDadoSerializado();

    /**
     * Valida o código CNES da unidade de saúde.
     *
     * Presença obrigatória.
     *
     * tamanho deve ser 7.
     *
     * @return True se estiver de acordo com as regras, caso contrario False.
     */
    boolean validateCodIbge();

    /**
     * Valida o dado serializado através do TBinaryProtocol a partir de uma ficha.
     *
     * Presença obrigatória.
     *
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    boolean validateDadoSerializado();

    /**
     * Valida o código INE da equipe que gerou a ficha.
     *
     * tamanho deve ser 10.
     *
     * @return True se estiver de acordo com as regras, caso contrario False.
     */
    boolean validateIneDadoSerializado();

    /**
     * Valida o identificador da instalação que cadastrou/digitou..
     *
     * Presença obrigatória.
     *
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    boolean validateOriginadora();

    /**
     * Valida o identificador da instalação que enviou o dado.
     *
     * Presença obrigatória.
     *
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    boolean validateRemetente();

    /**
     * Valida o tipo/classe do objeto serializado.
     *
     * Presença obrigatória.
     *
     * Os tipos podem ser:
     * 2  - Ficha de Cadastro Individual
     * 3  - Ficha de Cadastro Domiciliar
     * 4  - Ficha de Atendimento Individual
     * 5  - Ficha de Atendimento Odontológico
     * 6  - Ficha de Atividade Coletiva
     * 7  - Ficha de Procedimentos
     * 8  - Ficha de Visita Domiciliar
     * 10 - Ficha de Atendimento Domiciliar
     * 11 - Ficha de Avaliação de Elegibilidade
     * 12 - Marcadores de Consumo Alimentar
     *
     * @return True se estiver de acordo com as regras, caso contrario false.
     */
    boolean validateTipoDadoSerializado();

    /**
     * Valida UuidFicha.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter tamanho entre 36 e 44 (inclusivo)
     * @return true se válido
     *          false se inválido
     */
    boolean validateUuidDadoSerializado();

    boolean validates();
    
}
