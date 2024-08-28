package projetoAula3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProjetoConta {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Conta conta = new Conta();
        Cliente cliente = new Cliente();
        
        cliente.setNome(JOptionPane.showInputDialog ("Entre com o nome:"));
        cliente.setCpf(JOptionPane.showInputDialog("Entre com o CPF: "));
        cliente.setEndereco(JOptionPane.showInputDialog("Entre com o endereço: "));
        
        conta.setCliente(cliente);
        
        //código abaixo comentado: funcionando no terminal
    /*  System.out.println("Entre com o nome: ");
        conta.setCliente(scanner.nextLine());
        
        System.out.println("Entre com um valor de depósito");
        conta.depositar(scanner.nextDouble());
        
        System.out.println("Entre com um valor de saque: ");
        if (!conta.sacar(scanner.nextDouble())) {
            System.out.println("Saldo insuficiente");
        }
        
        System.out.println(conta.imprimeSaldo(true));
    }
   */
    String [] opcoes = new String [] {"Depositar", "Sacar", "Imprimir Saldo", "Sair"};
    String opcao;
    do {
        opcao = (String)JOptionPane.showInputDialog(null, "Escolha uma opção: ", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcoes, "Depositar");
        
        switch (opcao) {
            case "Depositar": 
                conta.depositar(Double.parseDouble(JOptionPane.showInputDialog(("Entre com um valor de depósito: "))));
                break;
            
            case "Sacar": 
               if (!conta.sacar(Double.parseDouble(JOptionPane.showInputDialog ("Entre com o valor do saque: ")))){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }    
        
            break;
    
            case "Imprimir Saldo":
            JOptionPane.showMessageDialog(null, conta.imprimeSaldo(true)); 
            break;
            
            case "Sair":
               JOptionPane.showMessageDialog(null, "Bye!"); 
               break;
        }
    } while (!opcao.equals("Sair"));
        
    }
}