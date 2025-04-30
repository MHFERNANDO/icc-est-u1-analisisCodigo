import time
import random
import metodosOrdenamiento
class Benchmarking:
    def __init__(self):
        print("Benchmarking inicializado")
        self.mOrdenamiento = metodosOrdenamiento.metodosOrdenamiento()
        arreglo = self.buildArreglo(10000)
        tarea=lambda: self.mOrdenamiento.sortByBubble(arreglo)
        tiempoMilles=self.contar_con_current_time_milles(tarea)#Self es el mismo
        tiempoNano=self.contar_con_nano_time(tarea)
        print(f"Tiempo en milisegundos: {tiempoMilles}")
        print(f"Tiempo en nanosegundos: {tiempoNano}")
        
        
        
        
        
    def buildArreglo(self, n):
        
        arreglo=[]
        for i in range(n):
            numero=random.randint(0,99999)
            arreglo.append(numero)
        return arreglo
    
    def contar_con_current_time_milles(self,tarea):
        
        start_time = time.time()
        tarea()
        end_time = time.time()
        return (end_time - start_time)
    def contar_con_nano_time(self,tarea):
        
        start_time = time.time_ns()
        tarea()
        end_time = time.time_ns()
        return (end_time - start_time) / 1000000000