import java.util.ArrayList;

public class SetItem extends Item {
    ArrayList<Item> items = new ArrayList<Item>();

    // 引数として名前を受け取るコンストラクタ
    public SetItem(String name) {
        this.name = name;  // 継承されたnameフィールドに直接設定
    }

    public void addItem(Item item){
        items.add(item);
    }

    @Override
    public String getName(){
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" (");

        for (int i = 0; i < items.size(); i++){
            sb.append(items.get(i).getName());
            if (i < items.size() - 1){
                sb.append(", ");
            }
        }

        sb.append(")");
        return sb.toString();
    }
}
