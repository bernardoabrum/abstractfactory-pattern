package org.example;

public class FabricaPF implements FabricaAbstrata {

    @Override
    public Boleto pagarBoleto() {
        return new BoletoPF();
    }

    @Override
    public Pix pagarPix() {
        return new PixPF();
    }
}
