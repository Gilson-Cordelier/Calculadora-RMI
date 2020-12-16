package Calculadora.RMI;
import java.rmi.Remote;
import  java.rmi.RemoteException;

public interface Calculadora extends Remote{

    public int div(int a, int b) throws RemoteException;
    public int mul(int a, int b) throws RemoteException;
    public int sub(int a, int b) throws RemoteException;
    public int add(int a, int b) throws RemoteException;

    public int por(double a, double b) throws RemoteException;
    public int raiz(double a) throws RemoteException;
    public int poten(double a, double b) throws RemoteException;

}