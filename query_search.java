
import java.util.Scanner;

public class query_search {
    static int[] frequencyarray(int[] arr) {
        int[] freq = new int[10001];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        System.out.println("enter elements in array");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] freq = frequencyarray(arr);
        System.out.println("enter no of queries");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("enter no to be searched");
            int x = sc.nextInt();
            if (freq[x] > 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            q--;
        }
    }
}

//"C:\Program Files\Java\jdk-18.0.2.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\lib\idea_rt.jar=54537:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\hp\pwjava\out\production\pwjava query_search
//        enter size of array
//        5
//        enter elements in array
//        1
//        45
//        87
//        45
//        37
//        enter no of queries
//        3
//        enter no to be searched
//        45
//        yes
//        enter no to be searched
//        20
//        no
//        enter no to be searched
//        37
//        yes
//
//        Process finished with exit code 0
