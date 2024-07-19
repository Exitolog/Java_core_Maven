package lesson3_hw;

import java.time.Year;
import java.util.Comparator;

public class OldYearComporator implements Comparator<DateUs> {
    @Override
    public int compare(DateUs o1, DateUs o2) {
        return (Year.now().getValue() - o1.getYear()) -(Year.now().getValue() - o2.getYear());
        //сортируем по удалению от текущего года (от ближайшего)
    }
}
