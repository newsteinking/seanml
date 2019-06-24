/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.seanlab.machinelearning.mlkit.md.java;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
import com.seanlab.machinelearning.mlkit.R;
import com.seanlab.machinelearning.mlkit.ghost.view.LoginActivity;


/** Entry activity to select the detection mode. */
public class PointActivity extends AppCompatActivity {

  //sean
  //private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
 // private DatabaseReference databaseReference = firebaseDatabase.getReference();

  private enum DetectionModePoint {

    ODT_LIVE_MYPOINT(R.drawable.mypoint,R.string.mode_odt_live_mypoint_title, R.string.mode_odt_live_mypoint_subtitle,R.string.title_point);
   // ODT_LIVE_IMAGE(R.drawable.image_labelling,R.string.mode_odt_live_image_title, R.string.mode_odt_live_image_subtitle),
   // ODT_LIVE_TEXT(R.drawable.text_recognition,R.string.mode_odt_live_text_title, R.string.mode_odt_live_text_subtitle),
   // ODT_LIVE_LANDMARK(R.drawable.landmark_identification,R.string.mode_odt_live_landmark_title, R.string.mode_odt_live_landmark_subtitle);
    //ODT_LIVE_FACE(R.drawable.face_detection,R.string.mode_odt_live_face_title, R.string.mode_odt_live_face_subtitle);
    /*
    ODT_LIVE(R.string.mode_odt_live_image_title, R.string.mode_odt_live_image_subtitle),
    ODT_STATIC(R.string.mode_odt_static_title, R.string.mode_odt_static_subtitle),
    BARCODE_LIVE(R.string.mode_barcode_live_title, R.string.mode_barcode_live_subtitle);
    */
    //sean
    private final int imageResId;

    private final int titleResId;
    private final int subtitleResId;

    private final int subpointResId;

    DetectionModePoint(int imageResId,int titleResId, int subtitleResId,int subpointResId) {
      this.imageResId=imageResId;
      this.titleResId = titleResId;
      this.subtitleResId = subtitleResId;
      this.subpointResId = subpointResId;
    }
  }

  @Override
  protected void onCreate(@Nullable Bundle bundle) {
    super.onCreate(bundle);

    AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    setContentView(R.layout.activity_main_point);

    RecyclerView modeRecyclerView = findViewById(R.id.mode_recycler_view);
    modeRecyclerView.setHasFixedSize(true);
    modeRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    modeRecyclerView.setAdapter(new ModeItemAdapter(DetectionModePoint.values()));


  }

  @Override
  protected void onResume() {
    super.onResume();
    if (!Utils.allPermissionsGranted(this)) {
      Utils.requestRuntimePermissions(this);
    }
  }


  @Override
  protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
    if (requestCode == Utils.REQUEST_CODE_PHOTO_LIBRARY
        && resultCode == Activity.RESULT_OK
        && data != null) {
      Intent intent = new Intent(this, StaticObjectDetectionActivity.class);
      intent.setData(data.getData());
      startActivity(intent);
    } else {
      super.onActivityResult(requestCode, resultCode, data);
    }
  }

  private class ModeItemAdapter extends RecyclerView.Adapter<ModeItemAdapter.ModeItemViewHolder> {

    private final DetectionModePoint[] detectionModes;

    ModeItemAdapter(DetectionModePoint[] detectionModes) {
      this.detectionModes = detectionModes;
    }

    @NonNull
    @Override
    public ModeItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      return new ModeItemViewHolder(
          LayoutInflater.from(parent.getContext())
              .inflate(R.layout.detection_mode_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ModeItemViewHolder modeItemViewHolder, int position) {
      modeItemViewHolder.bindDetectionMode(detectionModes[position]);
    }

    @Override
    public int getItemCount() {
      return detectionModes.length;
    }

    private class ModeItemViewHolder extends RecyclerView.ViewHolder {

      private final ImageView imgView;
      private final TextView titleView;
      private final TextView subtitleView;
      private final TextView subpointView;

      ModeItemViewHolder(@NonNull View view) {
        super(view);
        imgView=view.findViewById(R.id.iViewApi);
        titleView = view.findViewById(R.id.mode_title);
        subtitleView = view.findViewById(R.id.mode_subtitle);
        subpointView=view.findViewById(R.id.point_value);
      }

      void bindDetectionMode(DetectionModePoint detectionMode) {

        imgView.setImageResource(detectionMode.imageResId);
        titleView.setText(detectionMode.titleResId);
        subtitleView.setText(detectionMode.subpointResId);

        subpointView.setText(R.string.point_value);


        itemView.setOnClickListener(
            view -> {
              Activity activity = PointActivity.this;
              switch (detectionMode) {
                /*
                case ODT_LIVE_BARCODE:
                  activity.startActivity(new Intent(activity, LiveBarcodeScanningActivity.class));
                  break;
                case ODT_LIVE_IMAGE_LABEL:
                  activity.startActivity(new Intent(activity, LiveObjectCloudDetectionActivity.class));
                  break;
                case ODT_LIVE_HOME:
                  activity.startActivity(new Intent(activity, WebHomeActivity.class));
                  break;
                case ODT_LIVE_MYIMG:
                  activity.startActivity(new Intent(activity, LoginActivity.class));
                  break;
                  */
                  /*
                //case ODT_LIVE_IMAGE:
                //  activity.startActivity(new Intent(activity, com.seanlab.machinelearning.mlkit.md.java.LiveObjectCloudImageDetectionActivity.class));
                //  break;
                case ODT_LIVE_TEXT:
                  //Utils.openImagePicker(activity);
                  activity.startActivity(new Intent(activity, com.seanlab.machinelearning.mlkit.md.java.LiveObjectCloudTextDetectionActivity.class));
                  break;

                case ODT_LIVE_LANDMARK:
                  activity.startActivity(new Intent(activity, com.seanlab.machinelearning.mlkit.md.java.LiveObjectCloudLandDetectionActivity.class));
                  break;
                //case ODT_LIVE_FACE:
                //  activity.startActivity(new Intent(activity, com.seanlab.machinelearning.mlkit.md.java.LiveObjectDetectionActivity.class));
                 // break;
                 */
                /*
                case ODT_LIVE:
                  activity.startActivity(new Intent(activity, com.seanlab.machinelearning.mlkit.md.java.LiveObjectDetectionActivity.class));
                  break;
                case ODT_STATIC:
                  Utils.openImagePicker(activity);
                  break;
                case BARCODE_LIVE:
                  activity.startActivity(new Intent(activity, com.seanlab.machinelearning.mlkit.md.java.LiveBarcodeScanningActivity.class));
                  break;
                  */
              }
            });
      }
    }
  }
}