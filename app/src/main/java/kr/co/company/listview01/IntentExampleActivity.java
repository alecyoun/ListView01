package kr.co.company.listview01;

import android.Manifest;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


public class IntentExampleActivity extends Activity {

    ImageView selectedImage;
    ImageAdapter4G ia;
    Gallery mGallery;

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == requestCode) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:480-240-9255"));
                startActivity(callIntent);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_intent_sample);
        int requestCode = 0;

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            Log.d("STATE", "Call Button DOES NOT WORK");
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, requestCode);
            return;
        }

        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() { // 전화걸기

            @Override
            public void onClick(View view) {

                Log.d("STATE", "Call Button DOES WORK");
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:480-240-9255"));
                startActivity(callIntent);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() { // 지도보기
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:37.563563, 126.975331"));//geo:위도,경도
                startActivity(i2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() { // 웹브라우저
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://wikidocs.net/book/2184"));
                startActivity(i3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() { // 연락처보기
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("content://contacts/people/"));
                startActivity(i4);
            }
        });

    }

}
