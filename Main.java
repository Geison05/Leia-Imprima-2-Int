import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    //Variavel
    int primeiroNumero = 0;
    int segundoNumero = 0 ;
    //Entrada de Dados
    System.out.println("Digite o Primeiro Número :");
    primeiroNumero = leitor.nextInt();
    System.out.println("Digite o Segundo Número :");
    segundoNumero = leitor.nextInt();
    //Saida
    System.out.println("\nPrimeiro Número Inteiro :"+ primeiroNumero +"\nSegundo Número Inteiro :"+segundoNumero );
  }
}