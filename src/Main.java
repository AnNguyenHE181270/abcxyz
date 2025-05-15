
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static char max(Map<Character, Integer> map) {
            char result = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getKey() > result) {
                    result = entry.getKey();
                }
            }
            return result;
        }

        public static char min(Map<Character, Integer> map) {
            char result = 127; // max ASCII chuẩn
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getKey() < result) {
                    result = entry.getKey();
                }
            }
            return result;
        }



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            TreeMap<Character, Integer> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                char x = sc.next().charAt(0);
                if (map.isEmpty() || !map.containsKey(x)) {
                    map.put(x, 1);
                } else if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                }

            }
            System.out.println(min(map)+" " +map.get(min(map)));
            System.out.println("");
            System.out.println(max(map)+" " +map.get(max(map)));

            System.out.println("");


            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());

            }
            System.out.println("");
            for (Map.Entry<Character, Integer> entry : map.descendingMap().entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());


                System.out.println("abc");
            }

        }
    }

