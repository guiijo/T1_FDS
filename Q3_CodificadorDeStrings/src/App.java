


public class App {
            public static void main(String[] args) throws Exception {
                Codificador cod = new Codificador(new CodificadorSimples());

                String aux = "Desafio Padrões de Projeto";

                System.out.println("Original: " + aux);
                aux = cod.codifica(aux);
                System.out.println("Codificado SIMPLES: " + aux);
                aux = cod.deCodifica(aux);
                System.out.println("Decodificado SIMPLES: " + aux);

                
                cod.setStrategy(new CodificadorDesloca());
                aux = cod.codifica(aux);
                System.out.println("Codificado DESLOCA: " + aux);
                aux = cod.deCodifica(aux);
                System.out.println("Decodificado DESLOCA: " + aux);
            }
}


