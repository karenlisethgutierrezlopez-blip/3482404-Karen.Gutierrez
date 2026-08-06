import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {

        String resultado = "Temperaturas\n";
        int temperatura = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas temperaturas va a registrar?"));

        double temperaturas[] = new double[temperatura];

        for (int i = 0; i < temperatura; i++) {
            temperaturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura " + (i + 1)));
        }

        for (int i = 0; i < temperatura; i++) {

            if (temperaturas[i] < 10) {
                resultado += temperaturas[i] + " -> Frío\n";
            } else if (temperaturas[i] >= 10 && temperaturas[i] <= 25) {
                resultado += temperaturas[i] + " -> Templado\n";
            } else {
                resultado += temperaturas[i] + " -> Calor\n";
            }
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
