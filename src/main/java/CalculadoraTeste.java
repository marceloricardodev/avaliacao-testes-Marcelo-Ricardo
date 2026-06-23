import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {

    calculadora calc = new calculadora();

    @Test
    public void testSoma() {
        // Testa se 5 + 3 é igual a 8
        assertEquals(8, calc.soma(5, 3));
    }

    @Test
    public void testDivisao() {
        // Testa se 10 / 2 é igual a 5
        assertEquals(5, calc.divisao(10, 2));
    }

    @Test
    public void testDivisaoPorZero() {
        // Testa se tentar dividir por 0 vai dar erro (que é o esperado)
        assertThrows(ArithmeticException.class, () -> {
            calc.divisao(10, 0);
        });
    }
}