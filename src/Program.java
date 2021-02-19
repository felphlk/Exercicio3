import java.lang.invoke.MutableCallSite;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.print("Digite o valor de x: ");
        Scanner a=new Scanner(System.in);
        int x=a.nextInt();
        System.out.print("Digite o valor de y: ");
        int y=a.nextInt();
        Soma s=new Soma();
        Subtracao sub=new Subtracao();
        Multiplicacao mult=new Multiplicacao();
        Divisao div=new Divisao();
        System.out.println("Soma: "+s.efetuarOperacao(x,y));
        System.out.println("Subtração: "+sub.efetuarOperacao(x,y));
        System.out.println("Multiplicação: "+mult.efetuarOperacao(x,y));

        System.out.println("Divisão: "+div.efetuarOperacao(x,y));


    }
}
