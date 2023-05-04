import hsa.Console;

public class Practica1
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int num;
	c.print ("ingrese un numero del 0 al 99:");
	num = c.readInt ();
	if (num <= 9)
	{
	    c.print ("numero de un digito");
	}
	if (num >= 10)
	{
	    c.print ("el numero tiene dos digitos ");
	}
    }
}
