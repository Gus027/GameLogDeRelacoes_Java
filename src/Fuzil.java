import java.util.Scanner;

public class Fuzil implements Arma_IF{
    private String modelo;
    int escolha = 0;
    Scanner tlc = new Scanner(System.in);

    
    public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
    	
       
    	public void EscolherArma(){   		
    		 System.out.println("Armas:\n1 -  AK-47\n2 - M4-A4");
    	       System.out.println("Insira a sua escolha: ");
    	      switch(tlc.nextInt()){
    	            case 1:
    	            	escolha = 1;
    	            	System.out.println("Ak-47 Adicionada ao inventario...");
    	            	this.setModelo("AK-47");
    	            	getModelo();        	
    	               break;
    	            case 2:
    	            	escolha = 2;
    	            	System.out.println("M4-A4 Adicionada ao Inventario...");
    	                this.setModelo("M4");
    	                getModelo();
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

