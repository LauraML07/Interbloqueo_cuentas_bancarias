package ejercicio5;

public class Hilo extends Thread {
    private Cuenta c1;
    private Cuenta c2;

    public Hilo(String nombre, Cuenta c1, Cuenta c2) {
        super(nombre); 
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            //TransferenciaConBloqueo.transferencia(this.c1, this.c2, 10);
            TransferenciaSinBloqueo.transferencia(this.c1, this.c2, 10);
        }
        System.out.println("Hilo " + this.getName() + " ha terminado sus transferencias.");
    }
}
