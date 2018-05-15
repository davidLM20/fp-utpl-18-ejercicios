cont=1
lim=4
cadena= "%s\t%s\t%s\t%s\t%s\n" %("Nombre","nota1","nota2","nota3","promedio")
while( cont <= lim):
	nombre=input("Ingrese el nombre del estudiante\n")
	nota1=float(input("ingrese la primera nota\n"))
	nota2=float(input("ingrese la segunda nota\n"))
	nota3=float(input("ingrese la tercera nota\n"))

	#se calcula el promedio
	prom = float(nota1 + nota2 + nota3) / 3
	cadena = "%s%s\t%.2f\t%.2f\t%.2f\t%.2f\n" % (cadena, nombre, nota1, nota2, nota3, prom)
	cont = cont + 1
print("Reportes de notas")
print(cadena)