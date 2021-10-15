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
    @Test
    public void return_sum_for_two_inputs() {
        assertEquals(add("1,2"), 3);
    }

    @Test
    public void return_sum_for_any_number_of_inputs() {
        assertEquals(add("1,2,3"), 6);
    }

    @Test
    public void return_sum_for_commas_and_new_lines() {
        assertEquals(6, add("1\n2,3"));
   }

    @Test
    public void return_sum_for_delimiters() {
        assertEquals(3, add("//;\n1;2"));
    }

    @Test
    public void throw_error_for_negatives(){
        try {
            add("-1,2");
        }
        catch (IllegalArgumentException e){
            assertEquals(e.getMessage(), "Negatives are not allowed:  -1");
        }

        try {
            add("2,-4,3,-5");
        }
        catch (IllegalArgumentException e){
            assertEquals(e.getMessage(), "Negatives are not allowed:  -4 -5");
        }
    }



}
