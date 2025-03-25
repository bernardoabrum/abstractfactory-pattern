package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PagamentoTest {

    @Test
    void deveProcessarBoletoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Pagamento pagamento = new Pagamento(fabrica);
        assertEquals("Boleto pago como pessoa física", pagamento.pagarBoleto());
    }

    @Test
    void deveProcessarBoletoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Pagamento pagamento = new Pagamento(fabrica);
        assertEquals("Boleto pago como pessoa jurídica", pagamento.pagarBoleto());
    }

    @Test
    void deveProcessarPixPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Pagamento pagamento = new Pagamento(fabrica);
        assertEquals("Pix pago como pessoa física", pagamento.pagarPix());
    }

    @Test
    void deveProcessarPixPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Pagamento pagamento = new Pagamento(fabrica);
        assertEquals("Pix pago como pessoa jurídica", pagamento.pagarPix());
    }
}
