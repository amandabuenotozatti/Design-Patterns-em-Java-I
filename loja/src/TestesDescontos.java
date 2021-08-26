import Descontos.CalculadoraDescontos;
import Impostos.ICMS;
import Orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args){
        Orcamento primeiro = new Orcamento(new BigDecimal("200"),6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"),1);

        CalculadoraDescontos calculadora = new CalculadoraDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
