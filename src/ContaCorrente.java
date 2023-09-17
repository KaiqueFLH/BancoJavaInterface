public class ContaCorrente extends ContaBancaria{

    private double taxaOperacao;

    public ContaCorrente(int numeroConta, double saldo) {
        super(numeroConta, saldo);
        this.taxaOperacao = 1;
    }

    @Override
    public String sacar(double valor) {
        this.setSaldo(getSaldo()-(valor + valor*taxaOperacao/100));
        return "Saque realizado com sucesso! Taxa de operação: "+taxaOperacao+"%" + "\nSaldo atual: "+getSaldo();
    }

    @Override
    public String depositar(double valor) {
        this.setSaldo(getSaldo()+valor - (valor*taxaOperacao/100));
        return "Depósito realizado com sucesso! Taxa de operação: "+taxaOperacao+"%"+ "\nSaldo atual: "+getSaldo();
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
