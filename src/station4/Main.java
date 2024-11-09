public class Main {
    public static void main(String[] args) {
        SetItem setItem = new SetItem("ギフトセット");
        
        Item item1 = new Item();
        item1.name = "ハンドクリーム";
        
        Item item2 = new Item();
        item2.name = "石鹸";
        
        Item item3 = new Item();
        item3.name = "タオル";
        
        setItem.addItem(item1);
        setItem.addItem(item2);
        setItem.addItem(item3);
        
        System.out.println(setItem.getName()); // 出力: ギフトセット (ハンドクリーム, 石鹸, タオル)
    }
}
