import hsa.Console;

public class Practica6
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int num1, num2, num3;
	c.print ("ingrese primer numero:");
	num1 = c.readInt ();
	c.print ("ingrese segundo numero:");
	num2 = c.readInt ();
	c.print ("ngrese tercer numero:");
	num3 = c.readInt ();
	if (num1 == num2 && num2 == num3)
	{
	    c.println ("todos los numeros son iguales");
	}
	else
	{
	    c.println ("no todos los numeros son iguales ");
	}


    }
}
