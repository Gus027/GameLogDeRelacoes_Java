
public class Jogo {
    
    
    public static void main(String[] args) {
        
               Dragao dr = new Dragao();
               Mago mr = new Mago();
               Soldado sol = new Soldado();
               General gr = new General();
               LutSumo lu = new LutSumo();
             
               sol.Desenhar();
               System.out.println("----------------------------------------------------------------------------------------------------------");
               sol.EscolherArma();
               sol.Arma();         
               System.out.println("----------------------------------------------------------------------------------------------------------");
               lu.Desenhar();              
               System.out.println("----------------------------------------------------------------------------------------------------------");
               lu.EscolherArma();
               lu.Arma();
               System.out.println("----------------------------------------------------------------------------------------------------------");
               gr.Desenhar();
               System.out.println("----------------------------------------------------------------------------------------------------------");
               gr.EscolherArma();
               gr.Arma();
              
    }
    
}
