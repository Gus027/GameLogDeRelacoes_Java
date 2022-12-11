import java.util.Scanner;


public class Soldado extends Pessoa implements Terrestre{
     int escolha = 0;
     
     
  public void FalarInicial(){
        System.out.println("Ao Seu Dispor Senhor."); 
    }
  public void FalarAtaque(){
         System.out.println("Irei elimina-lo pelo o meu capitão.");
  }
  
  	Scanner tl = new Scanner(System.in);
  	Fuzil f = new Fuzil();
  	Faca f1 = new Faca();
  	Desarmado d = new Desarmado();
    Revolver r = new Revolver();

    
   public void EscolherArma(){

       System.out.println("Selecione o tipo de sua arma para o combate.");
       System.out.println("Tipos:\n1 - Fuzil\n2 - Faca\n3 - Desarmado\n4 - Revolver");
       switch(tl.nextInt()){
           case 1:
        	   escolha = 1;         
               f.EscolherArma();
               break;
           case 2:
        	   escolha = 2;           
               f1.EscolherArma();
               break;
           case 3:
        	   escolha = 3;
               d.EscolherArma();
               break;
           case 4:
        	   escolha = 4;
               r.EscolherArma();
               break;
       }
  
   }  
	public void Arma(){
		if(escolha != 0) {
		switch (escolha) {
			case 1 :
				f.usarArma();
		        break;
			case 2:	 	            
		        f1.usarArma();
		        break;
		    case 3:		 	 
		        d.usarArma();
		        break;
		    case 4:		 	   
		        r.usarArma();
		        break;
			}		
		}
		else {
			System.out.println("voce deve escolher uma arma primeiro");
		}  
	}
	   
	   
//       
//       
//       System.out.println("1 -  AK-47\n2 - M4-A4\n3 - Faca\n4 - Espada\n5 - Mãos");
//       System.out.println("Insira um numero: ");
//      switch(tl.nextInt()){
//            case 1:     
//               getAk();
//               break;
//            case 2:
//                getM4();
//                break;
//            case 3:
//                getFaca();
//                break;
//            case 4:
//                getEspada();
//                break;
//            case 5:
//                getDesarmado();
//                break;
//       }
//        
   
   
   public void correr(){
        System.out.println("O"+this.nome+" está correndo");
    }
   
    public void Desenhar(){
       System.out.println("        .---.\n" +
"  ___ /_____\\\n" +
" /\\.-`( '.' )\n" +
"/ /    \\_-_/_\n" +
"\\ `-.-\"`'V'//-.\n" +
" `.__,   |// , \\\n" +
"     |Ll //Ll|\\ \\\n" +
"     |__//   | \\_\\\n" +
"    /---|[]==| / /\n" +
"    \\__/ |   \\/\\/\n" +
"    /_   | Ll_\\|\n" +
"     |`^\"\"\"^`|\n" +
"     |   |   |\n" +
"     |   |   |\n" +
"     |   |   |\n" +
"     |   |   |\n" +
"     L___l___J\n" +
" jgs  |_ | _|\n" +
"     (___|___)\n" +
"      ^^^ ^^^                                  ");
   }
    
}
