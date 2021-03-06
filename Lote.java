import java.util.Date;

public class Lote {
    private String id;
    private Produto produto;
    private Date dataF;
    private Date dataV;
    private int qtd;

    public Lote(String id, Produto produto, Date dataF, Date dataV, int qtd) {
        this.id = id;
        this.produto = produto;
        this.dataF = dataF;
        this.dataV = dataV;
        this.qtd = qtd;
    }

    public String toString() {
        return "Lote - id:" + id + "produto: " + produto + "data de fabricação: " + dataF +
                "data de validade: " + dataV + "quantidade: " + qtd;
    }
}
