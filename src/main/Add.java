package main;

public class Add {
    public static int add(String input){
        if(input.equals("")){
            return 0;
        }
        else
            return convert(input);
    }

    public static int convert(String input){
        return Integer.parseInt(input);
    }

}
