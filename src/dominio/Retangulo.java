package dominio;

public class Retangulo {
	private int valorBase;
    private int valorAltura;
    
    public Retangulo(int valorBase, int valorAltura) {
     
        this.valorBase = valorBase;
        this.valorAltura = valorAltura;
    }

    public int getValorBase() {
        return valorBase;
    }

    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
    }

    public int getValorAltura() {
        return valorAltura;
    }

    public void setValorAltura(int valorAltura) {
        this.valorAltura = valorAltura;
    }
    
    public int calcularArea() {
        return valorBase * valorAltura;
    }
    
    public int calcularPerimetro() {
        return 2 * (valorBase + valorAltura);
    }
}
