package kr.co.company.listview01;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


public class GalleryActivity extends Activity {

    ImageView selectedImage;
    ImageAdapter4G ia;
    Gallery mGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_gallery);
        selectedImage = (ImageView) findViewById(R.id.imageView);

        mGallery = (Gallery) findViewById(R.id.gallery1);
        ia = new ImageAdapter4G(this);
        mGallery.setAdapter(new ImageAdapter4G(this));
        mGallery.setSpacing(10);

        mGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "" + i, Toast.LENGTH_SHORT).show();
                selectedImage.setImageResource(ia.mImageIds[i]);
            }
        });

        getIntent();
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            String index = intent.getExtras().getString("Key", "0");
            int i = Integer.parseInt(index);
            selectedImage.setImageResource(ia.mImageIds[i]);
        }
    }
}
