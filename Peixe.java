package aula12b_;

import aula12b_.Animal;

public class Peixe extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando!");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo substancias!");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som!");
    }
    //Médido Expecífico dos peixes
    public void soltarBolha(){
        System.out.println("Soltando bolha!");
    }
    //Métodos Getters e Setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
