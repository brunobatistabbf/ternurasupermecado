package supermercado;

public class ArmazenamentoProdutos {
//Atributos
public String marca;
protected int quantidade;
private int codigo;
public float preco;
public boolean valido;

//metodos personalizados do produto
 public void mostrarproduto(){
     System.out.println("-------------- Produto Cadastrado---------------::::");
     System.out.println("Quantidade :       " +getQuantidade());
     System.out.println("Preço da unidade : " +getPreco());
     System.out.println("Marca :            " +getMarca());
     System.out.println("Dentro da validade:" +getValido());
     System.out.println("-------------------------------------------------::::");
 }
 
 public void armazenarproduto(int q, int c, float p, String m){
     this.setValido(true);
     this.setQuantidade(q);
     this.setCodigo(c);
     this.setPreco(p);
     this.setMarca(m);
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

    public ArmazenamentoProdutos() {
        this.valido = false;
        
    }
//metodos personalizados
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean getValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }
 
 
}


