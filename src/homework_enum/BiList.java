package homework_enum;

import java.util.ArrayList;
import java.util.List;

public class BiList {
    public static void main(String[] args) {
        printList();
    }

    public static void printList() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 4; j++) {
                biDemArrList.get(i).add(j*2, "●");
                biDemArrList.get(i).add(j*2+i%2, "◯");
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
