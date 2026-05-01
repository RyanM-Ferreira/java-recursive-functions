import java.util.ArrayList;
import java.util.List;

public class Recursion {
    List<Long> numbersList = new ArrayList<>();
    List<Long> evenList = new ArrayList<>();
    List<Long> oddList = new ArrayList<>();

    void ArithmeticProgression(long initialTerm, long ratio, long limit) {
        if (limit <= 0) {
            PrintList("> Result - Arithmetic Progression", numbersList);
            return;
        }

        numbersList.add(initialTerm);

        ArithmeticProgression(initialTerm + ratio, ratio, limit - 1);
    }

    void GeometricProgression(long initialTerm, long ratio, long limit) {
        if (limit <= 0) {
            PrintList("> Result - Geometric Progression", numbersList);
            return;
        }

        numbersList.add(initialTerm);

        GeometricProgression(initialTerm * ratio, ratio, limit - 1);
    }

    void GetEvenAndOdd(int index) {
        if (index == 0) {
            Utils utils = new Utils();
            utils.ConsoleClear();

            evenList.clear();
            oddList.clear();

            System.out.println("> Geometric Progression with Even/Odd Separation");
        }

        if (index >= numbersList.size()) {
            if (!oddList.isEmpty())
                PrintList(null, oddList);
            if (!evenList.isEmpty())
                PrintList(null, evenList);
            return;
        }

        long number = numbersList.get(index);
        if (number % 2 == 0) {
            evenList.add(number);
        } else {
            oddList.add(number);
        }

        GetEvenAndOdd(index + 1);
    }

    void PrintList(String label, List<Long> numberList) {
        if (label != null && !label.isEmpty()) {
            System.out.println(label);
        }

        for (Long number : numberList) {
            System.out.println(number);
        }
    }
}