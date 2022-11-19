package pkgpackage.aula05b_gustavoguanabara;

public class PackageAula05b_gustavoguanabara {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco(); // Foi criado um objeto chamado p1
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC"); // CC - Conta Corrente
        
        
        ContaBanco p2 = new ContaBanco(); // Foi criado o 2° objeto, chamado p2
        p2.setNumConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta("CP"); // CP - Conta Poupança
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        
        
        
        p1.estadoAtual();
        p2.estadoAtual();

        
        
    }
    
}
