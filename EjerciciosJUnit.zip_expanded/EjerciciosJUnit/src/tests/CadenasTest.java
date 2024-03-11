package tests;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Cadenas;

class CadenasTest {

	@ParameterizedTest
	@MethodSource("cuentaEspacios")
	void testCuentaEspacios(String frase, int expected) {
		Cadenas cad = new Cadenas(frase);
		int resultado = cad.cuentaEspacios();
		assertEquals(expected, resultado);
	}

	private static Stream<Arguments> cuentaEspacios() {
		return Stream.of(Arguments.of("Soy Marco", 1), 
				Arguments.of("SoyMarco", 0), 
				Arguments.of("Soy Mar co", 2));
	}
	
	@ParameterizedTest
	@MethodSource ("delReves")
	void testdelReves (String frase, String expected) {
		Cadenas cad = new Cadenas(frase);
		String resultado = cad.delReves();
		assertEquals(expected, resultado);
	}
	
	private static Stream<Arguments> delReves() {
		return Stream.of(Arguments.of("Soy Marco", "ocraM yoS"), 
				Arguments.of("S", "S"), 
				Arguments.of("", ""));
	}
	
}
