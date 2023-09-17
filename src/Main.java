public class Main {

    //Crie uma classe executável na qual você instancia duas contas (uma de cada tipo), credita
    //algum valor para elas e efetua um saque (obs: no objeto conta poupança, faça um saque
    //maior que o saldo atual).

    static ContaBancaria corrente= new ContaCorrente(1,1000);
    static ContaBancaria poupanca= new ContaPoupanca(2,1000,3000);
    static Relatorio relatorio = new Relatorio();


    public static void main(String[] args) {
        System.out.println(relatorio.gerarRelatorio(corrente));
        System.out.println(relatorio.gerarRelatorio(poupanca));


        System.out.println(corrente.depositar(1000));
        System.out.println(poupanca.depositar(1000));
        System.out.println(corrente.sacar(1000));
        System.out.println(poupanca.sacar(50000));
    }

}
