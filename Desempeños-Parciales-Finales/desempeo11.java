import hsa.Console;
class desempeo11 {
 static Console c;
 public static void main (String arg [])
 {
 int n1, n2;
 c = new Console ();
 c.print ("Ingresar largo de la habitacion: ");
 n1 = c.readInt ();
 c.print ("Ingresar ancho de la habitacion: ");
 n2 = c.readInt ();
 c.println ();
 if (n1 * n2 > 10)
 {
 c.println ("la habitacion es adecuada ");
 }
 else
 {
 c.println ("la habitacion es pequenia");
 }
 } }
