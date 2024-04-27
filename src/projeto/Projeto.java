package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Projeto {
    static ArrayList <Cliente> ListaCli = new ArrayList();
    static ArrayList <Funcionario> ListaFunc = new ArrayList();
    static ArrayList <Produto> ListaProd = new ArrayList();
    
    public static void cadastrarProduto()
    {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o nome");
        String nome = teclado.nextLine();
        System.out.println("Digite o preço");
        int preco = teclado.nextInt();
        
        if (preco < 0)
        {
            throw new IllegalArgumentException ("Digite um preço maior que 0:"+preco);
        }
        
        System.out.println("Digite a descrição");
        String descricao = teclado.nextLine();
        System.out.println("Digite a cor:");
        String cor = teclado.nextLine();
        System.out.println("Digite o código de produto");
        int codproduto = teclado.nextInt();
        teclado.nextLine(); //Limpa o buffer do teclado
        
        
        
        Produto prod = new Produto();
        prod.setNome(nome);
        prod.setPreco(preco);
        prod.setDescricao(descricao);
        prod.setCodProduto(codproduto);
        prod.setCor(cor);
        
        ListaProd.add(prod);
        
    }
    
    public static void cadastrarFuncionario()
    {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o nome");
        String nome = teclado.nextLine();
        System.out.println("Digite a idade");
        int idade = teclado.nextInt();
        
        if (idade < 0)
        {
            throw new IllegalArgumentException ("Digite uma idade maior que 0:"+idade);
        }
        
        System.out.println("Digite o CPF");
        int CPF = teclado.nextInt();
        System.out.println("Digite o salário");
        int salario = teclado.nextInt();
        if (salario < 0)
        {
            throw new IllegalArgumentException ("Digite um salario maior que 0:"+salario);
        }
        System.out.println("Digite o setor");
        String setor = teclado.nextLine();
        teclado.nextLine(); //Limpa o buffer do teclado
        
        
        
        Funcionario func = new Funcionario();
        func.setNome(nome);
        func.setIdade(idade);
        func.setCPF(CPF);
        func.setSetor(setor);
        func.setSalario(salario);
        
        ListaFunc.add(func);
        
    }
    
    public static void cadastrarCliente()
    {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o nome");
        String nome = teclado.nextLine();
        System.out.println("Digite a idade");
        int idade = teclado.nextInt();
        
        if (idade < 0)
        {
            throw new IllegalArgumentException ("Digite uma idade maior que 0:"+idade);
        }
        
        System.out.println("Digite a CPF");
        int CPF = teclado.nextInt();
        System.out.println("Digite o numero de cadastro");
        int numCadastro = teclado.nextInt();
        System.out.println("Digite o numero de telefone");
        int numCelular = teclado.nextInt();
        
        teclado.nextLine(); //Limpa o buffer do teclad
        
        Cliente cli = new Cliente();
        cli.setNome(nome);
        cli.setIdade(idade);
        cli.setCPF(CPF);
        cli.setNumCadastro(numCadastro);
        cli.setNumCelular(numCelular);
        
        ListaCli.add(cli);
        
    }
    
    public static void buscarCliente()
    {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o nome a ser buscado");
        String nome = teclado.nextLine();
        for (Cliente c: ListaCli)
        {
            if (c.getNome().startsWith(nome))
                c.exibir();
        }
    } 
    
    public static void buscarProduto()
    {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite a descrição do produto:");
        String descricao = teclado.nextLine();
        for (Produto c: ListaProd)
        {
            if (c.getDescricao().startsWith(descricao))
                c.exibir();
        }
    } 
    
    public static void excluirCliente()
    {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o nome a ser excluido");
        String nome = teclado.nextLine();
        for (Cliente c: ListaCli)
        {
            if (c.getNome().startsWith(nome))
                ListaCli.remove(nome);
        }
    } 
    
    public static void main(String[] args) {
        
        cadastrarCliente();
    }
    
}
