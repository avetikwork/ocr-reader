package com.google.android.gms.samples.vision.ocrreader;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitle;

        public ViewHolder(final View container) {
            super(container);
            txtTitle = (TextView) container.findViewById(R.id.consoleItem);
        }
    }

    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onBindViewHolder(SimpleAdapter.ViewHolder holder, int position) {
        String item = items.get(position);
        holder.txtTitle.setText(item);
    }

    @Override
    public SimpleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.console_item, parent, false);
        return new ViewHolder(v);
    }
}
