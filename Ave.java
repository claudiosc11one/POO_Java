package aula12b_;



import aula12b_.Animal;

public class Ave extends Animal {
    //Atributos
    private String corPena;
    
    //Método
    public void locomomer(){
        
    }
    
    //Métodos Getters e Setters
    @Override
    public void locomover() {
        System.out.println("Voando!");
    }
    @Override
    public void alimentar() {
        System.out.println("Frutas!");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de ave!");
    }
    //Métodos
    public void fazerNinho(){
        System.out.println("Construindo Ninho!");
    }
}
