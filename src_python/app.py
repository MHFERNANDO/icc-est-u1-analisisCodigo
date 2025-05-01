import Benchmarking as Be
import metodosOrdenamiento


if __name__=="__main__":
    print("Funciona")
    Be.Benchmarking()
    
    #Instancias
    metodos=metodosOrdenamiento.metodosOrdenamiento()
    benchmarking=Be.Benchmarking()
    
    n=10000
    arreglo = benchmarking.buildArreglo(n)
    
    #Diccionario de metodos
    metodos = {"Burbuja" : metodos.sortByBubble, "Seleccion": metodos.sortBySelection} 
    
    resultados = []
    
    
    for nombre, metodo in metodos.items():
        tiempo=benchmarking.medir_tiempo(metodo, arreglo)
        resultadosTupla=(n,nombre,tiempo)
        resultados.append(resultadosTupla)
        
    for resultado in resultados:
        tam,nombre,tiempo=resultado
        print(f"tamanio: {tam}, metodo: {nombre}, tiempo: {tiempo:.6f} segundos")