import java.util.*;
import java.io.*;
public class Runner
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            File file = new File("input.txt");

            Scanner chop = new Scanner(file);

            ArrayList<Integer> numbers = new ArrayList<>();

            while(chop.hasNextInt())
            {
                numbers.add(chop.nextInt());
            }

            boolean skip = false;
            for(int i = 0; i < numbers.size() - 1; i++)
            {
                for(int j = i; j < numbers.size(); j++)
                {
                    if(numbers.get(i) + numbers.get(j) == 2020)
                    {
                        System.out.println(numbers.get(i) * numbers.get(j));
                        skip = true;
                    }
                    if(skip)
                    {
                        break;
                    }
                }
                if(skip)
                {
                    break;
                }
                chop.close();
            }
        }catch(Error ignored) {}
    }
}
