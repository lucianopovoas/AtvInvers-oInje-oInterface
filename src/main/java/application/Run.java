package application;

import entities.Contrato;
import entities.Parcela;
import java.awt.Container;
import java.time.LocalDate;
import java.util.Scanner;
import services.ContratoService;
import services.PaypalService;

public class Run {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Numero do Contrato:");
    int nContrato = scan.nextInt();
    System.out.println("Data do Contrato:");
    LocalDate dContrato = LocalDate.parse(scan.next());
    System.out.println("Valor Total do Contrato:");
    double vtContrato = scan.nextDouble();

    Contrato contrato = new Contrato(nContrato, dContrato, vtContrato);

    System.out.println("Numero de Parcelas:");
    int nParcelas = scan.nextInt();

    ContratoService contratoService = new ContratoService(new PaypalService());

    contratoService.processContrato(contrato, nParcelas);

    System.out.println("Parcelas: ");
    for (Parcela parcela : contrato.getParcelas()){
      System.out.println(parcela);
    }
  }
}
