package home.task15;

import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Task15 {
    public static void main(String[] args) {
        String path = "C:\\Users\\dkorolyuk\\Documents\\test\\new 2.txt";
        File f = new File(path);
        String delimiter = "\\:|\\.|,?\"?-?;?!?\\??\\.?\\@?\\:?\\s?\\(?\\)?\\s\\(?|\\)";
        String str = "";

        //BufferedReader br;
        try {
            FileInputStream in = new FileInputStream(f);
            BufferedReader bs = new BufferedReader(new FileReader(f));
            List content = Files.readAllLines(f.toPath());
            ListIterator<String> itr = content.listIterator();
            while (itr.hasNext()) {
                str = str.concat(itr.next() + " ");
            }
            System.out.println(str);

        }catch (FileNotFoundException e){
            System.err.println("File does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }


        String[] strArr = str.split(delimiter);
        System.out.println(strArr.length);
        Map<String , Integer> strMap = new HashMap<>();
        //int valueM = 1;

        for (int i = 0; i < strArr.length; i++ ) {
            if (strMap.containsKey(strArr[i])){
                strMap.replace(strArr[i], strMap.get(strArr[i]) + 1);
            }else strMap.put(strArr[i], 1);
            //System.out.println(strMap.get(strArr[i]) + " " + strArr[i]);
            //System.out.println(strMap.size());
        }
        System.out.println(strMap);
    }
}
