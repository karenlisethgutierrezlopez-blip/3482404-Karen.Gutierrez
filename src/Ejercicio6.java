import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        int votos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos votos se van a registrar?"));

        String[] candidato = new String[votos];

        int A = 0;
        int B = 0;
        int C = 0;

        for (int i = 0; i < votos; i++) {
            candidato[i] = JOptionPane.showInputDialog("Ingrese el voto (A, B o C)").toUpperCase();
        }

        for (int i = 0; i < votos; i++) {

            if (candidato[i].equals("A")) {
                A++;
            } else if (candidato[i].equals("B")) {
                B++;
            } else if (candidato[i].equals("C")) {
                C++;
            }

        }

        JOptionPane.showMessageDialog(null,
                "Votos del candidato A: " + A +
                        "\nVotos del candidato B: " + B +
                        "\nVotos del candidato C: " + C);
    }
}