public class TestPerson {

    public static void main(String[] args) {
        Person person1 = new Person("二狗",3);
        System.out.println(person1);
        Person person2 = new Person("二狗",3,1);
        System.out.println(person2);
        person1.setAge(2);
        System.out.println("Age:"+person1.getAge());
        person1.setSex(2);
        person1.setSex(1);
        System.out.println("Sex:"+person1.getSex());
        person1.setName("123");
        System.out.println("Name"+person1.getName());
    }
}
