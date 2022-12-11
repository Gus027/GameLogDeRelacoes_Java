import java.util.Scanner;

public class Revolver implements Arma_IF{
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
    		System.out.println("Armas:\n1 -  Glock\n2 - Desert Eagle");
            System.out.println("Insira a sua escolha: ");
            switch(tlc.nextInt()){
               case 1:
            	  this.escolha = 1;
            	  System.out.println("Glock Adicionada ao Inventario...");
                  this.setModelo("Glock");
                  break;
               case 2:
            	  this.escolha = 2;
            	  System.out.println("Desert Eagle Adicionada ao Inventario...");
                  this.setModelo("Desert Eagle");
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
