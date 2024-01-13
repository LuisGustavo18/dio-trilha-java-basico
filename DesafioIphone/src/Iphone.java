public class Iphone implements Musica, Telefone, Navegador{


    @Override
    public void exibirPagina() {
     System.out.println("Exibindo Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Pagina");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo....");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando Musica");
    }
    


  
} 
 
    
