package srongklod_bangtamruat.plantseconomic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import srongklod_bangtamruat.plantseconomic.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add fRagment to Activity
        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment()).commit();

        }


    } // Main Method

}//Main Class
