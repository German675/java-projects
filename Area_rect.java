// Este Programa Muestra El Area de un Rectangulo
import javax.swing.JOptionPane;
class Area_rect
{
public static void main (String args [])
{
JOptionPane.showMessageDialog(null,"AREA DE UN RECTANGULO.");
{
String a1,b2;
Double num1,num2,res;
a1=JOptionPane.showInputDialog("DAME LA BASE");
b2=JOptionPane.showInputDialog("DAME LA ALTURA");
num1=Double.parseDouble(a1);
num2=Double.parseDouble(b2);
res=num1*num2;
JOptionPane.showMessageDialog(null," EL AREA \n DEL \n RECTANGULO ES:\n "+num1+"*"+num2+" ES - "+res);
JOptionPane.showMessageDialog(null," ESTE PROGRAMA FUE ELABORADO POR EL PROGRAMADOR; \n GERMAN MENDEZ");
System.out.println("Fin Del Programa");
}
}
}