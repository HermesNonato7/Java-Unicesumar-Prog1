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

    private String motor;

    private boolean estaAcelerando = false;
    
    // GETTER E SETTER - ENCAPSULAMENTOS

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

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public boolean isEstaAcelerando() {
        return estaAcelerando;
    }

    public void setEstaAcelerando(boolean estaAcelerando) {
        this.estaAcelerando = estaAcelerando;
    }

    // Exemplo de ENCAPSULAMENTO de Métodos
    public void acelerar() {
        estaAcelerando = true;
        if (motor == null) {
            this.setMotor("Motor 1.0");
        }
        System.out.println("Acelerando com o motor: " + motor);
    }

    public void parar() {
        this.ligarLuzFreio();
        this.desacelerar();
        System.out.println("Carro parado");
    }

    private void desacelerar() {
        if (estaAcelerando == true) {
            System.out.println("Desaceleranso...");
        }
        estaAcelerando = false;
    }
    
    private void ligarLuzFreio(){
        System.out.println("Ligando Luz de Freio");
    }

    public void ligar() {
        System.out.println("Ligado");
    }

    public void desligar() {
        System.out.println("Desligado");
    }

}
