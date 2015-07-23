package com.bookends.mst.bookendsadapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bookends.mst.bookends.BookendsAdapter;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends Activity {

    @InjectView(R.id.listview)
    RecyclerView mListview;
    private LinearLayoutManager manager;
    private SampleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        manager = new LinearLayoutManager(this);
        mListview.setLayoutManager(manager);
        adapter = new SampleAdapter();
        TextView header = new TextView(this);
        header.setText("header");
        adapter.addHeader(header);
        TextView footer = new TextView(this);
        footer.setText("footer");
        adapter.addFooter(footer);
        mListview.setAdapter(adapter);

    }


    class SampleAdapter extends BookendsAdapter {

        @Override
        public RecyclerView.ViewHolder onCreateItemViewHolder(ViewGroup viewGroup, int viewType) {
            return null;
        }

        @Override
        public void onBindItemViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        }

        @Override
        public int getDataCount() {
            return 0;
        }
    }
}
