package subAc1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncoesTeste {

	@Test
	void test() {
		int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] rA = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int[] fib10 = {55, 34};
		Funcoes a = new Funcoes();
		
		assertEquals(120, a.recursiveFactorial(5), "O fatorial de 5 � 120");
		
		assertEquals(10, a.LinearSum(A, 5), "A soma dos 5 primeiros termos � 10");
		
		assertArrayEquals(rA, a.ReverseArray(A.clone(), 0, A.length - 1), "Deve retornar o A invertido");
		
		assertArrayEquals(rA, a.IterativeReverseArray(A.clone(), 0, A.length - 1), "Deve retornar o A invertido");
		
		assertEquals(55, a.BinaryFib(10), "O d�cimo termo de Fibonacci � 55");
		
		assertArrayEquals(fib10, a.LinearFib(10), "O d�cimo termo de Fibonacci � 55 e o nono � 34");
		
	}

}
