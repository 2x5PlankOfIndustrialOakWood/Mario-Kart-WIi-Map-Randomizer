import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File mapList = new File("mk_wii_maps.txt");
        Scanner mapScanner = new Scanner(mapList);

        ArrayList<String> maps = new ArrayList<String>();
        
        while(mapScanner.hasNextLine())
        {
            maps.add(mapScanner.nextLine());
        }
        mapScanner.close();

        for (int i = 0; i < maps.size(); i++) {
            System.out.println(maps.get(i));
        }
    }
}
