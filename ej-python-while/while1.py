"""
    Ingreso de datos en Python
    Tomado de: https://pyformat.info/
"""


print("Estamos relizando una prueba para el ciclo while")

# Comentarios de una línea

contador = True

cadena = "%s\t%s\t%s\n" % ("Nombres", "Apellidos", "Edad")
while contador:
    nombre = input("Ingrese su nombre: \n")
    apellido = input("Ingrese su apellido: \n")
    edad = input("Ingrese su edad: \n")
    cadena = "%s%s\t%s\t\t%d\n" % (cadena, nombre, apellido, int(edad))
    
     #remplazo de contador
    salir=input("¿Desea salir?\n")
    if salir=="si":
    	contador= False
print(cadena)
