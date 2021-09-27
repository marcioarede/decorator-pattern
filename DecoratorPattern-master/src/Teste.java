import org.junit.After; import org.junit.Before; import org.junit.Test;  import static org.junit.Assert.*;
public class Teste {
    @Before     public void setUp() throws Exception {

    }
    @After     public void tearDown() throws Exception {

    }
    @Test   public void test() {
        Beverage darkRoast = new DarkRoast();
        CondimentDecorator milk = new Milk(darkRoast);
        CondimentDecorator DobleMocha = new DobleMocha(milk);
        assertEquals(5.05, DobleMocha.cost(), 0.01f);
    }
 }