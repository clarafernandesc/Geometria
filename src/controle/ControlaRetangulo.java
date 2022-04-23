package controle;
import dominio.Retangulo;
import java.util.Scanner;

public class ControlaRetangulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o valor da base do ret�ngulo: ");
        int valorBase = leia.nextInt();
        System.out.print("Digite o valor da altura do ret�ngulo : ");
        int valorAltura = leia.nextInt();
        leia.close();
        
        Retangulo calc = new Retangulo(valorBase, valorAltura);
        
        System.out.println("RESULTADOS");
        System.out.println("�rea :" + calc.calcularArea());
        System.out.println("Per�metro: " + calc.calcularPerimetro());
    }
}
