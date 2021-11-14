package com.nttdata.proxy;

import com.nttdata.model.Account;
import com.nttdata.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
//aqui se almacenaran las cuentas en una base de datos simulada.
public class AccountProxy
{
    public Stream<Account> accountsGet(){
        List<Account> accounts = new ArrayList<>();

        accounts.add(new Account( 1,"123-456-789", 1, 2000, "Cuenta de Ahorro"));
        accounts.add(new Account(2,"123-666-789", 2, 4000, "Cuenta Corriente"));
        accounts.add(new Account(3,"555-456-789", 3, 3500, "Plazo fijo "));
        accounts.add(new Account(4,"999-456-789", 4, 5500, "Cuenta de Ahorro"));
        accounts.add(new Account(5,"999-456-789", 5, 6300, "Cuenta Corriente"));
        accounts.add(new Account(6,"745-459-789", 6, 1200, "Cuenta de Ahorro"));


        return accounts.stream();

    }
}
