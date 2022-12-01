package pessoas; //Classe Funcionário
public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    //Método Público
    public void mudaTrabalhando() {
        this.trabalhando = ! this.trabalhando;
    }

    //Métodos Especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
    
    
}
