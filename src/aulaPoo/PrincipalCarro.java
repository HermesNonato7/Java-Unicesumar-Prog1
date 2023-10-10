package aulaPoo;

/**
 *
 * @author HermesNonato7
 */
public class PrincipalCarro {

    public static void main(String args[]) {

        Carro obj = new Carro();

        obj.setModelo("BMW X1");
        obj.setPlaca("QWE 1234");
        obj.setQntPortas(4);
        
        obj.acelerar();
        obj.parar();

        //No SET podemos criar regras de validação de atributos. Exemplo de código:
        /*
        public void setIdade(int idade) {
            if(testeIdade(idade)){
                this.idade = idade;
            } else {
                this.idade = 0;
            }
        }

         */
    }
}
