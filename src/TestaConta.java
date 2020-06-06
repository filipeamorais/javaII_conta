
// To test the class Conta
public class TestaConta {

    public static void main (String[] args){
        // Create new checking account, deposit an amount and check the balance
        ContaCorrente joao = new ContaCorrente();
        joao.deposita(50.0);

        try{
            joao.saca(100.0);
        } catch (Exception e){
            System.out.println("Saldo insuficiente");
        }
        // if (joao.saca(100.0)){
        //     System.out.println("saque efetuado com sucesso!");
        // };

        System.out.println(joao.getSaldo());
    }
}