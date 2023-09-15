public abstract class ContaBancaria implements IImprimivel<String> {
    private int numeroConta;
    private double saldo;

// =====================================================================================================================
    //Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
// =====================================================================================================================

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public void transferir(double valor, ContaBancaria contaRecebedora) {

    }

    @Override
    public String toString() {
        return
                ", numeroConta=" + numeroConta +
                        ", saldo=" + saldo +
                        '}';
    }
}
