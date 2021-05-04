package com.sujon.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    View rootview;
    Button blogFragmentButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.fragment_home,container,false);

        blogFragmentButton = rootview.findViewById(R.id.button);
        blogFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("DATA_NAME","Hi, this is Sujon");
                Fragment fragment = new BlogFragment();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.Fragment_Container, fragment)
                        .addToBackStack("Main")
                        .commit();
            }
        });

        return  rootview;
    }
}
