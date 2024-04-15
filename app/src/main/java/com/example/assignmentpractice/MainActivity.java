package com.example.assignmentpractice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import androidx.activity.EdgeToEdge;

public class MainActivity extends AppCompatActivity {

    Button removeBtn;
    Button addBtn;
    TextView displayText;
    EditText contactNo;
    EditText Email;
    EditText someText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        removeBtn = findViewById(R.id.Remove);
        addBtn = findViewById(R.id.Add);
        displayText = findViewById(R.id.Display);
        contactNo = findViewById(R.id.Contact);
        Email = findViewById(R.id.Email);
        someText = findViewById(R.id.Something);
    }

    public void doDisplay(View v) {
        String contact = contactNo.getText().toString();
        String email = Email.getText().toString();
        String some = someText.getText().toString();

        String textAll = contact + "\n" + email + "\n" + some;

        displayText.setText(textAll);

        contactNo.setText("");
        Email.setText("");
        someText.setText("");
    }
}
