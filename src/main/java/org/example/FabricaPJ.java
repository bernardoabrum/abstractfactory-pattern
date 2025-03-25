package org.example;

public class FabricaPJ implements FabricaAbstrata {

    @Override
    public Boleto pagarBoleto() {
        return new BoletoPJ();
    }

    @Override
    public Pix pagarPix() {
        return new PixPJ();
    }
}
