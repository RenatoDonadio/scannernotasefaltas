/**
 * exercicioaula2notasefaltas
 */

import java.util.Scanner;
public class exercicioaula2notasefaltas {

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner (System.in);
    
        double nota1, nota2;
        int faltas;
        double media;
        double notaExame;

        //entrada
        System.out.println("Digite a Primeira Nota");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota"); 
        nota2 = teclado.nextDouble();
        System.out.println("Digite o numero de faltas");
        faltas = teclado.nextInt();


        //processamento

        if (faltas>=16) {

            System.out.println("Você está reprovado");

  
        }else{

            media = (nota1 + nota2) /2;
            if (media >=6) {
              System.out.println("Você está aprovado");
              
            }else{

              System.out.println("Informe a nota do exame");
              notaExame = teclado.nextDouble();
              media = (media + notaExame)/2;

                if(media>=5){
                    System.out.println("Você está aprovado em exame");
                }else{
                    System.out.println("Você está reprovado em exame");




                }
            
                


            }
        
        }
    }
}