import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        double acumulador= 0;
        double promedio;
        int numestudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes"));
        double [] notas = new double[numestudiantes];

        for (int i = 0; i < numestudiantes; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las nota"));

            acumulador += notas[i];
        }

        promedio = acumulador / numestudiantes;

        if (promedio >= 3.0) {
            JOptionPane.showMessageDialog(null, "El promedio es " +promedio + "\n Estado: Aprobado");
        }else {
            JOptionPane.showMessageDialog(null, "El promedio es " +promedio + "\n Estado: Reprobado");
        }
    }
}