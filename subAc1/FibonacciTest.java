package subAc1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

	@Test
	void test() {
		int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] B = {1, 2, 300};
		int[] rA = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		Funcoes a = new Funcoes();
		
		assertEquals(120, a.recursiveFactorial(5), "O fatorial de 5 é 120");
		assertEquals(10, a.LinearSum(A, 5), "A soma dos 5 primeiros termos é 10");
		assertArrayEquals(rA, a.ReverseArray(A.clone(), 0, A.length - 1), "Deve retornar invertido A");
		assertArrayEquals(rA, a.IterativeReverseArray(A.clone(), 0, A.length - 1), "Deve retornar invertido A");
		assertEquals(55, a.BinaryFib(10), "O décimo termo de Fibonacci é 55");
		
		assertEquals(10, a.BinarySum(A, 0, A.length - 1), "ESSE AQUI N FIZ!");
		assertEquals(, a.LinearFib(10), "ESSE AQUI N FIZ!");
		
	}

}
