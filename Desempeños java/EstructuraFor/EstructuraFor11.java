import hsa.Console;

public class EstructuraFor11
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int n;
	int lado1;
	int lado2;
	int lado3;
	int cont1 = 0;
	int cont2 = 0;
	int cont3 = 0;
	c.print ("Ingrese la cantidad de triangulos: ");
	n = c.readInt ();
	for (int i = 1 ; i <= n ; i++)
	{
	    c.print ("Ingrese lado1: ");
	    lado1 = c.readInt ();
	    c.print ("Ingrese lado2: ");
	    lado2 = c.readInt ();
	    c.print ("Ingrese lado3: ");
	    lado3 = c.readInt ();
	    if (lado1 == lado2 && lado1 == lado3)
	    {
		c.println ("Es un triangulo equilatero");
		cont1++;
	    }
	    else
		if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
		{
		    c.println ("Es un triangulo isosceles");
		    cont2++;
		}
		else
		    if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3)
		    {
			c.println ("Es un triangulo escaleno");
			cont3++;
		    }
	}


	c.println ("Cantidad de triangulos equilateros: " + cont1);
	c.println ("Cantidad de triangulos isosceles: " + cont2);
	c.println ("Cantidad de triangulos escalenos: " + cont3);
	if (cont1 < cont2 && cont1 < cont3)
	{
	    c.print ("Hay menor cantidad de triangulos equilateros");
	}
	else
	    if (cont2 < cont3)
	    {
		c.print ("Hay menor cantidad de triangulos isosceles");
	    }
	    else
	    {
		c.print ("Hay menor cantidad de triangulos escalenos");
	    }

    }
}


