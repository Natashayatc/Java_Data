/** Сравнивает объекты класса по длине
 * @version 1.0 05 ноября 2018
 * @author Natasha Yatcenya
 */
package Priority_queue;
import java.util.Comparator;

public class StringLengthComparator implements Comparator<String>
{
    @Override
    public int compare(String x, String y)
    {
        //предположим, что не одна строка не является нулевой
        if (x.length() < y.length())
        {
            return -1;
        }
        if (x.length() > y.length())
        {
            return 1;
        }
        return 0;
    }
}