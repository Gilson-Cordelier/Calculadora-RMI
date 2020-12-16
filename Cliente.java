package Calculadora.RMI;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cliente {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {

            while (true){
                String menu = JOptionPane.showInputDialog(" Exercício Calculadora \n\n" +
                        "Para somar escolha a opção - 1 -\n" +
                        "Para Subtrair escolha a opção - 2 -\n" +
                        "Para Multiplicar escolha a opção - 3 -\n" +
                        "Para Dividir escolha a opção - 4 -\n" +
                        "Para Porcentagem escolha a opção - 5 -\n" +
                        "Para Raiz escolha a opção - 6 -\n" +
                        "Para Potencia escolha a opção - 7 -\n" +
                        "Para SAIR - 8 -\n");

                int escolha = Integer.parseInt(menu);

                if (escolha <= 4) {
                    Registry meuRegistro = LocateRegistry.getRegistry("localhost", 1099);
                    Calculadora c = (Calculadora) Naming.list("//172.16.0.1/Calculadora");
                }else{
                    Registry meuRegistro = LocateRegistry.getRegistry("localhost", 9999);
                    Calculadora c = (Calculadora) Naming.list("//172.16.0.1/Calculadora");
                }

                switch (escolha){
                    case "1":
                    {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero: "));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero: "));
                        JOptionPane.showInputDialog(null, "A soma é: " + c.add(x,y));
                    }
                    case "2":
                    {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero: "));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero: "));
                        JOptionPane.showInputDialog(null, "O resto é: " + c.sub(x,y));
                    }
                    case "3":
                    {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero: "));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero: "));
                        JOptionPane.showInputDialog(null, "O resultado é: " + c.mul(x,y));
                    }
                    case "4":
                    {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero: "));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero: "));
                        JOptionPane.showInputDialog(null, "O resultado é: " + c.div(x,y));
                    }
                    case "5":
                    {
                        double x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero: "));
                        double y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero: "));
                        JOptionPane.showInputDialog(null, "O resultado é: " + c.por(x,y));
                    }
                    case "6":
                    {
                        double x = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero: "));
                        JOptionPane.showInputDialog(null, "O resultado é: " + c.raiz(x));
                    }
                    case "7":
                    {
                        double x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero: "));
                        double y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero: "));
                        JOptionPane.showInputDialog(null, "O resultado é: " + c.poten(x,y));
                    }
                    case "8":
                    {
                        JOptionPane.showInputDialog("Servidor desconectado" +  e);
                    }
                }
            }
        }
    }
}
