package entidades;

public class Produto {
    private String codigoBarras = "";
    private String descricao = "";
    private Double valor = 0.0;

    public Produto(String codigoBarras, String descricao, Double valor) {
        this.codigoBarras = codigoBarras;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}