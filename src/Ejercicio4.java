import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args){
        int temperatura;

        temperatura = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas temperaturas va a registrar?"));

        double temperaturas[] = new double[temperatura];

        for (int i = 0; i < temperatura; i++) {
            temperaturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura " + (i + 1)));
        }
    }
}
