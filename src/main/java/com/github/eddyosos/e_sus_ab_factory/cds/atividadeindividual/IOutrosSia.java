/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.OutrosSiaThrift;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IOutrosSia {

    /**
     * Código do exame solicitado ou avaliado.
     * @return
     */
    String getCodigoExame();

    OutrosSiaThrift getInstance();

    /**
     * Código do indicador se o exame foi Solicitado e / ou Avaliado.
     * @return
     */
    List<String> getSolicitadoAvaliado();

    /**
     * Código do exame solicitado ou avaliado.
     * @param codigoExame
     */
    void setCodigoExame(String codigoExame);

    /**
     * Código do indicador se o exame foi Solicitado e / ou Avaliado.
     * @param solicitadoAvaliado
     */
    void setSolicitadoAvaliado(List<String> solicitadoAvaliado);

    /**
     * Valida CodigoExame.
     * Para ser válido deve:
     * 1- Ter sido inserido préviamente
     * 2- Atender ao regex: \A\d{10}\z
     * @return
     */
    boolean validateCodigoExame();

    /**
     * Valida SolicitadoAvaliado.
     * Para ser válido deve ter sido inserido préviamente.
     * @return true se válido
     *          false se inválido
     */
    boolean validateSolicitadoAvaliado();

    /**
     * Valida a instancia
     * @return true se válido
     *          false se inválido
     */
    boolean validates();
    
}
