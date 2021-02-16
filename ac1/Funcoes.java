package ac1;

public class Funcoes {
	int[] arranjo = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
	
	public Integer menor() {
		 int cont = 0;
         int menor = arranjo[0];

         while(cont < arranjo.length)
         {
             if(arranjo[cont] < menor){
                 menor = arranjo[cont];
             }
             cont += 1;
         }
         
		return menor;
	}

	public Integer maior() {
		int[] arranjo = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
	    int contador = 0;
	    int maior = 0;
        while (contador < arranjo.length)
        {
            if (arranjo[contador] >= maior)
            {
                maior = arranjo[contador];
            }
            contador++;
        }
		return maior;
	}

	public Integer soma() {
		int[] arranjo = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
        int contador = 0;
        int soma = 0;
        while (contador < arranjo.length)
        {
            soma = soma + arranjo[contador];
            contador++;
        }
		return soma;
	}	

	public Integer repeticoes(int i) {
		int[] arranjo = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940}; 
        int contador = 0;
        int num = i;
        int repeticoes = 0;
        while(contador < arranjo.length)
        {
            if(arranjo[contador] == num)
            {
                repeticoes += 1;
            }
            contador++;
        }
        return repeticoes;
	}

}
