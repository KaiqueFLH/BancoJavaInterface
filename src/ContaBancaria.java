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

    public abstract String sacar(double valor);

    public abstract String depositar(double valor);

    public String transferir(double valor, ContaBancaria contaRecebedora) {
        this.sacar(valor);
        contaRecebedora.depositar(valor);

        return "Transferência realizada com sucesso!"+ "\nSaldo atual: "+contaRecebedora.getSaldo();
    }

    @Override
    public String toString() {
        return
                ", numeroConta=" + numeroConta +
                        ", saldo=" + saldo +
                        '}';
    }
}
