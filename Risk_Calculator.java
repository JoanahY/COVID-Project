import java.util.*;
import java.util.Scanner;

public class Risk_Calculator
{
    // instance variables - replace the example below with your own
    private int m;
    private String s;
    private String[] states = new String[]{"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming", "USA"};
    private int[] numbers = new int[]{46, 20, 47, 55, 35, 26, 37, 41, 38, 43, 6, 20, 23, 28, 24, 34, 48, 39, 20, 22, 40, 17, 16, 32, 21, 26, 21, 27, 28, 41, 25, 45, 55, 10, 31, 55, 15, 30, 47, 64, 17, 35, 49, 37, 21, 40, 16, 31, 22, 23, 37, 37, 37, 37};
    
    /**
     * Constructor for objects of class Risk_Calculator
     */
    public Risk_Calculator(String state, int members)
    {
        s=state;
        m=members;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double FindRatio()
    {
        int temp = 51;
        for(int x=0; x<50; x++)
        {
            if (s.equals(states[x]))
            {
                temp = x;
            }
        }
        double ans = numbers[temp];
        ans = ans*14/100000*100/63;
        return ans;
    }
    
    public double RiskPercentage()
    {
        double temp = FindRatio();
        double ans = Math.pow(1-temp, m);
        return 100-ans*100;
    }
}
