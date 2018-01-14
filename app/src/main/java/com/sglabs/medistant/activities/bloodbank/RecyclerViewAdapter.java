//package com.sglabs.medistant;
//
///**
// * Created by Celento on 4/7/2017.
// */
//
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
//    private ArrayList<String> values;
//    RecyclerViewAdapter(ArrayList<String> values) {
//        this.values = values;
//    }
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.re_view,parent,false));
//    }
//
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position) {
//        holder.name.setText(values.get(position));
//    }
//
//    @Override
//    public int getItemCount() {
//        return values.size();
//    }
//
//    class ViewHolder extends RecyclerView.ViewHolder {
//        private TextView name;
//        ViewHolder(View itemView) {
//            super(itemView);
//            name = (TextView) itemView.findViewById(R.id.list_item_text);
//        }
//    }
//}
