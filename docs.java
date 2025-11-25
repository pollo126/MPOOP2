/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2;

public class POO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo abreviado");
        System.out.println("########### if ########### ");
        int a = 5;
        int b = 3;
        if (a < b) {
            System.out.println("a es menor que b");

        } else if (a == b) {
            System.out.println("a es igual que b ");

        } else {
            System.out.println("a es mayor que b");
        }
        System.out.println("################# if else #########");
        if (menor(a, b)) {
            System.out.println("metodo retorna true");
        } else {
            System.out.println(" metodo retorna false");
        }
        System.out.println("########## switch######");
        int dia = 6;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("no existe tonoto");
        }
        System.out.println("######### while #########");
        int n = 0;
        while (n < 10) {
            System.out.println("Contando hacia arrina n=" + n);
            n++; //n=n+1;
        }
        System.out.println("");
        do {
            System.out.println("Contando hacia abajo n=" + n);
            n--; //n=n-1;
        } while (n > 0);
        System.out.println("n=" + n);

        System.out.println("####### for #######");
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba i=" + i);
        }
        System.out.println("");
        for (int i = 10; i > 0; i--) {
            System.out.println("Contando hacia abajo i=" + i);
        }
        System.out.println("");
        System.out.println("####### for #########");
        int[] arreglo = {1, 2, 3, 4, 5};
        int tamano = arreglo.length;
        System.out.println(tamano);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo [" + i + "]=" + arreglo[i]);
        }
        System.out.println("");
        System.out.println("######## for-each ##########");
        for (int temp : arreglo) {
            System.out.println("Elemento de arreglo= " + temp);
             System.out.println("");
        }

       
        System.out.println("####3 Pasas al bar? #####");
        int edad = 3; 

        if (edad >= 18) {
            System.out.println("Puedes pasar");
        } else {
            System.out.println("No puedes pasar");
        }
    }

    private static boolean menor(int a, int b) {
        return a < b;
    }

}
