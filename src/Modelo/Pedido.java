package Modelo;

import java.io.Serializable;
import java.util.Date;


public class Pedido implements Serializable {

    // Variables
    private Long id;
    private Date fechaPedido;
    private Date fechaEntrega;
    private Boolean entregado;
    private Boolean pagado;
}
