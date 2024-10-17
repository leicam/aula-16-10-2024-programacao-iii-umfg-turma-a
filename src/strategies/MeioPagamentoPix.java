package strategies;

public class MeioPagamentoPix
        implements MeioPagamentoStrategy{

    @Override
    public void pagar(Double valor) throws Exception {
        System.out.println("Pagamento PIX no valor de " +
                valor + " realizado com sucesso!");
    }
}
