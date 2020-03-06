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
public class PM_Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
/**
 * Inflate the layout for this fragment
 */
        return inflater.inflate(R.layout.pm_fragment, container, false);
    }
    public void flip (View view) {
        android.R.attr config = null;
        if (config.orientation == Configuration.ORIENTATION_PORTRAIT) {
            FragmentManager fragmentManager = getFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            LM_Fragment ls_fragment = new LM_Fragment();
            fragmentTransaction.replace( android.R.id.content, ls_fragment );
            fragmentTransaction.commit();
        }
    }
}

