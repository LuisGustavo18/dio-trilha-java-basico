import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {
        
        Iphone iph = new Iphone();

        int msc = 0;

        try (Scanner x = new Scanner(System.in)) {
            System.out.println("Deseja tocar musica em seu SmartPhone ? (1-sim) (2-nao)");
            msc = Integer.parseInt(x.nextLine());
            

            for(int i=0; i < msc;){
            
            if(msc == 1){
                System.out.println("");
                iph.selecionarMusica();
                System.out.println("");
                iph.tocarMusica();
                System.out.println("");
                System.out.println("Deseja continuar tocando ?");
                msc = Integer.parseInt(x.nextLine());
            }else if(msc == 2){
                System.out.println("");
                iph.pausarMusica();
                break;
            }
            continue;
   }
        } 


    }
        

    }

