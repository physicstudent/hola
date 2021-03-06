package com.ipartek.formacion.recetas.ejercicios.herencia;

/**
 * 
 * Comprobar que solo podemos instanciar objetos de las Clases que no sean
 * Abstractas
 * 
 * @author Curso
 *
 */

public class EjercicioAbstraccion {

	public static void main(String[] args) {

		// ObjetoGrafico og = new ObjetoGrafico(0,0);

		Linea linea = new Linea(0, 0);

		// En principio no se puede instanciar un objeto de Clase abstracta a
		// menos que se implemente en el momento de la instanciacion.
		// clase anonima
		Circulo c = new Circulo(5, 5) {

			@Override
			public void dibujar() {
				System.out.println("Dibujando Circulo");
			}
		};

		// Circulo c = new Circulo(0, 0);
		CirculoNoAbstracto c2 = new CirculoNoAbstracto(0, 0);
	}
}
