package pessoas; // Programa Principal
public class Pessoas {
    public static void main(String[] args) {
        // Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        //Nome de cada um deles
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);
        
        p2.setCurso("Informatica");
        p3.setSalario(5000.75f);
        p4.setSetor("Estoque");
        
        //Os 3 comandos que vão dar erro
        // p1.receberAumento(1550.75f); p1 não pode reseber aumento, só p3.
        p3.ReceberAum(1659.89f); //ReceberAum() é um método do filho, não da mãe, que é da Classe Pessoa
        //p2.mudaTrabalho() -> Este não é um método de p2, é método de p4
        p4.mudaTrabalhando(); //
        //p4.cacelarmatricula(); -> Este não é um método de p4, é método de p2
        p2.cancelarMatr();
        
        
        
        
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
    }
    
}
