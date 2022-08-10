package validation;

import validation.exception.MontoPositivoException;
import validation.exception.NumeroPositivoException;

public class ValidacionArgumentos {

    private ValidacionArgumentos() {
    }

    /*
     * se usa directamente en valores de la entidad
     * */
    public static void validarValorPositivo(Float numero, String mensaje) {
        if(numero <= 0) {
            throw new NumeroPositivoException(mensaje);
        }
    }

    /*
    * esta se usa para validar algo de negocio
    * */
    public static void validarMontoPositivo(Float numero, String mensaje) {
        if(numero <= 0) {
            throw new MontoPositivoException(mensaje);
        }
    }

}
