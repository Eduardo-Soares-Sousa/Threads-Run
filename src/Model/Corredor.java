package Model;

import java.util.Random;

public class Corredor implements Runnable {
    private final int CHEGADA = 5000;
    private String nome;
    private Random random = new Random();
    private Placar placar;

    public Corredor(String nome, Placar placar) {
        this.nome = nome;
        this.placar = placar;
    }

    @Override
    public void run() {
        int possicaoAtual = 0;

        synchronized(this){
            while(possicaoAtual < CHEGADA){
                int gerador =  random.nextInt(100);
                possicaoAtual += gerador;
    
                System.out.println("O " + nome + " percorreu " + possicaoAtual + " metros");
    
                if(possicaoAtual >= CHEGADA){
                    placar.adicionarNoPlacar(this);
                    break;
                }
    
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        }
    }

    @Override
    public String toString() {
        return "O " + nome + " Venceu!!!!";
    }
}
