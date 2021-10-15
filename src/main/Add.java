package main;

public class Add {
    public static int add(String input){
        if(input.equals("")){
            return 0;
        }

        else {

            String delimiter = ","; //default
            if(input.matches("//(.*)\n(.*)")){
                delimiter = Character.toString(input.charAt(2));
                input = input.substring(4);
            }

            String numList[] = delimiterSplit(input, delimiter + "|\n");
            return sum(numList);
        }
    }

    public static String[] delimiterSplit(String numbers, String delimiter){
        return numbers.split(delimiter);
    }

    public static int convert(String input){
        return Integer.parseInt(input);
    }

    public static int sum(String[] numbers){

        String negativeList = "";

        int total = 0;
        for(String number : numbers){
            if(convert(number) < 0){
                negativeList += (" " + number);
            }

                total += convert(number);
        }
        if(!negativeList.equals("")){
            throw new IllegalArgumentException("Negatives are not allowed: " + negativeList);
        }
        return total;
    }
}
