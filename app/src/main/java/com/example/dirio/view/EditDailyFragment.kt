package com.example.dirio.view

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.dirio.R
import com.example.dirio.Repository.DailyEntitie
import com.example.dirio.databinding.FragmentEditDailyBinding
import com.example.dirio.view.viewModel.FragmentsViewModel
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class EditDailyFragment : Fragment() {

    private var _binding: FragmentEditDailyBinding? = null
    private val binding get() = _binding!!
    private val viewMoodel by viewModels<FragmentsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentEditDailyBinding.inflate(inflater, container, false)

        return binding.root
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.buttonSecond.setOnClickListener {
//            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
//
//        }
//    }


    override fun onDestroyView() {
        super.onDestroyView()
        val title = binding.editTitle.text.toString()
        val textDaily = binding.editTextDaily.text.toString()
        if (title != "" && textDaily != ""){
            val currentDate = LocalDate.now()
            val dateTime = LocalDateTime.of(
                currentDate.year,
                currentDate.month,
                currentDate.dayOfMonth,
                binding.timeDate.hour,
                binding.timeDate.minute
            )
            viewMoodel.insertDaily(
                DailyEntitie(
                    0,
                    title,
                    textDaily,
                    dateTime
                )
            )
        }
        Log.i(TAG, "onDestroyView: true")
        _binding = null
    }
}