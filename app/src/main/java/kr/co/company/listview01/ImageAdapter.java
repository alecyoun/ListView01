package kr.co.company.listview01;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public ImageAdapter(GridViewActivity gridacitvity) {
        mContext = gridacitvity;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if(view == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(360, 240));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(4,4,4,4);
        } else {
            imageView = (ImageView) view;
        }

        imageView.setImageResource(mThumbIds[i]);
        return imageView;
    }

    private Integer[] mThumbIds = {
            R.drawable.winter1, R.drawable.winter2,
            R.drawable.winter3, R.drawable.winter4,
            R.drawable.winter5, R.drawable.winter6,
            R.drawable.winter7, R.drawable.winter8
    };
}
