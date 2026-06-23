public class calculadora {

    public int soma(int a, int b){
        return a + b;
    }

    public int divisao(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return a / b;

    }

    public static class Main {
        public static void main(String[] args) {

            calculadora calc = new calculadora();

            System.out.println("Soma: " + calc.soma(10, 5));
            System.out.println("Divisão: " + calc.divisao(10, 2));
        }
    }
}