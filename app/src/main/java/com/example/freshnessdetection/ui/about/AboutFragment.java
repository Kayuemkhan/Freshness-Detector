package com.example.freshnessdetection.ui.about;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.freshnessdetection.R;

public class AboutFragment extends Fragment {
  private ImageView imageView,imageView1;
  public AboutFragment() {

  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_about, container, false);
    imageView = view.findViewById(R.id.profile_image1);
    imageView1 = view.findViewById(R.id.profile_image);
    Glide.with(requireActivity()).load(R.drawable.pasha_vai).apply(RequestOptions.circleCropTransform()).into(imageView);
    Glide.with(requireActivity()).load(R.drawable.tishun_immg).apply(RequestOptions.circleCropTransform()).into(imageView1);

    return view.getRootView();

  }
}