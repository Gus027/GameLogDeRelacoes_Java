
public class Mago extends Pessoa implements Terrestre{
    private Magia_IF magia;
  
    public Magia_IF getMagia() {
		return magia;
	}
	public void setMagia(Magia_IF magia) {
		this.magia = magia;
	}
	
	public void FalarInicial(){
        System.out.println("Ao Seu Dispor Senhor."); 
    }
	public void FalarAtaque(){
         System.out.println("Irei elimina-lo pelo o meu capitão.");
	}
  
	public void Magia(){
    	Bola_de_fogo bola2 = new Bola_de_fogo();
    	bola2.usarMagia();
    }
    
	public void correr(){
        System.out.println("O"+this.nome+" está correndo");
    }
    public void Arma(){   	
    	Desarmado d = new Desarmado();
        d.usarArma();
    }
  public void Desenhar(){
	  	System.out.println("                      .\n" +
"        /^\\     .\n" +
"   /\\   \"V\"\n" +
"  /__\\   I      O  o\n" +
" //..\\\\  I     .\n" +
" \\].`[/  I\n" +
" /l\\/j\\  (]    .  O\n" +
"/. ~~ ,\\/I          .\n" +
"\\\\L__j^\\/I       o\n" +
" \\/--v}  I     o   .\n" +
" |    |  I   _________\n" +
" |    |  I c(`       ')o\n" +
" |    l  I   \\.     ,/\n" +
"_/j  L l\\_!  _//^---^\\\\_");
   }
    
}
