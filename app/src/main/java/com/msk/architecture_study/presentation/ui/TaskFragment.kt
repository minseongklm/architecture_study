package com.msk.architecture_study.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.msk.architecture_study.R
import com.msk.architecture_study.databinding.FragmentTaskBinding
import com.msk.architecture_study.presentation.base.BaseFragment

class TaskFragment : BaseFragment<FragmentTaskBinding>(R.layout.fragment_task) {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        bind {
            fragment = this@TaskFragment
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    /**
     * Navigate AddEditFragment
     */
    fun navAddEditFragment() {
        val action = TaskFragmentDirections.actionTaskFragmentToAddEditFragment()
        findNavController().navigate(action)
    }

    companion object {
        const val TAG = "TaskFragment"
    }
}