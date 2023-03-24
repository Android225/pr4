package com.example.pr4;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    sec_frag second__ = new sec_frag();

    thi_frag third__ = new thi_frag();

    fir_frag first__ = new fir_frag();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment);

        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_container_view,first__)
                .commit();
    }

    public void second_click(View view) {

        FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();

        Bundle bundle = new Bundle();

        second__.setArguments(bundle);

        fTrans.replace(R.id.fragment_container_view, second__).addToBackStack(null).commit();

    }

    public void third_click(View view) {
        FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();

        Bundle bundle = new Bundle();

        third__.setArguments(bundle);

        fTrans.replace(R.id.fragment_container_view, third__).addToBackStack(null).commit();

    }
}