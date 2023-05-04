//Ingresá un número, e imprimí todos sus
//múltiplos inferiores a 800.
import java.awt.*;
import hsa.Console;

public class EstrucutraDo6
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int n, i = 0;
	c = new Console ();

	c.print ("Ingrese un numero: ");
	n = c.readInt ();
	c.println ();

	do
	{
	    if (i % n == 0)
	    {
		c.print (i + " - ");
	    }
	    i++;
	}
	while (i <= 800);
    }
}
