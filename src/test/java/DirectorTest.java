import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Toad", 7842, 25.000, "film", 400.000);
    }
    @Test
    public void hasBudget(){
        assertEquals(400.000, director.getBudget(), 0.01);
    }
    @Test
    public void hasName(){
        assertEquals("Toad", director.getName());
    }
    @Test
    public void hasNI(){
        assertEquals(7842, director.getNI());
    }
    @Test
    public void hasDeptName(){
        assertEquals("film", director.getDeptName());
    }
    @Test
    public void hasSalary(){
        assertEquals(25.000, director.getSalary(),0.01);
    }
    @Test
    public void managerCanRaiseSalary(){
        director.raiseSalary(10.5);
        assertEquals(11.55, director.getSalary(), 0.01);
    }
}
