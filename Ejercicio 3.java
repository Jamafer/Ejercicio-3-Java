import java.util.Random;
public class Main {
public static void main(String[] args) {
Random azar = new Random();
int numero;
int sumaImpares = 0;
while (sumaImpares <= 25) {
// Generar un número entre 0 y 10
numero = azar.nextInt(11);
// Verificar si es par o impar
if (numero % 2 == 0) {
System.out.println("Número generado: "
+ numero + " - Es par");
} else {
System.out.println("Número generado: "
+ numero + " - Es impar");
// Acumular los números impares
sumaImpares += numero;
}
}
// Mostrar el resultado final
System.out.println();
System.out.println("La suma de los números impares es: "
+ sumaImpares);
System.out.println("La suma superó el valor 25. "
+ "El proceso ha finalizado.");
}
}