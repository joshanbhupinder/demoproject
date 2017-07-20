package com.spotspoon.fragment;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotspoon.R;
import com.spotspoon.databinding.ListItemBinding;
import java.util.List;


/**
 * Created by bhupinder on 20/7/17.
 */
public class VideoListAdapter extends RecyclerView.Adapter<VideoListAdapter.ViewHolder> {

    private Context mContext;
    private List<com.spotspoon.fragment.VideoList> mList;
    public VideoListAdapter(Context context,List<com.spotspoon.fragment.VideoList> list)
    {
        mContext=context;
        mList=list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ListItemBinding listItemBinding= DataBindingUtil.bind(LayoutInflater
                .from(mContext).inflate(R.layout.list_item,parent,false));
        return new ViewHolder(listItemBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.listItemBinding.textView.setText(mList.get(position).getTitle());
        holder.listItemBinding.textViewHour.setText(mList.get(position).getTime());
        holder.listItemBinding.textviewDescription.setText(mList.get(position).getDescription());
        setBackgroundImage(holder,position);

    }

    /*
    * Dummy images
    * */
    public void setBackgroundImage(ViewHolder holder,int position)
    {
        switch (position)
        {
            case 0:
                holder.listItemBinding.imageView.setImageDrawable(ContextCompat
                        .getDrawable(mContext, R.drawable.bg_guitar_third));
                break;

            case 1:
                holder.listItemBinding.imageView.
                        setImageDrawable(ContextCompat.getDrawable(mContext, R.drawable.bg_guitar));
                break;

            case 2:
                holder.listItemBinding.imageView.
                        setImageDrawable(ContextCompat.getDrawable(mContext, R.drawable.bg_guitar_sec));
                break;

            case 3:
                holder.listItemBinding.imageView.setImageDrawable(ContextCompat.getDrawable(mContext,
                        R.drawable.bg_guitar_third));
                break;

            case 4:
                holder.listItemBinding.imageView.setImageDrawable(ContextCompat.getDrawable(mContext,
                        R.drawable.bg_imag_fifth));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ListItemBinding listItemBinding;

        public ViewHolder(ListItemBinding listItemBinding) {
            super(listItemBinding.getRoot());
           this.listItemBinding=listItemBinding;
        }
    }
}
