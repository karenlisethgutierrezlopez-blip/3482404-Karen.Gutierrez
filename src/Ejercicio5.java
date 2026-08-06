import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args){

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros que va a ingresar"));
        int[] numeros = new int[num];

        for(int i = 0; i < num; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));

        }
        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea encontrar"));
        boolean encontrado = false;
        String resultado = "";

        for(int i = 0; i < num; i++){

            if(numeros[i] == buscar){
                encontrado = true;
                resultado += "El número " + buscar + " se encontró en la posición  " + i + "\n";
            }
        }
        if(encontrado == false){
            JOptionPane.showMessageDialog(null, "El numero no fue encontrado");
        }
    }
}

