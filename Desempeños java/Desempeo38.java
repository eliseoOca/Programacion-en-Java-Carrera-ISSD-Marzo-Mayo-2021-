import hsa.Console;
class Desempeo38
{
    static Console c;
    public static void main (String arg[])
    {
	float i, a, n, promedio;
	c = new Console ();
	i = 1;
	a = 0;
	while (i <= 7)
	{
	    c.print ("Ingrese un numero: ");
	    n = c.readFloat ();
	    a = a + n;
	    i = i + 1;
	}

	promedio = a / 7;
	c.println ("el promedio es:" + promedio);
	if (promedio >= 100)
	{
	    c.println ("el promedio es igual o mayor a 100");
	}
	else
	{
	    c.println ("elpromedio es menor a 100");
	}




    }
}
