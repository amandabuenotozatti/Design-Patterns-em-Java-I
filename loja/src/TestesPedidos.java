import Pedido.GerarPedido;
import Pedido.GerarPedidoHandler;

import java.math.BigDecimal;

public class TestesPedidos {

    public static void main(String[] args){
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler(/*dependencias*/);
        handler.executa(gerador);
    }
}
