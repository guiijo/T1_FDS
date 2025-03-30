import java.util.ArrayList;
import java.util.List;

class DadoComHistorico extends DadoDecorator {
    private List<Integer> historico;

    public DadoComHistorico(IDado dado) {
        super(dado);
        this.historico = new ArrayList<>();
    }

    @Override
    public void rolar() {
        super.rolar();
        historico.add(getValor());
    }

    public List<Integer> getHistorico() {
        return historico;
    }
}