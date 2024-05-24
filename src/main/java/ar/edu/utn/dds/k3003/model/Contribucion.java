package ar.edu.utn.dds.k3003.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public abstract class Contribucion {

  @Getter @Setter
  protected Long id;
  @Getter @Setter
  protected String description;

  @Getter @Setter
  private LocalDateTime contibutionDate;

  public Contribucion(LocalDateTime fecha) {
    this.contibutionDate = fecha;
  }

  public abstract Double getPuntaje();

}
