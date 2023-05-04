import hsa.Console;

public class EstructuraFor14
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int edad;
	int suma1 = 0;
	int suma2 = 0;
	int suma3 = 0;
	int pro1;
	int pro2;
	int pro3;
	for (int i = 1 ; i <= 5 ; i++)
	{
	    c.print ("Ingrese edad: ");
	    edad = c.readInt ();
	    suma1 = suma1 + edad;
	}
	pro1 = suma1 / 5;
	c.println ("Promedio de edades del turno manana: " + pro1);
	for (int i = 1 ; i <= 6;i++)
	{
	    c.println ("Ingrese edad: ");
	    edad = c.readInt ();
		suma2 = suma2 + edad;
	}
	pro2 = suma2 / 6;
	c.println ("Promedio de edades del turno tarde: " + pro2);
	for (int i = 1 ; i <= 10 ; i++)
	{
	    c.print ("Ingrese edad: ");
	    edad = c.readInt ();
	    suma3 = suma3 + edad;
	}
	pro3 = suma3 / 10;
	c.println ("Promedio de edades del turno noche: " + pro3);
	if (pro1 < pro2 && pro1 < pro3)
	{
	    c.print ("El turno manana tiene promedio menor de edades");
	}
	else
	    if (pro2 < pro3)
	    {
		c.print ("El turno tarde tiene promedio menor de edades");
	    }
	    else
	    {
		c.print ("El turno noche tiene promedio menor de edades");
	    }


    }
}
