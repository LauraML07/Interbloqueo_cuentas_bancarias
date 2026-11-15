package ejercicio5;

public class TransferenciaConBloqueo {
    
    public static boolean transferencia(Cuenta c1, Cuenta c2, int cantidad) {
        synchronized (c1) {
            try {
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            synchronized (c2) {
                if (c1.getSaldo() >= cantidad) {
                    c1.sacarCantidad(cantidad);
                    c2.ingresaCantidad(cantidad);
                    return true;
                }
                return false; 
            }
        }
    }
}
