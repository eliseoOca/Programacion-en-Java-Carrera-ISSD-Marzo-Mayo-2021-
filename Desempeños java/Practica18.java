import hsa.Console;

public class Practica18
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int angulo1, angulo2, angulo3;
	c.print ("angulo base es de 40:");
	angulo3 = c.readInt ();
	c.print ("ingrese segundo angulo:");
	angulo1 = c.readInt ();
	c.print ("ingrese tercer angulo:");
	angulo2 = c.readInt ();
	if (angulo1 == angulo2 && angulo1 == angulo3 && angulo2 == angulo3)
	{
	    c.print ("corresponde a un triangulo equilatero");
	}
	else
	    if (angulo1 == angulo2 && angulo1 != angulo3 && angulo2 != angulo3)
	    {
		c.print ("corresponde a un triandulo isosceles");
	    }
	    else
		if (angulo1 != angulo2 && angulo1 != angulo3 && angulo2 != angulo3)
		{
		    c.print ("corresponde al triangulo escaleno");
		}

    }
}
