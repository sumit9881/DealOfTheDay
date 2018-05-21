package com.sumit.dealoftheday.views;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.sumit.dealoftheday.Constants;
import com.sumit.dealoftheday.R;
import com.sumit.dealoftheday.viewmodels.BestDeal;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DealOfTheDayAdapter extends RecyclerView.Adapter<DealOfTheDayAdapter.ViewHolder> {

    private List<BestDeal> mBestDeals = new ArrayList<>();

    public DealOfTheDayAdapter(List<BestDeal> items) {
        if (items != null) {
            mBestDeals.addAll(items);
        }
    }


    @NonNull
    @Override
    public DealOfTheDayAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.groupon_rowlayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DealOfTheDayAdapter.ViewHolder holder, int position) {
        holder.item = mBestDeals.get(position);
        holder.desciption.setText(holder.item.getAnnouncementTitle());
        holder.title.setText(holder.item.getShortAnnouncementTitle());

        loadImage(holder.desciption.getContext(), holder.item.getLargeImageUrl(), holder.imageView);
    }

    private void loadImage(Context ctx, String url, ImageView imageView) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.placeholder(R.mipmap.ic_launcher);
        Glide.with(ctx)
                .load(url)
                .apply(requestOptions)
                .into(imageView);

    }

    @Override
    public int getItemCount() {
        return mBestDeals.size();
    }

    public void addItems(List<BestDeal> deals) {
        mBestDeals.addAll(deals);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.imageView_dealImage)
        ImageView imageView;
        @BindView(R.id.textView_title)
        TextView title;
        @BindView(R.id.textView_description)
        TextView desciption;
        BestDeal item;

        public ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
            v.setOnClickListener(this);
        }

        @Override
        public  void onClick(View view) {

            Intent i = new Intent(view.getContext(), CouponDetailActivity.class);
            i.putExtra(Constants.EXTRA_DEAL_URL, item.getDealUrl());
            view.getContext().startActivity(i);
        }
    }

}
