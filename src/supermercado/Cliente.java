package supermercado;


public class Cliente {
    //Atributos do Cliente
    private String genero;
    private String nome;
    private int CPF;
    private int idade;
    private int id;
    //Metodos personalizados do cliente

    //Construtor
    public Cliente(String nome, int idade, int cpf, String genero, int id){
        this.nome = nome;
        this.idade = idade;
        this.CPF = cpf;
        this.genero = genero;
        this.id = id;
    }

    //Metodos especiais do cliente
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getCPF() {
        return this.CPF;
    }

    public String getGenero() { return this.genero; }

    public int getID() { return this.id;}


}