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
        obj.setMotor(2.0f);

        obj.acelerar();

        Carro obj2 = new Carro();

        obj2.setModelo("Fiat");
        obj2.setQntPortas(5);
        obj2.setPlaca("JNH 1234");
        obj2.setCor("Vermelho");
        obj2.setCombustivel("Flex");
        obj2.setMotor(1.5f);

        obj.acelerar();

        // Comparando objetos
        System.out.println(obj + " <=> " + obj2);

        // Equals serve para comparar valores de atributos de objetos diferentes
        if (obj.getPlaca().equals(obj2.getPlaca())) {
            System.out.println("O objeto é igual");
        } else {
            System.out.println("O objeto é diferente");

        }

    }

}
