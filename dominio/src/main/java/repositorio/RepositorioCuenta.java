package repositorio;

import entidad.Cuenta;

public interface RepositorioCuenta {

    boolean cuentaExistente(Long numeroCuenta);
    Cuenta consultarPorNumero(Long numeroCuenta);
}
