package subAc1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncoesTeste {

	@Test
	void test() {
		int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] reverseA = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; // array A invertido para os testes
		int[] fib10 = {55, 34}; // décimo e nono termos de fibonacci para o teste
		Funcoes teste = new Funcoes();
		
		assertEquals(720, teste.recursiveFactorial(6), "O fatorial de 5 é 720");
		
		assertEquals(10, teste.linearSum(A, 6), "A soma dos 6 primeiros termos é 15");
		
		assertArrayEquals(reverseA, teste.reverseArray(A.clone(), 0, A.length - 1), "Deve retornar o A invertido");
		
		assertArrayEquals(reverseA, teste.iterativeReverseArray(A.clone(), 0, A.length - 1), "Deve retornar o A invertido");
		
		assertEquals(55, teste.binaryFib(10), "O décimo termo de Fibonacci é 55");
		
		assertArrayEquals(fib10, teste.linearFibonacci(10), "O décimo termo de Fibonacci é 55 e o nono é 34");
		
	}

}
