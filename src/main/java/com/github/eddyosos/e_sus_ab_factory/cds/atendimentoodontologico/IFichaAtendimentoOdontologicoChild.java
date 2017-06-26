/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.eddyosos.e_sus_ab_factory.cds.atendimentoodontologico;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.FichaAtendimentoOdontologicoChildThrift;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IFichaAtendimentoOdontologicoChild {

    /**
     * Adiciona um procedimento a lista de outros procedimentos.
     *
     * Regra: Não pode conter procedimentos da ListaProcedimentosRealizados.
     * Regra: Não pode haver procedimentos com o mesmo código.
     *
     * Mínimo: 0
     * Máximo: 24
     *
     * @param elem código do procedimento
     */
    void addToOutrosSiaProcedimentos(IProcedimentoQuantidade elem);

    /**
     * Adiciona um procedimento a lista de procedimentos realizados.
     *
     * Mínimo: 0
     * Máximo: 27
     *
     * @param elem Código dos procedimentos que são apresentados na ficha.
     */
    void addToProcedimentosRealizados(IProcedimentoQuantidade elem);

    /**
     * Adiciona um tipo de consulta odontológica realizada.
     *
     * Regra: É Requerido se o TipoDeAtendimento = 2 (consulta agendada).
     * Regra: Não pode ser preenchido se o TipoDeAtendimento = 4 (escuta inicial ou orientação).
     * Regra: Se o TipoDeAtendimento = 6 (atendimento de urgência), a opção de 2 (consulta de retorno) não pode ser marcada.
     * Regra: Se TipoDeAtendimento = 5 (consulta no dia), o campo é opcional.
     * Regra: Aceita apenas um registro.
     *
     * @param elem Código do tipo de consulta odontológica realizada.
     */
    void addToTiposConsultaOdonto(long elem);

    /**
     * Adiciona uma conduta adotada ou possíveis encaminhamentos.
     *
     *
     *
     * @param elem Código das conduta adotada ou encaminhamento.
     */
    void addToTiposEncamOdonto(long elem);

    /**
     * Adiciona um material a lista de materiais fornecido durante o atendimento.
     *
     * Máximo : 3
     *
     * @param elem Código dos materiais fornecidos durante o atendimento.
     */
    void addToTiposFornecimOdonto(long elem);

    /**
     * Adiciona um marcador referente a situação de vigilância em saúde bucal.
     *
     * Presença Obrigatória.
     * Mínimo: 1
     * Máximo: 7
     *
     * @param elem Código dos marcadores referentes a situação de vigilância em saúde bucal.
     */
    void addToTiposVigilanciaSaudeBucal(long elem);

    /**
     * Remove todos os dados da ficha.
     */
    void clear();

    /**
     * Data de nascimento do cidadão.
     *
     * @return Data de nascimento do cidadão no formato epoch time.
     */
    long getDtNascimento();

    /**
     * Instancia thrift da classe
     *
     * @return thrift da classe
     */
    FichaAtendimentoOdontologicoChildThrift getInstance();

    /**
     * Local onde o atendimento foi realizado
     *
     * @return Código do local onde o atendimento foi realizado
     */
    long getLocalAtendimento();

    /**
     * CNS do cidadão.
     * @return CNS do cidadão.
     */
    String getNumCartaoSus();

    /**
     * Número do prontuário do cidadão.
     *
     * @return Número do prontuário do cidadão.
     */
    String getNumProntuario();

    /**
     * Lista de outros códigos de procedimentos.
     *
     * @return Lista de outros códigos de procedimentos.
     */
    List<IProcedimentoQuantidade> getOutrosSiaProcedimentos();

    /**
     * Iterator de outros códigos de procedimentos.
     *
     * @return Iterator de outros códigos de procedimentos.
     */
    Iterator<IProcedimentoQuantidade> getOutrosSiaProcedimentosIterator();

    /**
     * Quantidade de outros códigos de procedimentos.
     *
     * @return Quantidade de outros códigos de procedimentos.
     */
    int getOutrosSiaProcedimentosSize();

    /**
     * Procedimentos que são apresentados na ficha.
     *
     * @return Código dos procedimentos que são apresentados na ficha.
     */
    List<IProcedimentoQuantidade> getProcedimentosRealizados();

    /**
     * Procedimentos que são apresentados na ficha.
     *
     * @return Código dos procedimentos que são apresentados na ficha.
     */
    Iterator<IProcedimentoQuantidade> getProcedimentosRealizadosIterator();

    /**
     * Quantidade de procedimentos que são apresentados na ficha.
     *
     * @return Quantidade de procedimentos que são apresentados na ficha.
     */
    int getProcedimentosRealizadosSize();

    /**
     * Retorna o sexo do cidadão.
     * @return Código do sexo do cidadão.
     */
    long getSexo();

    /**
     * Tipo de atendimento realizado
     *
     * @return Código do tipo de atendimento realizado.
     */
    long getTipoAtendimento();

    /**
     * Tipos de consulta odontológica realizadas.
     *
     * @return Códigos dos tipos de consulta odontológica realizadas.
     */
    List<Long> getTiposConsultaOdonto();

    /**
     * Tipos de consulta odontológica realizadas.
     *
     * @return Códigos dos tipos de consulta odontológica realizadas.
     */
    Iterator<Long> getTiposConsultaOdontoIterator();

    /**
     * Quantidade de tipos de consulta odontológica realizadas.
     *
     * @return Quantidade de tipos de consulta odontológica realizadas.
     */
    int getTiposConsultaOdontoSize();

    /**
     * Condutas adotadas e possíveis encaminhamentos.
     *
     * @return Lista com código das condutas adotadas e possíveis encaminhamentos.
     */
    List<Long> getTiposEncamOdonto();

    /**
     * Condutas adotadas e possíveis encaminhamentos.
     *
     * @return Código das condutas adotadas e possíveis encaminhamentos.
     */
    Iterator<Long> getTiposEncamOdontoIterator();

    /**
     * Quantidade de condutas adotadas e possíveis encaminhamentos.
     *
     * @return Código das condutas adotadas e possíveis encaminhamentos.
     */
    int getTiposEncamOdontoSize();

    /**
     * Materiais fornecidos durante o atendimento.
     *
     * @return Códigos dos materiais fornecidos durante o atendimento.
     */
    List<Long> getTiposFornecimOdonto();

    /**
     * Materiais fornecidos durante o atendimento.
     *
     * @return Códigos dos materiais fornecidos durante o atendimento.
     */
    Iterator<Long> getTiposFornecimOdontoIterator();

    /**
     * Quantidade de materiais fornecidos durante o atendimento.
     *
     * @return quantidade de materiais fornecidos durante o atendimento.
     */
    int getTiposFornecimOdontoSize();

    /**
     * Marcadores referentes a situação de vigilância em saúde bucal.
     *
     * @return Código dos marcadores referentes a situação de vigilância em saúde bucal.
     */
    List<Long> getTiposVigilanciaSaudeBucal();

    /**
     * Marcadores referentes a situação de vigilância em saúde bucal.
     *
     * @return Código dos marcadores referentes a situação de vigilância em saúde bucal.
     */
    Iterator<Long> getTiposVigilanciaSaudeBucalIterator();

    /**
     * Quantidade de marcadores referentes a situação de vigilância em saúde bucal.
     *
     * @return Quantidade de marcadores referentes a situação de vigilância em saúde bucal.
     */
    int getTiposVigilanciaSaudeBucalSize();

    /**
     * Código do turno onde aconteceu o atendimento.
     * @return O código do turno onde aconteceu o atendimento.
     */
    long getTurno();

    /**
     * Indica se o cidadão está gestante.
     * @return True caso o cidadão está gestante.
     */
    boolean isGestante();

    /**
     * Indica se o cidadão é portador de necessidades especiais.
     *
     * @return True se o cidadão é portador de necessidades especiais, False caso contraio.
     */
    boolean isNecessidadesEspeciais();

    /**
     * Verifica se a data de nascimento do cidadão foi declarada.
     * @return True caso a data de nascimento do cidadão tenha sido inserida.
     */
    boolean isSetDtNascimento();

    /**
     * Verifica se o estado de gestante foi declarado.
     *
     * @return True caso tenha sido declarado, False caso contrario.
     */
    boolean isSetGestante();

    /**
     * Verifica se o local onde o atendimento foi realizado foi declarado.
     *
     * @return True caso o local onde o atendimento foi realizado tenha sido declarado, False caso contrario.
     */
    boolean isSetLocalAtendimento();

    /**
     * Verifica se o marcador que indica se o cidadão é portador de necessidades especiais foi declarado.
     *
     * @return True caso o marcador indica se o cidadão é portador de necessidades especiais tenha sido declarado, False caso contrario.
     */
    boolean isSetNecessidadesEspeciais();

    /**
     * Verifica se o CNS do cidadão foi declarado.
     * @return True caso o CNS do cidadão tenhe sido inserido.
     */
    boolean isSetNumCartaoSus();

    /**
     * Verifica se o número do prontuário do cidadão foi declarado.
     * @return True caso o número do prontuário do cidadão tenha sido declarado, False caso contrario.
     */
    boolean isSetNumProntuario();

    /**
     * Verifica se a lista de outros procedimentos foi declarada.
     *
     * @return True caso tenha sido declarada, False case contrario.
     */
    boolean isSetOutrosSiaProcedimentos();

    /**
     * Verifica se os procedimentos que são apresentados na ficha foram declarados.
     *
     * @return True caso tenham sido declarados, False caso contraio.
     */
    boolean isSetProcedimentosRealizados();

    /**
     * Verifica se o sexo foi definido.
     * @return True caso o sexo tenha sido definido.
     */
    boolean isSetSexo();

    /**
     * Verifica se o tipo de atendimento realizado foi declarado.
     *
     * @return True caso o tipo de atendimento realizado tiver sido declarado, False caso contrario.
     */
    boolean isSetTipoAtendimento();

    /**
     * Verifica se o tipo de consulta odontológica realizada foi declarado.
     *
     * @return True caso o tipo de consulta odontológica realizada tenha sido declarado, False caso contrario.
     */
    boolean isSetTiposConsultaOdonto();

    /**
     * Verifica se as condutas adotadas e possíveis encaminhamentos foram declarados.
     * @return True caso as condutas adotadas e possíveis encaminhamentos tiverem sido declarados, false caso contrario.
     */
    boolean isSetTiposEncamOdonto();

    /**
     * Verifica se foram declarados materiais fornecidos durante o atendimento.
     *
     * @return True caso tenah sido declarado algum material, False caso contrario.
     */
    boolean isSetTiposFornecimOdonto();

    /**
     * Verifica se os marcadores referentes a situação de vigilância em saúde bucal foram declarados.
     *
     * @return True caso os marcadores tiverem sido declarados, False caso contrario.
     */
    boolean isSetTiposVigilanciaSaudeBucal();

    /**
     * Verifica se foi notificada a inserção do código do turno do atendimento
     * @return True caso tenha sido notificada a inserção do turno.
     */
    boolean isSetTurno();

    /**
     * Define a data de nascimento do cidadão.
     *
     * Presença obrigatória.
     * Regras: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     *
     * @param dtNascimento Data de nascimento do cidadão
     */
    void setDtNascimento(long dtNascimento);

    /**
     * Define se a data de nascimento do cidadão foi inserida.
     * @param value True caso a data de nascimento do cidadão tenha sido inserida
     */
    void setDtNascimentoIsSet(boolean value);

    /**
     * Define o marcador que indica se o cidadão está gestante.
     *
     * Regra: Sexo = 1 (feminino)
     *
     * @param gestante True para informar que o cidadão está gestante.
     */
    void setGestante(boolean gestante);

    /**
     * Declara que o marcador que indica se o cidadão está gestante foi inserido.
     *
     * @param value True caso o marcador que indica se o cidadão está gestante tiver sido inserido.
     */
    void setGestanteIsSet(boolean value);

    /**
     * Define o local onde o atendimento foi realizado.
     *
     * Regras: Apenas valores de 1 a 10.
     *
     * @param localAtendimento Código do local onde o atendimento foi realizado.
     */
    void setLocalAtendimento(long localAtendimento);

    /**
     * Declara que o local onde o atendimento foi realizado foi inserido.
     *
     * @param value True para informar que o local onde o atendimento foi realizado foi inserido, False caso contrario.
     */
    void setLocalAtendimentoIsSet(boolean value);

    /**
     * Define se o cidadão é portador de necessidades especiais.
     *
     * @param necessidadesEspeciais True para indicar que  o cidadão é portador de necessidades especiais, False caso contrario.
     */
    void setNecessidadesEspeciais(boolean necessidadesEspeciais);

    /**
     * Declara que o marcador que indica se o cidadão é portador de necessidades especiais foi inserido.
     *
     * @param value True para declarar que foi inserido, false caso contrario.
     */
    void setNecessidadesEspeciaisIsSet(boolean value);

    /**
     * CNS do cidadão.
     *
     * Regras: CNS válido de acordo com o algoritmo.
     * Tamanho: 15 digitos.
     *
     * @param numCartaoSus CNS do cidadão.
     */
    void setNumCartaoSus(String numCartaoSus);

    /**
     * Declara se o CNS do cidadão foi inserido.
     * @param value True caso o CNS do cidadão tenha sido inserido.
     */
    void setNumCartaoSusIsSet(boolean value);

    /**
     * Define o número do prontuário do cidadão
     *
     * Regra: Apenas letras e números são aceitos.
     *
     * Mínimo: 0
     * Máximo: 30
     *
     * @param numProntuario Número do prontuário do cidadão.
     */
    void setNumProntuario(String numProntuario);

    /**
     * Declara que o número do prontuário do cidadão foi inserido.
     *
     * @param value True para informar que o número do prontuário do cidadão foi inserido.
     */
    void setNumProntuarioIsSet(boolean value);

    /**
     * Define a lista de outros procedimentos.
     *
     * Regra: Não pode conter procedimentos da ListaProcedimentosRealizados.
     * Regra: Não pode haver procedimentos com o mesmo código.
     *
     * Mínimo: 0
     * Máximo: 24
     *
     * @param outrosSiaProcedimentos Lista de códigos dos procedimentos
     */
    void setOutrosSiaProcedimentos(List<IProcedimentoQuantidade> outrosSiaProcedimentos);

    /**
     * Declara que a lista de outros procedimentos foi inserida.
     *
     * @param value True para declarar que foi inserido, False caso contrario.
     */
    void setOutrosSiaProcedimentosIsSet(boolean value);

    /**
     * Define os procedimentos realizados.
     *
     *
     * Regra: Não pode haver procedimentos com o mesmo código.
     * Mínimo: 0
     * Máximo: 27
     *
     * @param procedimentosRealizados Código dos procedimentos que são apresentados na ficha.
     */
    void setProcedimentosRealizados(List<IProcedimentoQuantidade> procedimentosRealizados);

    /**
     * Declara que os procedimentos que são apresentados na ficha foram inseridos.
     *
     * @param value True para declarar que foram inseridos, False caso contrario.
     */
    void setProcedimentosRealizadosIsSet(boolean value);

    /**
     * Define o sexo do cidadão.
     *
     * Presença obrigatória.
     *
     * @param sexo Código do sexo do cidadão.
     */
    void setSexo(long sexo);

    /**
     * Retorna se o sexo do cidadão foi definido.
     * @param value True caso o sexo tenha sido definido.
     */
    void setSexoIsSet(boolean value);

    /**
     * Define o tipo de atendimento realizado.
     *
     * Regras: Apenas valores de 2 a 6.
     *
     * @param tipoAtendimento Código do tipo de atendimento realizado.
     */
    void setTipoAtendimento(long tipoAtendimento);

    /**
     * Declara que o tipo de atendimento realizado foi inserido.
     *
     * @param value True caso o tipo de atendimento realizado tiver sido inserido, False caso contrario.
     */
    void setTipoAtendimentoIsSet(boolean value);

    /**
     * Define um tipo de consulta odontológica realizada.
     *
     * Regra: É Requerido se o TipoDeAtendimento = 2 (consulta agendada).
     * Regra: Não pode ser preenchido se o TipoDeAtendimento = 4 (escuta inicial ou orientação).
     * Regra: Se o TipoDeAtendimento = 6 (atendimento de urgência), a opção de 2 (consulta de retorno) não pode ser marcada.
     * Regra: Se TipoDeAtendimento = 5 (consulta no dia), o campo é opcional.
     * Regra: Aceita apenas um registro.
     *
     * @param tiposConsultaOdonto Código do tipo de consulta odontológica realizada.
     */
    void setTiposConsultaOdonto(List<Long> tiposConsultaOdonto);

    /**
     * Declara que o tipo de consulta odontológica realizada foi inserido.
     *
     * @param value True para declarar que foi inserido, False caso contrario.
     */
    void setTiposConsultaOdontoIsSet(boolean value);

    /**
     * Define as condutas adotadas e possíveis encaminhamentos.
     * @param tiposEncamOdonto Lista com  códigos das condutas adotadas e possíveis encaminhamentos.
     */
    void setTiposEncamOdonto(List<Long> tiposEncamOdonto);

    /**
     * Declara que as as condutas adotadas e possíveis encaminhamentos foram inseridos.
     *
     * @param value True para declarar que foram inseridos, false caso contrario.
     */
    void setTiposEncamOdontoIsSet(boolean value);

    /**
     * Define uma lista de materiais fornecidos durante o atendimento.
     *
     * Máximo: 3
     *
     * @param tiposFornecimOdonto Lista com os códigos dos materiais fornecidos durante o atendimento.
     */
    void setTiposFornecimOdonto(List<Long> tiposFornecimOdonto);

    /**
     * Declara que foram fornecidos materiais durante o atendimento.
     *
     * @param value True para declarar que foram fornecidos materiais, False caso contrario.
     */
    void setTiposFornecimOdontoIsSet(boolean value);

    /**
     * Adiciona uma lista de marcadores referentes a situação de vigilância em saúde bucal.
     *
     * Presença Obrigatória.
     * Mínimo: 1
     * Máximo: 7
     *
     * @param tiposVigilanciaSaudeBucal Códigos dos marcadores referentes a situação de vigilância em saúde bucal.
     */
    void setTiposVigilanciaSaudeBucal(List<Long> tiposVigilanciaSaudeBucal);

    /**
     * Declara que os marcadores referentes a situação de vigilância em saúde bucal foram inseridos.
     *
     * @param value True para declarar os marcadores, False caso contrario.
     */
    void setTiposVigilanciaSaudeBucalIsSet(boolean value);

    /**
     * Define o turno onde aconteceu o atendimento.
     * Presença obrigatória.
     * @param turno Código do turno onde aconteceu o atendimento.
     */
    void setTurno(long turno);

    /**
     * Notifica a inserção do turno do atendimento.
     * @param value True caso deseje informar a inserção do turno.
     */
    void setTurnoIsSet(boolean value);

    /**
     * Remove a data de nascimento do cidadão,
     */
    void unsetDtNascimento();

    /**
     * Remove o marcador que indica se o cidadão está gestante.
     */
    void unsetGestante();

    /**
     * Remove o local onde o atendimento foi realizado
     */
    void unsetLocalAtendimento();

    /**
     * Remove o marcador que indica se o cidadão é portador de necessidades especiais.
     */
    void unsetNecessidadesEspeciais();

    /**
     * Remove o CNS do cidadão.
     */
    void unsetNumCartaoSus();

    /**
     * Remove o número do prontuário do cidadão.
     */
    void unsetNumProntuario();

    /**
     * Remove a lista de outros procedimentos.
     */
    void unsetOutrosSiaProcedimentos();

    /**
     * Remove os procedimentos que são apresentados na ficha.
     */
    void unsetProcedimentosRealizados();

    /**
     * Remove o sexo do cidadão.
     */
    void unsetSexo();

    /**
     * Remove o tipo de atendimento realizado.
     */
    void unsetTipoAtendimento();

    /**
     * Remove o tipo de consulta odontológica realizada.
     */
    void unsetTiposConsultaOdonto();

    /**
     * Remove as condutas adotadas e possíveis encaminhamentos.
     */
    void unsetTiposEncamOdonto();

    /**
     * Remove os materiais fornecidos durante o atendimento.
     */
    void unsetTiposFornecimOdonto();

    /**
     * Remove os marcadores referentes a situação de vigilância em saúde bucal.
     */
    void unsetTiposVigilanciaSaudeBucal();

    /**
     * Remove o código do turno.
     */
    void unsetTurno();

    /**
     * Valida se o marcador de gestante foi inserido.
     *
     * Regras: Sexo = 1 (feminino).
     *
     * @return True Caso não esteja presente ou caso esteja presente e o sexo seja igual a 1, False caso contrario.
     */
    boolean validadeGestante();

    /**
     * Valida LocalDeAtendimento.
     * Para ser válido deve:
     * 1- Préviamente inserido
     * 2- Valor entre 1 e 10 (inclusivo)
     * @return
     */
    boolean validateLocalDeAtendimento();

    /**
     * Valida o numero do cartão sus
     * @return True se não estiver presente ou se estiver presente e for válido, False caso contrario.
     */
    boolean validateNumCartaoSus();

    /**
     * Valida NumeroProntuario
     * Para ser válida, caso tenha sido inserida, deve ser ter entre 0 e 30
     * (inclusivo) caracteres alfanuméricos
     * @return True caso não esteja presente ou caso esteja presente e seja valido, False caso contrario
     */
    boolean validateNumeroProntuario();

    /**
     * Valida outrosSiaProcedimentos.
     * Para ser válido, caso inserido, deve:
     * 1- Não pode ter procedimentos iguais
     * 2- Não pode ter procedimentos iguais aos da lista de procedimentos realizados
     * 3- Não pode ter mais do que 24 procedimentos
     * @return true se válido
     *          false se inválido
     */
    boolean validateOutrosSiaProcedimentos();

    /**
     * Valida procedimentosRealizados.
     * Para ser válido, caso inserido, deve:
     * 1- Não pode ter procedimentos iguais
     * 2- Não pode ter mais do que 27 procedimentos
     * @return true se válido
     *          false se inválido
     */
    boolean validateProcedimentosRealizados();

    /**
     * Valida Sexo
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter valor 0 ou 1
     * @return
     */
    boolean validateSexo();

    /**
     * Valida Tipo de atendimento.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter valor entre 2 e 6 (inclusivo)
     * @return
     */
    boolean validateTipoAtendimento();

    /**
     * Valida materiais fornecidos durante o atendimento.
     * Para ser válido deve:
     * 1- É Requerido se o TipoDeAtendimento = 2 (consulta agendada)
     * 2- Não pode ser preenchido se o TipoDeAtendimento = 4 (escuta inicial ou orientação)
     * 3- Se o TipoDeAtendimento = 6 (atendimento de urgência), a opção de 2 (consulta de retorno) não pode ser marcada.
     * 4- Se TipoDeAtendimento = 5 (consulta no dia), o campo é opcional.
     * 5- Aceita apenas um registro.
     * @return True se estiver de acordo com as regras, False caso contrario.
     */
    boolean validateTiposConsultaOdonto();

    /**
     * Valida condutas adotadas e possíveis encaminhamentos.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter valor entre 1 e 16 (inclusivo)
     * 3- Ter entre 1 e 16 elementos
     * @return True se estiver de acordo com as regras, False caso contrario.
     */
    boolean validateTiposEncamOdonto();

    /**
     * Valida materiais fornecidos durante o atendimento.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter valor entre 1 e 3 (inclusivo)
     * 3- Ter entre 0 e 3 elementos
     * @return True se estiver de acordo com as regras, False caso contrario.
     */
    boolean validateTiposFornecimOdonto();

    /**
     * Valida materiais fornecidos durante o atendimento.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter valor entre 1 e 6 (inclusivo) ou ter valor igual a 99
     * 3- Ter entre 1 e 7 elementos
     * @return True se estiver de acordo com as regras, False caso contrario.
     */
    boolean validateTiposVigilanciaSaudeBucal();

    /**
     * Valida Turno
     * @return true se válido
     *          false se inválido
     */
    boolean validateTurno();

    /**
     * Valida a data de nascimento
     *
     * Presença obrigatória.
     *
     * @return True se estiver presente, False caso contrario.
     */
    boolean validatedtNascimento();

    /**
     * Valida a classe contra erros.
     *
     * @return True se a classe for valida, False caso contrario.
     */
    boolean validates();
    
}
