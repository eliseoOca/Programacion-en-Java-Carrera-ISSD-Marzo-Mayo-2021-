//Ingresar números y determinar si son pares
//o impares. El programa deberá terminar
//cuando se digite el número cero.
import hsa.Console;

public class EstrucutraDo1
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int n;
	do
	{


	    c.print ("Ingrese numeros :");
	    n = c.readInt ();
	    int suma = 0;
	    if (n % 2 == 0)

		c.println ("El numero es par");

	    else

		c.println ("El numero es impar");
	}
	while (n != 0);
	c.println ();
	c.println ("Fin de proceso");

    }
}

