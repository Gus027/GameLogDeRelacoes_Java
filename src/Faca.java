import java.util.Scanner;

public class Faca implements Arma_IF {
    private String Modelo;
    int escolha = 0;
    Scanner tlc = new Scanner(System.in);

    
    
    public String getModelo() {
		return Modelo;
	}

		public void setModelo(String modelo) {
			Modelo = modelo;
		}
		public void EscolherArma(){   		
			 System.out.println("Armas:\n1 - Karambit\n2 - Butterfly");
		       System.out.println("Insira a sua escolha: ");
	        switch(tlc.nextInt()){
	           case 1:
	        	   this.escolha = 1;
	        	   	System.out.println("Butterfly Adicionada ao Inventario...");
	           		this.setModelo("Butterfly");
	           		this.getModelo();
	              break;
	           case 2:
	        	   	this.escolha = 2;
	        	  	System.out.println("Karambit Adicionada ao Inventario...");
	          		this.setModelo("Karambit");
	              break;
	     }
		}   
	    
	
	     
	   public void usarArma(){
			if(escolha != 0 ) {
				System.out.println("Voce usou a sua "+this.getModelo());
			}
			else {
				System.out.println("Voce nao pode usar uma arma. pois ainda nao escolheu");
			}
	   }
}
