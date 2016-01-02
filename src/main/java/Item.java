import java.util.ArrayList;

/**
 * Created by Leo on 1/1/2016.
 */
public class Item {

    private String mTitle,mAddress,mPhone;
    private ArrayList<String> mItems;

    public Item(String title,String address,String phone,ArrayList<String> items){
        mTitle = title;
        mAddress = address;
        mPhone = phone;
        mItems = items;
    }


    public String getTitle() {
        return mTitle;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhone() {
        return mPhone;
    }

    public ArrayList<String> getItems() {
        return mItems;
    }

}
