package weekTwo.Sallys;

public class Product {

    String name;
    Double price;
    String desciption;

    public Product() {}

    

    public Product(String name, Double price, String desciption) {
        this.name = name;
        this.price = price;
        this.desciption = desciption;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice(Integer age) {

        if(age < 13) {

            return price*.7;

        }

        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", desciption=" + desciption + "]";
    }
    
    
}
