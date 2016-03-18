package project0.hkandukuri.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        String[] appList = getResources().getStringArray(R.array.myAppNames) ;
        String buttonName;
        switch(v.getId())
        {
            case R.id.first_button:
                buttonName = appList[0];
                break;
            case R.id.second_button:
                buttonName = appList[1];
                break;
            case R.id.third_button:
                buttonName = appList[2];
                break;
            case R.id.fourth_button:
                buttonName = appList[3];
                break;
            case R.id.fifith_button:
                buttonName = appList[4];
                break;
            case R.id.sixth_button:
                buttonName = appList[5];
                break;
            default:
                buttonName = "None";

        }
        Toast.makeText(MainActivity.this, "This button will launch my "+buttonName+" app!", Toast.LENGTH_SHORT).show();
    }
}
