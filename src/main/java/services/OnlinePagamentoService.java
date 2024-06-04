package services;

public interface OnlinePagamentoService {
  double taxaPagamento(double valor);
  double juros(double valor, int meses);
}
