package strategies;

public class MeioPagamentoCartaoCredito
        implements MeioPagamentoStrategy{
    private String nome = "";
    private String cpf = "";
    private String numeroCartao = "";
    private String cvv = "";
    private String validade = "";

    public MeioPagamentoCartaoCredito(String nome,
                                      String cpf,
                                      String numeroCartao,
                                      String cvv,
                                      String validade) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroCartao = numeroCartao;
        this.cvv = cvv;
        this.validade = validade;
    }

    @Override
    public void pagar(Double valor) throws Exception {
        if (this.cpf.length() != 11){
            throw new Exception("CPF invalido!");
        }

        System.out.println("Pagamento com Cartao de Crédito" +
                        " no valor de " + valor +
                        " realizado com sucesso!");
    }
}
