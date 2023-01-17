package cat.dam.andy.fragmentsdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn_tigers = findViewById(R.id.btn_tigers);
        final Button btn_zebras = findViewById(R.id.btn_zebras);
        btn_tigers.setOnClickListener(v -> {
            Toast.makeText(this, "Show Tigers", Toast.LENGTH_SHORT).show();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            Fragment_1 fragment_1a= new Fragment_1();
            transaction.replace(R.id.fragmentContainerView1, fragment_1a);
            Fragment_1 fragment_1b= new Fragment_1();
            transaction.replace(R.id.fragmentContainerView2, fragment_1b);
            Fragment_1 fragment_1c= new Fragment_1();
            transaction.replace(R.id.fragmentContainerView3, fragment_1c);
            transaction.commit();
        });
        btn_zebras.setOnClickListener(v -> {
            Toast.makeText(this, "Show Zebras", Toast.LENGTH_SHORT).show();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            Fragment_2 fragment_2a= new Fragment_2();
            transaction.replace(R.id.fragmentContainerView1, fragment_2a);
            Fragment_2 fragment_2b= new Fragment_2();
            transaction.replace(R.id.fragmentContainerView2, fragment_2b);
            Fragment_2 fragment_2c= new Fragment_2();
            transaction.replace(R.id.fragmentContainerView3, fragment_2c);
            transaction.commit();
        });
    }
}