//Escribir un programa para calcular el
//promedio de un alumno, que solicite la
//carga de sus notas por teclado y que finalice
//cuando se ingrese el valor 99. (El valor 99,
//no debe ser tenido en cuenta para el cálculo)
import hsa.Console;

public class EstructuraDo2
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int cantidad = 0;
	int suma = 0;
	int n;
	float promedio = 0;

	do
	{
	    c.print ("Cargar notas(finalizar con 99): ");
	    n = c.readInt ();
	    if (n != 0)
		cantidad++;
	    suma = suma + cantidad;
	}
	while (n != 99);
	c.println ();
	if (cantidad != 0)
	{
	    promedio = (float) suma / cantidad;
	    c.println ("El promedio es: " + promedio);
	}
	else
	{
	    c.println ("no se ingresaron notas");
	}



    }
}


