import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    //Declaração de variaveis
    
    double dinheiroPHora;
    double horas;
    double salario;

     System.out.println("Quantas horas você trabalhou nesse mês?");
    
    Scanner teclado = new Scanner(System.in);
    horas = teclado.nextDouble();

     System.out.println("Quanto você ganha por hora?");
    dinheiroPHora = teclado.nextDouble();

    salario = horas * dinheiroPHora;

    //Passo 3: Exibir Resultado

    System.out.println("Valor a receber nesse mês = R$" + salario);
    
  }
  
}