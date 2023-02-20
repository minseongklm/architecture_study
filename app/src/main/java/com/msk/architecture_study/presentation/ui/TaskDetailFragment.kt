package com.msk.architecture_study.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.msk.architecture_study.R
import com.msk.architecture_study.databinding.FragmentTaskDetailBinding
import com.msk.architecture_study.presentation.base.BaseFragment

class TaskDetailFragment : BaseFragment<FragmentTaskDetailBinding>(R.layout.fragment_task_detail) {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        return view
    }
}