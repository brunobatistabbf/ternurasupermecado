package supermercado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//%%Lista de Funcionalidades:%%
//-Armazenamento de produtos
//Sistema de controle de vendas 
//Balancete de vendas.
//-Cadastro de Vendedores
//-Cadastro de Clientes

public class Supermercado {
    
    public static void main(String[] args) {
        int opcao;
        int id = 0;
        Scanner sc = new Scanner(System.in);
        List<ArmazenamentoProdutos> produtos = new ArrayList<ArmazenamentoProdutos>();
        while (true) {
            while(true){
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

            switch (opcao) {
                case 1:
                    produto(id, produtos);
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
    public static void produto(int id, List<ArmazenamentoProdutos> produtos) {
        while (true) {
            System.out.println("--------------------------------------------");
            System.out.println("1- Armazene um produto");
            System.out.println("2- Remover produto");
            System.out.println("3- Mostrar produtos cadastrados");
            System.out.println("4- Sair");

            Scanner sc1 = new Scanner(System.in);
            int opcaop;
            opcaop = sc1.nextInt();

            if (opcaop == 1) {

                    System.out.println("Insira as seguintes informações");
                    System.out.println("Quantidade: ");
                    int quant = sc1.nextInt();

                    System.out.println("Codigo do produto:");
                    int cod = sc1.nextInt();

                    System.out.println("Preco: ");
                    float preco = sc1.nextFloat();

                    System.out.println("Nome do produto: ");
                    String nome = sc1.next();

                    produtos.add(new ArmazenamentoProdutos(nome, quant, cod, preco));
                    produtos.get(id).setQuantidade(quant);
                    produtos.get(id).setQuantidade(cod);
                    produtos.get(id).setPreco(preco);
                    produtos.get(id).setNome(nome);

                    System.out.println("Produto Criado com sucesso!!!");
                    id++;

            } else if (opcaop == 2) {
                System.out.println("Qual o id do produto que deseja remover?");
                int idp = sc1.nextInt();
                produtos.remove(idp);
            }else if (opcaop == 3){
                for (ArmazenamentoProdutos p : produtos){
                    System.out.println("Nome:"+p.getNome());
                    System.out.println("Codigo: "+p.getCodigo());
                    System.out.println("Preço: "+ p.getPreco());
                    System.out.println("Quantidade armazenada: "+p.getQuantidade());
                    System.out.println("----------------------------::");
                }
            } else if (opcaop == 4)
                break;
        }
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