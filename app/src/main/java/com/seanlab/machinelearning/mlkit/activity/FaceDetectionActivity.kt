package com.seanlab.machinelearning.mlkit.activity

import android.graphics.Bitmap
import android.os.Bundle
//import android.support.design.widget.BottomSheetBehavior
//import android.support.v7.widget.LinearLayoutManager

import com.google.android.material.bottomsheet.BottomSheetBehavior
import 	androidx.recyclerview.widget.LinearLayoutManager


import android.view.View
import android.widget.Toast
import com.google.firebase.ml.vision.FirebaseVision
import com.google.firebase.ml.vision.common.FirebaseVisionImage
import com.google.firebase.ml.vision.face.FirebaseVisionFace
import com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions
import com.seanlab.machinelearning.mlkit.R
import com.seanlab.machinelearning.mlkit.R.id.*
import com.seanlab.machinelearning.mlkit.adapter.FaceAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_image_label.*

class FaceDetectionActivity : BaseCameraActivity() {

    private val detectedFaces = arrayListOf<FirebaseVisionFace>()
    private val adapter = FaceAdapter(detectedFaces)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        cameraView.facing = CameraKit.Constants.FACING_FRONT
        setupBottomSheet(R.layout.layout_image_label)
        /* sean
        rvLabel.layoutManager = LinearLayoutManager(this)

        rvLabel.adapter = adapter
        */
    }

    private fun getFaceDetails(bitmap: Bitmap) {

        val options: FirebaseVisionFaceDetectorOptions = FirebaseVisionFaceDetectorOptions.Builder()
                .setLandmarkMode(FirebaseVisionFaceDetectorOptions.ALL_LANDMARKS)
                .setClassificationMode(FirebaseVisionFaceDetectorOptions.ALL_CLASSIFICATIONS)
                .setPerformanceMode(FirebaseVisionFaceDetectorOptions.FAST)
                .build()
        /*
        val options: FirebaseVisionFaceDetectorOptions = FirebaseVisionFaceDetectorOptions.Builder()
                .setLandmarkType(FirebaseVisionFaceDetectorOptions.ALL_LANDMARKS)
                .setClassificationType(FirebaseVisionFaceDetectorOptions.ALL_CLASSIFICATIONS)
                .setModeType(FirebaseVisionFaceDetectorOptions.FAST_MODE)
                .build()
        */
        val image: FirebaseVisionImage = FirebaseVisionImage.fromBitmap(bitmap)
        val faceDetector = FirebaseVision.getInstance().getVisionFaceDetector(options)

        faceDetector.detectInImage(image)
                .addOnSuccessListener {
                    detectedFaces.clear()
                    detectedFaces.addAll(it)
                    adapter.notifyDataSetChanged()
                }
                .addOnFailureListener {
                    Toast.makeText(this, "Sorry, an error occurred", Toast.LENGTH_SHORT).show()
                }
                .addOnCompleteListener {
                    sheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
                    fabProgressCircle.hide()
                }

    }
    override fun onClick(v: View?) {
        fabProgressCircle.show()
        cameraView.captureImage { cameraKitImage ->
            // Get the Bitmap from the captured shot
            getFaceDetails(cameraKitImage.bitmap)
            runOnUiThread {
                showPreview()
                imagePreview.setImageBitmap(cameraKitImage.bitmap)
            }
        }
    }
}