package univercity.softserve.main;

import univercity.softserve.dbo.Address;
import univercity.softserve.dbo.Customer;
import univercity.softserve.dbo.Name;
import univercity.softserve.dbo.Order;
import univercity.softserve.dto.OrderDTO;

public class MainWithoutMapper {
    public static void main(String[] args) {
        Name name = new Name("Jack", "Fox");
        Address address = new Address("NY", "Lafayette Street");
        Customer customer = new Customer(name);
        Order order = new Order(customer, address);

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setCustomerFirstName(order.getCustomer().getName().getFirstName());
        orderDTO.setCustomerLastName(order.getCustomer().getName().getLastName());
        orderDTO.setBillingStreet(order.getBillingAddress().getStreet());
        orderDTO.setBillingCity(order.getBillingAddress().getCity());

        System.out.println(orderDTO);
    }
}
