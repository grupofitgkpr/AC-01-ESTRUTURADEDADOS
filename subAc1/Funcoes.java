package subAc1;

public class Funcoes {
	
	int aux;
	public Integer recursiveFactorial(int n) {
		if (n == 0) 
			return 1;
		else 
			return n * recursiveFactorial(n - 1);
	}

	public Integer LinearSum(int[] a, int i) {
		if (i == 1)
			return a[0];
		else
			return LinearSum(a, i - 1) + a[i - 1];
	}

	public int[] ReverseArray(int[] a, int i, int j) {
		if (i < j) {
			aux = a[i];
			a[i] = a[j];
			a[j] = aux;
			i++;
			j--;
			return ReverseArray(a, i, j);
			}
		else return a;
			
	}

	public int[] IterativeReverseArray(int[] a, int i, int j) {
		while (i < j) {
			aux = a[i];
			a[i] = a[j];
			a[j] = aux;
			i++;
			j--;
		}
		return a;
	}
	
	// ARRUMAR ESSE AQUI!
	public Integer BinarySum(int[] a, int i, int j) {
	if (j == 1)
		return a[i];
	else {
		j = a.length - 1;
		return BinarySum(a, i, j/2) + BinarySum(a, i + j/2, j/2);
	}
}

	public Integer BinaryFib(int i) {
		if (i <= 1)
			return i;
		else
			return BinaryFib(i - 1) + BinaryFib(i - 2);
	}

	// ARRUMAR ESSE AQUI!
	public int[] LinearFib(int k) {
		if (k <= 1) {
			int[] array = {k, 0};
			return array;
		}
		else
			LinearFib(k - 1);
		return a;
	}
}