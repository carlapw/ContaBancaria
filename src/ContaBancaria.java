public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void depositar(double valor ){
        if (valor > 0){
            saldo += valor;
            System.out.println("Valor de deposito " + valor);
        }else{
            System.out.println("O valor do deposito deve ser positivo");
        }
    }

    public boolean sacar(double valor){
       if(valor <= saldo){
            saldo -= valor;
            System.out.println("O valor do saque foi " + valor);
            return true;
        }else {
            System.out.println("Saldo insuficiente para saque");
            return false;
        }
    }

    public void exibirResumo(){
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Nome do Titular: " + titular);
        System.out.println("Saldo da Conta: " + String.format("%.3f", saldo));
    }



}
