package Descontos;

import Orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoAcimaDeQuinhentos extends Desconto {

    public DescontoParaOrcamentoAcimaDeQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal(0.5));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
