
import matplotlib.pyplot as plt

x=[1,2,3,4,5]
y=[1,4,9,16,25]
plt.plot(x,y, label='Linea 1', color="blue")
#Agregar parametros
plt.title("Primera Grafica")
plt.xlabel("Eje X")
plt.ylabel("Eje Y")
    
plt.legend()#Necesario para mostrar la leyenda
plt.show()
    