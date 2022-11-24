package aula06b;

public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligando;
    private boolean tocando;
    
    // Métodos Especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligando = false;
        this.tocando = false;
        
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigando() {
        return ligando;
    }

    private void setLigado(boolean ligando) {
        this.ligando = ligando;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    // Métodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------MENU------");
        System.out.println("Estah ligado? " + this.getLigando());
        System.out.println("Estah tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print(" | ");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu....");
    }

    @Override
    public void maisVolume() {
        if (this.getLigando()){
            this.setVolume(this.getVolume() +5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigando()) {
            this.setLigado(this.getVolume() -5);                                 
        } else {
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigando() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigando() && this.getLigando() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigando() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigando() && this.getTocando()){
            this.setTocando(false);
        }
    }
    
    
    
    
}
