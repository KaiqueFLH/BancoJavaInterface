public class Relatorio {

    public String gerarRelatorio(IImprimivel imprimivel){

        return "=== RELATÓRIO === \n"+ imprimivel.mostrarDados();

    }

}
