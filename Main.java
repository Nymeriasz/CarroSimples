package CarroSimples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("Qual cor? ");
        String cor = sc.nextLine();
        carro.setCor(cor);

        System.out.println("Qual potencia do motor? ");
        int potencia = sc.nextInt();
        Motor motor = new Motor(potencia);
        carro.setMotor(motor);

        System.out.println("Cor: "+carro.getCor());
        System.out.println("Potencia do motor: "+carro.getMotor().getPotencia());
    }
}
