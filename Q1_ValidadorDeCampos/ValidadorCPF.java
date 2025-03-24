public class ValidadorCPF implements ValidadorCampo {
    @Override
    public boolean validar(String valor) {
        if (valor.length() != 11) {
            return false;
        }
        
        for (int i = 0; i < valor.length(); i++) {
            if (!Character.isDigit(valor.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
}