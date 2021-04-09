import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    private Person person = new Person(20, "Bogge");

    private int actualAge;
    private int expectedAge;
    private String expectedName;
    private String actualName;
    private String expectedReverseName;
    private String actualReverseName;

    @Test
    public void getAge() {
        System.out.println("getAge");
        expectedAge = 20;
        actualAge = person.getAge();
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void setAge() {
        System.out.println("setAge");
        expectedAge = 32;
        person.setAge(32);
        actualAge = person.age;
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void getName() {
        System.out.println("getName");
        expectedName = "Bogge";
        actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setName() {
        System.out.println("setName");
        expectedName = "Mats";
        person.setName("Mats");
        actualName = person.name;
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void reverseName() {
        System.out.println("reverseName");
        expectedReverseName = "eggoB";
        actualReverseName = person.reverseName();
        Assert.assertEquals(expectedReverseName, actualReverseName);
    }
}