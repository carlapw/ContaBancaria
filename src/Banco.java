import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta){
        contas.add(conta);
    }

    public ContaBancaria buscarConta(String numeroConta){
        for (ContaBancaria conta : contas){
            if (conta.getNumeroConta().equals(numeroConta)){
                return conta;
            }
        }
        return null;
    }

    public void listarContas(){
        for (ContaBancaria conta : contas){
            conta.exibirResumo();
        }
    }


}
