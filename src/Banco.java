import java.util.ArrayList;

public class Banco implements IImprimivel<String>{

    static ArrayList<ContaBancaria> listaContasBancarias = new ArrayList<>();


    public void inserir(ContaBancaria contaBancaria){
        listaContasBancarias.add(contaBancaria);
    }

    public void remover(ContaBancaria contaBancaria){
        listaContasBancarias.remove(contaBancaria);
    }

    public ContaBancaria procurarConta(int numeroConta){
        for (ContaBancaria contaBancaria: listaContasBancarias) {
            if (contaBancaria.getNumeroConta() == numeroConta){
                return contaBancaria;
            }
        }
        return null;
    }


    @Override
    public String mostrarDados() {
        System.out.println("=== RELATÓRIO ===");
        for (ContaBancaria contaBancaria: listaContasBancarias) {
            return contaBancaria.mostrarDados();
        }
        return null;
    }
}
