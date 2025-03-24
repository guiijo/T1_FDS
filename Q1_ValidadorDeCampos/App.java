public class App {
    public static void main(String[] args) {
        testarValidacao(ValidadorFactory.Tipo.EMAIL, "aluno@universidade.edu.br");
        testarValidacao(ValidadorFactory.Tipo.EMAIL, "email.invalido@");
        
        testarValidacao(ValidadorFactory.Tipo.CPF, "12345678909");  
        testarValidacao(ValidadorFactory.Tipo.CPF, "1234567890911"); 
        
        testarValidacao(ValidadorFactory.Tipo.MATRICULA, "20231876"); 
        testarValidacao(ValidadorFactory.Tipo.MATRICULA, "202318765"); 
    }
    
    private static void testarValidacao(ValidadorFactory.Tipo tipo, String valor) {
        ValidadorCampo validador = ValidadorFactory.getValidador(tipo);
        if (validador.validar(valor)) {
            System.out.println(valor + " é um " + tipo + " válido!");
        } else {
            System.out.println(valor + " não é um " + tipo + " válido!");
        }
    }
}