package com.example.buku;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemData implements Parcelable {
    public String itemTitle;
    public String itemSubtitle;
    public String itemImage;
    public String itemDescription;

    public ItemData(){

    }

    protected ItemData(Parcel in) {
        itemTitle = in.readString();
        itemSubtitle = in.readString();
        itemImage = in.readString();
        itemDescription = in.readString();
    }

    public static final Creator<ItemData> CREATOR = new Creator<ItemData>() {
        @Override
        public ItemData createFromParcel(Parcel in) {
            return new ItemData(in);
        }

        @Override
        public ItemData[] newArray(int size) {
            return new ItemData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(itemTitle);
        parcel.writeString(itemSubtitle);
        parcel.writeString(itemImage);
        parcel.writeString(itemDescription);
    }
}
