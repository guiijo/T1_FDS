public class App {
    public static void main(String[] args) {
        IDado d6 = new Dado(6);
        DadoComHistorico d6ComHistorico = new DadoComHistorico(new Dado(6));

        d6.rolar();
        d6ComHistorico.rolar();
        d6ComHistorico.rolar();
        d6ComHistorico.rolar();

        System.out.println("Dado Simples: " + d6.getValor());
        System.out.println("Dado Histórico: " + d6ComHistorico.getValor());
        System.out.println("Histórico de jogadas: " + d6ComHistorico.getHistorico());
    }
}
