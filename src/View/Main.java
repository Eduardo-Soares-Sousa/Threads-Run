package View;

import Model.Corredor;
import Model.Placar;

public class Main {
    public static void main(String[] args) throws Exception {
        Placar placar = new Placar();

        Thread thread1 = new Thread(new Corredor("Corredor 1", placar));
        Thread thread2 = new Thread(new Corredor("Corredor 2", placar));
        Thread thread3 = new Thread(new Corredor("Corredor 3", placar));
        Thread thread4 = new Thread(new Corredor("Corredor 4", placar));
        Thread thread5 = new Thread(new Corredor("Corredor 5", placar));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();

        placar.imprimirPlacarFinal();
    }
}