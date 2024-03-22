import java.util.Scanner;

public class Main {

  public static void main(String[] args) {


    Aluno a = new Aluno();
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = sc.nextLine();

    System.out.println("Digite sua 1ª nota: ");
    float nota1 = sc.nextFloat();

    System.out.println("Digite sua 2ª nota: ");
    float nota2 = sc.nextFloat();

    float media = (nota1+nota2)/2;
    if (media>=7) {
      System.out.println("APROVADO");
    } else if (media<4) {
      System.out.println("REPROVADO");
    } else {
      System.out.println("VOCÊ ESTÁ NA FINAL");
    }
  }
}
