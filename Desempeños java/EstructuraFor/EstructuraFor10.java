import hsa.Console;

public class EstructuraFor10
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int num;
	int termino = 0;
	c.print ("ingrese numero: ");
	num = c.readInt ();
	for (int i = 1 ; i <= 30 ; i++)
	{
	    c.print (termino+"-");
	    termino = termino + num;
	}


    }
}
