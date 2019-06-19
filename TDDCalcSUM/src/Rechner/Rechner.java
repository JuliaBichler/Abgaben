package Rechner;

import org.omg.CORBA.DynAnyPackage.Invalid;

public class Rechner {
    public  static int sum (String input, String delimeter)throws InvalidFormatException
    {
        String[] stringNumbers = input.split(delimeter);
        if(stringNumbers.length<2)
        {
            throw new InvalidFormatException();
        }
        try{
            return Integer.parseInt(stringNumbers[0])+ Integer.parseInt(stringNumbers[1]);
        }
        catch(NumberFormatException e)
        {
            throw new InvalidFormatException();
        }

    }

    public static int sum (String input) throws InvalidFormatException
    {
        return sum(input,";");
    }

    public static int sumList(String input, String delimeter) throws InvalidFormatException
    {
        int sum=0;
        String[] stringNumbers = input.split(delimeter);
        if(stringNumbers.length<2)
        {
            throw new InvalidFormatException();
        }
        try{
            for(int i=0;i<stringNumbers.length;i++)
            {
                sum=sum+Integer.parseInt(stringNumbers[i]);
            }
            return sum;
        }
        catch(NumberFormatException e)
        {
            throw new InvalidFormatException();
        }
    }

    public static int sumList(String input) throws InvalidFormatException
    {
        return sumList(input, ";");
    }
}
