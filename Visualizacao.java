package aula15b_projetoyoutube;
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;
    
    //Construtor
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    //3 Métodos Adicionados aos 9' do vídeo da aula 15b
   //Este métodos tem o mesmo nome (avaliar) e possoem assinaturas diferentes.
    public void avaliar(){
        this.filme.setAvaliacao(5);
        
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
        
    }
    
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        }else if (porc <= 50) {
            tot = 5;
        }else if (porc <= 90) {
            tot = 8;
        }else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    
    // Métodos Getters and Setters
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
    
    
}
