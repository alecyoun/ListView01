package kr.co.company.listview01;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


public class ListTestActivity extends ListActivity {

    ImageView selectedImage;
    ImageAdapter4G ia;
    Gallery mGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main2);

        String[] v = { "빨강", "주황", "노랑", "파랑", "남색", "보라" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, v);


/*        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_item, R.id.label, values);*/

        setListAdapter(adapter);


/*        GridView gridView = (GridView) findViewById(R.id.GridView01);
        gridView.setAdapter(new ImageAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "" + i, Toast.LENGTH_SHORT).show();
            }
        });*/

        /*mGallery = (Gallery) findViewById(R.id.gallery1);
        ia = new ImageAdapter4G(this);
        mGallery.setAdapter(new ImageAdapter4G(this));
        mGallery.setSpacing(10);

        selectedImage=(ImageView)findViewById(R.id.imageView);

        mGallery.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "" + i , Toast.LENGTH_SHORT).show();
                selectedImage.setImageResource(ia.mImageIds[i]);
            }
        });*/

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected", Toast.LENGTH_SHORT).show();
    }

}
