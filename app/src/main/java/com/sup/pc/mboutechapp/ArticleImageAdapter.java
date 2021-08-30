package com.sup.pc.mboutechapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.LinkedList;



public class ArticleImageAdapter extends RecyclerView.Adapter<ArticleImageAdapter.ImageViewHolder> {
    private LinkedList<ImageView> mImageList=new LinkedList<ImageView>();
    private ImageView[] image=new ImageView[10];
    private LayoutInflater mInflater;

    @Override
    public ArticleImageAdapter.ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ArticleImageAdapter.ImageViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final ImageView imageItemView;

        final ArticleDescriptionTextAdapter mIAdapter;


        public ImageViewHolder(View Imageview, ArticleDescriptionTextAdapter adapter){
            super(Imageview);
            imageItemView=Imageview.findViewById(R.id.imageView3);
            this.mIAdapter=adapter;
            Imageview.setOnClickListener(this);

        }



        public void onClick(View view){

            int mposition=getLayoutPosition();

            ImageView element=mImageList.get(mposition);
            mImageList.set(mposition,element);
            mIAdapter.notifyDataSetChanged();
        }

    }
    public ArticleImageAdapter(Context context, LinkedList<ImageView> wordmenuImage){
        mInflater= LayoutInflater.from(context);
        this.mImageList=wordmenuImage;


    }



}

