package supermercado;

public class Vendedor {
//Atributos dos vendedores
 public String nome;
 public int idade;
 private int CPF;
 public float salario;
 public boolean ativo;
 
 //Metodos personalizados dos Vendedores
 public void cadastrarvendedor(String n, int i, int c, float s){
     this.setNome(n);
     this.setIdade(i);
     this.setCPF(c);
     this.setSalario(s);
     this.setAtivo(true);
 }
  public void demitirvendedor(){
      if(getAtivo() ){
        setSalario(0f);
        setAtivo(false);
      }
 }
 public void mostrarvendedor(){
     System.out.println("STATUS DO VENDEDOR");
     System.out.println("Nome:       " +getNome());
     System.out.println("Idade:      " +getIdade());
     System.out.println("Salario:    " +getSalario());
     System.out.println("Trabalhando:" +getAtivo());
 }
//Construtor

   public Vendedor() {
       this.setAtivo(false);
       this.setSalario(1200f);
    }
 //Metodos personalizados Vendedor

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
