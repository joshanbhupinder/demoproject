package com.spotspoon.fragment;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListResponse {

@SerializedName("video_list")
@Expose
private List<com.spotspoon.fragment.VideoList> videoList;

public List<com.spotspoon.fragment.VideoList> getVideoList() {
return videoList;
}

public void setVideoList(List<com.spotspoon.fragment.VideoList> videoList) {
this.videoList = videoList;
}
}