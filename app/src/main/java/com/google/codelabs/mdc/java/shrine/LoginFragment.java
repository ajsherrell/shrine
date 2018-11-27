package com.google.codelabs.mdc.java.shrine;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Fragment representing the login screen for Shrine.
 */
public class LoginFragment extends Fragment {

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.shr_login_fragment, container, false);

        // Snippet from "Navigate to the next Fragment" section goes here.

        return view;
    }

    // "isPasswordValid" from "Navigate to the next Fragment" section method goes here
    /*
   In reality, this will have more complex logic including, but not limited to, actual
   authentication of the username and password.
*/
    private boolean isPasswordValid(@Nullable Editable text) {
        return text != null && text.length() >= 8;
    }
}
