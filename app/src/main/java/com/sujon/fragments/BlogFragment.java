package com.sujon.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BlogFragment extends Fragment {
    View rootview;
    TextView textView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.fragment_blog,container,false);
        textView = rootview.findViewById(R.id.textView2);

        Bundle bundle = this.getArguments();
        if(bundle!=null){
            String msg = bundle.getString("DATA_NAME");
            textView.setText(msg);
        }

        return rootview;
    }
}
