import hsa.Console;
class Ejemplo9
{
 static Console c;
 public static void main (String arg [])
 {
 int dia, mes;
 c = new Console ();
 c.print ("Ingrese día: ");
 dia = c.readInt ();
 c.print ("Ingrese mes: ");
 mes = c.readInt ();

 c.println ();
 if (dia == 25 && mes == 12)
 {
 c.println("La Fecha corresponde a Navidad");
 }
 else
 {
 c.println("La Fecha no corresponde a Navidad");
  }
 }
}
