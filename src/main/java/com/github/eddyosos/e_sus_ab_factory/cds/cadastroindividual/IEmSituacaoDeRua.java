/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.EmSituacaoDeRuaThrift;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IEmSituacaoDeRua {

    /**
     * Adiciona uma origem da alimentação do cidadão em situação de rua.
     *
     * Máximo: 5
     * Regras: Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @param elem Código da origem da alimentação do cidadão em situação de rua
     */
    void addToOrigemAlimentoSituacaoRua(long elem);

    void clear();

    /**
     * Grau de parentesco do familiar que frequenta.
     * @return
     */
    String getGrauParentescoFamiliarFrequentado();

    /**
     * Código das condições de higiene que o cidadão tem acesso.
     * @return
     */
    List<Long> getHigienePessoalSituacaoRua();

    /**
     * Instância thrift da classe.
     * @return Instância thrift da classe.
     */
    EmSituacaoDeRuaThrift getInstance();

    /**
     * Origens da alimentação do cidadão em situação de rua.
     *
     * @return Código da origem da alimentação do cidadão em situação de rua.
     */
    List<Long> getOrigemAlimentoSituacaoRua();

    /**
     * Origens da alimentação do cidadão em situação de rua.
     *
     * @return Código da origem da alimentação do cidadão em situação de rua.
     */
    Iterator<Long> getOrigemAlimentoSituacaoRuaIterator();

    /**
     * A quantidade de origens da alimentação do cidadão em situação de rua.
     *
     * @return Quantidade de origens da alimentação do cidadão em situação de rua.
     */
    int getOrigemAlimentoSituacaoRuaSize();

    /**
     * Nome de outra instituição que acompanha o cidadão.
     *
     * @return Nome de outra instituição que acompanha o cidadão.
     */
    String getOutraInstituicaoQueAcompanha();

    /**
     * Quantidade de vezes que o cidadão se alimenta por dia.
     * @return Código da quantidade de vezes que o cidadão se alimenta por dia.
     */
    long getQuantidadeAlimentacoesAoDiaSituacaoRua();

    /**
     * Tempo que o cidadão está em situação de rua
     *
     * @return Código do tempo que o cidadão está em situação de rua.
     */
    long getTempoSituacaoRua();

    /**
     * Verifica se a origem da alimentação do cidadão em situação de rua foi declarada.
     * @return True caso tenha sido declarada, caso contrario False.
     */
    boolean isSetOrigemAlimentoSituacaoRua();

    /**
     * Verifica se o nome de outra instituição que acompanha o cidadão foi declarado.
     *
     * @return True caso tenha sido declarada, caso contrario False.
     */
    boolean isSetOutraInstituicaoQueAcompanha();

    /**
     * Verifica se a quantidade de vezes que o cidadão se alimenta por dia foi declarada.
     *
     * @return True caso tenha sido declarada, caso contrario False.
     */
    boolean isSetQuantidadeAlimentacoesAoDiaSituacaoRua();

    /**
     * Verifica se foi declarada a informação que informa se o cidadão é ou não acompanhado por outra instituição.
     *
     * @return True caso tenha sido inserida, caso contrario False.
     */
    boolean isSetStatusAcompanhadoPorOutraInstituicao();

    /**
     * Verifica se o marcador que indica se o cidadão possuiu alguma referência familiar foi declarado.
     *
     * @return True caso tenha sido declarado, caso contraio false.
     */
    boolean isSetStatusPossuiReferenciaFamiliar();

    /**
     * Verifica se o marcador que indica se o cidadão recebe algum benefício foi declarado.
     *
     * @return True caso tenha sido declarado, caso contrario False.
     */
    boolean isSetStatusRecebeBeneficio();

    /**
     * Verifica se o marcador que indica se o cidadão está em situação de rua foi declarado.
     *
     * @return True caso tenha sido declarado, false caso contrario.
     */
    boolean isSetStatusSituacaoRua();

    /**
     * Verifica se o marcador que indica se o cidadão tem acesso a higiene pessoal foi inserido.
     *
     * @return True caso tenha sido inserido, caso contrario false.
     */
    boolean isSetStatusTemAcessoHigienePessoalSituacaoRua();

    /**
     * Verifica se o marcador que indica se o cidadão visita algum familiar frequentemente foi declarado.
     *
     * @return True caso tenha sido declarado, caso contrario false.
     */
    boolean isSetStatusVisitaFamiliarFrequentemente();

    /**
     * Verifica se o tempo que o cidadão está em situação de rua foi declarado.
     *
     * @return True caso tenha sido declarado, caso contrario false.
     */
    boolean isSetTempoSituacaoRua();

    /**
     * Verifica se o cidadão é acompanhado por outra instituição.
     *
     * @return True caso seja acompanhado por outra instituição, caso contrario False.
     */
    boolean isStatusAcompanhadoPorOutraInstituicao();

    /**
     * Indica se o cidadão possuiu alguma referência familiar.
     *
     * @return True caso possua alguma referencia, caso contrario False.
     */
    boolean isStatusPossuiReferenciaFamiliar();

    /**
     * Indica se o cidadão recebe algum benefício.
     *
     * @return True se o cidadão receber algum benefício, false caso não.
     */
    boolean isStatusRecebeBeneficio();

    /**
     * Indica se o cidadão está em situação de rua.
     *
     * @return True caso o cidadão esteja em situação de rua, caso contrario false.
     */
    boolean isStatusSituacaoRua();

    /**
     * Indica se o cidadão tem acesso a higiene pessoal.
     * @return True caso tenha acesso, caso contrario false.
     */
    boolean isStatusTemAcessoHigienePessoalSituacaoRua();

    /**
     * Indica se o cidadão visita algum familiar frequentemente.
     *
     * @return True caso visite, caso contrario false.
     */
    boolean isStatusVisitaFamiliarFrequentemente();

    /**
     * Grau de parentesco do familiar que frequenta.
     * @param grauParentescoFamiliarFrequentado
     */
    void setGrauParentescoFamiliarFrequentado(String grauParentescoFamiliarFrequentado);

    /**
     * Código das condições de higiene que o cidadão tem acesso.
     * @param higienePessoalSituacaoRua
     */
    void setHigienePessoalSituacaoRua(List<Long> higienePessoalSituacaoRua);

    /**
     * Define as origens da alimentação do cidadão em situação de rua.
     *
     * Máximo: 5
     * Regras: Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @param origemAlimentoSituacaoRua Código da origem da alimentação do cidadão em situação de rua
     */
    void setOrigemAlimentoSituacaoRua(List<Long> origemAlimentoSituacaoRua);

    /**
     * Declara que a origem da alimentação do cidadão em situação de rua foi inserida.
     *
     * @param value True para declarar que foi inserida, caso contrario False.
     */
    void setOrigemAlimentoSituacaoRuaIsSet(boolean value);

    /**
     * Define o nome de outra instituição que acompanha o cidadão.
     *
     * Tamanho máximo: 100
     *
     * Regra: Não pode ser preechido se o campo statusSituacaoRua = false.
     * Regra: Não pode ser preenchido se o campo statusAcompanhadoPorOutraInstituição = false.
     *
     * @param outraInstituicaoQueAcompanha Nome de outra instituição que acompanha o cidadão.
     */
    void setOutraInstituicaoQueAcompanha(String outraInstituicaoQueAcompanha);

    /**
     * Declara que o nome de outra instituição que acompanha o cidadão foi inserido.
     *
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    void setOutraInstituicaoQueAcompanhaIsSet(boolean value);

    /**
     * Define a quantidade de vezes que o cidadão se alimenta por dia.
     *
     * Regras: Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @param quantidadeAlimentacoesAoDiaSituacaoRua Código da quantidade de vezes que o cidadão se alimenta por dia.
     */
    void setQuantidadeAlimentacoesAoDiaSituacaoRua(long quantidadeAlimentacoesAoDiaSituacaoRua);

    /**
     * Declara que a quantidade de vezes que o cidadão se alimenta por dia foi inserida
     *
     * @param value True para declarar que foi inserida, caso contrario False.
     */
    void setQuantidadeAlimentacoesAoDiaSituacaoRuaIsSet(boolean value);

    /**
     * Declara que a informação que informa se o cidadão é ou não acompanhado por outra instituição foi inserida.
     *
     * @param statusAcompanhadoPorOutraInstituicao True para declarar que foi inserido, caso contrario False.
     */
    void setStatusAcompanhadoPorOutraInstituicao(boolean statusAcompanhadoPorOutraInstituicao);

    /**
     * Declara que a informação que informa se o cidadão é ou não acompanhado por outra instituição foi inserida.
     *
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    void setStatusAcompanhadoPorOutraInstituicaoIsSet(boolean value);

    /**
     * Define se o cidadão possuiu alguma referência familiar.
     *
     * Regra: Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @param statusPossuiReferenciaFamiliar True para indicar que possui referencia, False caso contrario.
     */
    void setStatusPossuiReferenciaFamiliar(boolean statusPossuiReferenciaFamiliar);

    /**
     * Declara que o marcador que indica se o cidadão possuiu alguma referência familiar foi inserido.
     *
     * @param value True para declarar que foi inserido, false caso contrario.
     */
    void setStatusPossuiReferenciaFamiliarIsSet(boolean value);

    /**
     * Define se o cidadão recebe algum benefício.
     *
     * Regra: Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @param statusRecebeBeneficio True para indicar que recebe algum benefício, false para indicar que não.
     */
    void setStatusRecebeBeneficio(boolean statusRecebeBeneficio);

    /**
     * Declara que o marcador que indica se o cidadão recebe algum benefício foi inserido.
     *
     * @param value True para indicar que foi inserido, false caso contrario.
     */
    void setStatusRecebeBeneficioIsSet(boolean value);

    /**
     * Define se o cidadão está em situação de rua.
     *
     * Presença obrigatória.
     *
     * @param statusSituacaoRua True para indicar que o cidadão está em situação de rua, caso contrario false.
     */
    void setStatusSituacaoRua(boolean statusSituacaoRua);

    /**
     * Declara que o marcador que indica se o cidadão está em situação de rua foi inserido.
     *
     * @param value True para informar que foi inserido, false caso contrario.
     */
    void setStatusSituacaoRuaIsSet(boolean value);

    /**
     * Define se o cidadão tem acesso a higiene pessoal.
     *
     * Regra: Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @param statusTemAcessoHigienePessoalSituacaoRua True para declarar que tem acesso, false caso contrario.
     */
    void setStatusTemAcessoHigienePessoalSituacaoRua(boolean statusTemAcessoHigienePessoalSituacaoRua);

    /**
     * Declara que o marcador que indica se o cidadão tem acesso a higiene pessoal foi inserido.
     *
     * @param value True para declarar que foi inserido, caso contrario false.
     */
    void setStatusTemAcessoHigienePessoalSituacaoRuaIsSet(boolean value);

    /**
     * Define se o cidadão visita algum familiar frequentemente.
     *
     * Regras: Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @param statusVisitaFamiliarFrequentemente True caso visite, caso contrario false.
     */
    void setStatusVisitaFamiliarFrequentemente(boolean statusVisitaFamiliarFrequentemente);

    /**
     * Declara que o marcador que indica se o cidadão visita algum familiar frequentemente foi inserido.
     *
     * @param value True para declarar que foi inserido, caso contrario false.
     */
    void setStatusVisitaFamiliarFrequentementeIsSet(boolean value);

    /**
     * Define o tempo que o cidadão está em situação de rua.
     *
     * Regras: Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @param tempoSituacaoRua Código do tempo que o cidadão está em situação de rua.
     */
    void setTempoSituacaoRua(long tempoSituacaoRua);

    /**
     * Declara que o tempo que o cidadão está em situação de rua foi inserido.
     *
     * @param value True para declarar que foi inserido, caso contrario false.
     */
    void setTempoSituacaoRuaIsSet(boolean value);

    /**
     * Remove a origem da alimentação do cidadão em situação de rua.
     */
    void unsetOrigemAlimentoSituacaoRua();

    /**
     * Remove o nome de outra instituição que acompanha o cidadão.
     */
    void unsetOutraInstituicaoQueAcompanha();

    /**
     * Remove a quantidade de vezes que o cidadão se alimenta por dia.
     */
    void unsetQuantidadeAlimentacoesAoDiaSituacaoRua();

    /**
     * Remove a a informação que informa se o cidadão é ou não acompanhado por outra instituição.
     */
    void unsetStatusAcompanhadoPorOutraInstituicao();

    /**
     * Remove o marcador que indica se o cidadão possuiu alguma referência familiar.
     */
    void unsetStatusPossuiReferenciaFamiliar();

    /**
     * Remove o marcador que indica se o cidadão recebe algum benefício.
     */
    void unsetStatusRecebeBeneficio();

    /**
     * Remove o marcador que indica se o cidadão está em situação de rua.
     */
    void unsetStatusSituacaoRua();

    /**
     * Remove o marcador que indica se o cidadão tem acesso a higiene pessoal.
     */
    void unsetStatusTemAcessoHigienePessoalSituacaoRua();

    /**
     * Remove o marcador que indica se o cidadão visita algum familiar frequentemente.
     */
    void unsetStatusVisitaFamiliarFrequentemente();

    /**
     * Remove o tempo que o cidadão está em situação de rua.
     */
    void unsetTempoSituacaoRua();

    /**
     * Valida GrauParentescoFamiliarFrequentado.
     * Para ser válido, caso inserido, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 2- Não pode ser preenchido se o campo statusVisitaFamiliarFrequentemente = false.
     * @return true se válido
     *          false se inválido
     */
    boolean validateGrauParentescoFamiliarFrequentado();

    /**
     * Valida HigienePessoalSituacaoRua.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 2- Requerido preenchimento de pelo menos um item se o campo statusTemAcessoHigienePessoalSituacaoRua = true.
     * @return true se válido
     *          false se inválido
     */
    boolean validateHigienePessoalSituacaoRua();

    /**
     * Valida OrigemAlimentoSituacaoRua.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 2- Máximo 5
     *
     * @return true se válido
     *          false se inválido
     */
    boolean validateOrigemAlimentoSituacaoRua();

    /**
     * Valida OutraInstituicaoQueAcompanha.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 2- Não pode ser preenchido se o campo statusAcompanhadoPorOutraInstituição = false.
     * 3- Tamanho máximo 100.
     *
     * @return true se válido
     *          false se inválido
     */
    boolean validateOutraInstituicaoQueAcompanha();

    /**
     * Valida QuantidadeAlimentacoesAoDiaSituacaoRua.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @return true se válido
     *          false se inválido
     */
    boolean validateQuantidadeAlimentacoesAoDiaSituacaoRua();

    /**
     * Valida StatusAcompanhadoPorOutraInstituicao.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @return true se válido
     *          false se inválido
     */
    boolean validateStatusAcompanhadoPorOutraInstituicao();

    /**
     * Valida StatusPossuiReferenciaFamiliar.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @return true se válido
     *          false se inválido
     */
    boolean validateStatusPossuiReferenciaFamiliar();

    /**
     * Valida StatusRecebeBeneficio.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @return true se válido
     *          false se inválido
     */
    boolean validateStatusRecebeBeneficio();

    /**
     * Valida StatusSituacaoRua.
     * Para ser válida,  deve:
     * 1- Presença obrigatória.
     *
     * @return true se válido
     *          false se inválido
     */
    boolean validateStatusSituacaoRua();

    /**
     * Valida StatusTemAcessoHigienePessoalSituacaoRua.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @return true se válido
     *          false se inválido
     */
    boolean validateStatusTemAcessoHigienePessoalSituacaoRua();

    /**
     * Valida StatusVisitaFamiliarFrequentemente.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @return true se válido
     *          false se inválido
     */
    boolean validateStatusVisitaFamiliarFrequentemente();

    /**
     * Valida TempoSituacaoRua.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     *
     * @return true se válido
     *          false se inválido
     */
    boolean validateTempoSituacaoRua();

    /**
     * Valida a instancia
     * @return true se válido
     *          false se inválido
     */
    boolean validates();
    
}
