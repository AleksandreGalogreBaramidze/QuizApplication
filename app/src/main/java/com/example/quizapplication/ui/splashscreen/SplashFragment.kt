package com.example.quizapplication.ui.splashscreen


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.quizapplication.R
import com.example.quizapplication.databinding.SplashFragmentBinding
import com.example.quizapplication.extensions.startAnimation
import com.example.quizapplication.extensions.observe
import com.example.quizapplication.ui.basefragment.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SplashFragment : BaseFragment<SplashFragmentBinding, SplashViewModel>() {
    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> SplashFragmentBinding get() = SplashFragmentBinding::inflate
    override fun getViewModel() = SplashViewModel::class.java
    override fun initFragment(viewModel: SplashViewModel) {
        viewModel.getUserName()
        with(binding){
            logo.startAnimation(R.anim.fade_out)
            splashBg.startAnimation(R.anim.fade_out)
        }
        lifecycleScope.launch {
            delay(SPLASH_DELAY)
            observer(viewModel)
        }
    }
    private fun observer(viewModel: SplashViewModel){
        observe(viewModel.isLogged) { status ->
            findNavController().navigate(if(status){
                R.id.action_splashFragment_to_homeFragment
            }else{R.id.action_splashFragment_to_startPageFragment})
        }
    }
    companion object{
        private const val SPLASH_DELAY = 2000L
    }
}