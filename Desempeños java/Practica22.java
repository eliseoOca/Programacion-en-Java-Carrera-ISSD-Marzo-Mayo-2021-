import hsa.Console;

public class Practica22
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int x = 1;
	int par = 0;
	int impar = 0;
	int cero = 0;
	int n;
	while (x <= 15)
	{
	    c.print ("ingrese numero: ");
	    n =c.readInt ();
	    if (n % 2 == 0)
	    {
		par++;
	    }
	    else
	    {
		impar++;
	    }
	    if (n % 10 == 0)
	    {
		cero++;
	    }
	x=x+1;}
	c.println("cantidad de pares: "+par);
	c.println("cantidad de impares: "+impar);
	c.println("cantidad de ceros: "+cero);



    }
}
