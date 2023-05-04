//Ingresá un número, y mostrá la tabla de
//multiplicar de ese número.
import java.awt.*;
import hsa.Console;

public class EstructuraFor15
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int n;
	c.print ("Ingrese un numero: ");
	n = c.readInt ();
	c.println ("Tabla del " + n);
	for (int i = 1 ; i <= 10 ; i++)
	{
	    c.println (n + " * " + i + " = " + n * i);
	}


    }
}
