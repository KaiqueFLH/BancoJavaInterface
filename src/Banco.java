import java.util.ArrayList;

public class Banco implements IImprimivel<ArrayList<ContaBancaria>> {

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
    public ArrayList<ContaBancaria> mostrarDados() { return listaContasBancarias; }
}
