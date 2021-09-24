package com.example.cameraapp

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cameraapp.databinding.FragmentPreviewBinding

class PreviewFragment : Fragment() {

    private lateinit var fragmentPreviewBinding: FragmentPreviewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentPreviewBinding = FragmentPreviewBinding.inflate(inflater, container, false)
        val string = arguments?.getString("imageUri")
        fragmentPreviewBinding.previewImageView.setImageURI(Uri.parse(string))
        return fragmentPreviewBinding.root
    }
}