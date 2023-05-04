import hsa.Console;
class Ejemplo14
{
    static Console c;
    public static void main (String arg[])
    {
	int mes;
	c = new Console ();
	c.print ("Ingrese un Numero: ");
	mes = c.readInt ();
	switch (mes)
	{
	    case 1:
		c.println ("Corresponde a Enero ");
		break;
	    case 2:
		c.println ("Corresponde a Febrero ");
		break;
	    case 3:
		c.println ("Corresponde a Marzo ");
		break;
	    case 4:
		c.println ("Corresponde a Abril ");
		break;
	    case 5:
		c.println ("Corresponde a Mayo ");
		break;
	    case 6:
		c.println ("Corresponde a Junio ");
		break;
	    case 7:
		c.println ("Corresponde a Julio");
		break;
	    case 8:
		c.println ("Corresponde a Agosto ");
		break;
	    case 9:
		c.println ("Corresponde a Septiembre ");
		break;
	    case 10:
		c.println ("Corresponde a Octubre ");
		break;
	    case 11:
		c.println ("Corresponde a Noviembre ");
		break;
	    case 12:
		c.println ("Corresponde a Diciembre ");
		break;
	    default:
		c.println ("No Corresponde a un mes valido ");
		break;
	}
    }
}
