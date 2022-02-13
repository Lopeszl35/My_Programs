package meus_programas;
import java.util.Scanner;
public class Gastos_mensais {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
//VARIAVEIS QUE SERÃO DECLARADAS CASO capturador = 1
float salario, gasto_total, comida, lazer, essencial, sobra_preju, capturador, proximo_mes;

//VARIAVEIS QUE SERÃO DECLARADAS CASO capturador = 2
float streaming, combustivel, calculo, parcelas, almoco, supermercado, transporte, contas, extras;
int dias_semanas;

System.out.println("Bem vindo ao programa de calculo de gastos mensais");
   System.out.println("Antes de inicializar o programa, preciso fazer algumas perguntas");
   System.out.println("Você tem calculado todos os valores exatos dos seus gastos mensais?\n Se sim digite '1', se não digite '2': ");
capturador = teclado.nextInt();

//CONDIÇÃO1, ENTRADA E PROCESSAMENTO DE DADOS
if(capturador == 1){
System.out.println("Informe o seu salário: ");
  salario = teclado.nextFloat();
System.out.println("Informe seu gasto com comida(supermercado, ifood, etc) no mês: ");
  comida = teclado.nextFloat();
System.out.println("Informe seu gasto com lazer, Academia, Netflix, Shopping, etc durante o mês: ");
  lazer =  teclado.nextFloat();
System.out.println("Informe seus gastos mensais com, Água, luz, gás, faculdade, contas, combustivel, uber, etc: ");
  essencial = teclado.nextFloat();
gasto_total = comida + lazer + essencial;
sobra_preju = salario - gasto_total;

//SAIDA SE CONDIÇÃO=1
if(gasto_total < salario){
 System.out.println("Parabéns você gastou um valor menor doque o seu salário no mês");
  System.out.println("Seu gasto mensal foi de: " + gasto_total);
   System.out.println("O restante do seu salário ficou em: " + sobra_preju);
   proximo_mes = sobra_preju + salario;
   System.out.println("O valor que você terá para o mês seguinte será de: " + proximo_mes);
   System.out.println("Que sera o valor restante desse mês + o salario do mês que vem");
}else if(gasto_total > salario){
  System.out.println("Esse mês você gastou um valor maior doque o seu salário");
   System.out.println("Seu gasto mensal foi de: " + gasto_total);
    System.out.println("O valor negativo ficou em: " +  sobra_preju);
  proximo_mes = sobra_preju + salario;
   System.out.println("O valor que você terá para o mês seguinte será de: " + proximo_mes);
    System.out.println("Que sera o valor restante desse mês + o salario do mês que vem");
   }
}

//CONDIÇÃO2, ENTRADA E PROCESSAMENTO DE DADOS
if(capturador == 2){
   System.out.println("O programa ira fazer algumas perguntas, como você não sabe o valor exato faremos uma estimativa de seus gastos");
    System.out.println("O programa ira perguntar o valor/estimativa de gastos em determinada aréa. Se você não gastar informe o valor: 0");
     System.out.println("Primeiramente informe o seu salário: ");
salario = teclado.nextFloat();

System.out.println("Valor gasto em aplicativos de Streaming: ");
 streaming = teclado.nextFloat();
gasto_total = streaming;

System.out.println("Informe um valor que você geralmente gasta para encher o tanque do carro ou da moto: ");
 combustivel = teclado.nextFloat();
System.out.println("Quantas vezes no mês você abastece o seu carro?: ");
 dias_semanas = teclado.nextInt();
  calculo = combustivel * dias_semanas;
gasto_total = gasto_total + calculo;

System.out.println("Informe o valor da parcela do carro se houver: ");
 parcelas = teclado.nextFloat();
gasto_total = gasto_total + parcelas;
System.out.println("Informe o valor de todas as parcelas de seu cartão: ");
 parcelas = teclado.nextFloat();
gasto_total = gasto_total + parcelas;

System.out.println("Informe o valor que você gasta com almoço durante seu horario de almoço: ");
 almoco = teclado.nextFloat();
System.out.println("Informe a quantidade de dias que você almoça no mês: ");
 dias_semanas = teclado.nextInt();
  calculo = almoco * dias_semanas;
gasto_total = gasto_total + calculo;

System.out.println("Qual o valor que você gasta quando vai ao supermercado?: ");
 supermercado = teclado.nextFloat();
System.out.println("Quantas vezes no mês você vai ao supermercado?: ");
 dias_semanas = teclado.nextInt();
  calculo = supermercado * dias_semanas;
gasto_total = gasto_total + calculo;	

System.out.println("Informe o valor que você gasta com transporte(Uber, Onibús, etc) no dia a dia: ");
 transporte = teclado.nextFloat();
System.out.println("Agora informe quantas vezes no mês você utiliza esse transporte: ");
 dias_semanas = teclado.nextInt();
  calculo = transporte * dias_semanas;
gasto_total = gasto_total + calculo;
System.out.println("Informe o valor gasto com contas no mês água, energia, gás, etc: ");
 contas = teclado.nextFloat();
gasto_total = gasto_total + contas;
System.out.println("Informe aqui outros gastos que você possa ter tido no mês: ");
extras = teclado.nextFloat();
gasto_total = gasto_total + extras;

sobra_preju = salario - gasto_total;

//SAIDA SE GASTO TOTAL FOR MENOR QUE O SALÁRIO 
if(gasto_total < salario){
  System.out.println("Parebêns esse mês você consegui gastar um valor menor doque seu salário");
  System.out.println("O seu salário no mês é de: " + salario);
  System.out.printf("O seu gasto total no mês foi de R$ %.2f \n", gasto_total);
  System.out.printf("O restante do seu salário ficou em R$ %.2f \n", sobra_preju);
  proximo_mes = sobra_preju + salario;
   System.out.println("O valor que você terá para o mês seguinte será de: " + proximo_mes);
   System.out.println("Que sera o valor restante desse mês + o salario do mês que vem");
  //SAIDA SE GASTO TOTAL MAIOR QUE O SALÁRIO 
   }else if(gasto_total > salario){
     System.out.println("Esse mês você gastou um valor maior que seu salário");
     System.out.println("O seu salário no mês é de" + salario);
     System.out.printf("O seu gasto total no mês foi de R$ %.2f \n", gasto_total);
     System.out.printf("O saldo negativo do seu salário ficou em R$ %.2f", sobra_preju);
     proximo_mes = sobra_preju + salario;
   System.out.println("O valor que você terá para o mês seguinte será de: " + proximo_mes);
   System.out.println("Que sera o valor restante desse mês + o salario do mês que vem");
   }
	}
  teclado.close();
    }
}
