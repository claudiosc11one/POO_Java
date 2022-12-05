package aula12b_;

import aula12b_.Animal;

public class Mamifero extends Animal {
    //Atributos
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Correndo!");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamando!");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero!");
    }
    //Métodos Getters e Setters
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    
}
