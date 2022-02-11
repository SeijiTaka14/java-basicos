package arreglos;

public class ManipularArreglos {
	public static void main(String[] args) {
		/*Crea una clase llamara ManipularArreglo
		crea un array con los siguientes n�meros enteros:

		1, 6, 45, 53, 80, 102, 145, 326, 450, 892
		Crea un programa que use un ciclo que tome los n�meros de arreglo y devuelva la suma total, la suma de los n�meros pares y la suma de los n�meros impares.*/

        //Creaci�n del array 
        int []numeros = new int[]{1, 6, 45, 53, 80, 102, 145, 326, 450, 892};

        //Declarar sumas
        int sumaTotal = 0;
        int sumaPar = 0;
        int sumaImpar = 0;

        //Sumar con ciclo
        for(int i = 0; i < numeros.length; i++){
            sumaTotal += numeros[i];

            //Suma de # par
            if(numeros[i] % 2 == 0){
                sumaPar += numeros[i];
            } else {
                sumaImpar += numeros[i];
            }
        }

        System.out.println("La suma total de los n�meros es: " + sumaTotal);
        System.out.println("La suma total de los n�meros pares es: " + sumaPar);
        System.out.println("La suma total de los n�meros impares es: " + sumaImpar);
	}
}
