import hsa.Console;

public class Practica14
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();

	int num1;
	c.print ("ingrese un numero con 1,2,3,4,5 cifras:");
	num1 = c.readInt ();
	if (num1 >= 1 && num1 <= 9)
	{
	    c.print ("numero con un digito");
	}
	else
	    if (num1 >= 10 && num1 <= 99)
	    {
		c.print ("numero con dos digitos");
	    }
	    else
		if (num1 >= 100 && num1 <= 999)
		{
		    c.print ("numero con tres digitos");
		}
		else
		    if (num1 >= 1000 && num1 <= 9999)
		    {
			c.print ("mumero con cuatro digitos");
		    }
		    else
			if (num1 >= 10000 && num1 <= 99999)
			{
			    c.print ("numero con cinco digitos");
			}
			else
			    if (num1 >= 100000)
			    {
				c.print ("numero mal ingresado");
			    }

    }
}
