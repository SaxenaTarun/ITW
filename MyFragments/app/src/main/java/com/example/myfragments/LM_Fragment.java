package com.example.myfragments;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by TutorialsPoint7 on 8/23/2016.
 */
public class LM_Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
/**
 * Inflate the layout for this fragment
 */
        return inflater.inflate(R.layout.lm_fragment, container, false);
    }
    public void r (View view){
        android.R.attr config = null;
        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE){
            FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        PM_Fragment pm_fragment = new PM_Fragment();
        fragmentTransaction.replace(android.R.id.content, pm_fragment);
        fragmentTransaction.commit();}
    }
}
