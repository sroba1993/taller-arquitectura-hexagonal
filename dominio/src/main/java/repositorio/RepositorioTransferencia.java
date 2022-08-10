package repositorio;

import entidad.Cuenta;

public interface RepositorioTransferencia {
    Long descontar(Cuenta cuenta, Float monto);
    Long depositar(Cuenta cuenta, Float monto);
}
