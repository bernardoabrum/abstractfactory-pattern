package org.example;

public class Pagamento {

    private Boleto boleto;
    private Pix pix;

    public Pagamento (FabricaAbstrata fabrica) {
        this.boleto = fabrica.pagarBoleto();
        this.pix = fabrica.pagarPix();
    }

    public String pagarBoleto() {
        return this.boleto.processar();
    }

    public String pagarPix() {
        return this.pix.processar();
    }
}
