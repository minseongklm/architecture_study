package com.msk.architecture_study.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.msk.architecture_study.R
import com.msk.architecture_study.databinding.FragmentTaskBinding
import com.msk.architecture_study.presentation.base.BaseFragment

class TaskFragment : BaseFragment<FragmentTaskBinding>(R.layout.fragment_task) {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_task, container, false)
    }
}