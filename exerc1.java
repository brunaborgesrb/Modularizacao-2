/*Implementre um programa que forneça ao usuário os seguintes serviços:
(a) Verificar se um dado número inteiro é divisível por outro. Para tal, construa uma
função que receba como parâmetro de entrada os dois números a serem
testados (A e B) e retorne true se A for divisível por B ou false, caso contrário;
(b) Truncar um dado número real. Truncar um número é remover a parte
fracionária, tornando-a nula. Para tal, construa uma função que recebe como
parâmetro de entrada o número a ser truncado e retorna o valor resultante do
truncamento.
(c) Arredondar um dado número real para um valor “inteiro” (ou seja, valor real com
parte fracionária nula) seguindo os padrões científicos, ou seja, se a parte
fracionária for menor que 0,5, arredondar para o valor “inteiro” inferior, caso
contrário, arredondar para o valor “inteiro” superior. Para tal, construa uma
função que recebe como parâmetro de entrada o número a ser arredondado e
retorna o valor resultante do arredondamento.
(d) Encontrar o MDC (máximo divisor comum) de dois números inteiros fornecidos
pelo usuário. Para tal, construa uma função que receba como parâmetro de
entrada dois números inteiros e retorne o MCD dos números dados.
(e) Encontrar o MMC (mínimo múltiplo comum) de dois números inteiros fornecidos
pelo usuário. Para tal, construa uma função que receba como parâmetro de
entrada dois números inteiros e retorne o MMC dos números dados.
OBS1: Toda entrada de dados deve ser feita pelo programa principal.
OBS2: O programa deverá ter um menu principal que permita ao usuário executar as
funções quantas vezes desejar e só deverá terminar sua execução se o usuário solicitar. */

public static boolean eDivisivel (int a, int b) {
    boolean result;
    int resto;
    resto = a%b;
    if(resto == 0) {
        result = true;
    }
    else {
        result = false;
    }
    return result;
}
public static double truncar (double num) {
    double result;
    result = Math.floor(num);
    return result;
    }
public static double arredondar (double num) {
    double num2, frac, result;
    num2= Math.floor(num);
    frac =num - num2;
    if (frac < 0.5) {
        result = num2;
    }
    else {
        result = Math.ceil(num);
    }
    return result;
}
public static int mdc (int a, int b) {
    int result = 0, i, menor;
    if (a<b) {
        menor = a;
    }
    else {
        menor = b;
    }
    for (i = 2; i <= menor; i=i+1) {
        if (a % i==0 && b % i==0) {
            result = i;
    }

    }
    return result;
}
public static int mmc (int a, int b) {
    int maior, menor, result, i, teste;
    if (a> b){
        maior = a;
        menor = b;
    }
    else {
        maior = b;
        menor = a;
    }
    teste = maior;
    i = 2;
    while (teste % menor != 0) {
        teste = maior*i;
        i = i+1;
    }
    return teste;
    }

public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int num1, num2, num3, resultado, op = 0;
    boolean retorno;
    double valor1, valor2;
    do {
        exibirOpcoes();
        op = input.nextInt();
        switch(op) {
        case 1: System.out.print("informe o primeiro valor: ");
                num1 = input.nextInt();
                System.out.println("informe o segundo valor: ");
                num2 = input.nextInt();
                retorno = eDivisivel(num1, num2);
                if (retorno == true) {
                    System.out.println(num1 + " é divisível por " + num2);
                }
                else {
                    System.out.println(num1 +" não é divisível por " + num2);
                }
                break;
        case 2: System.out.println("informe o número: ");
                valor1 = input.nextDouble();
                valor2 = truncar
        }
    
    
    
    
    }while(op != 6);
}

public static void exibirOpcoes () {
System.out.println("opções");
System.out.println("1- verificar se é divisível");
System.out.println("2- truncar");
System.out.println("3- arredondar");
System.out.println("4- calcular MDC");
System.out.println("5- calcular MMC");
System.out.println("6- encerrar programa");
System.out.println("informe a opção desejada: ");
}
}