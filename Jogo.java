import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int tabuleiro[][] = new int[8][8];
        int a, b;
        int cont1 = 0;
        int contt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tabuleiro[i][j] + "|");
            }
            System.out.println("  ");
        }
        do {
            System.out.print("Informe a posicao da " + cont1 + 1 + "ª rainha; linha e coluna respectivamente de 0/7: ");
            a = leitura.nextInt();
            b = leitura.nextInt();
            int c = a;
            int d = b;
            int e = a;
            int f = b;
            int g = a;
            int h = b;
            if (tabuleiro[a][b] != 1 & tabuleiro[a][b] != 2) {
                tabuleiro[a][b] = 2;
                cont1++;
                contt++;

                if (contt > 0) {
                    contt = 0;
                    for (int i = b - 1; i >= 0; i--) {
                        tabuleiro[a][i] = 1;
                    }
                    for (int i = b + 1; i < 8; i++) {
                        tabuleiro[a][i] = 1;
                    }
                    for (int i = a - 1; i >= 0; i--) {
                        tabuleiro[i][b] = 1;
                    }
                    for (int i = a + 1; i < 8; i++) {
                        tabuleiro[i][b] = 1;
                    }
                    a = a - 1;
                    b = b - 1;
                    while (a >= 0 & b >= 0) {

                        tabuleiro[a--][b--] = 1;
                    }
                    c = c + 1;
                    d = d + 1;
                    while (c < 8 & d < 8) {

                        tabuleiro[c++][d++] = 1;
                    }
                    e = e - 1;
                    f = f + 1;
                    while (e >= 0 & f < 8) {
                        tabuleiro[e--][f++] = 1;
                    }
                    g = g + 1;
                    h = h - 1;
                    while (g < 8 & h >= 0) {
                        tabuleiro[g++][h--] = 1;
                    }

                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print(tabuleiro[i][j] + "|");
                        }
                        System.out.println("  ");
                    }
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if (tabuleiro[i][j] != 1 & tabuleiro[i][j] != 2) {
                                contt++;
                            }
                        }
                    }
                    System.out.println("Numero de rainhas no tabuleiro é =" + cont1);
                    System.out.println("Numero de espacos em branco é =" + contt);

                }

            } else {
                System.out.println("######Territorio Ocupado######");

            }
            if (contt <= 0 & cont1 < 8) {
                System.out.println("######Você perdeu######");
                break;

            }
            if (contt == 0 & cont1 == 8) {
                System.out.println("######Você Ganhou######");
                break;

            }

        } while (cont1 <= 8);
    }
}
