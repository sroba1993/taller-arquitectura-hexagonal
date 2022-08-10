package servicio;

import entidad.Cuenta;
import repositorio.RepositorioTransferencia;
import validation.ValidacionArgumentos;

public class ServicioTransferencia {
    private final RepositorioTransferencia repositorioTransferencia;

    public ServicioTransferencia(RepositorioTransferencia repositorioTransferencia) {
        this.repositorioTransferencia = repositorioTransferencia;
    }

    public Long descontar(Cuenta cuenta, Float monto) {
        validarMonto(monto);
        return repositorioTransferencia.descontar(cuenta, monto);
    }

    public Long depositar(Cuenta cuenta, Float monto) {
        validarMonto(monto);
        return repositorioTransferencia.depositar(cuenta, monto);
    }
/*
* validacion de negocio
* */
    public boolean validarMonto(Float monto) {
        ValidacionArgumentos.validarMontoPositivo(monto, "el monto es negativo");
        return true;
    }
}
