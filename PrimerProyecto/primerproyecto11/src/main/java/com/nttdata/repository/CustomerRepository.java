package com.nttdata.repository;

import com.nttdata.model.Customer;
//aqui se almacenara los datos de los clientes de una manera simulando un base de datos.
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    public List<Customer> getAll(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Peramas", "Jose", "72154085", "1057756085", "personal"));
        customers.add(new Customer(2, "Gavidia", "Juan", "95194085", "1062654899", "empresarial"));
        customers.add(new Customer(3, "Alva", "Luis", "93158095", "2572154085", "personal"));
        customers.add(new Customer(4, "Tolentino", "Maria", "78134085", "4772154085", "empresarial"));
        customers.add(new Customer(5, "Vejarano", "Joaquin", "79237095", "6252154085", "personal"));
        customers.add(new Customer(6, "Vela", "Sasha", "91234675", "6345154085", "empresarial"));
        return customers;
    }
}
