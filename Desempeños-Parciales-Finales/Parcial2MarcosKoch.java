import hsa.Console;
import java.awt.*;
class Parcial2MarcosKoch
{
    static Console c;
    int codigo[];
    String descripcion[];
    int genero[];
    int qUnidades[];
    int qReservados[];
    int n;


    Parcial2MarcosKoch ()
    {
	c.print ("Ingrese cantidad de libros a cargar: ");
	n = c.readInt ();
	codigo = new int [n];
	descripcion = new String [n];
	genero = new int [n];
	qUnidades = new int [n];
	qReservados = new int [n];
    }


    void cargarDatos ()
    {

	c.setCursor (2, 20);
	c.print ("LISTADO DE LIBROS LIBRERIA CORDOBA");
	c.setCursor (3, 20);
	c.print ("----------------------------------");
	c.setCursor (5, 10);
	c.print ("Cod Libro");
	c.setCursor (5, 20);
	c.print ("Descripcion");
	c.setCursor (5, 40);
	c.print ("Genero");
	c.setCursor (5, 50);
	c.print ("Unidades");
	c.setCursor (5, 60);
	c.print ("Reservados");
	int fila = 7;

	for (int i = 0 ; i < n ; i++)
	{
	    c.setCursor (fila, 10);
	    codigo [i] = c.readInt ();
	    c.setCursor (fila, 20);
	    descripcion [i] = c.readLine ();
	    c.setCursor (fila, 40);
	    genero [i] = c.readInt ();
	    c.setCursor (fila, 50);
	    qUnidades [i] = c.readInt ();
	    c.setCursor (fila, 60);
	    qReservados [i] = c.readInt ();
	    fila++;
	}
	c.setCursor ((fila + 1), 25);
	c.setTextColor (Color.red);
	c.print ("Presione [Enter] para volver al Menu ");
	c.readChar ();
	c.setTextColor (Color.black);
    }


    void ordenarPorDescripcion ()
    {
	String auxD;
	int auxC, auxG, auxU, auxR;
	for (int k = 1 ; k < descripcion.length ; k++)
	{
	    for (int i = 0 ; i < (descripcion.length - k) ; i++)
	    {
		if (descripcion [i].compareTo (descripcion [i + 1]) > 0)
		{
		    auxD = descripcion [i];
		    descripcion [i] = descripcion [i + 1];
		    descripcion [i + 1] = auxD;

		    auxC = codigo [i];
		    codigo [i] = codigo [i + 1];
		    codigo [i + 1] = auxC;

		    auxG = genero [i];
		    genero [i] = genero [i + 1];
		    genero [i + 1] = auxG;

		    auxU = qUnidades [i];
		    qUnidades [i] = qUnidades [i + 1];
		    qUnidades [i + 1] = auxU;

		    auxR = qReservados [i];
		    qReservados [i] = qReservados [i + 1];
		    qReservados [i + 1] = auxR;
		}
	    }
	}
    }


    void imprimirPorDescripcion ()
    {
	c.setCursor (2, 20);
	c.print ("LISTADO DE LIBROS LIBRERIA CORDOBA ORDENADOS POR DESCRIPCION");
	c.setCursor (3, 20);
	c.print ("------------------------------------------------------------");
	c.setCursor (5, 10);
	c.print ("Codigo Libro");
	c.setCursor (5, 20);
	c.print ("Descripcion");
	c.setCursor (5, 40);
	c.print ("Genero");
	c.setCursor (5, 50);
	c.print ("Cant Unidades");
	c.setCursor (5, 60);
	c.print ("Cant Reservados");
	int fila = 7;

	for (int i = 0 ; i < n ; i++)
	{
	    c.setCursor (fila, 10);
	    c.print (codigo [i]);
	    c.setCursor (fila, 20);
	    c.print (descripcion [i]);
	    c.setCursor (fila, 40);
	    c.print (genero [i]);
	    c.setCursor (fila, 50);
	    c.print (qUnidades [i]);
	    c.setCursor (fila, 60);
	    c.print (qReservados [i]);
	    fila++;
	}
	c.setCursor ((fila + 1), 25);
	c.setTextColor (Color.red);
	c.print ("Presione [Enter] para volver al Menu ");
	c.readChar ();
	c.setTextColor (Color.black);
    }


    void consultaPorDescripcion ()
    {
	String des;
	char op;
	do
	{
	    c.clear ();
	    c.setCursor (2, 20);
	    c.print ("CONSULTA POR DESCRIPCION");
	    c.setCursor (3, 20);
	    c.print ("------------------------");
	    c.setCursor (4, 20);
	    c.print ("Ingrese la descripcion que desea buscar: ");
	    des = c.readLine ();
	    c.setCursor (5, 10);
	    c.print ("Codigo Libro");
	    c.setCursor (5, 20);
	    c.print ("Descripcion");
	    c.setCursor (5, 40);
	    c.print ("Genero");
	    c.setCursor (5, 50);
	    c.print ("Cant Unidades");
	    c.setCursor (5, 60);
	    c.print ("Cant Reservados");
	    int fila = 7;
	    int p = -1;

	    for (int i = 0 ; i < descripcion.length ; i++)
	    {
		if (des.equalsIgnoreCase (descripcion [i]))
		{
		    p = i;

		    c.setCursor (fila, 10);
		    c.print (codigo [p]);
		    c.setCursor (fila, 20);
		    c.print (descripcion [p]);
		    c.setCursor (fila, 40);
		    c.print (genero [p]);
		    c.setCursor (fila, 50);
		    c.print (qUnidades [p]);
		    c.setCursor (fila, 60);
		    c.print (qReservados [p]);
		    fila++;
		}
	    }
	    if (p == -1)
	    {
		c.setCursor (fila, 25);
		c.print ("NO HAY LIBROS CON LA DESCRIPCION BUSCADA");
	    }
	    c.setCursor ((fila + 1), 25);
	    c.setTextColor (Color.red);
	    c.print ("Desea realizar otra busqueda? (s/n) ");
	    op = c.readChar ();
	    c.setTextColor (Color.black);
	}
	while (op == 's' || op == 'S');
    }


    void totalLibrosReservados ()
    {
	int suma = 0;
	for (int i = 0 ; i < qReservados.length ; i++)
	{
	    suma = suma + qReservados [i];
	}

	c.clear ();
	c.setCursor (2, 20);
	c.print ("CONSULTA DE RESERVAS");
	c.setCursor (3, 20);
	c.print ("--------------------");
	c.setCursor (5, 20);
	c.print ("La libreria tiene un total de [" + suma + "] libros reservados");

	c.setCursor (7, 20);
	c.setTextColor (Color.red);
	c.print ("Pulse [Enter] para volver al Menu ");
	c.readChar ();
	c.setTextColor (Color.black);
    }


    void generoMasReservado ()
    {
	//1 AVENTURA - 2 FICCION - 3 INFANTIL
	int suma1 = 0, suma2 = 0, suma3 = 0;
	
	c.clear ();
	c.setCursor (2, 20);
	c.print ("CONSULTA GENERO MAS RESERVADO");
	c.setCursor (3, 20);
	c.print ("-----------------------------");
	
	for (int i = 0 ; i < qReservados.length ; i++)
	{
	    if (genero [i] == 1)
	    {
		suma1 = suma1 + qReservados [i];
	    }
	    if (genero [i] == 2)
	    {
		suma2 = suma2 + qReservados [i];
	    }
	    if (genero [i] == 3)
	    {
		suma3 = suma3 + qReservados [i];
	    }
	}
	if (suma1 > suma2 && suma1 > suma3)
	{
	    c.setCursor (5, 20);
	    c.print ("El genero mas reservado es 1-AVENTURA con [" + suma1 + "] reservas");
	}
	else
	{
	    if (suma2 > suma3)
	    {
	    c.setCursor (5, 20);    
	    c.print ("El genero mas reservado es 2-FICCION con [" + suma2 + "] reservas");
	    }
	    else
	    {
	    c.setCursor (5, 20);
	    c.print ("El genero mas reservado es 3-INFANTIL con [" + suma3 + "] reservas");
	    }
	}
	
	c.setCursor (7, 20);
	c.setTextColor (Color.red);
	c.print ("Pulse [Enter] para volver al Menu ");
	c.readChar ();
	c.setTextColor (Color.black);

    }


    public static void main (String arg[])
    {
	c = new Console ();
	c.setTextBackgroundColor (Color.orange);
	Parcial2MarcosKoch e = new Parcial2MarcosKoch ();
	int m;
	do
	{
	    c.clear ();
	    c.setTextBackgroundColor (Color.orange);
	    c.setCursor (2, 20);
	    c.print ("MENU DE OPCIONES");
	    c.setCursor (3, 20);
	    c.print ("----------------");
	    c.setCursor (5, 15);
	    c.print ("1 - Carga datos de cada libro");
	    c.setCursor (7, 15);
	    c.print ("2 - Ver Listado ordenado por DESCRIPCION");
	    c.setCursor (9, 15);
	    c.print ("3 - Consulta por DESCRIPCION");
	    c.setCursor (11, 15);
	    c.print ("4 - Cantidad total de libros reservados");
	    c.setCursor (13, 15);
	    c.print ("5 - Mostrar genero con mayor reserva");
	    c.setCursor (15, 15);
	    c.print ("6 - Finalizar Programa");
	    c.setCursor (20, 15);
	    c.print ("Elija una opcion del menu: ");
	    m = c.readInt ();

	    switch (m)
	    {
		case 1:
		    c.clear ();
		    e.cargarDatos ();
		    break;

		case 2:
		    c.clear ();
		    e.ordenarPorDescripcion ();
		    e.imprimirPorDescripcion ();
		    break;

		case 3:
		    c.clear ();
		    e.consultaPorDescripcion ();
		    break;

		case 4:
		    c.clear ();
		    e.totalLibrosReservados ();
		    break;

		case 5:
		    c.clear ();
		    e.generoMasReservado ();
		    break;

		case 6:
		    System.exit (0);


		default:
		    c.println ("NO CORRESPONDE A UNA OPCION DEL MENU");

	    }
	}


	while (m != 6);
	System.exit (0);
    }
}
