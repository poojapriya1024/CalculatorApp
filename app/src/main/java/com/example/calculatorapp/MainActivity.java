package com.example.calculatorapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.calculatorapp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    EditText e1,e2;
    String s1,s2;
    int n1,n2;
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextText8);
        e2 = findViewById(R.id.editTextText9);
        myTextView = findViewById(R.id.textView5);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void sum(View v)
    {
        s1 = e1.getText().toString();
        s2 = e2.getText().toString();

        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);

        Integer sum = n1+n2;
        myTextView.setText(sum.toString());
       // Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_LONG).show();
    }

    public void difference(View v)
    {
        s1 = e1.getText().toString();
        s2 = e2.getText().toString();

        n1 = Integer.parseInt(s1); n2 = Integer.parseInt(s2);
        // convert to integer

        Integer difference = n1-n2;
        myTextView.setText(difference.toString());

       // Toast.makeText(this,String.valueOf(difference),Toast.LENGTH_LONG).show();
    }

    public void product(View v)
    {
        s1 = e1.getText().toString();
        s2 = e2.getText().toString();

        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);

        Integer product = n1*n2;
        myTextView.setText(product.toString());
    }

    public void divide(View v)
    {
        s1 = e1.getText().toString();
        s2 = e2.getText().toString();

        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);

        Integer quotient = n1/n2;
        myTextView.setText(quotient.toString());

    }
}