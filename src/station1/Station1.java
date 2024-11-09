// javac -encoding UTF-8 Station1.java
import java.util.ArrayList;

public class Station1 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう
        ArrayList<String> result = q1();
        System.out.println(result);

        ArrayList<String> list = new ArrayList<>();
        list.add("Tech");
        list.add("Train");
        list.add("Railway");

        ArrayList<String> searchWords = new ArrayList<>();
        searchWords.add("Railway");
        searchWords.add("Tech");
        searchWords.add("Station");

        int result2 = q2(list, searchWords);
        System.out.println(result2); // 出力される値は2のはずです
    }

    public static ArrayList<String> q1() {
        // 問題1: ここから
        ArrayList<String> list = new ArrayList<>();
        list.add("Tech");
        list.add("Train");
        return list;
        // 問題1: ここまで
    }

    public static int q2(ArrayList<String> list, ArrayList<String> searchWords) {
        // 問題2: ここから
        int count = 0;
        for (String word : searchWords){
            if (list.contains(word)){
                count++;
            }
        }
        return count;
        // 問題2: ここまで
    }
}
