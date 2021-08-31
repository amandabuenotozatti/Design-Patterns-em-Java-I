package Orcamento.Situacao;

import Orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }

}
