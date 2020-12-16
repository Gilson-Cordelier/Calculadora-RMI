package Calculadora.RMI;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class RMI extends  UnicastRemoteObject implements Calculadora{

    public rmi() throws RemoteException{
        int a, b;
    }

    public int add(int a, int b) throws RemoteException{
        return  a+b;
    }

    public int sub(int a, int b) throws RemoteException{
        return  a-b;
    }

    public int mul(int a, int b) throws RemoteException{
        return  a*b;
    }

    public int div(int a, int b) throws RemoteException{
        return  a/b;
    }

    public double por(double a, double b) throws RemoteException{
        return  a*(b/100);
    }

    public double raiz(double a) throws RemoteException{
        return  Math.sqrt(a);
    }

    public double poten(double a, double b) throws RemoteException{
        return  a/b;
    }
}
