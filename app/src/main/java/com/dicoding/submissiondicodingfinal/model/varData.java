package com.dicoding.submissiondicodingfinal.model;

import android.os.Parcel;
import android.os.Parcelable;

public class varData implements Parcelable {
    protected varData(Parcel in) {
        name = in.readString();
        from = in.readString();
        photo = in.readString();
    }

    public static final Creator<varData> CREATOR = new Creator<varData>() {
        @Override
        public varData createFromParcel(Parcel in) {
            return new varData(in);
        }

        @Override
        public varData[] newArray(int size) {
            return new varData[size];
        }
    };

    public varData() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    private String name, from, photo;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(from);
        dest.writeString(photo);
    }
}
