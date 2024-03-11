package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.FuncionesRecursivas;

class FuncionesRecursivasTest {

	@ParameterizedTest
	@MethodSource ("sumatorio")
	void testSumatorio(int numero, int expected) {
		FuncionesRecursivas fr = new FuncionesRecursivas();
		int resultado=fr.sumatorio(numero);
		assertEquals(expected, resultado);
	}
	
	private static Stream<Arguments> sumatorio() {
		return Stream.of(Arguments.of("1", "1"), 
				Arguments.of("4", "10"));
	}
	
	@ParameterizedTest
	@MethodSource ("potencia")
	void testPotencia (int a, int n, double expected) {
		FuncionesRecursivas fr = new FuncionesRecursivas();
		double resultado = fr.potencia(a, n);
		assertEquals(expected, resultado);
		
	}
	private static Stream<Arguments> potencia(){
		return Stream.of(Arguments.of(1,1,1),
				Arguments.of(2,3,8));
	}
	
	@ParameterizedTest
	@MethodSource ("fibonacci")
	void testFibonacci (int numero, int expected) {
		FuncionesRecursivas fr = new FuncionesRecursivas();
		double resultado = fr.fibonacci(numero);
		assertEquals(expected, resultado);
		
	}
	private static Stream<Arguments> fibonacci(){
		return Stream.of(Arguments.of(1,1),
				Arguments.of(10,55));
	}
}
