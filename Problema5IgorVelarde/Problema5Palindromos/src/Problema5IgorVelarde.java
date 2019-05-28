import java.util.Scanner;
import java.util.*;
public class Problema5IgorVelarde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner texto = new Scanner(System.in);
        System.out.println("ingrese la frase: ");
       String cadena = texto.nextLine();
       cadena = cadena.replace(" ", "");
       int lenght = cadena.length();
       char [] cadenaChar = cadena.toCharArray();
       int n = lenght;
       if ( lenght % 2 != 0){
           lenght = lenght + 1;
        }
      
       boolean palindromo = true;
       
       for (int i = 0; i < lenght/2 ; i++) {
                      
           char x = cadenaChar[i];
           char y = cadenaChar[n - 1 -i];
           
            if(x == y){
               
           }
           else{
               palindromo = false;
               
               break;
            }
       }
       
       if (palindromo == true){
           System.out.println(" La frase es palindroma");
       }
       else{
           System.out.println(" La frase no es palindroma");
       }
	}

}
