package pessoas; //Classe Aluno
public class Aluno extends Pessoa { // extends faz a Classe Aluno receber herança da Classe Pessoa
    private int matr;
    private String curso;
    
    //Método    
    public void cancelarMatr(){
        System.out.println("Matricula serah cancelada!");
    }
    
    //Métodos Especiais

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
