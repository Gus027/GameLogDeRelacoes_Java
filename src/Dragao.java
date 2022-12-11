
public class Dragao extends Criatura implements Alado{
    private boolean asas;
    private Bola_de_fogo magia;

    public boolean isAsas() {
        return asas;
    }

    public void setAsas(boolean asas) {
        this.asas = asas;
    }
    
    
    
   public Bola_de_fogo getMagia() {
		return magia;
	}

	public void setMagia(Bola_de_fogo magia) {
		this.magia = magia;
	}

public void Magia(){
      Bola_de_fogo bola1 = new Bola_de_fogo();
      bola1.usarMagia();
    }
   
    public void voar(){
    
        System.out.println("O"+this.nome+"está voando");
    }
    
    
    public void Desenhar(){
        System.out.println("                                         __----~~~~~~~~~~~------___\n" +
"                                  .  .   ~~//====......          __--~ ~~\n" +
"                  -.            \\_|//     |||\\\\  ~~~~~~::::... /~\n" +
"               ___-==_       _-~o~  \\/    |||  \\\\            _/~~-\n" +
"       __---~~~.==~||\\=_    -_--~/_-~|-   |\\\\   \\\\        _/~\n" +
"   _-~~     .=~    |  \\\\-_    '-~7  /-   /  ||    \\      /\n" +
" .~       .~       |   \\\\ -_    /  /-   /   ||      \\   /\n" +
"/  ____  /         |     \\\\ ~-_/  /|- _/   .||       \\ /\n" +
"|~~    ~~|--~~~~--_ \\     ~==-/   | \\~--===~~        .\\\n" +
"         '         ~-|      /|    |-~\\~~       __--~~\n" +
"                     |-~~-_/ |    |   ~\\_   _-~            /\\\n" +
"                          /  \\     \\__   \\/~                \\__\n" +
"                      _--~ _/ | .-~~____--~-/                  ~~==.\n" +
"                     ((->/~   '.|||' -_|    ~~-/ ,              . _||\n" +
"                                -_     ~\\      ~~---l__i__i__i--~~_/\n" +
"                                _-~-__   ~)  \\--______________--~~\n" +
"                              //.-~~~-~_--~- |-------~~~~~~~~\n" +
"                                     //.-~~~--\\");
   }
}
    
    
    
    
    

