package test;
import static main.Add.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.junit.jupiter.api.Assertions;


public class AddTest {
   @Test
   public void return_zero_for_empty_input(){
       Assertions.assertEquals(add(""), 0);
   }

    @Test
    public void return_number_for_one_input() {
        assertEquals(add("1"), 1);
    }

}
