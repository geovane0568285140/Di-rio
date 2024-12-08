package com.example.dirio.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dirio.adapter.DiariesAdapter
import com.example.dirio.databinding.FragmentDiariesBinding
import com.example.dirio.listener.ListenerFragment
import com.example.dirio.view.viewModel.FragmentsViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class DiariesFragment : Fragment() {

    private var _binding: FragmentDiariesBinding? = null
    private val binding get() = _binding!!
    private var adpter = DiariesAdapter()
    private val viewModel by viewModels<FragmentsViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDiariesBinding.inflate(inflater, container, false)

        binding.recyclerviewDiaries.layoutManager = LinearLayoutManager(context)
        binding.recyclerviewDiaries.adapter = adpter
        adpter.getListener(object : ListenerFragment{

            override fun editDaily(id: Int) {
val disk = "so pra dizer"
            }

            override fun deleteDaiyl(id: Int) {

            }

        })

        viewModel.getALL()
        observe()

        return binding.root
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
//    }

    override fun onResume() {
        super.onResume()
        viewModel.getALL()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun observe(){
        viewModel.observeListaDaily.observe(viewLifecycleOwner
        ) {
            adpter.update(it)
        }
    }
}