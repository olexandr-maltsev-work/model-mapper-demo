package univercity.softserve.dto;

public class UserDTOSpringWithCity {

    private String name;
    private String email;
    private String mobileNumber;
    private String userCity;

    public UserDTOSpringWithCity() {
    }

    public UserDTOSpringWithCity(String name, String email, String mobileNumber, String userCity) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.userCity = userCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    @Override
    public String toString() {
        return "UserDTOSpringWithCity{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", userCity='" + userCity + '\'' +
                '}';
    }
}
