/*
 	Seleccion.java
 	
    2021 Daniel Cardenas (danielkard@hotmail.com)

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package ec.danielkard.estructura.datos.ordenamiento;

/**
 * Ordena un arreglo mediante el metodo de Seleccion
 *
 * @author Daniel Cardenas
 */
public class Seleccion {

	public static void ordenar() {

		System.out.println("Selecci\u00F3n:");

		int[] arreglo = new int[] { 1, 5, 7, 10, 3, 2 };

		int n = arreglo.length;// total del arreglo

		int posicionConElMenor, i, j;
		/* comienza a realizar el ordenamiento */
		for (i = 0; i < n - 1; i++) {

			posicionConElMenor = i;// se asume que el primero es el menor y luego se compara con el resto del
									// arreglo (i+1)

			for (j = i + 1; j < n; j++) {
				/*
				 * si encuentra un valor con un valor menor, entonces ahora posicionConElMenor
				 * cambia a esa nueva posicion
				 */
				if (arreglo[j] < arreglo[posicionConElMenor]) {
					posicionConElMenor = j;
				}
			}
			/*
			 * si la posicionConElMenor no es la misma, entonces pone pone al valor menor en
			 * la "primera" posicion
			 */
			if (i != posicionConElMenor) {
				int aux = arreglo[i];
				arreglo[i] = arreglo[posicionConElMenor];
				arreglo[posicionConElMenor] = aux;

			}
		}

		// imprime el arreglo ordenado
		for (int z : arreglo) {
			System.out.println(z);
		}

	}

}
