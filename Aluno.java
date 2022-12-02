package aula011b;
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    //Método NORMAL, que é pagarMensalidade do Aluno, não é sobreposto.
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno: " + this.nome);
    }
    //Métodos Getters and Setters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
