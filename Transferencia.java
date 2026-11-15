package ejercicio5;

public class Transferencia {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("ES388388433883838388484", 20500);
        Cuenta c2 = new Cuenta("ES99090499388484889399", 50000);

        System.out.println("saldos antes de las transferencias");
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        Hilo h1 = new Hilo("Laura Montes", c1, c2); 
        Hilo h2 = new Hilo("Montes Laura", c2, c1);

        System.out.println("\nLanzando hilos, se producirá un interbloqueo");
        
        h1.start();
        h2.start();

        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nSaldos despues de las transferencias");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
