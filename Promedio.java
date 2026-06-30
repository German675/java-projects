// El Presente Programa Muestra El Nombre y Promedio de 4 Calificaciones
import javax.swing.JOptionPane;
class Promedio
{
public static void main (String args [])
{
JOptionPane.showMessageDialog(null,"NOMBRE \n Y \n PROMEDIO \n DE 4 CALIFICACIONES");
{
String n1,n2,n3,n4,nom;
Double num1,num2,num3,num4,promedio;
nom=JOptionPane.showInputDialog("INTRODUCE EL NOMBRE DEL ALUMNO");
n1=JOptionPane.showInputDialog("INGRESE LA CALIFICACION 1");
n2=JOptionPane.showInputDialog("INGRESE LA CALIFICACION 2");
n3=JOptionPane.showInputDialog("INGRESE LA CALIFICACION 3");
n4=JOptionPane.showInputDialog("INGRESE LA CALIFICACION 4");
num1=Double.parseDouble(n1);
num2=Double.parseDouble(n2);
num3=Double.parseDouble(n3);
num4=Double.parseDouble(n4);
promedio=((num1+num2+num3+num4)/4);
JOptionPane.showMessageDialog(null," EL NOMBRE \n Y PROMEDIO \n DEL ALUMNO ES: " +nom +promedio);
JOptionPane.showMessageDialog(null," ESTE PROGRAMA FUE PROGRAMADO POR EL PROGRAMADOR: \n GERMAN MENDEZ");
System.out.println(" FIN DEL PROGRAMA");
}
}
}