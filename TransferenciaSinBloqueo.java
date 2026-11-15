package ejercicio5;

public class TransferenciaSinBloqueo {
    public static boolean transferencia(Cuenta c1, Cuenta c2, int cantidad) {
        Cuenta primeraEnBloquear, segundaEnBloquear;

        if (c1.getNumeroCuenta().compareTo(c2.getNumeroCuenta()) < 0) {
            primeraEnBloquear = c1;
            segundaEnBloquear = c2;
        } else {
            primeraEnBloquear = c2;
            segundaEnBloquear = c1;
        }

        synchronized (primeraEnBloquear) {
            synchronized (segundaEnBloquear) {
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
