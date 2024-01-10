package QuickSortExample.quicksort;

import QuickSortExample.model.Human;
import QuickSortExample.util.ShowProcessHuman;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class QuickSortHuman {

    private static ArrayList<Human> sortedHumanList = new ArrayList<>();

    public static void sortById(ArrayList<Human> humanList) {

        Human[] humans = humanList.toArray(new Human[humanList.size()]);

        Comparator<Human> humanComp = (o1, o2) -> Long.compare(o1.getId(), o2.getId());

        Human[] sortedHumans = quickSort(humans, humanComp);

        sortedHumanList = new ArrayList<>(Arrays.asList(sortedHumans));

        ShowProcessHuman.showValues(sortedHumanList);

    }

    public static void sortByName(ArrayList<Human> humanList) {

        Human[] humans = humanList.toArray(new Human[humanList.size()]);

        Comparator<Human> humanComp = (o1, o2) -> {
            Collator collator = Collator.getInstance(new Locale("tr", "TR"));
            return collator.compare(o1.getName(), o2.getName());
        };

        Human[] sortedHumans = quickSort(humans, humanComp);

        sortedHumanList = new ArrayList<>(Arrays.asList(sortedHumans));

        ShowProcessHuman.showValues(sortedHumanList);
    }

    public static void sortByLastName(ArrayList<Human> humanList) {

        Human[] humans = humanList.toArray(new Human[humanList.size()]);

        Comparator<Human> humanComp = (o1, o2) -> {
            Collator collator = Collator.getInstance(new Locale("tr", "TR"));
            return collator.compare(o1.getLastname(), o2.getLastname());
        };

        Human[] sortedHumans = quickSort(humans, humanComp);

        sortedHumanList = new ArrayList<>(Arrays.asList(sortedHumans));

        ShowProcessHuman.showValues(sortedHumanList);
    }

    public static void sortByAge(ArrayList<Human> humanList) {

        Human[] humans = humanList.toArray(new Human[humanList.size()]);

        Comparator<Human> humanComp = (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge());

        Human[] sortedHumans = quickSort(humans, humanComp);

        sortedHumanList = new ArrayList<>(Arrays.asList(sortedHumans));

        ShowProcessHuman.showValues(sortedHumanList);
    }

    public static void sortByRegisterDate(ArrayList<Human> humanList) {

        Comparator<Human> humanComp = (o1, o2) -> {
            if (o1.getRegisterDate().before(o2.getRegisterDate())) {
                return -1;
            } else if (o1.getRegisterDate().after(o2.getRegisterDate())) {
                return 1;
            } else {
                return 0;
            }
        };

        Human[] humans = humanList.toArray(new Human[humanList.size()]);

        Human[] sortedHumans = quickSort(humans, humanComp);

        sortedHumanList = new ArrayList<>(Arrays.asList(sortedHumans));

        ShowProcessHuman.showValues(sortedHumanList);
    }

    public static Human[] quickSort(Human a[], Comparator comp) {
        return quickSort(a, 0, a.length - 1, comp);
    }

    private static Human[] quickSort(Human[] array, int lowerIndex, int higherIndex, Comparator comp) {
        int ll = lowerIndex;
        int rr = higherIndex;

        if (rr > ll) {

            Human pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

            while (ll <= rr) {
                while (ll < higherIndex && lessThan(comp, array[ll], pivot)) {
                    ll += 1;
                }
                while (rr > lowerIndex && greaterThan(comp, array[rr], pivot)) {
                    rr -= 1;
                }
                if (ll <= rr) {
                    exchangeNumbers(array, ll, rr, comp);
                    ll += 1;
                    rr -= 1;
                }
            }
            if (lowerIndex < rr) {
                quickSort(array, lowerIndex, rr, comp);

            }
            if (ll < higherIndex) {
                quickSort(array, ll, higherIndex, comp);
            }
        }
        return array;
    }

    private static void exchangeNumbers(Human[] array, int i, int j, Comparator comp) {
        Human temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    private static boolean greaterThan(Comparator comp, Human x, Human y) {
        return comp.compare(x, y) > 0;
    }

    private static boolean lessThan(Comparator comp, Human x, Human y) {
        return comp.compare(x, y) < 0;
    }
}
