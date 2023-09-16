public class ContaPoupanca extends ContaBancaria{

    private double limite;

    public ContaPoupanca(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public String sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor);

        return "Saque realizado com sucesso!";
    }

    @Override
    public String depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);

        return "Depósito realizado com sucesso!";
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
