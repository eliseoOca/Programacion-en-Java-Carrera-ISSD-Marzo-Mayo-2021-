import hsa.Console;

public class Prueba
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int edad;

	c.println ("Ingrese edad:");
	edad = c.readInt ();
	if (edad >= 18)
	{
	    c.println ("es mayor de edad");
	}
	else
	{
	    c.print ("es menor de edad");
	}

    }
}
