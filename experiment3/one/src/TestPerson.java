public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        person.setAge(2);
        System.out.println("Age:"+person.getAge());
        person.setSex(2);
        person.setSex(1);
        System.out.println("Sex:"+person.getSex());
        person.setName("123");
        System.out.println("Name"+person.getName());
    }
}
