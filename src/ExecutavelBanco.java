import java.util.Scanner;

public class ExecutavelBanco {

    static Banco bancoSantoAndre = new Banco();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int opcao;
        do {
            System.out.println("""
                Bem Vindo ao Banco Santo André!
                ====== MENU ======
                Informe a opção desejada:
                1 - Criar Conta.
                2 - Selecionar Conta.
                3 - Remover Conta.
                4 - Gerar Relatório.
                5 - Sair...
                """);
            opcao = scanner.nextInt();

            switch(opcao){
                case 1 -> criarConta();
                case 2 -> selecionarConta();
                case 3 -> removerConta();
                case 4 -> System.out.println(bancoSantoAndre.mostrarDados());
                case 5 -> System.out.println("Obrigado por utilizar nossos serviços!");
            }
        }while (opcao!=5);
    }

    private static void removerConta() {
        System.out.println("Informe o número da conta:");
        int numeroConta = scanner.nextInt();
        ContaBancaria conta = bancoSantoAndre.procurarConta(numeroConta);
        if (conta != null){
            bancoSantoAndre.remover(conta);
            System.out.println("Conta removida com sucesso!");
        }else {
            System.out.println("Conta não encontrada!");
        }
    }

    private static void criarConta() {
        System.out.println("Você deseja criar uma conta corrente ou poupança?");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        int opcao = scanner.nextInt();

        if (opcao == 1){
            System.out.println("Informe o número da conta:");
            int numeroConta = scanner.nextInt();
            System.out.println("Informe o saldo da conta:");
            double saldo = scanner.nextDouble();
            ContaBancaria contaCorrente = new ContaCorrente(numeroConta,saldo);
            bancoSantoAndre.inserir(contaCorrente);
            System.out.println("Conta criada com sucesso!");
        }
        else if (opcao == 2){
            System.out.println("Informe o número da conta:");
            int numeroConta = scanner.nextInt();
            System.out.println("Informe o saldo da conta:");
            double saldo = scanner.nextDouble();
            System.out.println("Informe o limite da conta:");
            double limite = scanner.nextDouble();
            ContaBancaria contaPoupanca = new ContaPoupanca(numeroConta,saldo,limite);
            bancoSantoAndre.inserir(contaPoupanca);
            System.out.println("Conta criada com sucesso!");
        }
    }

    private static void selecionarConta() {
        System.out.println("Informe o número da conta:");
        int numeroConta = scanner.nextInt();
        ContaBancaria conta = bancoSantoAndre.procurarConta(numeroConta);
        if (conta != null){
            menuConta(conta);
        }else {
            System.out.println("Conta não encontrada!");
        }
    }

    private static void menuConta(ContaBancaria conta) {
        int opcao;
        do {
            System.out.println("""
                ====== MENU ======
                Informe a opção desejada:
                1 - Sacar.
                2 - Depositar.
                3 - Transferir.
                4 - Mostrar Dados.
                5 - Voltar para o início...
                """);
            opcao = scanner.nextInt();

            switch(opcao){
                case 1 -> sacar(conta);
                case 2 -> depositar(conta);
                case 3 -> transferir(conta);
                case 4 -> System.out.println(conta.mostrarDados());
                case 5 -> System.out.println("Você será redirecionado para o início...");
            }
        }while (opcao !=5);
    }

    private static void transferir(ContaBancaria conta) {
        System.out.println("Informe o número da conta que irá receber a transferência:");
        int numeroConta = scanner.nextInt();
        ContaBancaria contaRecebedora = bancoSantoAndre.procurarConta(numeroConta);
        if (contaRecebedora != null){
            System.out.println("Informe o valor a ser transferido:");
            double valor = scanner.nextDouble();
            System.out.println(conta.transferir(valor,contaRecebedora));
        }else {
            System.out.println("Conta não encontrada!");
        }
    }

    private static void depositar(ContaBancaria conta) {
        System.out.println("Informe o valor a ser depositado:");
        double valor = scanner.nextDouble();
        System.out.println(conta.depositar(valor));
    }

    private static void sacar(ContaBancaria conta) {
        System.out.println("Informe o valor a ser sacado:");
        double valor = scanner.nextDouble();
        System.out.println(conta.sacar(valor));
    }
}
