public class ContaCorrente extends ContaBancaria{

    private double taxaOperacao;

    public ContaCorrente(int numeroConta, double saldo, double taxaOperacao) {
        super(numeroConta, saldo);
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

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
