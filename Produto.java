public class Produto {
    private String id;
    private String nome;
    private String fabricante;

    public Produto(String id, String nome, String fabricante) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
    }
    public String toString() {
        return "Produto: id " + id + "nome: " + nome + "fabricante" + fabricante;
    }
}
