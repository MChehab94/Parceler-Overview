package mchehab.com.parceleroverview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {

    private PersonFragment blankFragment = new PersonFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            Bundle bundle = new Bundle();
            Person person = new Person("first name", "last name", 20);
            bundle.putParcelable("person", Parcels.wrap(person));
            blankFragment.setArguments(bundle);
            getFragmentManager().beginTransaction().add(R.id.frameLayout, blankFragment).commit();
        }
    }
}
