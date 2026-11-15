package ejercicio5;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public synchronized double getSaldo() { 
        return this.saldo; 
    }
    
    public synchronized void ingresaCantidad(double cantidad) { 
        this.saldo += cantidad; 
    }
    
    public synchronized void sacarCantidad(double cantidad) { 
        this.saldo -= cantidad; 
    }
    
    public String getNumeroCuenta() { 
        return this.numeroCuenta; 
    }

    @Override
    public String toString() {
        return "Cuenta " + this.numeroCuenta + " con saldo: " + this.saldo;
    }
}
