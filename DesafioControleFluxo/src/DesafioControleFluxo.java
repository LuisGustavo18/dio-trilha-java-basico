import java.util.Scanner;

public class DesafioControleFluxo {

    public static void main(String[] args) throws Exception {
    
    

                try (Scanner terminal = new Scanner(System.in)) {
                    System.out.println("Digite o primeiro número: ");
                    int parametroUm = Integer.parseInt(terminal.nextLine());
                    System.out.println("Digite o segundo número: ");
                    int parametroDois = Integer.parseInt(terminal.nextLine());


                    try {

                       contar(parametroUm, parametroDois);
                        
                    } catch (ParametrosInvalidosException exception) {
                        System.out.println("O segundo parametro deve ser maior que o primeiro");
                    }
                }
            }

        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{                   
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
                 }else {
                    String parametrosUm = Integer.toString(parametroUm);
                    String parametrosDois = Integer.toString(parametroDois);

                        System.out.println("Imprimindo o primeiro numero do parametro 1: " + parametrosUm.charAt(0));
                        System.out.println("Imprimindo o segundo numero do parametro 1: " + parametrosUm.charAt(1));
                       
                        System.out.println("   ");
                       
                        System.out.println("Imprimindo o primeiro numero do parametro 2: " + parametrosDois.charAt(0));
                        System.out.println("Imprimindo o segundo numero parametro 2: " + parametrosDois.charAt(1));

            int contagem = parametroDois - parametroUm;
        

             for(int i=0; i < contagem;i++){
                    System.out.println((i + 1));
            
             }
            }
                
        }
    }
