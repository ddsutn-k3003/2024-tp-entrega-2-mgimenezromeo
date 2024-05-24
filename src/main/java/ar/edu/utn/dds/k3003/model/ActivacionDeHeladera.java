package ar.edu.utn.dds.k3003.model;

import lombok.Setter;

import java.time.LocalDateTime;

public class ActivacionDeHeladera extends Contribucion{

  @Setter
  private static Double pesoPuntaje;

  private LocalDateTime ActivationDate;

  //Usamos el atributo max del packaga y creamos un segundo constructor
  private LocalDateTime DeactivationDate = LocalDateTime.MAX;


   public ActivacionDeHeladera(LocalDateTime fecha, LocalDateTime ActivationDate, LocalDateTime DeactivationDate) {
    super(fecha);
    this.description = "Heladera Activada";
    this.ActivationDate = ActivationDate;
    this.DeactivationDate = DeactivationDate;
  }

  public ActivacionDeHeladera(LocalDateTime fecha, LocalDateTime ActivationDate) {
    super(fecha);
    this.description = "Heladera Activada";
    this.ActivationDate = ActivationDate;
  }


  @Override
  public Double getPuntaje() {

    //Puntaje = pesoPuntaje * meses activo. Si no hay fecha de finalizacion se cuenta el dia de hoy.
    if(DeactivationDate == LocalDateTime.MAX){
        return pesoPuntaje * (LocalDateTime.now().getMonthValue() - ActivationDate.getMonthValue()) + 12*(LocalDateTime.now().getYear() - ActivationDate.getYear());
    }else{
        return pesoPuntaje * (DeactivationDate.getMonthValue() - ActivationDate.getMonthValue()) + 12*(DeactivationDate.getYear() - ActivationDate.getYear());
    }

  }
}
