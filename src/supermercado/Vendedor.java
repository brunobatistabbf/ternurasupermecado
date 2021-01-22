package supermercado;

public class Vendedor {
    //Atributos dos vendedores
    private String nome;
    private int idade;
    private int CPF;
    private int id;
    private float salario;
//Construtor
    public Vendedor(String nome, int idade, int cpf, float salario, int id) {
        this.nome = nome;
        this.idade =idade;
        this.CPF = cpf;
        this.salario =salario;
        this.id = id;
    }
    //Metodos personalizados Vendedor
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public int getCPF() { return CPF; }
    public float getSalario() { return salario; }



}