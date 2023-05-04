import hsa.Console;

public class Practica7
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	float sueldo, anio;
	c.print ("ingrese sueldo:");
	sueldo = c.readFloat ();
	c.print ("ingrese anio de antiguedad:");
	anio = c.readFloat ();
	if (sueldo < 4500 && anio > 10)
	{
	    sueldo = sueldo * (float) 1.1;
	    c.print ("aumento del %10:" + sueldo);
	}
	else
	{
	    if (sueldo < 4500 && anio < 10)
		;
	}


	{
	    sueldo = sueldo * (float) 0.9;
	    c.print ("aumento del %5:" + sueldo);
	}

	{
	    if (sueldo >= 4500)
		;
	}
	{
	    c.print ("no tienen aumento");
	}
    }
}


