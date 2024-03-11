package operaciones;

public class Calculadora {
	private int num1;
	private int num2;

	public Calculadora(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int suma() {
		int resul = num1 + num2;
		return resul;
		
	}

	public int resta() {
		  int  resul = num1 - num2;

	return resul;
		}


	public boolean resta2() {
		if (num1 >= num2)
			return true;
		else
			return false;
	}

	public int multiplica() {
		int resul = num1 * num2;
		return resul;
	}

	public int divide() {
		int resul = num1 / num2;
		return resul;
	}

	public Integer divide2() {
		Integer resul;
		if (num2 == 0)
			resul = null;
		else
			resul = num1 / num2;
		return resul;
	}

}
