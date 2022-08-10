package entidad;

import validation.ValidacionArgumentos;

public class Cuenta {
    private Long numero;
    private Float saldo;
    private String acreedor;

    public Cuenta(Long numero, Float saldo, String acreedor) {
        ValidacionArgumentos.validarValorPositivo(Float.valueOf(numero), "numero negativo");
        ValidacionArgumentos.validarValorPositivo(saldo, "saldo negativo");
        this.numero = numero;
        this.saldo = saldo;
        this.acreedor = acreedor;
    }

    public Long getNumero() {
        return numero;
    }

    public Float getSaldo() {
        return saldo;
    }

    public String getAcreedor() {
        return acreedor;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public void setAcreedor(String acreedor) {
        this.acreedor = acreedor;
    }
}
