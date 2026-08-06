import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args){
        int temperatura;

        temperatura = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas temperaturas va a registrar?"));

        double temperaturas[] = new double[temperatura];

        for (int i = 0; i < temperatura; i++) {
            temperaturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura " + (i + 1)));
        }

            for (int i = 0; i < temperatura; i++) {

                if (temperaturas[i] < 10) {
                    JOptionPane.showMessageDialog(null, "Temperatura: " + temperaturas[i] + "°C -> Frío");
                } else if (temperaturas[i] <= 25) {
                    JOptionPane.showMessageDialog(null, "Temperatura: " + temperaturas[i] + "°C -> Templado");
                } else {
                    JOptionPane.showMessageDialog(null, "Temperatura: " + temperaturas[i] + "°C -> Calor");

            }
        }
    }
}
