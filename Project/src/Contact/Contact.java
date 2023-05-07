package Contact;


public class Contact {
    private String name;
    private String phone;
    private String email;
    private String address;

    final String fixname = "Japan Restuarant";
    final String fixphone = "099-999-9999";
    final String fixemail = "JPrestau@gmail.com";
    final String fixaddress = "Main Street, 123, Anytown, CA, 12345";


    public Contact() {
        this.name = fixname;
        this.phone = fixphone;
        this.email = fixemail;
        this.address = fixaddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\t\t\t " + name + "\n\t\t-------------------------\n"
                + "\t\t\t Phone: " + phone + "\n\t\t Email: " + email
                + "\n Address: " + address;
    }
}


