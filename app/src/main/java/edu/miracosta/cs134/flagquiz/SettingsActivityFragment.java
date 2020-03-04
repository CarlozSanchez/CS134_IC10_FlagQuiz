package edu.miracosta.cs134.flagquiz;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class SettingsActivityFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);


    }
}
