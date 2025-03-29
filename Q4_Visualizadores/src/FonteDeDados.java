import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<Observador> observadores;

    public FonteDeDados(){
        lst = new LinkedList<>();
        observadores = new LinkedList<>();
    }

    public void registraObservador(Observador observador) {
        observadores.add(observador);
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }

    public void inserir(Integer valor) {
        lst.add(valor);
        notificaObservadores();
    }

    public void notificaObservadores() {
        for (Observador obs : observadores)
            obs.notifica(lst);
    }
}