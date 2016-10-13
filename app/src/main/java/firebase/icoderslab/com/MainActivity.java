package firebase.icoderslab.com;

import android.app.Activity;
import android.os.Bundle;

import com.google.firebase.crash.FirebaseCrash;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Don't forget to Create and Add your google-services.json

        FirebaseCrash.report(new Exception("iCodersLab.com : My first Android non-fatal error"));
    }
}
