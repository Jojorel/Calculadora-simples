
//*** Fundamentos *** Profa.Giraffa
import java.util.*;
//uso de diversos metodos para organizar o programa 
public class CalculadoraSimples {
        
        private static double a,b;//declaracao de variavel estatica privada escopo classe Calculadora
        
        public static void leitura() { 
        Scanner entrada = new Scanner(System.in);//objeto instanciado para este metodo
        System.out.println("\n  Calculadora ****");
        System.out.println ("\n Digite o primeiro valor ");
        a=entrada.nextDouble();
        System.out.println ("\n Digite o segundo valor ");
        b=entrada.nextDouble();}
        
        public static double soma(double a, double b){ 
        return a+b;
        }
        
        public static double subtrai(double a, double b){ 
        return a-b;
        }
        
        public static double multiplica(double a, double b){ 
        return a*b;
        }
        
        public static void divide(double a, double b){ //observe este metodo é void
        if (b!=0) {System.out. println("\n Divisão de:"+ a+ "e "+b+ "="+ a/b);}
                else {System.out. println("\n Impossivel dividir porque o valor de b é igual a zero");}
        }
        
        public static double raizQuadrada(double a){ 
          return Math.sqrt(a);      
        }
        
        public static double raizCubica(double a){ 
        return Math.cbrt(a);
        }
        
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);//objeto instanciado para metodo main
        System.out.println("\f");
        int opcao; double valor;
        System.out.println ("\n Digite a opção desejada ");
        System.out.println ("\n 1 - somar os valores ");
        System.out.println ("\n 2 - subtrair os valores ");
        System.out.println ("\n 3 - multiplicar os valores ");
        System.out.println ("\n 4 - dividir os valores ");
        System.out.println ("\n 5 - raiz quadrada dos valores ");
        System.out.println ("\n 6 - raiz cubica dos valores ");
        System.out.println ("\n 0 - sair ");
         
        opcao=teclado.nextInt(); //aqui "acreditando" que o usário fará certo a entrada
     
    if (opcao==0) { System.out.println ("\n Saindo do sistema...voce digitou ZERO ....tchau!");}
    
    if (opcao==1) { leitura();System.out.println ("\n Soma de: "+ a+ " e "+b+ "= "+ soma(a,b));} 
    
    if (opcao==2) { leitura();System.out.println ("\n Subtracao de: "+ a+ " e "+b+ "= "+ subtrai(a,b));} 
    
    if (opcao==3) { leitura();System.out.println ("\n Multiplicacao de: "+ a+ " e "+b+ "= "+ multiplica(a,b));} 
    
    if (opcao==4){ leitura();divide(a,b);} //observe a diferença
    
    if (opcao==5){ System.out.println ("\n Digite valor maior que zero para calcular a raiz"); valor= teclado.nextDouble();
                    if (valor>=0) {System.out.println ("\n a raiz de: "+valor+" ="+ Math.sqrt(valor)); } 
                    else {System.out.println ("\n nao  posso calcular raiz de numero negativo");} }//mais uma diferença
                    
    if (opcao==6){ leitura();System.out.println ("\n Raiz Cubica de:"+ a+ "e "+ raizCubica(a)); System.out.println ("\n Raiz Cubica de:"+ b+ "e "+ raizCubica(b)); 
    }


}
//faca uma versao substituindo estes IF por switch
}


 

 