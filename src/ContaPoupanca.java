public class ContaPoupanca extends ContaBancaria {

    private double limite;

    public ContaPoupanca(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public String sacar(double valor) {
        if (valor >= 0) {
            if (valor <= getSaldo()) {
                if (this.getSaldo() >= valor) {
                    this.setSaldo(this.getSaldo() - valor);
                    return "Saque realizado com sucesso!" + "\nSaldo atual: " + getSaldo();
                } else {
                    if (valor > limite) {
                        return "Saldo insuficiente! Seu limite iria estourar caso completasse a transação!";
                    } else {
                        valor = valor - this.getSaldo();
                        this.setSaldo(0);
                        limite = limite - valor;
                    }
                    return "Saque realizado com sucesso! Limite atual: " + limite + "\nSaldo atual: " + getSaldo();
                }
            } else return "O valor de saque é maior que seu saldo atual. Tente novamente!";
        }
        else return "O valor inserido é negativo, tente novamente!";

    }

    @Override
    public String depositar(double valor) {
        if (valor>=0){
            this.setSaldo(this.getSaldo() + valor);
            return "Depósito realizado com sucesso!" + "\nSaldo atual: " + getSaldo();
        }
        else return "O valor inserido é negativo, tente novamente!";
    }

    @Override
    public String mostrarDados() {
        return "ContaPoupanca{" +
                "limite=" + limite +
                super.toString();
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "limite=" + limite +
                super.toString();
    }
}
