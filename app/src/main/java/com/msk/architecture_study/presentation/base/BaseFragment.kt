package com.msk.architecture_study.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 * [BaseFragment] example for base fragment
 *
 * @param layoutRes Layout id(R.layout.fragment_example)
 */
abstract class BaseFragment<T : ViewDataBinding>(
    @LayoutRes private val layoutRes: Int
) : Fragment() {
    protected lateinit var binding: T
        private set

    /**
     * only create lifecycle if get usable fragment view objects.
     * this lifecycle updated INITIALIZED state.
     *
     * can set view's initial value, livedata observing, setting adapter for recyclerView.
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutRes, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = this
    }

    /**
     * All ending animations and transitions are completed, and if the Fragment fails on the screen,
     * the Fragment View's Lifecycle becomes DESTROYED and onDestroy() is called.
     *
     * After this point, getViewLifecycleOwnerLiveData() returns null as the return value.
     * And at that point, all references to the Fragment View should be removed so that it can be
     * collected by the garbage collector.
     */
    override fun onDestroyView() {
        super.onDestroyView()
        binding.unbind()
    }

    /**
     * binding builder
     */
    protected inline fun bind(block: T.() -> Unit) {
        binding.apply(block)
    }
}