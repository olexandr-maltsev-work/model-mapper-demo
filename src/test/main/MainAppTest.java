package main;

import dbo.Address;
import dbo.Customer;
import dbo.Name;
import dbo.Order;
import dto.OrderDTO;
import org.junit.Test;
import org.modelmapper.ModelMapper;

import static org.junit.Assert.*;

public class MainAppTest {

    @Test
    public void testOrderDTO() {
        Name name = new Name("Jack", "Fox");
        Address address = new Address("NY", "Lafayette Street");
        Customer customer = new Customer(name);
        Order order = new Order(customer, address);
        ModelMapper modelMapper = new ModelMapper();

        OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);

        assertEquals(order.getCustomer().getName().getFirstName(), orderDTO.getCustomerFirstName());
        assertEquals(order.getCustomer().getName().getLastName(), orderDTO.getCustomerLastName());
        assertEquals(order.getBillingAddress().getStreet(), orderDTO.getBillingStreet());
        assertEquals(order.getBillingAddress().getCity(), orderDTO.getBillingCity());

    }
}