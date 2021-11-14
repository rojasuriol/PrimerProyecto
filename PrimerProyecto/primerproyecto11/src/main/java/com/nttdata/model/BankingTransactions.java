package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
// En esta clase se almacenara los parametros de las transacciones del banco
@Data
@AllArgsConstructor
public class BankingTransactions {
    private Integer accountId;
    private String description;
}
