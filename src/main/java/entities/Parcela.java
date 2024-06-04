package entities;

import java.time.LocalDate;

public class Parcela {

  private LocalDate vencimentoData;
  private double valor;

  public Parcela(LocalDate vencimentoData, double valor) {
    this.vencimentoData = vencimentoData;
    this.valor = valor;
  }

  public LocalDate getVencimentoData() {
    return vencimentoData;
  }

  public void setVencimentoData(LocalDate vencimentoData) {
    this.vencimentoData = vencimentoData;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  @Override
  public String toString() {
    return vencimentoData + " - " + valor;
  }
}
