package aulaPoo;

/**
 *
 * @author HermesNonato7
 */
public class Carro {

    private String modelo;

    private int qntPortas;

    private String placa;

    private String motor;

    // Contrutor com Parâmetro
    public Carro(String placa) {
        this.setPlaca(placa);
    }

    public Carro(String placa, String motor) {
        this.setMotor(motor);
        this.setModelo(modelo);
    }

    public Carro() {
        this.setPlaca("A definir");
    }

    private boolean estaAcelerando = false;

    //
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
            System.out.println("Desacelerando...");
        }
        estaAcelerando = false;
    }

    private void ligarLuzFreio() {
        System.out.println("Ligando Luz de Freio");
    }

    public void ligar() {
        System.out.println("Ligado");
    }

    public void desligar() {
        System.out.println("Desligado");
    }

}
