package m5.uf3.gloria;

public class Calculadora {

	private int num1;
	private int num2;

	public Calculadora(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}

	public int divideix() {
		int resul = num1 / num2;
		return resul;
	}

	public boolean residu() {

		if (num1 % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int potencia() {
		
		return (num1 * num1) * num2;
		
	}
}
