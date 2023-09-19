public class ContaCorrente extends ContaBancaria{

    private double taxaOperacao;

    public ContaCorrente(int numeroConta, double saldo) {
        super(numeroConta, saldo);
        this.taxaOperacao = 1;
    }

    @Override
    public String sacar(double valor) {
        if (valor>=0){
            if (valor<=getSaldo()){
                this.setSaldo(getSaldo()-(valor + valor*taxaOperacao/100));
                return "Saque realizado com sucesso! Taxa de operação: "+taxaOperacao+"%" + "\nSaldo atual: "+getSaldo();
            }
            else return "O valor de saque é maior que seu saldo atual. Tente novamente!";
        }
        else return "O valor inserido é negativo, tente novamente!";
    }

    @Override
    public String depositar(double valor) {
        if (valor>=0){
            this.setSaldo(getSaldo()+valor - (valor*taxaOperacao/100));
            return "Depósito realizado com sucesso! Taxa de operação: "+taxaOperacao+"%"+ "\nSaldo atual: "+getSaldo();
        }
        else return "O valor inserido é negativo, tente novamente!";

    }

    @Override
    public String mostrarDados() {
        return "ContaCorrente{" +
                "taxaOperacao=" + taxaOperacao +
                super.toString();
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "taxaOperacao=" + taxaOperacao +
                super.toString();
    }
}
