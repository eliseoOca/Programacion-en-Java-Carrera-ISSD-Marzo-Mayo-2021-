import hsa.Console;

public class Practica15
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int sueldo1, sueldo2, sueldo3, sueldo4;
	c.println ("Nivel pobreza por debajo de $17000");
	c.print ("ingrese sueldo trabajador1:");
	sueldo1 = c.readInt ();
	c.print ("Ingrese sueldo trabajador2:");
	sueldo2 = c.readInt ();
	c.print ("Ingrese sueldo trabajador3:");
	sueldo3 = c.readInt ();
	c.print ("Ingrese sueldo trabajador4:");
	sueldo4 = c.readInt ();
	if (sueldo1 >= 17001)
	{
	    c.println ("no esta en el nivel de pobreza");
	}

	if (sueldo1 <= 17000)
	{
	    c.println ("esta en nivel de pobreza");
	}

	if (sueldo2 >= 17001)
	{
	    c.println ("no esta en el nivel de pobreza");
	}

	if (sueldo2 <= 17000)
	{
	    c.println ("esta en nivel de pobreza");
	}

	if (sueldo3 >= 17001)
	{
	    c.println ("no esta en el nivel de pobreza");
	}

	if (sueldo3 <= 17000)
	{
	    c.println ("esta en nivel de pobreza");
	}

	if (sueldo4 >= 17001)
	{
	    c.println ("no esta en el nivel de pobreza");
	}

	if (sueldo4 <= 17000)
	{
	    c.println ("esta a nivel de pobreza");
	}


    }
}
