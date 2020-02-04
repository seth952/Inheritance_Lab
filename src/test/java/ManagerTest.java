import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Sam",345, 18.000, "Java");
    }


    @Test
    public void hasName(){
        assertEquals("Sam", manager.getName());
    }
    @Test
    public void hasNI(){
        assertEquals(345, manager.getNI());
    }
    @Test
    public void hasDeptName(){
        assertEquals("Java", manager.getDeptName());
    }
    @Test
    public void hasSalary(){
        assertEquals(18.000, manager.getSalary(),0.01);
    }
    @Test
    public void managerCanRaiseSalary(){
        manager.raiseSalary(10.5);
        assertEquals(19.89, manager.getSalary(), 0.01);
    }
    @Test
    public void payManagerBonus(){
        manager.payBonus();
        assertEquals(18.0, manager.getSalary(), 0.01);
    }







}
