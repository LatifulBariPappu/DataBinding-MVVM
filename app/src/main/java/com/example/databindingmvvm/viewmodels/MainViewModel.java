package com.example.databindingmvvm.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.databindingmvvm.models.Customer;

public class MainViewModel extends AndroidViewModel {

    Customer customer;

    public MainViewModel(@NonNull Application application) {
        super(application);
        customer=new Customer("Latiful Bari");
    }

    public Customer getCustomer() {
        return this.customer;
    }
}
