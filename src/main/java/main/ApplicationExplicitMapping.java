package main;

import dbo.UserSpring;
import dto.UserDTOSpring;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationExplicitMapping {
    public static void main(String[] args) {
        UserSpring sourceUser = new UserSpring(1, "SpringUser", "customer@mail.com", "3806712345678", "Lviv");
        UserDTOSpring targetUserDTO = new UserDTOSpring();

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new PropertyMap<UserSpring, UserDTOSpring>() {
            protected void configure() {
                map().setUserCity(source.getCity());
            }
        });
        modelMapper.map(sourceUser, targetUserDTO);


        System.out.println(targetUserDTO);
    }
}
