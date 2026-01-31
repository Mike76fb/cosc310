package Chapter8;

public class Banner {
    
    public static void main(String[]args) {
        Person persons[] = new Person[15_000];
        persons[0] = new Student("John Smith", "900000000", "123 Street", "city,state,zip, USA", "jsmith@samford.edu");
        persons[1] = new Faculty("Jane Doe", "800000000", "456 Avenue", "city,state,zip, USA", "jdoe@samford.edu");
        persons[2] = new Staff("Bob Johnson", "700000000", "789 Boulevard", "city,state,zip, USA", "bjohnson@samford.edu");
        for (Person person : persons) {
            if(person != null) {
                System.out.println("Name: " + person.getName());
                System.out.println("Type: " + person.getType());
                //if(person instanceof Person)
            }
        }
        
    }
}
