import hsa.Console;

public class EstructuraFor16
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int num1 = 0;
	int num2;
	int suma=0;
	int suma1=0;
	c.print ("Ingresar un numero: ");
	num1 = c.readInt ();
	c.print ("Ingresa el otro numero: ");
	num2 = c.readInt ();

	for (int i = num1 ; i <= num2; i++)
	{suma +=i;
	    
	    
	    c.print(suma+  "  ");
	    
	    
	}
	
       

    }
}
