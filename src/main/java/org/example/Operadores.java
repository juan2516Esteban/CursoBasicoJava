package org.example;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class Operadores {

    public Operadores(){

    }
    public void ejercio1(){

        /* Este ejercio lo que nos pide es:  pedir por panatalla tres notas,
        sumarlas y mostrar el resultado por pantalla. */

        System.out.println("Por favor ingresa tres notas a sumar: ");

        // pedimos las notas por ventanas emergentes.
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite la primera nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite la segunda  nota: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite la tercera nota: "));

        double resultado = nota1 + nota2 + nota3; // Calculamos la suma.

        // Mostramos por pantalla.
        JOptionPane.showMessageDialog(null,"El resultado de la suma de las tres notas es: "+ resultado);
    }

    public void ejercio2(){

        /*
         Este método calcula el salario semanal a partir del salario mensual y las horas trabajadas.
         Primero, calcula el salario diario dividiendo el salario mensual por 23.83 (porcentaje de días hábiles al mes).
         Luego, calcula el salario por hora dividiendo el salario diario entre 8 (horas laborables al día).
         Finalmente, determina el salario semanal multiplicando el salario por hora por las horas trabajadas.
         */

        // Se asume que los empleados trabajan 8 horas al día en la empresa.

        float salario, salarioDiario , salarioPorHora;
        int horasTrabajadas;

        System.out.printf("Por favor ingresa tu salario mensual, recomendación ingresa el salario con , " +
                "en los puntos decimales: ");

        Scanner entrada = new Scanner(System.in);

        salario = entrada.nextFloat();

        System.out.print("Por favor ingresa las horas trabajadas por semana: ");

        horasTrabajadas = entrada.nextInt();

        // el 23.83 es el porcetaje de dias que trabaja un empleado al mes segun el ministerio de trabajo.
        salarioDiario = salario / 23.83f;

        salarioPorHora = salarioDiario / 8;

        System.out.printf("El salario semanal es: "+ Math.round(salarioPorHora * horasTrabajadas));

        entrada.close();
    }

    public void ejercio3 (){

        /* Este ejercicio lo que nos pide es calcular que cantidad de dolares tiene Guillermo,
        Luis y Juan juntos, el enunciado es el siguiente: Guillermo tiene N dolares, Luis
        tiene la mitad de lo que posee Guillermo y Juan tiene la mitad de lo que poseen
        Luis y Gullermo juntos. */

        System.out.println("Por favor ingresa la cantidad de dolares que tiene Guillermo");

        Scanner entrada = new Scanner(System.in);

        double cantDolaresGui = entrada.nextDouble();

        double cantDolaresLui = cantDolaresGui / 2 ;

        double cantDolaresJua = ( cantDolaresGui + cantDolaresLui) / 2;

        // imprimimos el resultado del total de Dolares.
        System.out.println("La cantidad de dolares entre los tres es: "+
                (cantDolaresGui + cantDolaresLui + cantDolaresJua));

    }

    public void ejercio4(){

        /* El ejercio 4 nos habla sobre un programa para calcular el salario mensual
        de un vendedor, con este enunciado, Una compañia de venta de carros usados,
        paga a su personal un salario de $1000 mensuales, mas una comición de $150 por
        cada carro vendido, mas el 5% del valor de la venta del carro. */

        System.out.println("Por Favor ingresanos la cantidad de carros vendidos por el vendedor");

        Scanner entrada = new Scanner(System.in);

        int numCarros = entrada.nextInt();
        float totalComicion = 0 ;

        /* Generamos una matriz para almacenar la marca y el valor de la compra
        del los carros vendidos con 2 columnas que corresponde a marca y precio de venta. */
        String[][] matrizCarros = new String[numCarros][2];



        System.out.println("Ahora te pediremos la marca de los carros vendidos y valor de " +
                "la venta");

        // Recorremos las filas.
        for (int i = 0; i<numCarros; i++){

            // Recorremos las columnas.
            for (int g = 0 ; g<2; g++) {

                /* Lo que hicimos aca con los condicionales es que si es g == 0 pida la marca del vehiculo
                 y si g == 2 pida el precio de venta  haciendo la simulación de las dos columnas. */

                if (g == 0) {
                    System.out.println("\nIngresa la marca del vehículo #" + (i + 1) + " de las ventas hechas por" +
                            " el vendedor");

                } else if (g == 1) {
                    System.out.println("\nIngresa el valor del la venta del #" + (i + 1) + " de las ventas hechas por" +
                            " el vendedor");
                }

                // Pedimos el valor.
                String PrecioOMarca = entrada.next();

                // Lo asignamos en la matriz.
                matrizCarros[i][g] = PrecioOMarca;

                if (g == 1){
                    // sumamos los valores del precio de venta para despues hallar el 5% de comición.
                    // Ademas parseamos el String a un Float.
                    totalComicion += Float.parseFloat(matrizCarros[i][g]);
                }
            }

        }

        // Aca imprimimos la matriz para verificar los datos ingresados.
        for (int i = 0 ; i<matrizCarros.length; i++){

            for (int g = 0; g<matrizCarros[0].length;g++){

                /* Aca hicimos lo mismo de la otra vez simulamos las columnas de la matriz. */

                if (g == 0) {
                    System.out.println("La Marca del vehiculo #" + (i + 1) + " es: " + matrizCarros[i][g]);
                }else{
                    System.out.println("La precio de venta del vehiculo #" + (i + 1) + " es: " + matrizCarros[i][g]);
                }
            }
            System.out.println("\n"); // damos un espaciado al formato.
        }

        // imprimimos y calculamos el valor del salario sugun los parametros obtenidos.

        double totalSalario = ((totalComicion*5/100)+1000+(150*numCarros));

        System.out.println(" El valor del salario mensual del vendedor es: "
                + Math.round(totalSalario)); // redondiamos el salario.
    }


}
