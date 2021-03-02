package kr.co.company.listview01;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ImageView selectedImage;
    ImageAdapter4G ia;
    Gallery mGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ListTestActivity.class);
                intent.putExtra("Key", "명시적 인텐트 값 전달");
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), GridViewActivity.class);
                intent.putExtra("Key", "명시적 인텐트 값 전달");
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), GalleryActivity.class);
                intent.putExtra("Key", "3");
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), IntentExampleActivity.class);
                intent.putExtra("Key", "명시적 인텐트 값 전달");
                startActivity(intent);
            }
        });


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

}
