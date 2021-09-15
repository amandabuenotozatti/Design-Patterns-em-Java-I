package Pedido;

import Orcamento.Orcamento;

import java.time.LocalDateTime;

public class GerarPedidoHandler {

    //construtor com injeção de dependências: repository, service ...

    public void executa(GerarPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }

}
