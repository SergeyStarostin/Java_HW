import java.io.BufferedReader;
import java.io.FileReader;

public class Task03 
{
    public static void main(String[] args) throws Exception 
    {
        String [] arrayData = ReadLineFromFile("Task03.txt");
        for (String arrayDatum : arrayData) {
            System.out.println(PrintLine(arrayDatum));
        }
    }

    public static String [] ReadLineFromFile(String pathway) throws Exception 
    {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) 
            size += 1;
            br.close();
            String [] listData = new String [size];
            int count = 0;
            BufferedReader br1 = new BufferedReader(new FileReader(pathway));
            while ((str = br1.readLine()) != null) 
            {
                listData[count] = str;
                count += 1;
            }
            br1.close();
            return listData;
    }
    
    public static StringBuilder PrintLine(String line) 
    {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        StringBuilder result = new StringBuilder();
        String [] arrayData = line5.split(",");
        String [] listName = {"Студент ", " получил ", " по предмету "};
        for (int i = 0; i < arrayData.length; i++) 
        {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]);
            result.append(arrData[1]);
        }
        return result;
    }
}