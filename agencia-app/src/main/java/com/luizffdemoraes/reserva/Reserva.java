package com.luizffdemoraes.reserva;

import com.luizffdemoraes.cliente.Cliente;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Reserva extends PanacheEntity {

    // Varias reservas para um unico cliente, só vai carregar os dados do cliente se precisar consultar dados do cliente
    @ManyToOne(fetch = FetchType.LAZY)
    public Cliente cliente;
}
