///Ingresá las 20 notas de un curso y determiná
//su promedio. Imprimí lo siguiente:
//a | Si el promedio del curso es inferior a 5,
//mostrar: "Curso Deficiente".
//b | Si el promedio está entre 5 y 7, mostrar:
//"Curso Satisfactorio".
//c | Si el promedio es mayor a 7, mostrar:
//"Curso muy Bueno"
import hsa.Console;

public class EstructuraFor18
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int notas = 0;
	int suma = 0;
	int prom = 0;
	for (int x = 1 ; x <= 20 ; x++)
	{
	    c.print ("ingrese notas: ");
	    notas = c.readInt ();
	    suma = suma + notas;
	}
	prom = suma / 20;
	c.println ("Promedio de las notas: " + prom);

	if (prom < 5)
	{
	    c.print ("Curso deficiente");
	}
	if (prom >= 5 && prom <= 7)
	{
	    c.print ("Curso satisfactorio");
	}
	if (prom > 7)
	{
	    c.print ("Curso muy bueno");
	}



    }
}


