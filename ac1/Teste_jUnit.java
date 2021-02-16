package ac1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste_jUnit {

	@Test
	void test() {
		Funcoes a = new Funcoes();
		
		assertEquals(510, a.menor(), "O menor deve ser 510");
		assertEquals(940, a.maior(), "O maior � 940");
		assertEquals(7540, a.soma(), "A soma � 7040");
		assertEquals(0, a.repeticoes(3), "3 n�o aparece");
		assertEquals(1, a.repeticoes(790), "790 aparece 1 vez");
		assertEquals(2, a.repeticoes(940), "940 aparece 2 vezes");
		
	}

}
