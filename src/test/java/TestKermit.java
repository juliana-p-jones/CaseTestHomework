import org.junit.Assert;
import org.junit.Test;

public class TestKermit {
    @Test
    public void testMakeSoundMethod() {
        //given
        Kermit kermit = new Kermit();
        //when
        String expect = "It ain't easy being green";
        String actual = kermit.makeSound(1);
        //then
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testSetColor() {
        Kermit kermit = new Kermit("green");
        //Given
        String expect = "green";

        //When
        kermit.setColor("green");
        String actual = kermit.getColor();
        //Then
        Assert.assertEquals(expect, actual);
    }
}
