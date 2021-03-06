package com.syabhri.app.katalogadmin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    CheckBox chkRemember;
    Button btnLogin;
    EditText txtUsername;
    EditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.initComponents();
        this.checkSavedCredentials();

    }

    private void initComponents() {
        this.chkRemember = findViewById(R.id.chk_remember);
        this.btnLogin = findViewById(R.id.btn_login);
        this.txtUsername = findViewById(R.id.txt_username);
        this.txtPassword = findViewById(R.id.txt_password);
    }



    private void login() {
        String username = this.txtUsername.getText().toString();
        String password = this.txtPassword.getText().toString();

        boolean loginCorrect = this.checkCredentials(username, password);

        if (loginCorrect) {
            boolean remember = this.chkRemember.isChecked();

            if(remember) {
                this.saveCredentials();

            }

            this.openHome(username);

        } else {
            Toast.makeText(this.getApplicationContext(), "Salah username atau passwordnya", Toast.LENGTH_SHORT).show();
        }

    }

    private void openHome(String username) {
        Intent intent = new Intent(this.getApplicationContext(), HomeActivity.class);
        intent.putExtra("username", username);
        this.startActivity(intent);
    }

    private void saveCredentials() {
        SharedPreferences handler = this.getSharedPreferences("data",Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = handler.edit();

        editor.putString("username", this.txtUsername.getText().toString());
        editor.putString("password", this.txtPassword.getText().toString());

        editor.apply();

    }

    private boolean checkCredentials(String username, String password) {
        if (username.equals("mimin") && password.equals("mimin")) {
            return true;
        } else {
            return false;
        }
    }

    private void checkSavedCredentials() {
        SharedPreferences handler = this.getSharedPreferences("data",Context.MODE_PRIVATE);

        String username = handler.getString("username", "");
        String password = handler.getString("password", "");

        boolean loginCorrect = this.checkCredentials(username, password);

        if (loginCorrect) {
            this.openHome(username);
        }
    }

    public void button_onClick(View view) {
        this.login();
    }
}

