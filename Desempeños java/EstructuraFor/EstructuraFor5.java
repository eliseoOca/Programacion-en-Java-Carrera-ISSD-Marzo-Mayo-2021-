import java.awt.*;
import hsa.Console;

public class EstructuraFor5
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int mayores =0;
	int suma = 0;
	int n;
	int monto;
	c.print ("ingresa cantidad de ventas: ");
	n = c.readInt ();
	c.println ();

	for (int i = 1 ; i <= n ; i++)
	{
	    c.print ("ingresa monto de ventas: ");
	    monto = c.readInt ();
	    if (monto > 1000)
	    {
		mayores++;
		    suma = suma + monto;
	    }
	}
	 c.println ();
    c.println ("las ventas mayores a $1000:  " + mayores);
    c.println ("la suma de todas las ventas: " + suma);

    }


   

}
