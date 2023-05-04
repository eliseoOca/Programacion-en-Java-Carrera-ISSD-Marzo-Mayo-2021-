import hsa.Console;
class Ejemplo6
{
 static Console c;
 public static void main (String arg [])
 {
 float valor1, valor2, total, promedio;
c = new Console ();
 c.print ("Ingrese Primer Valor: ");
 valor1 = c.readFloat ();
 c.print ("Ingrese Segundo Valor: ");
 valor2 = c.readFloat ();
 total = valor1 + valor2;
 promedio = (valor1 + valor2) / 2;
 if (promedio > 10)
 {
 total = total - 2;
 }
 c.println ();
 c.println ("El monto total es: " + total);
 }
}
