
public class Desarmado implements Arma_IF {
    private String Modelo;
    int escolha = 0;
    public String getModelo() {
		return Modelo;
	}
	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}
	
	
		public void EscolherArma() {
			escolha = 1;
			this.setModelo("desarmado");
	    	System.out.println("Voce Esta "+this.Modelo); 	
	    }
		public void usarArma(){
    		if(escolha != 0 ) {
    			System.out.println("Voce está "+this.getModelo());
    		}
    		else {
    			System.out.println("Voce nao pode usar uma arma. pois ainda nao escolheu");
    		}
    }
    
    
}
