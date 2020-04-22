package vn.edu.ntu.luongtungthien.com.example.luongtungthien_59132385_androidlifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView tvTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("AppLog", "On Create is called!");
        Toast.makeText(this, "On Create is called!", Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTime = findViewById(R.id.tv_Time);
    }

    @Override
    protected void onStart() {
        Log.d("AppLog", "On Start is called!");
        Toast.makeText(this, "On Start is called!", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("AppLog", "On Resume is called!");
        Toast.makeText(this, "On Resume is called!", Toast.LENGTH_SHORT).show();
        super.onResume();

        setTimeForTextView();
    }

    @Override
    protected void onPause() {
        Log.d("AppLog", "On Pause is called!");
        Toast.makeText(this, "On Pause is called!", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("AppLog", "On Stop is called!");
        Toast.makeText(this, "On Stop is called!", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("AppLog", "On Destroy is called!");
        Toast.makeText(this, "On Destroy is called!", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("AppLog", "On Restart is called!");
        Toast.makeText(this, "On Restart is called!", Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.d("AppLog", "On Save is called!");
        outState.putInt("item", 1999);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Log.d("AppLog", "On Restore is called!");
        Log.d("AppLog", "" + savedInstanceState.getInt("item"));
    }

    private void setTimeForTextView() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
        String timeString = format.format(date);

        tvTime.setText(timeString);
    }

}