package aula011b;
public class Aula011b { 
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); -> Pessoa não pode er instanciado, pois faz parte de uma Classe Abstrada (abstract)
        /*Visitante v1 = new Visitante();
        v1.setNome(" Juvenal");
        v1.setIdade( 22);
        v1.setSexo(" M");
        System.out.println(v1.toString());*/
        
       Aluno a1 = new Aluno(); // a1 é um objeto da Classe Aluno
       a1.setNome("Claudio");
       a1.setMatricula(1111);
       a1.setCurso("TI");
       a1.setIdade(16);
       a1.setSexo("M");
       a1.pagarMensalidade();
       
       Bolsista b1 = new Bolsista(); //b1 é objeto da Classe Bolsista
       b1.setMatricula(1112);
       b1.setNome("Jubileu");
       b1.setBolsa(12.5f);
       b1.setSexo("M");
       b1.pagarMensalidade();
       
       
       
       
       
        
    }
    
}
