package univercity.softserve.main;

import org.junit.Test;
import org.modelmapper.ModelMapper;
import univercity.softserve.dbo.Address;
import univercity.softserve.dbo.Customer;
import univercity.softserve.dbo.Name;
import univercity.softserve.dbo.Order;
import univercity.softserve.dto.OrderDTO;

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