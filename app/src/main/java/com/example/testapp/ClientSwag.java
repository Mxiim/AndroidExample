package com.example.testapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class ClientSwag {
    private Fragment f;
    public ClientSwag(Fragment f) {
        this.f = f;
    }

    public FragmentActivity getActivity() {
        return f.getActivity();
    }

    public String test(){
        return "test";
    }

}
