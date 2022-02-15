package meus_programas;
import java.util.Scanner;
public class operacoes_matematicas {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int capturador, soma, multiplicacao, subtracao, potenciacao = 1, num1, num2, a, b, c, delta, d = -4, b2, v2;
		double r1 = 0, r2 = 0;
		float num3, num4, raiz_quadrada, divisao;

		System.out.print("Informe a operação matemática\n");
		System.out.print("1=Soma\n 2=Multiplicação\n 3=Divisão\n 4=Subtração\n 5=Potenciação\n 6=Raiz quadrada\n 7=Equação do 2° grau\n 8=Tabuada\n : ");
		 capturador = teclado.nextInt();
		while (capturador != 0) {
			if (capturador == 1) {
				System.out.print("Informe um número: ");
				 num1 = teclado.nextInt();
				System.out.print("Informe outro número: ");
				 num2 = teclado.nextInt();
				 soma = num1 + num2;
				System.out.println("A soma entre os numero é: " + soma);
			} else if (capturador == 2) {
				System.out.print("Informe um número:");
				 num1 = teclado.nextInt();
				System.out.print("Informe outro número:");
				 num2 = teclado.nextInt();
				 multiplicacao = num1 * num2;
				System.out.println(num1 + "x" + num2 + "=" + multiplicacao);

			} else if (capturador == 3) {
				System.out.print("Informe um número: ");
				 num3 = teclado.nextFloat();
				System.out.print("Informe outro número: ");
				 num4 = teclado.nextFloat();
				 divisao = num3 / num4;
				System.out.println(num3 + "÷" + num4 + "=" + divisao);
			} else if (capturador == 4) {
				System.out.print("Informe um número: ");
				 num1 = teclado.nextInt();
				System.out.print("Informe outro número: ");
				 num2 = teclado.nextInt();
				 subtracao = num1 - num2;
				System.out.println(num1 + "-" + num2 + "=" + subtracao);
			} else if (capturador == 5) {
				System.out.print("Informe a base:  ");
				 num1 = teclado.nextInt();
				System.out.print("Informe o expoente da base: ");
				 num2 = teclado.nextInt();
				for (int i = num2; i >= 1; i--) {
					potenciacao = potenciacao * num1;
				}
				System.out.println("O resultado é: " + potenciacao);
			} else if (capturador == 6) {
				System.out.print("Informe o valor da raiz: ");
				 raiz_quadrada = teclado.nextFloat();
				System.out.println("O valor da raiz de\t" +  raiz_quadrada +  "\t=\t"  +  Math.sqrt(raiz_quadrada));

			} else if (capturador == 7) {
				System.out.print("Informe o valor de 'a': ");
				a = teclado.nextInt();
				while (a == 0) {
					System.out.println("O valor de 'a' deve ser diferente  de 0");
					System.out.print("Digite novamente um valor para 'a': ");
					a = teclado.nextInt();
				}

				System.out.println("Informe um valor para 'b': ");
				 b = teclado.nextInt();
				System.out.print("Informe um valor para 'c': ");
				 c = teclado.nextInt();
				System.out.println("Resolvendo o valor de delta");

				System.out.println("A fórmula de delta é:  b²-4.a.c");
				System.out.println("Substituindo a formula:\t" + b + "²" + d + "." + a + "." + c);

				b2 = b * b;
				v2 = ((d) * (a) * (c));
				delta = (b2) + (v2);

				System.out.println("O valor de delta é  = " + delta);
				if (delta < 0) {
					System.out.println("A equação  não  possui raízes reais");
				} else {
					r1 = (-b + Math.sqrt(delta)) / (2 * a);
					r2 = (-b - Math.sqrt(delta)) / (2 * a);
				}
				System.out.println("O valor de X¹ é =: " + r1);
				System.out.println("O valor de X² é =: " + r2);

			}else if(capturador == 8){
				System.out.print("Informe o número referente a tabuada: ");
				int tabuada = teclado.nextInt();
				for(int i = 1; i  <= 100; i++){
					multiplicacao = tabuada * i;
					System.out.println(tabuada +"x" + i + "=" + multiplicacao);
				}
			}

				System.out.print("\nInforme a operação matemática\n");
		                System.out.print("1=Soma\n 2=Multiplicação\n 3=Divisão\n 4=Subtração\n 5=Potenciação\n 6=Raiz quadrada\n 7=Equação do 2° grau\n 8=Tabuada\n : ");
			        capturador = teclado.nextInt();
		}

        teclado.close();
    }
}
