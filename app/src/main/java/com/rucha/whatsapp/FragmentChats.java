package com.rucha.whatsapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentChats extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Chat> lstChat;

    public FragmentChats() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.chats_fragment, container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.chats_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstChat);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstChat = new ArrayList<>();
        lstChat.add(new Chat (R.drawable.bheem , "Bheem" , "20:41" , R.drawable.seen , "Chutki bolatach nahi mazhyasobat",R.drawable.messagenotifier));
        lstChat.add(new Chat (R.drawable.chutki , "Chutki" , "20:41" , R.drawable.seen , "Boltech tar ahe",R.drawable.messagenotifier));
        lstChat.add(new Chat (R.drawable.jaggu , "Jaggu" , "18:45" , R.drawable.seen , "Ae bhava",R.drawable.messagenotifier));
        lstChat.add(new Chat (R.drawable.taklya , "Jaggu" , "18:45" , R.drawable.seen , "Ae bhava mahiti ahemi taklya ahe te",R.drawable.messagenotifier));
        lstChat.add(new Chat (R.drawable.kaliya , "Kaliya" , "17:57" , R.drawable.seen , "Jadya nako bolus kalla na",R.drawable.messagenotifier));
        lstChat.add(new Chat (R.drawable.indumati , "Jaggu" , "17:57" , R.drawable.seen , "Mi aahech chhavi",R.drawable.messagenotifier));
        lstChat.add(new Chat (R.drawable.dholubholu , "Indumati" , "18:51" , R.drawable.seen , "ha kaaliya kasla jaada ahe",R.drawable.messagenotifier));
    }
}
