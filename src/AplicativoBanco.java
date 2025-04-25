public class AplicativoBanco {
    public static void main(String[] args) {

        Banco meubanco = new Banco();

        ContaBancaria conta1 = new ContaBancaria("078", "Carla", 30.000);
        ContaBancaria conta2 = new ContaBancaria("019", "Kaique", 70.000);
        ContaBancaria conta3 = new ContaBancaria("025", "Vitoria", 90.000);

        meubanco.adicionarConta(conta1);
        meubanco.adicionarConta(conta2);
        meubanco.adicionarConta(conta3);





        meubanco.listarContas();





    }
}
