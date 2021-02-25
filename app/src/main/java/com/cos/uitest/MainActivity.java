package com.cos.uitest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvUserList, rvList;
    private UserAdapter userAdapter;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Integer> users = new ArrayList<>();
        List<Integer> lists = new ArrayList<>();

        for (int i =0; i<10; i++){
            users.add(i+1);
        }

        for(int i=0; i<3; i++){
            lists.add(i);
        }


        LinearLayoutManager manger = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rvUserList = findViewById(R.id.rv_userlist);
        rvUserList.setLayoutManager(manger);
        userAdapter = new UserAdapter(users);
        rvUserList.setAdapter(userAdapter);

        LinearLayoutManager manger2 = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvList = findViewById(R.id.rv_mainlist);
        rvList.setLayoutManager(manger2);
        mainAdapter = new MainAdapter(lists);
        rvList.setAdapter(mainAdapter);

    }


}