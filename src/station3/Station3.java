public class Station3 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう
        System.out.println(checkEmailAddress("diikafsa"));
    }

    public static boolean checkEmailAddress(String email) {
        // 問題1: ここから
        return email != null && !email.isEmpty() && email.contains("@");

        // 問題1: ここまで
    }

    public static void q2(User user) {
        // 問題2: ここから
        if (user.name == null){
            user.name = "未設定";
        }
        // 問題2: ここまで
    }
}
