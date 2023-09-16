public class ContaCorrente extends ContaBancaria{

    private double taxaOperacao;

    public ContaCorrente(int numeroConta, double saldo, double taxaOperacao) {
        super(numeroConta, saldo);
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public String sacar(double valor) {
        this.setSaldo(getSaldo()-valor);
        return "Saque realizado com sucesso!";
    }

    @Override
    public String depositar(double valor) {
        this.setSaldo(getSaldo()+valor);
        return "Depósito realizado com sucesso!";
    }

    @Override
    public String mostrarDados() {
        return null;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "taxaOperacao=" + taxaOperacao +
                super.toString();
    }
}
