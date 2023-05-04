import hsa.Console;

public class EstructuraFor3
{
    static Console c;

    public static void main (String[] args)
    {
	int i, nota, mayores, entre, menores;
	c = new Console ();
	mayores = menores = entre = 0;
	for (i = 1 ; i <= 10 ; i++)
	{
	    c.print ("ingrese notas: ");
	    nota = c.readInt ();
	    if (nota > 7)
	    {
		mayores++;
	    }
	    else
		if (nota > 4 && nota < 7)
		{
		    entre++;
		}
		else
		    if (nota < 4)
		    {
			menores++;
		    }
	}

	c.println ();
	c.println ("cantidad de mayores a 7: " + mayores);
	c.println ("cantidad de entre 4 y 7: " + entre);
	c.println ("cantidad de menores a 4: " + menores);
    }
}
