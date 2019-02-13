public class Gift {
    private String gender;
    private String price;
    private String name;
    public Gift(){
        name ="";
        gender = "";
        price ="";
    }
    public Gift(String name, String gender, String price){
        super();
        this.name = name;
        this.price = price;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
