public class ContaPoupanca extends ContaBancaria{

    private double limite;

    public ContaPoupanca(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public String sacar(double valor) {
        if (this.getSaldo() >=valor){
            this.setSaldo(this.getSaldo() - valor);
            return "Saque realizado com sucesso!"+ "\nSaldo atual: "+getSaldo();
        }else {
            valor = valor - this.getSaldo();
            this.setSaldo(0);
            if (valor> limite){
                return "Saldo insuficiente! Seu limite iria estourar caso completasse a transação!";
            }else {
                limite = limite - valor;
            }
            return "Saque realizado com sucesso! Limite atual: " + limite+ "\nSaldo atual: "+getSaldo();
        }
    }

    @Override
    public String depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);

        return "Depósito realizado com sucesso!"+ "\nSaldo atual: "+getSaldo();
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
