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
}