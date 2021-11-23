import java.util.Scanner;

public class Menu {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      System.out.println("------------KOMMANDOER------------");
      System.out.println("formand      = gå til formandsmenu");
      System.out.println("kasserer     = gå til kasserermenu");
      System.out.println("trænermenu   = gå til trænermenu");
      System.out.println("Skriv en af ovenstående kommandoer:\n");
      String command = scan.nextLine();
      System.out.println(command);

      switch (command.toLowerCase()) {
        case "formand":
          //formandsmenu
          break;
        case "kasserer":
          //kasserermenu
          break;
        case "træner":
          //trænermenu
          break;
        default:
          //Nedenstående skrives ud hvis du ikke skriver en af kommandoerne
          System.out.println("Det forstår jeg ikke.");
          break;
      }

    }
  }
}