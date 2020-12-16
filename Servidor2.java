package Calculadora.RMI;
import java.rmi.Remote;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class Servidor {
    public static void main(String[] args){
        try{
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(9999);
            r.rebind("Calculadora", new rmi());
            JOptionPane.showMessageDialog(null, "Servidor Conectado");
        } catch ( Exception e){
            JOptionPane.showMessageDialog(null, "Servidor desconectado");
        }
    }
}