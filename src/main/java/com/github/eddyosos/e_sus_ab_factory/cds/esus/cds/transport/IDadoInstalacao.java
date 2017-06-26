/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.transport;

import br.gov.saude.esus.transport.common.generated.thrift.DadoInstalacaoThrift;

/**
 *
 * @author eddyosos
 */
public interface IDadoInstalacao {

    /**
     * Remove todos os dados da instância.
     */
    void clear();

    /**
     * Identifica o software que gerou o dado (pec/cds, cdsOff ou software de terceiros).
     * @return Identificador do software que gerou o dado (pec/cds, cdsOff ou software de terceiros).
     */
    String getContraChave();

    /**
     * CPF do responsável ou CNPJ da empresa responsável.
     * @return CPF do responsável ou CNPJ da empresa responsável.
     */
    String getCpfOuCnpj();

    /**
     * Email da pessoa ou empresa responsável.
     *
     * @return Email da pessoa ou empresa responsável.
     */
    String getEmail();

    /**
     * Telefone da pessoa ou empresa responsável.
     *
     * @return Telefone da pessoa ou empresa responsável.
     */
    String getFone();

    DadoInstalacaoThrift getInstance();

    /**
     * Nome do responsável ou razão social da empresa responsável.
     * @return Nome do responsável ou razão social da empresa responsável.
     */
    String getNomeOuRazaoSocial();

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return Código UUID
     */
    String getUuidInstalacao();

    /**
     * Verifica se o software que gerou o dado foi declarado.
     *
     * @return True caso tenha sido declarado, caso contrario False.
     */
    boolean isSetContraChave();

    /**
     * Verifica se o CPF do responsável ou CNPJ da empresa responsável foi declarado.
     *
     * @return True caso tenha sido declarado, False caso contrario.
     */
    boolean isSetCpfOuCnpj();

    /**
     * Verifica se o email da pessoa ou empresa responsável foi declarado.
     *
     * @return true caso tenha sido declarado, False caso contrario.
     */
    boolean isSetEmail();

    /**
     * Verifica se o telefone da pessoa ou empresa responsável foi declarado.
     *
     * @return True caso tenha sido declarado, False caso contrario.
     */
    boolean isSetFone();

    /**
     * Verifica se o ome do responsável ou razão social da empresa responsável foi declarado.
     *
     * @return True caso tenha sido declarado, caso contrario False.
     */
    boolean isSetNomeOuRazaoSocial();

    /**
     * Verifica se a ficha possui um uuid
     * @return True caso possua um uuid
     */
    boolean isSetUuidInstalacao();

    /**
     * Define o software que gerou o dado (pec/cds, cdsOff ou software de terceiros).
     *
     * @param contraChave Identificador do software que gerou o dado (pec/cds, cdsOff ou software de terceiros).
     */
    void setContraChave(String contraChave);

    /**
     * Declara que o software que gerou o dado foi inserido.
     *
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    void setContraChaveIsSet(boolean value);

    /**
     * Define o CPF do responsável ou CNPJ da empresa responsável.
     *
     * Presença obrigatória.
     *
     * Observações:
     * Apenas CPFs e CNPJs válidos. Rever validação.
     * Campo serve para a identificar a instalação que gerou / cadastrou / enviou os dados.
     *
     * @param cpfOuCnpj CPF do responsável ou CNPJ da empresa responsável.
     */
    void setCpfOuCnpj(String cpfOuCnpj);

    /**
     * Declara que o CPF do responsável ou CNPJ da empresa responsável foi inserido.
     *
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    void setCpfOuCnpjIsSet(boolean value);

    /**
     * Define o email da pessoa ou empresa responsável.
     *
     * Tamanho mínimo: 6
     * Tamanho máximo: 255
     *
     * @param email Email da pessoa ou empresa responsável.
     */
    void setEmail(String email);

    /**
     * Declara que o email da pessoa ou empresa responsável foi inserido.
     *
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    void setEmailIsSet(boolean value);

    /**
     * Define o telefone da pessoa ou empresa responsável.
     *
     * Presença obrigatória.
     *
     * Tamanho mínimo 10.
     * Tamanho máximo: 11.
     *
     * Observações: Campo serve para a identificar a instalação que gerou / cadastrou / enviou os dados.
     *
     * @param fone Telefone da pessoa ou empresa responsável
     */
    void setFone(String fone);

    /**
     * Declara que o telefone da pessoa ou empresa responsável foi inserido.
     *
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    void setFoneIsSet(boolean value);

    /**
     * Nome do responsável ou razão social da empresa responsável.
     *
     * Presença obrigatória.
     *
     * Observações: Campo serve para a identificar a instalação que gerou / cadastrou / enviou os dados.
     *
     * @param nomeOuRazaoSocial Nome do responsável ou razão social da empresa responsável.
     */
    void setNomeOuRazaoSocial(String nomeOuRazaoSocial);

    /**
     * Declara que o ome do responsável ou razão social da empresa responsável foi inserido.
     *
     * @param value True para declarar que foi inserido, False caso o contrario.
     */
    void setNomeOuRazaoSocialIsSet(boolean value);

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     *
     * Presença obrigatória
     *
     * Observações: Campo serve para a identificar a instalação que gerou / cadastrou / enviou os dados.
     *
     * @param uuidInstalacao Código UUID
     */
    void setUuidInstalacao(String uuidInstalacao);

    /**
     * Define se o uuid da ficha foi definido.
     * @param value True caso o uuid tenha sido definido.
     */
    void setUuidInstalacaoIsSet(boolean value);

    /**
     * Remove o software que gerou o dado.
     */
    void unsetContraChave();

    /**
     * Remove o CPF do responsável ou CNPJ da empresa responsável.
     */
    void unsetCpfOuCnpj();

    /**
     * Remove o email da pessoa ou empresa responsável.
     */
    void unsetEmail();

    /**
     * Remove o telefone da pessoa ou empresa responsável.
     */
    void unsetFone();

    /**
     * Remove o nome do responsável ou razão social da empresa responsável.
     */
    void unsetNomeOuRazaoSocial();

    /**
     * Remove o Uuid da ficha
     */
    void unsetUuidInstalacao();

    /**
     * Valida o identificador do software que gerou o dado (pec/cds, cdsOff ou software de terceiros).
     *
     * Presença obrigatória.
     *
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    boolean validateContraChave();

    /**
     * Valida o CPF do responsável ou CNPJ da empresa responsável.
     *
     * Presença obrigatória.
     *
     * Tamanho mínimo : 11
     * Tamanho máximo: 15
     *
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    boolean validateCpfOuCnpj();

    /**
     * Valida o email da pessoa ou empresa responsável.
     *
     * Presença obrigatória.
     *
     * Tamanho mínimo : 6
     * Tamanho máximo: 255
     *
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    boolean validateEmail();

    /**
     * Valida o telefone da pessoa ou empresa responsável.
     *
     * Presença obrigatória.
     *
     * Tamanho mínimo : 10
     * Tamanho máximo: 11
     *
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    boolean validateFone();

    /**
     * Valida o nome do responsável ou razão social da empresa responsável.
     *
     * Presença obrigatória.
     *
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    boolean validateNomeOuRazaoSocial();

    /**
     * Valida um identificador da instalação do software que gerou o dado. Seja ele o e-SUS ou software de terceiro. Cada e-SUS possui um UUID.
     *
     * Presença obrigatória.
     *
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    boolean validateUuidInstalacao();

    boolean validates();
    
}
