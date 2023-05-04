import hsa.Console;

public class DesempenioDiez
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int num1;
	int num2;
	int suma;
	int diferencia;
	int producto;
	int division;

	c.print ("ingrese el primer num:");
	num1 = c.readInt ();
	c.print ("ingrese el segundo num:");
	num2 = c.readInt ();
	if (num1 > num2)

	    {
		suma = num1 + num2;
		diferencia = num1 - num2;
		c.println ("la suma es:" + suma);
		c.println ("la diferencia es:" + diferencia);
	    }
	else
	{
	    producto = num1 * num2;
	    division = num1 / num2;
	    c.println ("el producto es:" + producto);
	    c.println ("la division es:" + division);
	}
    }
}
