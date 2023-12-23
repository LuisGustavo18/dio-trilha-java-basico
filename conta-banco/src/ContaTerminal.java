import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
                
        try (Scanner x = new Scanner(System.in)) {
            System.out.println("Digiste a sua agência: ");
            String y = x.nextLine();

            conta conta = new conta();
            
            if(y.equals(conta.agencia)){
                System.out.println("Olá " + conta.nome + ", " + "obrigado por ciar uma conta em nosso banco, sua agência é " + conta.agencia + ", " +
                 "conta " + conta.numero + " e seu Saldo " + conta.saldo +
                 " já está disponivel para saque");
            }else{
                System.out.println("Agência não encontrada");
            }
        }
        
    }


}
