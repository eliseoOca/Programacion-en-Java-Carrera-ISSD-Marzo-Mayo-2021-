import hsa.Console;

public class Practica2
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int num1, num2, total;
	c.print ("ingrese primer numero:");
	num1 = c.readInt ();
	c.print ("ingrese segundo numero:");
	num2 = c.readInt ();
	if (num1 > num2)
	{

	    c.println ("la suma es: " + (num1 + num2));
	    c.println ("la resta es: " + (num1 - num2));
	}
	else
	{
	    if (num2 > num1)
	    {
		c.println ("la division es: " + num2 / num1);
		c.println ("la multiplicacion es:" + num2 * num1);
	    }
	}
    }
}


