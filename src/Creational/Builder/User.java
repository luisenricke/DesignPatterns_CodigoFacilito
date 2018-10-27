package Creational.Builder;

public class User {

    private String name, lastname;
    private boolean enableContact;
    private String email, phone, address;
    private String payMethod, token;

    private User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.enableContact = false;
        this.email = "";
        this.phone = "";
        this.address = "";
        this.payMethod = "";
        this.token = "";
    }

    public static User Make(String name, String lastname) {
        return new User(name, lastname);
    }

    public User Build() {
        return this;
    }

    public BuilderUser setEnableContact(boolean enableContact) {
        if (!enableContact)
            throw new IllegalArgumentException("Illegal argument, does't accept false");

        this.enableContact = enableContact;
        return new BuilderUser(this);
    }

    public BuilderUserPay setPayMethod(String payMethod) {
        if (email.isEmpty() || address.isEmpty() || phone.isEmpty())
            throw  new IllegalArgumentException("Set all the fields");

        this.payMethod = payMethod;
        return  new BuilderUserPay(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class BuilderUser {
        private User user;

        public BuilderUser(User user) {
            this.user = user;
        }

        public BuilderUser setEmail(String email) {
            user.email = email;
            return this;
        }

        public BuilderUser setPhone(String phone) {
            user.phone = phone;
            return this;
        }

        public BuilderUser setAddress(String address) {
            user.address = address;
            return this;
        }

        public User Build() {
            return user;
        }
    }

    public static class BuilderUserPay{
        private User user;

        public BuilderUserPay(User user) {
            this.user = user;
        }

        public BuilderUserPay setToken(String token) {
            user.token = token;
            return this;
        }

        public User Build() {
            return user;
        }
    }

}
