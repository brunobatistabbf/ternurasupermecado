package supermercado;

public class ArmazenamentoProdutos {
//Atributos
private String nome;
private int quantidade;
private int codigo;
private double preco;
public boolean valido;

//metodos personalizados do produto
 public void mostrarproduto(){
     System.out.println("-------------- Produto Cadastrado----------------::::");
     System.out.println("Quantidade :       " +getQuantidade());
     System.out.println("Preço da unidade : " +getPreco());
     System.out.println("Nome :            " +getNome());
     System.out.println("Codigo do produto:" +getCodigo());
     System.out.println("-------------------------------------------------::::");
 }
 
 public void armazenarproduto(int q, int c, float p, String m){
     this.setValido(true);
     this.setQuantidade(q);
     this.setCodigo(c);
     this.setPreco(p);
     this.setNome(m);
     this.mostrarproduto();
     
    }
 public void removerproduto(){
     if (getValido()== true ) {
         System.out.println("----Impossivel remover produto em estoque e valido!---");
         this.mostrarproduto();
     } else {
        this.setValido(false);
        this.setQuantidade(0);
     }

 }
    
 //construtor

    public ArmazenamentoProdutos(String nome, int quantidade, int codigo, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.preco = preco;
    }

//metodos personalizados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean getValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }
 
 
}


