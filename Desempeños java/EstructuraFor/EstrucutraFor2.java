import hsa.Console;

public class EstrucutraFor2
{
    static Console c;


    public static void main (String[] args)
    {
	float suma = 0;
	float promedio;
	int i;
	float altura;

	c = new Console ();
	for (i = 1 ; i <= 8 ; i++)
	{
	    c.print ("ingresa altura: ");
	    altura = c.readFloat ();
	    suma = suma + altura;
	}
	promedio = suma / 8;
	c.print ("la altura romedio de todos es: " + promedio);

    }
}
