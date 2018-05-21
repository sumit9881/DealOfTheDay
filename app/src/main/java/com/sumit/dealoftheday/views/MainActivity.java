package com.sumit.dealoftheday.views;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.sumit.dealoftheday.R;
import com.sumit.dealoftheday.viewmodels.BestDeal;
import com.sumit.dealoftheday.viewmodels.GrouponDealViewModel;
import com.sumit.dealoftheday.viewmodels.GrouponDealViewModelFactory;
import com.sumit.dealoftheday.viewmodels.Response;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    GrouponDealViewModelFactory mGrouponDealViewModelFactory;

    @BindView(R.id.recyclerView_dealsList)
    RecyclerView mRecyclerView;

    @BindView(R.id.progressbar)
    ContentLoadingProgressBar mProgressBar;

    GrouponDealViewModel mGrouponDealViewModel;

    private DealOfTheDayAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mAdapter = new DealOfTheDayAdapter(null);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
        mGrouponDealViewModel = ViewModelProviders.of(this, mGrouponDealViewModelFactory).get(GrouponDealViewModel.class);
        mGrouponDealViewModel.response().observe(this, response -> processResponse(response));

        Response response = mGrouponDealViewModel.response().getValue();
        if (response == null) {
            mGrouponDealViewModel.loadGrouponResponse();
        } else {
            processResponse(response);
        }
    }

    private void processResponse(Response response) {
        switch (response.status) {
            case LOADING:
                renderLoadingState();
                break;

            case SUCCESS:
                renderDataState(response.data);
                break;

            case ERROR:
                renderErrorState(response.error);
                break;
        }
    }

    private void renderLoadingState() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    private void renderDataState(List<BestDeal> data) {
        mProgressBar.setVisibility(View.GONE);
        mAdapter.addItems(data);
        mAdapter.notifyDataSetChanged();

    }

    private void renderErrorState(Throwable throwable) {
        mProgressBar.setVisibility(View.GONE);
        Toast.makeText(this, R.string.network_error, Toast.LENGTH_SHORT).show();
    }
}
