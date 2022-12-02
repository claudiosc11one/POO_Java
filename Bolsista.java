package aula011b;
public class Bolsista extends Aluno {// A Classe Bolsista recebe as heranças das Classes superiores: Aluno e Pessoa.
    private float bolsa;
    
    //Métodos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
    // Métodos
    @Override //Método Sobreposto, que é pagarMensalidade do Bolsista
    public void pagarMensalidade(){
        System.out.println(this.nome + " eh bolsista! Pagamento Facilitado.");
        
    }
    //Métodos Getters and Setters
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
