/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.procedimento;

import br.gov.saude.esus.cds.transport.generated.thrift.procedimento.FichaProcedimentoMasterThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IUnicaLotacaoHeader;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IFichaProcedimentoMaster {

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void addToAtendProcedimentos(IFichaProcedimentoChild elem);

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    List<IFichaProcedimentoChild> getAtendProcedimentos();

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    Iterator<IFichaProcedimentoChild> getAtendProcedimentosIterator();

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    int getAtendProcedimentosSize();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    IUnicaLotacaoHeader getHeaderTransport();

    FichaProcedimentoMasterThrift getInstance();

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    long getNumTotalAfericaoPa();

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    long getNumTotalAfericaoTemperatura();

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    long getNumTotalColetaMaterialParaExameLaboratorial();

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    long getNumTotalCurativoSimples();

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    long getNumTotalGlicemiaCapilar();

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    long getNumTotalMedicaoAltura();

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    long getNumTotalMedicaoPeso();

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    int getTpCdsOrigem();

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    String getUuidFicha();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetAtendProcedimentos();

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    boolean isSetHeaderTransport();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetNumTotalAfericaoPa();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetNumTotalAfericaoTemperatura();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetNumTotalColetaMaterialParaExameLaboratorial();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetNumTotalCurativoSimples();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetNumTotalGlicemiaCapilar();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetNumTotalMedicaoAltura();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetNumTotalMedicaoPeso();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    boolean isSetTpCdsOrigem();

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    boolean isSetUuidFicha();

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setAtendProcedimentos(List<IFichaProcedimentoChild> atendProcedimentos);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setAtendProcedimentosIsSet(boolean value);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setHeaderTransport(IUnicaLotacaoHeader headerTransport);

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    void setHeaderTransportIsSet(boolean value);

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setNumTotalAfericaoPa(long numTotalAfericaoPa);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setNumTotalAfericaoPaIsSet(boolean value);

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setNumTotalAfericaoTemperatura(long numTotalAfericaoTemperatura);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setNumTotalAfericaoTemperaturaIsSet(boolean value);

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setNumTotalColetaMaterialParaExameLaboratorial(long numTotalColetaMaterialParaExameLaboratorial);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setNumTotalColetaMaterialParaExameLaboratorialIsSet(boolean value);

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setNumTotalCurativoSimples(long numTotalCurativoSimples);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setNumTotalCurativoSimplesIsSet(boolean value);

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setNumTotalGlicemiaCapilar(long numTotalGlicemiaCapilar);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setNumTotalGlicemiaCapilarIsSet(boolean value);

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    void setNumTotalMedicaoAltura(long numTotalMedicaoAltura);

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    void setNumTotalMedicaoAlturaIsSet(boolean value);

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setNumTotalMedicaoPeso(long numTotalMedicaoPeso);

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    void setNumTotalMedicaoPesoIsSet(boolean value);

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    void setTpCdsOrigem(int tpCdsOrigem);

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setTpCdsOrigemIsSet(boolean value);

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void setUuidFicha(String uuidFicha);

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    void setUuidFichaIsSet(boolean value);

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    void unsetHeaderTransport();

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    void unsetTpCdsOrigem();

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    void unsetUuidFicha();

    /**
     * Valida todos os campos.
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validate();

    /**
     * Registro dos procedimentos realizados.
     * Regras: Utilizar valor 3 (sistemas terceiros).
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateAtendProcedimentos();

    /**
     * Valida os campos com preenchimento condicional.
     * @return True caso ao menos um dos campos esteja válido, false caso todos estejam inválidos
     */
    boolean validateGroup();

    /**
     * Profissional que realizou os procedimentos.
     * Obrigatório!
     * Regras: Utilizar valor 3 (sistemas terceiros).
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateHeaderTransport();

    /**
     * Quantidade de aferições de pressão realizadas.
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateNumTotalAfericaoPa();

    /**
     * Quantidade de aferições de glicemia capilar.
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateNumTotalAfericaoTemperatura();

    /**
     * Quantidade de aferições de peso.
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateNumTotalColetaMaterialParaExameLaboratorial();

    /**
     * Quantidade de curativos simples realizados.
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateNumTotalCurativoSimples();

    /**
     * Quantidade de aferições de glicemia capilar.
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateNumTotalGlicemiaCapilar();

    /**
     * Quantidade de aferições de altura.
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateNumTotalMedicaoAltura();

    /**
     * Quantidade de aferições de peso.
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateNumTotalMedicaoPeso();

    /**
     * Tipo de origem dos dados do registro.
     * Obrigatório!
     * Regras: Utilizar valor 3 (sistemas terceiros).
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateTpCdsOrigem();

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * Obrigatório!
     * Regras: É recomendado concatenar o CNES na frente do UUID, de modo que os
     * 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do
     * UUID são a limitação de 44 bytes do campo.
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateUuidFicha();
    
}
