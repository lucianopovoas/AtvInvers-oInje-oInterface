package services;

public class PaypalService implements OnlinePagamentoService{

  @Override
  public double taxaPagamento(double valor) {
    return valor * 0.02;
  }

  @Override
  public double juros(double valor, int meses) {
    return (valor * 0.01) * meses;
  }
}
