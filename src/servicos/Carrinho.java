package servicos;

import entidades.Produto;
import strategies.MeioPagamentoStrategy;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> lista
            = new ArrayList<>();

    public void addProduto(Produto produto){
        this.lista.add(produto);
    }

    public void pagar(MeioPagamentoStrategy pagamento)
            throws Exception {
        pagamento.pagar(getTotalProdutos());
    }

    private Double getTotalProdutos(){
        final Double[] total = {0.0};

        this.lista
                .stream()
                .forEach(x -> total[0] += x.getValor());

        return total[0];
    }
}