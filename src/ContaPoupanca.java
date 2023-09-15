public class ContaPoupanca extends ContaBancaria{

    private double limite;

    public ContaPoupanca(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
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
        return "ContaPoupanca{" +
                "limite=" + limite +
                super.toString();
    }
}
