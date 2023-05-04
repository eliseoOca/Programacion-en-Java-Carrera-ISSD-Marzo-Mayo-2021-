import hsa.Console;
class Desempeo37
{
    static Console c;
    public static void main (String arg[])
    {
	int i, a;
	c = new Console ();
	i = 1;
	a = 0;
	while (i <= 100)
	{
	    c.print (a + " ");
	    a = a + 1;
	    i = i + 1;
	}
    }
}
