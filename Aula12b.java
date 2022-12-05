package com.mycompany.aula12b;

import aula12b_.Reptil;
import aula12b_.Peixe;
import aula12b_.Mamifero;

public class Aula12b {
    public static void main(String[] args) {
         //Animal n = new Animal(); -> Não pode ser instânciado.
         Mamifero m = new Mamifero();
         Reptil r = new Reptil();
         Peixe p = new Peixe();
         Ave a = new Ave();
         
         m.setPeso(35.31f);
         m.setCorPelo("Marrom");
         m.alimentar();
         m.locomover();
         m.emitirSom();
         
    }
}
