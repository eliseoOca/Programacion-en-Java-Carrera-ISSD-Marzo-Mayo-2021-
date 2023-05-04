import hsa.Console;
class Ejemplo17
{
    static Console c;
    public static void main (String arg[])
    {
	int i;
	c = new Console ();
	i = 1;
	while (i <= 100)
	{
	    c.print (i + " ");
	    i = i + 1;
	}
    }
}
