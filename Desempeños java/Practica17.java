import hsa.Console;

public class Practica17
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int num1, num2, num3, num4;
	c.print ("ingresa numero1:");
	num1 = c.readInt ();
	c.print ("ingresa numero2:");
	num2 = c.readInt ();
	c.print ("ingresa numero3:");
	num3 = c.readInt ();
	c.print ("ingresa numero4:");
	num4 = c.readInt ();
	if (num1 > num2 && num1 > num3 && num1 > num4)
	{
	    c.print ("numero1 es mayor");
	}
	else
	    if (num2 > num1 && num2 > num3 && num2 > num4)
	    {
		c.print ("numero2 es mayor");
	    }
	    else
		if (num3 > num1 && num3 > num2 && num3 > num4)
		{
		    c.print ("numero3 es mayor");
		}
		else
		    if (num4 > num1 && num4 > num2 && num4 > num3)
		    {
			c.print ("numero4 es mayor");
		    }


    }
}
