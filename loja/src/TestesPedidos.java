import Pedido.Acao.EnviarEmailPedido;
import Pedido.Acao.SalvarPedidoNoBancoDados;
import Pedido.GerarPedido;
import Pedido.GerarPedidoHandler;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args){
        String cliente = "Amanda";
        BigDecimal valorOrcamento = new BigDecimal(300);
        int quantidadeItens = Integer.parseInt("2");

        GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler(
            Arrays.asList(new SalvarPedidoNoBancoDados(),
                new EnviarEmailPedido()));
        handler.executa(gerador);
    }
}
