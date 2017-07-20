package com.spotspoon.fragment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideoList {

@SerializedName("title")
@Expose
private String title;
@SerializedName("time")
@Expose
private String time;
@SerializedName("description")
@Expose
private String description;

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getTime() {
return time;
}

public void setTime(String time) {
this.time = time;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

}