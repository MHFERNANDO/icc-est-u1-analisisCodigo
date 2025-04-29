public class Benchmarking {

    private MetodosOrdenamiento metodosOrdenamiento;


    public Benchmarking() {
        Long inicioMillis=System.currentTimeMillis();
        Long inicioNano=System.nanoTime();

        metodosOrdenamiento = new MetodosOrdenamiento();
        int[] arreglo=generarArregloAleatorio(9000000);
        Runnable tarea = () -> metodosOrdenamiento.burbujaTradicional(arreglo);


        double tiempoEjecucion = medirConNanoTime(tarea);
        double tiempoEjecucion2 = medirConCurrentTime(tarea);
        //System.out.println("Inicio Benchmarking en milisegundos: " + inicioMillis);
        //System.out.println("Inicio Benchmarking en nanosegundos: " + inicioNano);
        System.out.println("Tiempo de ejecución con nanoTime: " + tiempoEjecucion + " segundos");
        System.out.println("Tiempo de ejecución con currentTimeMillis: " + tiempoEjecucion2 + " segundos");
    }
    

    private int[] generarArregloAleatorio(int size) {
        int[] arreglo = new int[size];
        for (int i = 0; i < size; i++) {
            arreglo[i] = (int) (Math.random() * 999999); 
        }
        return arreglo;
    }


    public double medirConNanoTime(Runnable tarea){
        long inicio = System.nanoTime();
        tarea.run();
        long fin = System.nanoTime();
        return (fin - inicio) / 1_000_000_000.0; // Convertir a segundos
        
    }


    public double medirConCurrentTime(Runnable tarea){
        long inicio = System.currentTimeMillis();
        tarea.run();
        long fin = System.currentTimeMillis();
        return (fin - inicio) / 1000.0; // Convertir a segundos
    }
    
}
