package submmision.sliit.labsheet03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MSG = "Hello there, this is Lab Sheet 03";

    private EditText msg;
    private Button sndBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessage.class);
        msg = (EditText) findViewById(R.id.msgText);
        String message = msg.getText().toString();
        intent.putExtra(EXTRA_MSG, message);
        startActivity(intent);
    }
}
