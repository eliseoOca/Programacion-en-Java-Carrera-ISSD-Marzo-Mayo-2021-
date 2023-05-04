import hsa.Console;

public class Desempenio46
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int x = 1;
	int impar = 0;
	int suma = 1;

	while (x <= 99)
	{


	    c.print (x + " ");
	    x = x + 2;
	    ;
	    suma=suma+x;
	    c.print("la suma es : "+suma);




	}



    }
}
