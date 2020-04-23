package sg.edu.rp.c346.dailygoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {
    TextView G1, G2, G3, Reflection;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        G1 = findViewById(R.id.textViewGoal1);
        G2 = findViewById(R.id.textViewGoal2);
        G3 = findViewById(R.id.textViewGoal3);
        Reflection = findViewById(R.id.textViewReflect);
        back = findViewById(R.id.buttonBack);

        Intent i = getIntent();
        String[] data = i.getStringArrayExtra("data");

        G1.setText(data[0]);
        G2.setText(data[1]);
        G3.setText(data[2]);
        Reflection.setText(data[3]);
        
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}