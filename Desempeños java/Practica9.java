import hsa.Console;

public class Practica9
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	float altura;
	c.print ("ingresa altura de una persona:");
	altura = c.readFloat ();
	if (altura < 1.60)
	{
	    c.print ("es una persona baja");
	}
	else

	    if (altura >= 1.60 && altura <= 1.75)

		{
		    c.print ("es una persona normal");
		}
	    else
		if (altura > 1.75)
		{
		    c.print ("es una persona alta");
		}

    }
}


