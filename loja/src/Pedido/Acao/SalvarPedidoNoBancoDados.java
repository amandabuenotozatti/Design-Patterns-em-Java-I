package Pedido.Acao;

import Pedido.Pedido;

public class SalvarPedidoNoBancoDados implements  AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados");
    }

}
