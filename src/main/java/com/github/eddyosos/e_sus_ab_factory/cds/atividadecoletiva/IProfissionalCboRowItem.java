/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ProfissionalCboRowItemThrift;

/**
 *
 * @author eddyosos
 */
public interface IProfissionalCboRowItem {

    /**
     * Devolve o valor de cns
     * @return cns String
     */
    String getCns();

    /**
     * Devolve o valor de codigoCbo2002
     * @return codigoCbo2002 String
     */
    String getCodigoCbo2002();

    /**
     * Devolve uma instancia de ProfissionalCboRowItemThrift
     * @return profissionalCboRowItemThrift
     */
    ProfissionalCboRowItemThrift getInstance();

    /**
     * Altera o valor de cns
     * @param cns String
     */
    void setCns(String cns);

    /**
     * Atlera o valor de codigoCbo2002
     * @param codigoCbo2002 String
     */
    void setCodigoCbo2002(String codigoCbo2002);
    
}
