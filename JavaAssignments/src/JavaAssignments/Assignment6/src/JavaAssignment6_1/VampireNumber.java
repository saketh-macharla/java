package JavaAssignment6_1;

import java.util.Arrays;
import java.util.HashSet;

public class VampireNumber {
    private static int numberOfDigits(long num)
    {
        return Long.toString(Math.abs(num)).length();
    }

    private static boolean findFactors(long originalNumber, long factor1, long factor2)
    {
        //only either of factor should have trailing 0's
        if(Long.toString(factor1).endsWith("0") && Long.toString(factor2).endsWith("0")) return false;

        //length of each factor should be of length originalNumber length / 2
        int originalNumberLength = numberOfDigits(originalNumber);
        if(numberOfDigits(factor1) != originalNumberLength / 2 || numberOfDigits(factor2) != originalNumberLength / 2) return false;

        //finding out if all the digits present in originalNumber are present in both factor1 & facto2 combined
        byte[] originalNumberBytes = Long.toString(originalNumber).getBytes();
        byte[] factorBytes = (Long.toString(factor1) + Long.toString(factor2)).getBytes();
        Arrays.sort(originalNumberBytes);
        Arrays.sort(factorBytes);
        return Arrays.equals(originalNumberBytes, factorBytes);
    }
    public static void vampireNumber()
    {
        HashSet<Long> vampireNumbers = new HashSet<Long>();
        for(long number = 10; vampireNumbers.size() <= 99; number++ )
        {
            //number should be of even length
            if((numberOfDigits(number) % 2) != 0)
            {
                number = number * 10 - 1;
                continue;
            }

            for(long factor1 = 2; factor1 <= Math.sqrt(number) + 1; factor1++)
            {
                if(number % factor1 == 0)
                {
                    long factor2 = number / factor1;
                    //checking if factor1 and factor2 are correct vampire numbers for number in findFactors method
                    if(findFactors(number, factor1, factor2) && factor1 <= factor2)
                    {
                        vampireNumbers.add(number);
                        System.out.println(number + ": [" + factor1 + ", " + factor2 +"]");
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        vampireNumber();
    }
}
