package main;

import dbo.Address;
import dbo.Customer;
import dbo.Name;
import dbo.Order;
import dto.OrderDTO;
import org.modelmapper.ModelMapper;

public class MainApp {

    public static void main(String[] args) {
        Name name = new Name("Jack", "Fox");
        Address address = new Address("NY", "Lafayette Street");
        Customer customer = new Customer(name);
        Order order = new Order(customer, address);
        ModelMapper modelMapper = new ModelMapper();

        OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);
        System.out.println(orderDTO);
    }
}
