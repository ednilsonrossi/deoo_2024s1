package example_4;

public class Calculo {

    public int divide(int x, int y) throws ArithmeticException{
        if(x < y){
            throw new ArithmeticException("A divisão gera um valor menor que 1.");
        }
        return x / y;
    }

    public static void main(String[] args) {
        Calculo calculo = new Calculo();
        try {
            int result = calculo.divide(2, 8);
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e){
            System.err.println("Mensagem: " + e.getMessage());
        }
    }
}
