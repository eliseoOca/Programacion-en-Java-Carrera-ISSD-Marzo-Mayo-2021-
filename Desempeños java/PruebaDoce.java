import hsa.Console;

public class PruebaDoce
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int edad;
	c.print ("ingrese edad:");
	edad = c.readInt ();

	if (edad < 12)
	{
	    c.print ("nino");
	}
	if (edad >= 12 && edad <= 21)
	{
	    c.print ("joven");
	}
	if (edad > 21)
	{
	    c.print ("adulto");
	}

    }
}
