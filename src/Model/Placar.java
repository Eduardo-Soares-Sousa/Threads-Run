package Model;

import java.util.ArrayList;
import java.util.List;

public class Placar {
    private List<Corredor> listaCorredor;

    public Placar() {
        this.listaCorredor = new ArrayList<>();
    }

    public synchronized void adicionarNoPlacar(Corredor corredor) {
        listaCorredor.add(corredor);
    }

    public void imprimirPlacarFinal() {
        for (Corredor corredor : listaCorredor) {
            System.out.println(corredor);
        }
    }
}
