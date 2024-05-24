package ar.edu.utn.dds.k3003.model;

import lombok.Setter;


import java.time.LocalDateTime;

public class RepartoDeTarjetas extends Contribucion{

  private Double cantidad;
  @Setter
  private static Double pesoPuntaje;

  //Compilador pide que se declare abstracto si se implementa por Lombok....

  @Override
  public Double getPuntaje() {
    return pesoPuntaje;
  }

  public RepartoDeTarjetas(Double cantidad, LocalDateTime fecha) {
    super(fecha);
    this.cantidad = cantidad;
    this.description = "Reparto de tarjetas";
  }
}
