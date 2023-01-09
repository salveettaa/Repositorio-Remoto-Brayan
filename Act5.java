package UD01.actividades;
import java.util.*;;
/*
 Actividad 05. Escribe un programa que calcule el salario semanal de un empleado en
base a las horas trabajadas, a razón de 12 euros la hora.
 */
public class Act5 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("¿Cuántas horas trabajas diariamente?: ");
        double horas = tec.nextDouble();
        double salario_semanal = horas*12*7;
        System.out.println("Tu salario semanal es: "+salario_semanal);
    }
    
}
