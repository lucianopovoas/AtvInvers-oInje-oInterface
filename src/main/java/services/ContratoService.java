package services;

import entities.Contrato;
import entities.Parcela;
import java.time.LocalDate;

public class ContratoService {

  private OnlinePagamentoService onlinePagamentoService;

  public ContratoService(OnlinePagamentoService onlinePagamentoService) {
    this.onlinePagamentoService = onlinePagamentoService;
  }

  public void processContrato(Contrato contrato, int meses){

    double parcelaBasica = contrato.getValorTotal() / meses;

    for (int i = 1; i<meses+1; i++){
      LocalDate vencimentoParcela = contrato.getData().plusMonths(i);

      double juros = onlinePagamentoService.juros(parcelaBasica, i);
      double taxa = onlinePagamentoService.taxaPagamento(parcelaBasica + juros);
      double parcela = parcelaBasica + juros + taxa;

      contrato.getParcelas().add(new Parcela(vencimentoParcela, parcela));
    }
  }
}
