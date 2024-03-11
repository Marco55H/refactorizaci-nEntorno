package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CalculadoraTest2 {

	@ParameterizedTest
	@MethodSource ("division")
	void testDivide(int num1, int num2, int resultadoEsperado) {
		Calculadora calc = new Calculadora( num1,  num2);
		int resultado=calc.divide();
		
		assertEquals(resultadoEsperado, resultado);
		
	}

	@ParameterizedTest
	@MethodSource ("suma")
	void testSuma(int num1, int num2, int resultadoEsperado) {
		Calculadora calc = new Calculadora( num1,  num2);
		int resultado=calc.suma();
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	@ParameterizedTest
	@MethodSource ("resta")
	void testResta(int num1, int num2, int resultadoEsperado) {
		Calculadora calc = new Calculadora( num1,  num2);
		int resultado=calc.resta();
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	@ParameterizedTest
	@MethodSource ("multiplica")
	void testMultiplicacion(int num1, int num2, int resultadoEsperado) {
		Calculadora calc = new Calculadora( num1,  num2);
		int resultado=calc.multiplica();
		
		assertEquals(resultadoEsperado, resultado);
		
	}

	private static Stream<Arguments> division(){
		return Stream.of(Arguments.of(10, 5, 2),
				Arguments.of(10, -5, -2),
				Arguments.of(16, 5, 3)
				);
	}

private static Stream<Arguments> suma(){
	return Stream.of(Arguments.of(10, 5, 15),
			Arguments.of(10, -5, 5),
			Arguments.of(16, 5, 21)
			);
}

private static Stream<Arguments> resta(){
	return Stream.of(Arguments.of(10, 5, 5),
			Arguments.of(10, -5, 15),
			Arguments.of(16, 5, 11)
			);
}

private static Stream<Arguments> multiplica(){
	return Stream.of(Arguments.of(10, 5, 50),
			Arguments.of(10, -5, -50),
			Arguments.of(16, 5, 80)
			);
}
}
