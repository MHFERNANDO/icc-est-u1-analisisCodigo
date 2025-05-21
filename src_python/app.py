import Benchmarking as Be
import metodosOrdenamiento
import matplotlib.pyplot as plt


if __name__=="__main__":
    print("Funciona")
    Be.Benchmarking()
    
    #Instancias
    metodosI=metodosOrdenamiento.metodosOrdenamiento()
    benchmarking=Be.Benchmarking()
    
    nT=[500,1000,2000]

    
    #Diccionario de metodos
    tiemposByMetdo ={
       "Burbuja":[],
       "Seleccion":[]
     }
    
    
    for n in nT:
        
        arreglo = benchmarking.buildArreglo(n)
        metodos = {"Burbuja" : metodosI.sortByBubble, 
                   "Seleccion": metodosI.sortBySelection}
        for nombre, metodo in metodos.items():
            tiempo=benchmarking.medir_tiempo(metodo, arreglo)
            tiemposByMetdo[nombre].append((tiempo))
            print(f"tamanio: {n}, metodo: {nombre}, tiempo: {tiempo:.6f} segundos")
            
        
    plt.figure(figsize=(10, 6))
    
    #En y los tiempos y en x el tamaño del arreglo
    for nombre, tiempos in tiemposByMetdo.items():
        plt.plot(nT, tiempos, marker='o', label=nombre)
        
    plt.grid()
    
    plt.title("Fernando Martinez\n"
              "Tiempos de Ejecucion de Algoritmos de Ordenamiento")
    plt.xlabel("Tamaño del Arreglo")
    plt.ylabel("Tiempo (segundos)")
    plt.legend()
    plt.show()
    
    plt.get_current_fig_manager().set_window_title("Comparación de Métodos - Fernando Martínez-9:01")