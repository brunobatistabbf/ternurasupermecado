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
        int idProduto = 0;
        int idVendedor = 0;
        int idCliente = 0;
        Scanner sc = new Scanner(System.in);
        List<ArmazenamentoProdutos> produtos = new ArrayList<ArmazenamentoProdutos>();
        List<Vendedor> vendedor = new ArrayList<Vendedor>();
        List<Cliente> cliente = new ArrayList<Cliente>();
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
                        produto(idProduto, produtos);
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        vendedor(idVendedor, vendedor);
                    case 5:
                        cliente(idCliente, cliente);
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
            System.out.println("3- Mostrar todos produtos cadastrados");

            System.out.println("4- Sair");

            Scanner sc1 = new Scanner(System.in);
            int opcaop = sc1.nextInt();

            if (opcaop == 1) {

                System.out.println("Insira as seguintes informações");
                System.out.println("Nome do produto: ");
                String nome = sc1.next();

                System.out.println("Quantidade: ");
                int quant = sc1.nextInt();

                System.out.println("Preco: ");
                float preco = sc1.nextFloat();

                System.out.println("Codigo do produto:");
                int cod = sc1.nextInt();

                produtos.add(new ArmazenamentoProdutos(nome, quant, cod, preco, id));

                System.out.println("Produto Criado com sucesso!!!");
                id++;

            } else if (opcaop == 2) {
                System.out.println("Qual o id do produto que deseja remover?");
                int idp = sc1.nextInt();
                produtos.remove(idp);
                System.out.println("O funcionário foi demitido com sucesso.");

            } else if (opcaop == 3) {
                for (ArmazenamentoProdutos p : produtos) {
                    System.out.println("Nome:" + p.getNome());
                    System.out.println("Codigo: " + p.getCodigo());
                    System.out.println("Preço: " + p.getPreco());
                    System.out.println("Quantidade armazenada: " + p.getQuantidade());
                    System.out.println("Numero de identificação: " + p.getId());
                    System.out.println("----------------------------::");
                }
            } else if (opcaop == 4) break;
        }
    }
    public static void vendedor(int id, List<Vendedor> vendedor) {
        while (true) {
            System.out.println("--------------------------------------------");
            System.out.println("1- Cadastrar funcionário.");
            System.out.println("2- Demitir funcionário.");
            System.out.println("3- Mostrar funcionários.");
            System.out.println("4- Sair");

            System.out.println("--------------------------------------------");

            Scanner sc2 = new Scanner(System.in);
            int opcaop = sc2.nextInt();
            if (opcaop == 1) {
                System.out.println("Insira as seguintes informações");
                System.out.println("Nome: ");
                String nome = sc2.next();

                System.out.println("Idade:");
                int idade = sc2.nextInt();

                System.out.println("CPF: ");
                int cpf = sc2.nextInt();

                System.out.println("Salário: ");
                float salario = sc2.nextFloat();

                vendedor.add(new Vendedor(nome, idade, cpf, salario, id));

                System.out.println("Vendedor adicionado com Sucesso!!!");
                id++;
            } else if (opcaop == 2) {
                System.out.println("Qual o ID do vendedor?");
                int idp = sc2.nextInt();
                vendedor.remove(idp);

            } else if (opcaop == 3) {
                for (Vendedor v : vendedor) {
                    System.out.println("Nome:" + v.getNome());
                    System.out.println("Idade: " + v.getIdade());
                    System.out.println("CPF: " + v.getCPF());
                    System.out.println("Salário: " + v.getSalario());
                    System.out.println("----------------------------::");
                }
            }
            else if (opcaop == 4) break;
        }
    }


    public static void cliente(int id, List<Cliente> cliente) {
        while (true) {
            System.out.println("--------------------------------------------");
            System.out.println("1- Cadastrar cliente");
            System.out.println("2- Remover Cliente");
            System.out.println("3- Mostrar todos os clientes");
            System.out.println("--------------------------------------------");

            Scanner sc3 = new Scanner(System.in);
            int opcaop = sc3.nextInt();
            if (opcaop == 1) {
                System.out.println("Insira as seguintes informações");

                System.out.println("Nome: ");
                String nome = sc3.next();

                System.out.println("Idade:");
                int idade = sc3.nextInt();

                System.out.println("CPF: ");
                int cpf = sc3.nextInt();

                System.out.println("Genero: ");
                String genero = sc3.nextLine();
                cliente.add(new Cliente(nome, idade, cpf, genero, id));
                System.out.println("Cliente adicionado com Sucesso!!!");
                id++;
            } else if (opcaop == 2) {
                System.out.println("Qual o ID do cliente?");
                int idp = sc3.nextInt();

                cliente.remove(idp);
                System.out.println("Cliente removido do sistema.");
            } else if (opcaop == 3) {
                for (Cliente v : cliente) {
                    System.out.println("Nome:" + v.getNome());
                    System.out.println("Idade: " + v.getIdade());
                    System.out.println("CPF: " + v.getCPF());
                    System.out.println("Gênero: " + v.getGenero());
                    System.out.println("ID: " + v.getID());
                    System.out.println("----------------------------::");
                }
            }
            else if (opcaop == 4) break;
        }
    }
}