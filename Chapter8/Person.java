package Chapter8;

abstract public class Person {
    
    protected String name;
    protected String id;
    protected String addr;
    protected String email;

    protected Person(String name, String id, String addr, String email) {
        this.name = name;
        this.id = id;
        this.addr = addr;
        this.email = email;
    }

    protected Person(String name, String id, String email) {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

}
