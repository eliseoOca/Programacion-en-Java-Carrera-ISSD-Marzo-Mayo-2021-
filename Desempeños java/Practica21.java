import hsa.Console;

public class Practica21
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int x = 1;
	float a = 0;
	float valor,promedio;
	while (x <= 7)
	{
	    c.print ("ingrese valor:");
	    valor = c.readFloat ();
	    a = a + valor;
	    x = x + 1;
	}
	promedio = a / 7;
	if (promedio >= 100)
	{
	    c.println ("el promedio es mayor o igual a 100");
	    
	  c.println("el promedio es: "+promedio);
	}
	else
	    if (promedio < 100)
	    {
		c.println ("el promedio es menor a 100");
		c.println("el promedio es: "+promedio);
	    }


    }
}
