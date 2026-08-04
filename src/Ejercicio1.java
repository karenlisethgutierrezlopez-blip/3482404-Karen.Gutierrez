import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        int pares = 0;
        int impares = 0;

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de numeros que ingresara"));
        int [] numeros = new int [num];

        for (int i = 0; i < num; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los numeros que ingresara"));



        }
        JOptionPane.showMessageDialog(null, "Hay " +pares+" pares\n Hay " +impares+" impares");
    }
}
