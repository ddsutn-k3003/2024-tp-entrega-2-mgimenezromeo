package ar.edu.utn.dds.k3003.model;

import java.time.LocalDateTime;

public class DonacionDeVianda extends Contribucion{

  private static Double pesoPuntaje;

  public static void setPesoPuntaje(Double nuevoPuntaje) {
    pesoPuntaje = nuevoPuntaje;
  }

  public Double getPuntaje() {
    return pesoPuntaje;
  }
  public DonacionDeVianda(LocalDateTime fecha) {
    super(fecha);
    this.description = "Donacion de vianda";
  }

  public DonacionDeVianda(Long id, LocalDateTime fecha) {
    super(fecha);
    this.id = id;
    this.description = "Donacion de vianda";
  }
}
