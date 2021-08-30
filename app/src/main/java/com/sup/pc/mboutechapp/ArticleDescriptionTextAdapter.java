package com.sup.pc.mboutechapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;


public class ArticleDescriptionTextAdapter extends RecyclerView.Adapter<ArticleDescriptionTextAdapter.WordViewHolder> {

    private LinkedList<String> mWordmenuList=new LinkedList<>();

    private LayoutInflater mInflater;



    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView wordItemView;

        final ArticleDescriptionTextAdapter mtAdapter;


        public WordViewHolder(View itemview, ArticleDescriptionTextAdapter adapter){
            super(itemview);
            wordItemView=itemview.findViewById(R.id.LinearLayout);
            this.mtAdapter=adapter;
            itemview.setOnClickListener(this);

        }


        public void onClick(View view){

            int mposition=getLayoutPosition();

            String element=mWordmenuList.get(mposition);
            mWordmenuList.set(mposition,"clicked! "+element);
            mtAdapter.notifyDataSetChanged();
        }

    }


    public ArticleDescriptionTextAdapter(Context context, LinkedList<String> wordmenuList){
        mInflater= LayoutInflater.from(context);
        this.mWordmenuList=wordmenuList;


    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
