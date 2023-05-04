import hsa.Console;
class Ejemplo10
{
 static Console c;
 public static void main (String arg [])
 {
 int edad;
 c = new Console ();
 c.print ("Ingrese la edad: ");
 edad = c.readInt ();
 c.println ();
 if (edad < 12)
 {
 c.println ("Es un Niño");
 }
 if (edad >= 12 && edad <= 21 )
 {
 c.println ("Es un Joven");
 }
 if (edad > 21)
 {
 c.println ("Es un Adulto");
 }
 }
}
