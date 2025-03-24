public class ValidadorEmail implements ValidadorCampo {
    @Override
    public boolean validar(String valor) {
        int posArroba = valor.indexOf('@');
        if (posArroba <= 0) return false;
        
        String dominio = valor.substring(posArroba + 1);
        return dominio.contains(".") && dominio.indexOf('.') != dominio.length() - 1;
    }
}