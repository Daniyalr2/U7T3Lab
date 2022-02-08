import java.util.ArrayList;

public class Digits
{
    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * PRECONDITION: num >= 0
     */
    public Digits(int num)
    {
        int number;
        while (num >= 10)
        {
            number = num;
            number %= 10;
            digitList.set(0, number);
            num = (int)(num/10);
        }

    }

    // GETTER METHOD: added to enable test code (not provided in original FRQ)
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing()
    {
        int number = digitList.get(0);
        for (int i = 1; i < digitList.size(); i++)
        {
            if (number < digitList.get(i))
            {
                return false;
            }
            else
            {
                number = digitList.get(i);
            }
        }
        return true;
    }
}
