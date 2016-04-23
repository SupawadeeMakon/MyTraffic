package rmutsv.supawadee.traffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Traffic_23April16 extends AppCompatActivity {
    //Explicit ประกาศตัวแปร
// มี 3 ส่วน Acess(public,private) type Name
    private ListView trafficListView;
    private Button aboutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_23_april16);

        //Bind Widget ผูกความสัมพันธ์ของตัวแปรกับ widget ที่อยู่บน Activity
        // findViewById คือ คำสั่งให้ตัวแปรตัวนี้ไปเปิดสมุดรายชื่อ
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutButton = (Button) findViewById(R.id.button);

        //Button Controller
        buttonController();

    }//Main Method

    private void buttonController() {

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.horse);
                mediaPlayer.start();

            }   //onClick
        });

    }//buttonController Method


}//Main Class
