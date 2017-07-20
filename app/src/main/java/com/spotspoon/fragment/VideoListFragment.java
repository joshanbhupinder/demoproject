package com.spotspoon.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.spotspoon.R;
import com.spotspoon.databinding.VideoListBinding;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bhupinder on 20/7/17.
 */

public class VideoListFragment extends Fragment
{
    private VideoListBinding mVideoListBinding;
    private List<com.spotspoon.fragment.VideoList> mList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mVideoListBinding= DataBindingUtil.bind(inflater.inflate(R.layout.video_list,null));
        return mVideoListBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mVideoListBinding.recyleview.setLayoutManager(new LinearLayoutManager(getActivity()));
        setData();
        mVideoListBinding.recyleview.setAdapter(new com.spotspoon.fragment.VideoListAdapter(getActivity(),mList));

    }

    public void setData()
    {
        mList=new ArrayList<>();
        Type type = new TypeToken<com.spotspoon.fragment.ListResponse>() {
        }.getType();
        Gson gson = new Gson();
        com.spotspoon.fragment.ListResponse listResponse = gson.fromJson(com.spotspoon.fragment.Utils.readJSONFromAsset(getActivity(),"list"), type);
        for (int i = 0; i <listResponse.getVideoList().size() ; i++) {
            mList.add(listResponse.getVideoList().get(i));
        }

    }
}
