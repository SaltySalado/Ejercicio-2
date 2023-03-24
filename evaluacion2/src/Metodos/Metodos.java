
package Metodos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Evaluacion2.TablaEnteros;

/**
 * @author David Rodríguez Díaz
 * @since 24/03/2023
 *
 *        En esta clase Metodos vamos a realizar varias pruebas unitarias de
 *        JUnit para comprobar los metodos de la clase TablaEnteros.java
 *
 */
class Metodos {

	TablaEnteros tabla;

	/**
	 * En esta clase se inicializara el objeto tabla que es de tipo TablaEnteros.
	 * Sera el objeto que usaremos principalmente para hacer todos los test (excepto
	 * en algunos casos)
	 */
	@BeforeEach
	public void crearCasoDePrueba() {

		Integer[] bateriaNumeros = { 6, 4, 2, 1 };

		tabla = new TablaEnteros(bateriaNumeros);

	}

	@Test
	/**
	 * En este test se comprobara que el valor devuelto por el metodo sumaTabla da
	 * un @return igual a 13 que tecnicamente es el valor de la suma de nuestra
	 * bateria de numeros.
	 */
	void testSuma() {
		int resultadoEsperado = 13, valorDelMetodo = tabla.sumaTabla();

		assertEquals(resultadoEsperado, valorDelMetodo);

	}

	@Test
	/**
	 * En este test se comprobara que el valor devuelto por el metodo mayorTabla da
	 * un @return igual a 6 que tecnicamente es el valor maximo de nuestra bateria
	 * de numeros.
	 */
	void testNumeroMaximo() {
		int resultadoEsperado = 6, valorDelMetodo = tabla.mayorTabla();

		assertEquals(resultadoEsperado, valorDelMetodo);

	}

	@Test
	/**
	 * En este test se comprobara que el valor devuelto por el metodo posicionTabla
	 * da un @return igual a 0 que tecnicamente es la posicion del valor buscado 6.
	 */
	void testPosicionTablaCorrecto() {
		int numeroBuscado = 6, resultadoEsperado = 0, valorDelMetodo;

		valorDelMetodo = tabla.posicionTabla(numeroBuscado);

		assertEquals(resultadoEsperado, valorDelMetodo);

	}

	@Test
	/**
	 * En este test se comprobara que el método falla ya que el valor buscado no se
	 * encuentra dentro de la batería de numeros.
	 * 
	 * El test debe fallar
	 */
	void testPosicionTablaError() {
		int numeroBuscado = 11, resultadoEsperado = 6, valorDelMetodo;

		valorDelMetodo = tabla.posicionTabla(numeroBuscado);

		assertEquals(resultadoEsperado, valorDelMetodo);

	}

}
