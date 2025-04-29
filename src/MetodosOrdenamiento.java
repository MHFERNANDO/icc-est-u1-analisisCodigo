import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado:
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;//Retornaba un arreglo vacio por lo que daba error
    }

    // Método de burbuja tradicional con errores
    // Error encontrado:

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] < arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado:
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {//Inicializamos el valor de j al tradicional j=i+1
                if (arreglo[j] > arreglo[i]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = temp;//Cambio a la variable i, no a la j, iniciamos valor en j, porque no es el mejorado, es el tradicional.
                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado:
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if (indiceMinimo != i) {//No habia condicionante de cambio, es decir cambiaba aunque el indice no cambiara
                // Intercambio de elementos
                int temp = arreglo[i];
                arreglo[i] = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = temp;
            }
            
        }
        return arreglo;//No retornaba ningun arreglo por lo que daba error

    }

    // Método de selección con errores
    // Error encontrado:
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length-1; i++) {//Restar el valor de 1 al arreglo.length
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {//Tenemos que sumar j, no restarlo.
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            if (indiceMinimo != i) {//No habia condicionante de cambio, es decir cambiaba aunque el indice no cambiara
                int temp = arreglo[i];
                arreglo[i] = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = temp;
            }

            
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado:
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if (indiceMinimo != i) {//No habia condicionante de cambio, es decir cambiaba aunque el indice no cambiara, comparar a que sea diferente            
                int temp = arreglo[indiceMinimo];//Cambiamos el valor de indiceMinimo por el de i, no al reves
                arreglo[indiceMinimo] = arreglo[i];
                arreglo[i] = temp;
            }

            
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] < key) {//tiene que ser mientras i sea mayor o igual a 0 y el arreglo sea menor que key
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];

            int i = j - 1;
            while( i >= 0 && arreglo[i] > actual) {//Tiene que ser un while, no se trabaja con un For, se trabaja con la i no con la j
                arreglo[i + 1] = arreglo[i];
                i--;//Se debe restar el valor de i, no mantenerlo estatico
            }
            arreglo[i + 1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j;

            while (i > 0 && arreglo[i] < key) {
                arreglo[i + 1] = arreglo[i];
                i++;
            }
            arreglo[i + 1] = key;
        }
        return new int[] { 15, 34, 1, 2, 5, 6, 7, 10 };
    }

}
