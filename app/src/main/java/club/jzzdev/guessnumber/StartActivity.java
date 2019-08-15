package club.jzzdev.guessnumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button mBtnStart;
    private Button mBtnInstrct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mBtnStart = findViewById(R.id.btn_startGame);
        mBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        mBtnInstrct = findViewById(R.id.btn_instruction);
        mBtnInstrct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this,InstructionActivity.class);
                startActivity(intent);
            }
        });
    }
}
