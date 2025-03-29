import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia(dados.getValores());
        dados.registraObservador(cm);
        var cs = new VisualizadorDeSomatorio(dados.getValores());
        dados.registraObservador(cs);

        Scanner s = new Scanner(System.in);
        int valor = 0;
        while(true){
            System.out.println("\nEntre um valor positivo maior que zero (0=fim):");
            valor = Integer.parseInt(s.nextLine());
            if (valor == 0){
                break;
            }
            
            dados.inserir(valor);

            /* 
            dados.add(valor);
            cs.acrescentaValor(valor);
            cm.acrescentaValor(valor);
            cs.exibeSomatorio();
            cm.exibeMedia();
            */

        }
        System.out.println("Fim");
    }
}
