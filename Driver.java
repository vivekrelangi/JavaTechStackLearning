package OOPS;

public class Driver{
    public static void main(String[] args) throws Exception{
        //User user1 = new User();
        /*user1.first_name="john";
        user1.last_name="doeayya";
        user1.gender='M';
        user1.age=20;*/

        //System.out.println(user1.getAgeGroup());
        //user1.display();

        User user2 = new User();
        //user2.first_name="john";
        user2.setFirst_name("john");
        user2.setLast_name("chinnayya");
        user2.setGender('M');
        //user2.setAge(-27);
        user2.setAge(27);
        //user2.last_name="doeamma";
        //user2.gender='F';
        //user2.age=18;

        System.out.println(user2.getAgeGroup());
        System.out.println(user2.getGender());
        user2.display();

        //User user3 = new User("John", "doechinnayya",19,'M');

        //System.out.println(user3.getAgeGroup());
        //user3.display();
    }
}
