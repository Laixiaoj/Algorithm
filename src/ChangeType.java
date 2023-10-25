import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ChangeType {
    public static void main(String[] args){

        // 1. String -> int/Long/Double...
        String stringToInteger = "123";
        int num = Integer.valueOf(stringToInteger);
        System.out.println("======1. String -> Integer: " + num);

        // 2. String[] -> Integer[]
        String[] stringsToIntegrts = {"1", "2", "3"};
        Integer[] integers = new Integer[3];
        for (int i = 0; i < stringsToIntegrts.length; i++) {
            integers[i] = Integer.parseInt(stringsToIntegrts[i]);
        }
        System.out.println("======2. String[] -> Integer[]: " + Arrays.toString(integers));

        // 3. Integer[] -> List
        List<Integer> numList = Arrays.asList(integers);
        System.out.println("======3. Integer[] -> List: " + numList.toString());

        // 4. List -> Integer[]
        Object[] integers1 = numList.toArray();
        System.out.println("======4. List -> Integer[]: " + Arrays.toString(integers1));

        try{
            // 5. String（yyyy-MM-dd HH:mm:ss） -> Date
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date = sdf.parse("2022-10-25 15:50:50");
            System.out.println("======5. String(yyyy-MM-dd HH:mm:ss) -> Date: " + sdf.format(date));

            // 6. timeStamp -> Date
            Long timeStamp = 1630194745000L;
            Date customDate = new Date(timeStamp);
            System.out.println("======6. timeStamp -> Date: " + sdf.format(customDate));

        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
