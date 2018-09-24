package com.example.shosho.soomterapp.Model;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("HigriToDate")
    @Expose
    private String higriToDate;
    @SerializedName("HigriFromDate")
    @Expose
    private String higriFromDate;
    @SerializedName("timeFrom")
    @Expose
    private String timeFrom;
    @SerializedName("timeTo")
    @Expose
    private String timeTo;
    @SerializedName("DateFrom")
    @Expose
    private String dateFrom;
    @SerializedName("DateTo")
    @Expose
    private String dateTo;
    @SerializedName("Time")
    @Expose
    private Object time;
    @SerializedName("Location")
    @Expose
    private String location;
    @SerializedName("BusinessCategory")
    @Expose
    private String businessCategory;
    @SerializedName("Status")
    @Expose
    private Integer status;
    @SerializedName("Details")
    @Expose
    private String details;
    @SerializedName("Mobile")
    @Expose
    private String mobile;
    @SerializedName("Telephone")
    @Expose
    private Object telephone;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("EventUrl")
    @Expose
    private String eventUrl;
    @SerializedName("Long")
    @Expose
    private Object _long;
    @SerializedName("Lat")
    @Expose
    private Object lat;
    @SerializedName("EventStatus")
    @Expose
    private Integer eventStatus;
    @SerializedName("Organizers")
    @Expose
    private ArrayList<Organizer> organizers = null;
    @SerializedName("ImageIds")
    @Expose
    private List<Integer> imageIds = null;
    @SerializedName("Images")
    @Expose
    private List<String> images = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHigriToDate() {
        return higriToDate;
    }

    public void setHigriToDate(String higriToDate) {
        this.higriToDate = higriToDate;
    }

    public String getHigriFromDate() {
        return higriFromDate;
    }

    public void setHigriFromDate(String higriFromDate) {
        this.higriFromDate = higriFromDate;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public Object getTime() {
        return time;
    }

    public void setTime(Object time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(String businessCategory) {
        this.businessCategory = businessCategory;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Object getTelephone() {
        return telephone;
    }

    public void setTelephone(Object telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEventUrl() {
        return eventUrl;
    }

    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    public Object getLong() {
        return _long;
    }

    public void setLong(Object _long) {
        this._long = _long;
    }

    public Object getLat() {
        return lat;
    }

    public void setLat(Object lat) {
        this.lat = lat;
    }

    public Integer getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(Integer eventStatus) {
        this.eventStatus = eventStatus;
    }

    public ArrayList<Organizer> getOrganizers() {
        return organizers;
    }

    public void setOrganizers(ArrayList<Organizer> organizers) {
        this.organizers = organizers;
    }

    public List<Integer> getImageIds() {
        return imageIds;
    }

    public void setImageIds(List<Integer> imageIds) {
        this.imageIds = imageIds;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

}
