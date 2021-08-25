import Impostos.CalculadoraImpostos;
import Impostos.ICMS;
import Impostos.ISS;
import Impostos.Imposto;
import Orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}
