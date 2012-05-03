import org.junit.*;
import static org.junit.Assert.*;

public class MoneyTest {
    @Test
    public void addFiveDollarsAndTenFrancs() {
        // Given : I have $5 and 10 CHF 
        
        Franc 
        // And : The exchange rate is 2:1
        
        // When: I add the two together
        
        // Then: The result should be 10 dollars
        
    }
    
    @Test
    public void multiplyFiveDollarsTimesTwo(){
        // Given : I have $5
        Dollar five = new Dollar(5);
        // When: I multiply it by 2
        five.times(2);
        // Then: I should have $10
        assertEquals(10,five.amount);
    } 
}
