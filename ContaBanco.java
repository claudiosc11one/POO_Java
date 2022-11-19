package pkgpackage.aula05b_gustavoguanabara;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("-------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.tipo);
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)){
            this.saldo = 50; // mexe-se no atributo
            this.setSaldo(50); // mexe-se no método
        }else if ("CP".equals(t)){
            this.setSaldo(150);         
        }
        System.out.println("Conta aberta com sucesso!!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta ainda não pode ser fechada, pois ainda tem dinheiro.");
    }else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada, pois tem débito.");   
    } else {
    this.setStatus(false);
            System.out.println("Conta fechada com sucesso!!");
    }
        
    public void depositar(float v) {
        if (this.getStatus()){
            //this.saldo = this.saldo + v; // Atributos
            this.setSaldo(this.getSaldo() + v); // Métodos Especiais
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
   
    public void sacar(float v){
        if (this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else {
                System.out.println("Saldo insuficiente para saque!");
            }
        }else {
            System.out.println("Impossível sacar de uma conta fechada!");    
        }
    }
    public void pagarMensal(){
        int v = 0; //variável local,não é atributo
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())){
            v = 20;
        
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade com sucesso por " + this.getDono());
        }else{
            System.out.println("Impossível pagar uma conta fechada!");
        }
                
  
        
    }
    //Métodos Especiais
    public void ContaBanco(){//Método Construtor que tem o mesmo nome da classe.
        this.saldo = 0;
        this.status = false;
        
   }
    //Métudos no automático clicar em Alt + Insert

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

