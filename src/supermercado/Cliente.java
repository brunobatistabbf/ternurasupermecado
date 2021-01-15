package supermercado;


public class Cliente {
 //Atributos do Cliente 
 public String nome;
 public int idade;
 private int CPF;
 private String genero;
 public boolean ativo;
 
 //Metodos personalizados do cliente
  public void mostrarconta(){
      System.out.println("  --------------------CONTA DO CLIENTE-----------:::::::::");
        
        System.out.println("NOME : " + this.getNome());
        System.out.println("IDADE: " + this.getIdade());
        System.out.println("COMPROU RECENTEMENTE: " +this.getAtivo() );
        System.out.println("--------------------------------------------------------" );
    
 }
  public void cadastrarcliente(String n, int i, int c, String g){
      this.setNome(n);
      this.setIdade(i);
      this.setCPF(c);
      this.setGenero(g);
      this.setAtivo(true);
   
 }
 
  public void removercliente(){
   this.setAtivo(false);
   this.mostrarconta();
 }
 //Construtor

    public Cliente() {
        this.setAtivo(false);
    }
//Metodos especiais do cliente
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
  
}
