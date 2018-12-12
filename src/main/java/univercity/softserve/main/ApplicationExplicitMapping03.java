package univercity.softserve.main;

import univercity.softserve.dbo.UserSpring;
import univercity.softserve.dto.UserDTOSpring;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import univercity.softserve.dto.UserDTOSpringWithCity;

@SpringBootApplication
public class ApplicationExplicitMapping03 {
    public static void main(String[] args) {
        UserSpring sourceUser = new UserSpring(1, "SpringUser", "customer@mail.com", "3806712345678", "Lviv");
        UserDTOSpringWithCity targetUserDTO = new UserDTOSpringWithCity();

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(sourceUser, targetUserDTO);
        modelMapper.addMappings(new PropertyMap<UserSpring, UserDTOSpringWithCity>() {
            protected void configure() {
                map().setUserCity(source.getCity());
            }
        });


        System.out.println(targetUserDTO);
    }
}
