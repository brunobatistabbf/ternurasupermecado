package supermercado;

public class ArmazenamentoProdutos {
    //Atributos
    private String nome;
    private int quantidade;
    private int codigo;
    private double preco;
    private int id;


    //construtor

    public ArmazenamentoProdutos(String nome, int quantidade, int codigo, double preco, int id) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.preco = preco;
        this.id = id;
    }

    //metodos personalizados
    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public double getPreco() {
        return this.preco;
    }
    public int getId() { return this.id; }



}
