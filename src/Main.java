public class Main {

    //Crie uma classe executável na qual você instancia duas contas (uma de cada tipo), credita
    //algum valor para elas e efetua um saque (obs: no objeto conta poupança, faça um saque
    //maior que o saldo atual).

    static ContaBancaria corrente; // = new ContaCorrente();
    static ContaBancaria poupanca; // = new ContaPoupanca();
    static Relatorio relatorio = new Relatorio();


    public static void main(String[] args) {
        relatorio.gerarRelatorio(corrente);
        relatorio.gerarRelatorio(poupanca);


    }

}
