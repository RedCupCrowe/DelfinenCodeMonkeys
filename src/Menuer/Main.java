package Menuer;

import Storage.Storage;

import java.util.Scanner;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    Storage.loadStorage();

    while (true) {
      System.out.println("------------KOMMANDOER------------");
      System.out.println("1. Formand      = gå til formandsmenu");
      System.out.println("2. Kasserer     = gå til kasserermenu");
      System.out.println("3. Trænermenu   = gå til trænermenu");
      System.out.println("Skriv en af ovenstående kommandoer:\n");
      String command = scan.nextLine();
      System.out.println(command);

      switch (command.toLowerCase()) {
        case "formand":
        case "1":
          Menu.formandMenu(scan);
          break;

        //formandsmenu
        case "kasserer":
        case "2":
          Menu.kassererMenu(scan);
          break;

        //kasserermenu
        case "træner":
        case "3":
          Menu.trænerMenu(scan);
          break;
        //trænermenu

        default:

      }

    }

  }
}
