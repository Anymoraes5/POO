import java.util.Scanner;

public class Main {

      public static void  main (String [] args){
        //instancia o scanner

        Scanner scanner = new Scanner(System.in);
    
        
        int  codigo1 = scanner.nextInt(); //next + o tipo da variavel 
        int numPecas1 = scanner.nextInt();
        double  valorUnitario1 = scanner.nextDouble();
        System.out.println("codigo da peça: " + codigo1); 
        System.out.println("quantidade da peça: " + numPecas1);
        System.out.println("valor unitário da peça: " + valorUnitario1);
        // aparece separadamente qual dado é qual 
      
        int  codigo2 = scanner.nextInt();
        int numPecas2 = scanner.nextInt();
        double  valorUnitario2 = scanner.nextDouble();

        System.out.println("codigo da peça: " + codigo2);
        System.out.println("quantidade da peça: " + numPecas2);
        System.out.println("valor unitário da peça: " + valorUnitario2);

        double total = (numPecas1 * valorUnitario1) + (numPecas2 * valorUnitario2); // tipo da variavel + nome + o calculo 
        
        System.out.printf("\nVALOR A PAGAR: R$ %.2f ", total);
        scanner.close(); 

      }
      
}