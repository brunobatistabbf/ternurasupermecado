package supermercado;
import java.util.Scanner;
//%%Lista de Funcionalidades:%%
//-Armazenamento de produtos
//Sistema de controle de vendas 
//Balancete de vendas.
//-Cadastro de Vendedores
//-Cadastro de Clientes

public class Supermercado {
    
    public static void main(String[] args) {
        int  opcao;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
           
                System.out.println("--------------------------------------------------");
                System.out.println("----------------SUPERMERCADO TERNURA------------- ");
                System.out.println("Escolha um opção para começar:                    ");
                System.out.println(" 1-Armazenamento de produtos");
                System.out.println(" 2-Sistema de Controle de vendas");
                System.out.println(" 3-Balancete de vendas.");
                System.out.println(" 4-Cadastro de Vendedores");
                System.out.println(" 5-Cadastro de Clientes");
                System.out.println(" 6- SAIR ");
                opcao = sc.nextInt();
            while(true){
            switch (opcao) {
                case 1:
                    produto();
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    vendedor();
                case 5:
                    cliente();
                case 6:
                    break;
                default:
                    System.out.println("Insira uma opcao valida!!!");
                    break;
                }
            }
        }
        
        
    }
    public static void produto() {
       
        System.out.println("--------------------------------------------");
        System.out.println("1- Armazene um produto");
        System.out.println("2- Remover produto");
        
        Scanner sc1 = new Scanner(System.in);
        int opcaop;
        opcaop = sc1.nextInt();
        ArmazenamentoProdutos p1 = new ArmazenamentoProdutos();
        if (opcaop ==1){
            System.out.println("Insira as seguintes informações");
            System.out.println("Quantidade: ");
            int q = sc1.nextInt();
            System.out.println("Codigo do produto:");
            int c = sc1.nextInt();
            System.out.println("Preco: ");
            float p = sc1.nextFloat();
            System.out.println("Marca: ");
            String m = sc1.nextLine();
            p1.armazenarproduto(q, c, p, m);
            p1.mostrarproduto();
            System.out.println("Produto Criado com sucesso!!!");
        }
        else if (opcaop == 2){
            p1.removerproduto();
        }
        p1.mostrarproduto();
    }
    public static void vendedor() {
               
        System.out.println("--------------------------------------------");
        System.out.println("1- Cadastrar vendedor");
        System.out.println("2- Demitir vendedor");
        
        Scanner sc = new Scanner(System.in);
        int opcaop;
        opcaop = sc.nextInt();
        Vendedor v1 = new Vendedor();
        if (opcaop ==1){
            System.out.println("Insira as seguintes informações");
            System.out.println("Nome: ");
            String n = sc.nextLine();
            System.out.println("Idade:");
            int i = sc.nextInt();
            System.out.println("CPF: ");
            int c = sc.nextInt();
            System.out.println("Salario: ");
            float s = sc.nextFloat();
            v1.cadastrarvendedor( n,  i, c,  s);
            v1.mostrarvendedor();
            System.out.println("Vendedor adicionado com Sucesso!!!");
        }
        else if (opcaop == 2){
            v1.demitirvendedor();
        }
        v1.mostrarvendedor();
    }
    public static void cliente() {
               
        System.out.println("--------------------------------------------");
        System.out.println("1- Cadastrar cliente");
        System.out.println("2- Remover Cliente");
        System.out.println("3- Status do Cliente");
        Scanner sc = new Scanner(System.in);
        int opcaop;
        opcaop = sc.nextInt();
        Cliente c1 = new Cliente();
        if (opcaop ==1){
            System.out.println("Insira as seguintes informações");
            System.out.println("Nome: ");
            String n = sc.nextLine();
            System.out.println("Idade:");
            int i = sc.nextInt();
            System.out.println("CPF: ");
            int c = sc.nextInt();
            System.out.println("Genero: ");
            String s = sc.nextLine();
            c1.cadastrarcliente( n,  i, c,  s);
            c1.mostrarconta();
            System.out.println("Vendedor adicionado com Sucesso!!!");
        }
        else if (opcaop == 2){
            c1.removercliente();
            System.out.println("Cliente removido do sistema.");
        }
        c1.mostrarconta();
    }
}