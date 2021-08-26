package Descontos;

import Orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return calcular(orcamento);
        }
        return proximo.efetuarCalculo(orcamento);
    }

    protected abstract BigDecimal calcular(Orcamento orcamento);
    public abstract boolean deveAplicar(Orcamento orcamento);

}
