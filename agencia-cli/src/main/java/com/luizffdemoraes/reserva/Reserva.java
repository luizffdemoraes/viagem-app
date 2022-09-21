package com.luizffdemoraes.reserva;

import com.luizffdemoraes.cliente.Cliente;

public class Reserva {

    private Cliente cliente;

    public Reserva(Cliente cliente) {
        this.cliente = cliente;
    }

    public static Reserva of(Cliente cliente){
        return new Reserva(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
