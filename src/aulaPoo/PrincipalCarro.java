package aulaPoo;

/**
 *
 * @author HermesNonato7
 */
public class PrincipalCarro {
    
    public static void main(String args[]){
       
        Carro obj = new Carro();
        
        obj.modelo = "BMW X!";
        obj.placa = "QWE 1234";
        obj.qntPortas = 4;
        
        obj.acelerar();
        
    }
    
}
