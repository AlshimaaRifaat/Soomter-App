package com.example.shosho.soomterapp.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Organizer implements Parcelable {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("CompanyName")
    @Expose
    private String companyName;
    @SerializedName("TitleKey")
    @Expose
    private String titleKey;
    @SerializedName("Summary")
    @Expose
    private String summary;
    @SerializedName("ImageId")
    @Expose
    private Integer imageId;
    @SerializedName("Image")
    @Expose
    private String image;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTitleKey() {
        return titleKey;
    }

    public void setTitleKey(String titleKey) {
        this.titleKey = titleKey;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



    public Organizer(Integer id, String companyName, String titleKey, String summary, Integer imageId, String image) {
        this.id = id;
        this.companyName = companyName;
        this.titleKey = titleKey;
        this.summary = summary;
        this.imageId = imageId;
        this.image = image;
    }

    public Organizer(Parcel in)
    {
        this.id = in.readInt();
        this.companyName = in.readString();
        this.titleKey = in.readString();
        this.summary = in.readString();
        this.imageId = in.readInt();
        this.image = in.readString();
    }
    @Override
    public int describeContents() {
        return 0;
    }

    public Organizer() {
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt( this.id );
        parcel.writeString( this.companyName);
        parcel.writeString(  this.titleKey);
        parcel.writeString(  this.summary);
        parcel.writeInt( this.imageId);
        parcel.writeString(  this.image);
    }
    public static final Creator<Organizer> CREATOR = new Creator<Organizer>() {
        @Override
        public Organizer createFromParcel(Parcel in) {
            return new Organizer( in );
        }

        @Override
        public Organizer[] newArray(int size) {
            return new Organizer[size];
        }
    };
}