public class Relatorio {

    public String gerarRelatorio(IImprimivel imprimivel){

        return "=== RELATÓRIO === \n"+ (String) imprimivel.mostrarDados();

    }

}
