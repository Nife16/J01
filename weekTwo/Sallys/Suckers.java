package weekTwo.Sallys;

public class Suckers {
    
    String email;
    String firstName;
    String lastName;
    String phoneNumber;
    Integer age;
    String password;

    Address address;

    public Suckers() {
    }

    public Suckers(String email, String firstName, String lastName, String phoneNumber, Integer age, String password) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Suckers [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
                + phoneNumber + ", age=" + age + ", password=" + password + "]";
    }
    
}
