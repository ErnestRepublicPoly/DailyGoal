package sg.edu.rp.c346.dailygoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup goal1, goal2, goal3;
    Button submit;
    RadioButton radioG1, radioG2, radioG3;
    EditText reflection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goal1 = findViewById(R.id.RadioGroupG1);
        goal2 = findViewById(R.id.RadioGroupG2);
        goal3 = findViewById(R.id.RadioGroupG3);
        submit = findViewById(R.id.buttonOk);
        reflection = findViewById(R.id.editTextReflection);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Id1 = goal1.getCheckedRadioButtonId();
                radioG1 = findViewById(Id1);
                String G1A = radioG1.getText().toString();

                int Id2 = goal2.getCheckedRadioButtonId();
                radioG2 = findViewById(Id2);
                String G2A = radioG2.getText().toString();

                int Id3 = goal3.getCheckedRadioButtonId();
                radioG3 = findViewById(Id3);
                String G3A = radioG3.getText().toString();
                String reflect= reflection.getText().toString();

                String[] all = {G1A, G2A, G3A, reflect};

                Intent i = new Intent(MainActivity.this,
                        Main2Activity.class);

                i.putExtra("data", all);

                startActivity(i);
            }
        });
    }
}
