import hsa.Console;

public class Desempenio47
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int x = 1;
	int n = 1;
	int n2 = 1;
	c.print ("ingrese un numero: ");
	n = c.readInt ();
	c.print ("ingrese un numero: ");
	n2=c.readInt();
	while (x <= n&& n<=n2)

	    {
		c.print (x + " ");
		x = x + 1;
	    }


    }
}
