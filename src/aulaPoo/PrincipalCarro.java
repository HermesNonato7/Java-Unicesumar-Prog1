package aulaPoo;

/**
 *
 * @author HermesNonato7
 */
public class PrincipalCarro {

    public static void main(String args[]) {

        Carro obj = new Carro();

        obj.setModelo("BMW X1");
        obj.setQntPortas(4);
        obj.setPlaca("QWE 1234");
        obj.setCor("Azul Royal");
        obj.setCombustivel("gasolina");

        obj.acelerar();

    }

}
