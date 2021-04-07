import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testSetName(){
        Person person = new Person("Bill");
        //Given
        String expect = "Billy Bob Thorton";

        //When
        person.setName("Billy Bob Thorton");
        String actual = person.getName();
        //Then
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testSetAge(){
        Person person = new Person(59);
        //Given
        Integer expect = 60;

        //When
        person.setAge(60);
        Integer actual = person.getAge();
        //Then
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testDefaultConstructor(){
        //Given
        String expectedName= null;
        Integer expectedAge = 0;
        //When
        Person person = new Person();
        //Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName(){
        //Given
        String expected = "Leon";

        //When
        Person person = new Person(expected);

        //Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConstructorWithAge(){
        //Given
        Integer expected = 5;

        //When
        Person person = new Person(expected);
        person.setAge(expected);
        //String actual = person.getName();

        //Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
}
