package CriarCarros;

public class Carro {
    private String marca;
    private int ano;
    private float preco;

    
    //Construtores
    
    public Carro(String marca, int ano, float preco) {
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }
    
    public Carro(){
        
    }
    
    // Métodos acessores
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", ano=" + ano + ", preco=" + preco + '}';
    }
    
    
    
    
}
