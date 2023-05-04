import hsa.Console;

public class Practica3
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int largo, ancho, superficie;
	c.print ("ingrese el ancho del 1 al 10:");
	ancho = c.readInt ();
	c.print ("ingrese el largo del 1 al 10:");
	largo = c.readInt ();
	superficie = ancho * largo;
       
	if (superficie > 10)
	{

	    c.println ("habitacion adecuada:");
	}
	else
	{
	    if (superficie <= 10)
	    {

		c.println ("habitacion pequenia:");
	    }
	}
    }
}
