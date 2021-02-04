package bank.account;

public abstract class Account {

    private Person owner;
    private String password;

    abstract void addAccToOwner(Person p);

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getOwner() {
        return owner;
    }

    public String getPassword() {
        return password;
    }

}
