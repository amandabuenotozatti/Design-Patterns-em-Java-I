package Orcamento.Situacao;

import DomainException.DomainException;
import Orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new DomainException("O orcamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento)
    {
        throw new DomainException("O orcamento não pode ser aprovado");
    }

    public void finalizar(Orcamento orcamento)
    {
        throw new DomainException("O orcamento não pode ser finalizado");
    }

}
