package univercity.softserve.main;

import univercity.softserve.dbo.UserSpring;
import univercity.softserve.dto.UserDTOSpring;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApplication02 {

    public static void main(String[] args) {
        UserSpring sourceUser = new UserSpring(1, "SpringUser", "customer@mail.com", "3806712345678", "Lviv");

        UserDTOSpring targetUserDTO = new UserDTOSpring();

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(sourceUser, targetUserDTO);

        SpringApplication.run(SpringApplication02.class, args);
        System.out.println(targetUserDTO.getName());
        System.out.println(targetUserDTO.getEmail());
        System.out.println(targetUserDTO.getMobileNumber());

    }
}
