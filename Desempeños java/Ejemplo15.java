import hsa.Console;
class Ejemplo15
{
    static Console c;
    public static void main (String arg[])

{
    float basico; // Sueldo Basico
    float incremento, sueldo;
    int categoria;
    c = new Console ();
    c.print ("Ingrese Sueldo Basico: ");
    basico = c.readFloat ();
    c.print ("Ingrese Categoria: ");
    categoria = c.readInt ();
    switch (categoria)
    {
	case 1:
	    incremento = basico * 20
		/ 100;
	    break;
	case 2:
	    incremento = basico * 10
		/ 100;
	    break;
	case 3:
	    incremento = basico * 15
		/ 100;
	    break;
	case 4:
	    incremento = basico * 5
		/ 100;
	    break;
	default:
	    incremento = 0;
	    break;
    }


    sueldo = basico + incremento;
    c.println ("El sueldo a cobrar es: " +
	    sueldo);
}
}

