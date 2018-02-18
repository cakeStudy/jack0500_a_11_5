import java.util.ArrayList;
import java.util.Collections;

public class ch11_5a
{
    /*Write a method called sortAndRemoveDuplicates that accepts a list of integers as its parameter and rearranges
    the list’s elements into sorted ascending order, as well as removing all duplicate values from the list. For example,
    the list [7, 4, –9, 4, 15, 8, 27, 7, 11, –5, 32, –9, –9]
    would become [–9, –5, 4, 7, 8, 11, 15, 27, 32] after a call to your method. Use a Set as part of your solution.*/

    public void run()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(-9);
        list.add(4);
        list.add(15);
        list.add(8);
        list.add(27);
        list.add(7);
        list.add(11);
        list.add(-5);
        list.add(32);
        list.add(-9);
        list.add(-9);

        System.out.println(sortAndRemoveDuplicates(list));
    }

    public ArrayList<Integer> sortAndRemoveDuplicates(ArrayList<Integer> list)
    {
        //sorts the list
        Collections.sort(list);
        int slutIndex = list.size();

        try
        {
            for (int i = 0; i < slutIndex; i++)
            {
                if (list.get(i) == list.get(i + 1))
                {
                    list.remove(i);
                    i--;
                    slutIndex--;
                }

            }
        }catch (IndexOutOfBoundsException IOOBe)
        {
            return list;
        }
        return list;
    }

}
