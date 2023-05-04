import hsa.Console;

public class Practica8
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int num1, num2, num3;
	c.print ("ingresa primer numero:");
	num1 = c.readInt ();
	c.print ("ingresa segundo numero:");
	num2 = c.readInt ();
	c.print ("ingresa tercer numero:");
	num3 = c.readInt ();
	if (num1 < 10 && num2 < 10)
	{
	    c.print ("algun numero es menor a 10");
	}
	else
	
	    if (num3 < 10)
		
	    {
		c.print ("algun numero es menor a 10");
	    }
	    else
	    {
		c.print ("ninguno de los numeros es menor a 10");
	    }
	}
    }


