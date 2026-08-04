import javax.swing.*;

public class Ejercicio3{
    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos numeros va a ingresar"));

        int [] numeros = new int [num];

        for(int i = 0; i < num; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for(int i = 0; i < num; i++){

            if(numeros[i] > mayor){
                mayor = numeros[i];
            }

            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
    }

}
