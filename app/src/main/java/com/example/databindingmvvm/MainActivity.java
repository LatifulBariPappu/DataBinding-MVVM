package com.example.databindingmvvm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.databindingmvvm.databinding.ActivityMainBinding;
import com.example.databindingmvvm.viewmodels.MainViewModel;


public class MainActivity extends AppCompatActivity {

   MainViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding mainxml= DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewModel=new ViewModelProvider(this).get(MainViewModel.class);

        mainxml.setCustomer(viewModel.getCustomer());

    }
}