package subAc1;

public class Funcoes {
	
	public int recursiveFactorial(int n) {
		if (n == 0) 
			return 1;
		else 
			return n * recursiveFactorial(n - 1);
	}

	public int linearSum(int[] a, int i) {
		if (i == 1)
			return a[0];
		else
			return linearSum(a, i - 1) + a[i - 1];
	}

	public int[] reverseArray(int[] a, int i, int j) {
		if (i < j) {
			int aux = a[i];
			a[i] = a[j];
			a[j] = aux;
			i++;
			j--;
			return reverseArray(a, i, j);
		} else 
			return a;
	}

	public int[] iterativeReverseArray(int[] a, int i, int j) {
		while (i < j) {
			int aux = a[i];
			a[i] = a[j];
			a[j] = aux;
			i++;
			j--;
		}
		return a;
	}
	
	public int binaryFib(int i) {
		if (i <= 1)
			return i;
		else
			return binaryFib(i - 1) + binaryFib(i - 2);
	}


	public int[] linearFibonacci(int k) {
		if (k <= 1) {
			int[] array = {k, 0};
			return array;
		} else {
			int x[] = linearFibonacci(k - 1);
			int aux = x[0];
			x[0] = x[0] + x[1];
			x[1] = aux;
			return x;
		}
	}
}