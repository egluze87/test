package com.byethost5.egle.BeautyRoom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.byethost5.egle.BeautyRoom.R;

public class RegisterActivity extends Activity {

    private EditText username;
    private EditText password;
    private EditText repeat_password;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.register_username_id);
        password = (EditText) findViewById(R.id.register_password_id);
        repeat_password = (EditText) findViewById(R.id.register_repeat_password_id);
        register = (Button) findViewById(R.id.register_register_button_id);


        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (username.getText().toString() != null && !username.getText().toString().isEmpty() &&
                        password.getText().toString() != null && !password.getText().toString().isEmpty() &&
                        repeat_password.getText().toString() != null && !repeat_password.getText().toString().isEmpty() &&
                        password.getText().toString().equals(repeat_password.getText().toString()))
                {
                    Toast.makeText(RegisterActivity.this, "Congrats! " + username.getText().toString() + " you have successfully registered", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(i);
                }
                else if (username.getText().toString() == null || username.getText().toString().isEmpty())
                {
                    Toast.makeText(RegisterActivity.this, "Please, enter username!", Toast.LENGTH_SHORT).show();
                }
                else if (password.getText().toString() == null || password.getText().toString().isEmpty())
                {
                    Toast.makeText(RegisterActivity.this, "Please, enter password!", Toast.LENGTH_SHORT).show();
                }
                else if (repeat_password.getText().toString() == null || repeat_password.getText().toString().isEmpty())
                {
                    Toast.makeText(RegisterActivity.this, "Please, reenter password!", Toast.LENGTH_SHORT).show();
                }
                else if (!password.getText().toString().equals(repeat_password.getText().toString()) )
                {
                    Toast.makeText(RegisterActivity.this, "Passwords must match!", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
