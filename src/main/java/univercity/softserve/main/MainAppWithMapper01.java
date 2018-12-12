package univercity.softserve.main;

import univercity.softserve.dbo.Address;
import univercity.softserve.dbo.Customer;
import univercity.softserve.dbo.Name;
import univercity.softserve.dbo.Order;
import univercity.softserve.dto.OrderDTO;
import org.modelmapper.ModelMapper;

public class MainAppWithMapper01 {

    public static void main(String[] args) {
        Name name = new Name("Jack", "Fox");
        Address address = new Address("NY", "Lafayette Street");
        Customer customer = new Customer(name);
        Order order = new Order(customer, address);

        ModelMapper modelMapper = new ModelMapper();
        OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);

        System.out.println(orderDTO);

        System.out.println("---------------");
        System.out.println("Validating mapping");
        modelMapper.validate();
    }
}
