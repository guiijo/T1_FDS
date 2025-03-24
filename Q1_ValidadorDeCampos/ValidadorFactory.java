public class ValidadorFactory {
    public enum Tipo { EMAIL, CPF, MATRICULA }
    
    public static ValidadorCampo getValidador(Tipo tipo) {
        switch(tipo) {
            case EMAIL:
                return new ValidadorEmail();
            case CPF:
                return new ValidadorCPF();
            case MATRICULA:
                return new ValidadorMatricula();
            default:
                throw new IllegalArgumentException("Tipo de validador não suportado: " + tipo);
        }
    }
}