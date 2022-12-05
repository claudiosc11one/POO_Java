package aula12b_;

import aula12b_.Animal;

public class Reptil extends Animal {
    //Atributo
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando!");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais!");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil!");
    }
    //Métodos Getters e Setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
