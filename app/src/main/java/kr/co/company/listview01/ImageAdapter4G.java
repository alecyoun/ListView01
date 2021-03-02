package kr.co.company.listview01;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class ImageAdapter4G extends BaseAdapter {

    int mGalleryItemBackground;
    private Context mContext;

    public Integer[] mImageIds = {
            R.drawable.winter1, R.drawable.winter2,
            R.drawable.winter3, R.drawable.winter4,
            R.drawable.winter5, R.drawable.winter6,
            R.drawable.winter7, R.drawable.winter8
    };

    public ImageAdapter4G(GalleryActivity galleractivity) {
        mContext = galleractivity;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView ;
        imageView = new ImageView(mContext);
        imageView.setImageResource(mImageIds[i]);
        imageView.setLayoutParams(new Gallery.LayoutParams(640, 480));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setBackgroundResource(mGalleryItemBackground);

        return imageView;

    }


}
