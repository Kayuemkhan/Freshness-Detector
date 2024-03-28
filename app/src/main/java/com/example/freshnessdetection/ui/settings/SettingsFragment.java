package com.example.freshnessdetection.ui.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.freshnessdetection.databinding.FragmentSettingsBinding;
import com.example.freshnessdetection.ui.about.AboutActivity;

public class SettingsFragment extends Fragment {

  private FragmentSettingsBinding binding;

  public View onCreateView(@NonNull LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
    SettingsViewModel settingsViewModel =
        new ViewModelProvider(this).get(SettingsViewModel.class);

    binding = FragmentSettingsBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

    binding.aboutUs.getRoot().setOnClickListener(
        view -> startActivity(new Intent(requireActivity(), AboutActivity.class)));
    return root;
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    binding = null;
  }
}