package test233.leo.com.test233;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    private Button bt;
    private Button bt2;
    private EditText et;
    private Button bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) findViewById(R.id.change_text);
        bt2 = (Button) findViewById(R.id.change_text2);
        bt3 = (Button)findViewById(R.id.getTextandShow) ;
        txt = (TextView)findViewById(R.id.topShow) ;
        et =(EditText) findViewById(R.id.editText);

        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txt.setText(R.string.hello_android);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txt.setText(R.string.hello_world);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txt.setText(et.getText());
            }
        });

    }
}
