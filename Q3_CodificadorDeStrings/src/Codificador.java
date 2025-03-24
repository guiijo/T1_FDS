
public class Codificador {


    private CodificadorStrategy strategy;

    public Codificador(CodificadorStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CodificadorStrategy strategy) {
        this.strategy = strategy;
    }

    public String codifica(String str) {
        return strategy.codifica(str);
    }

    public String deCodifica(String str) {
        return strategy.deCodifica(str);
    }
}
