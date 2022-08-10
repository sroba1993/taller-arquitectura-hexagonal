package servicio;

import entidad.Cuenta;
import repositorio.RepositorioCuenta;

public class ServicioCuenta {
    private final RepositorioCuenta repositorioCuenta;

    public ServicioCuenta(RepositorioCuenta repositorioCuenta) {
        this.repositorioCuenta = repositorioCuenta;
    }

    public boolean cuentaExistente(Long numeroCuenta) {
        return repositorioCuenta.cuentaExistente(numeroCuenta);
    }

    public Cuenta consultarPorNumero(Long numeroCuenta) {
        return repositorioCuenta.consultarPorNumero(numeroCuenta);
    }
}
