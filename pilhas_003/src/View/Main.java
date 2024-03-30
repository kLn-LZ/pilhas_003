package View;

import Controller.NPRController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        NPRController NPRC = new NPRController();
        Scanner scan = new Scanner(System.in);

        int opc = 0;

        while(opc != 9) {

            System.out.print("\n1 - Adicionar novo número \n 2 - Realizar operação \n 9 - Encerrar \n Escolha: ");
            opc = scan.nextInt();

            switch(opc) {
                case 1:
                    System.out.print("\nInsira um valor: ");
                    NPRC.insereValor(scan.nextInt());
                    break;
                case 2:
                    System.out.print("\nInsira uma operação (+,-,*,/): ");
                    System.out.println("Resultado: " + NPRC.npr(scan.next()));
                    break;
                default:
                    System.out.println("Opção inválido");
                    break;
            }


        }

    }
}
