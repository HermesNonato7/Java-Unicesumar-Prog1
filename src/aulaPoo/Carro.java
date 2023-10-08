package aulaPoo;

/**
 *
 * @author HermesNonato7
 */
public class Carro {

    private String modelo;

    private int qntPortas;

    private String placa;

    private String cor;

    private String combustivel;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQntPortas() {
        return qntPortas;
    }

    public void setQntPortas(int qntPortas) {
        this.qntPortas = qntPortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void ligar() {
        System.out.println("Ligado");
    }

    public void desligar() {
        System.out.println("Desligado");
    }

    public void acelerar() {
        System.out.println("Acelerando");
    }

    public void parar() {
        System.out.println("Parando");
    }

}
