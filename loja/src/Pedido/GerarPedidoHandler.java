package Pedido;

import Orcamento.Orcamento;
import Pedido.Acao.AcaoAposGerarPedido;
import Pedido.Acao.EnviarEmailPedido;
import Pedido.Acao.SalvarPedidoNoBancoDados;

import java.time.LocalDateTime;
import java.util.List;

public class GerarPedidoHandler {

    List<AcaoAposGerarPedido> acoes;

    public GerarPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GerarPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }

}
