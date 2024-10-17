import entidades.Produto;
import servicos.Carrinho;
import strategies.MeioPagamentoCartaoCredito;
import strategies.MeioPagamentoPix;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            Carrinho carrinho = new Carrinho();

            Produto cocaCola = new Produto("1234",
                    "COCA COLA 350ml", 2.59);
            Produto pepsi = new Produto("4321",
                    "PEPSI 350ml", 2.49);

            carrinho.addProduto(cocaCola);
            carrinho.addProduto(cocaCola);
            carrinho.addProduto(cocaCola);
            carrinho.addProduto(pepsi);
            carrinho.addProduto(pepsi);
            carrinho.addProduto(pepsi);
            carrinho.addProduto(pepsi);

            carrinho.pagar(new MeioPagamentoPix());
            carrinho.pagar(new MeioPagamentoCartaoCredito("teste",
                    "00000000045",
                    "123456789",
                    "123",
                    "12/29"));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}