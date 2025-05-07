class metodosOrdenamiento:
    def sortByBubble(self,arreglo):
        arreglo = arreglo.copy()
        n = len(arreglo)
        for i in range(n):
            for j in range(i+1, n):
                if arreglo[i] > arreglo[j]:
                    aux = arreglo[i]
                    arreglo[i] = arreglo[j]
                    arreglo[j] = aux
                    #arreglo[i], arreglo[j] = arreglo[j], arreglo[i]
        return arreglo
    
    
    def sortBySelection(self,arreglo):
        arreglo = arreglo.copy()
        n = len(arreglo)
        for i in range(n-1):
            min_index = i
            for j in range(i+1, n):
                if arreglo[j] < arreglo[min_index]:
                    min_index = j
                if min_index != i:
                    aux = arreglo[i]
                    arreglo[i] = arreglo[min_index]
                    arreglo[min_index] = aux
        return arreglo
    
metodos = metodosOrdenamiento()
        