import java.util.ArrayList;
import java.util.List;

public class Learn {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Nisha");
        list.add("Soni");
        list.add("JavaDeveloper");
        modifyList(list);
        System.out.println(list);
    }

    private static void modifyList(List<String> receivedList) {
       String temp = receivedList.get(0);
       receivedList.add("Dream");
        System.out.println(receivedList);
    }
}
