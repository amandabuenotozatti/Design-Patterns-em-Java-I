package Descontos;

import Orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDescontos {

    public BigDecimal calcular (Orcamento orcamento){
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(new DescontoParaOrcamentoAcimaDeQuinhentos(new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
