package com.example.dirio.view

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.dirio.Repository.DailyEntitie
import com.example.dirio.constants.Constants
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
    private var bundle: Int? = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentEditDailyBinding.inflate(inflater, container, false)

        bundle = arguments?.getInt("id")
        bundleId_Fragment()


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        val title = binding.editTitle.text.toString()
        val textDaily = binding.editTextDaily.text.toString()
        if (title != "" && textDaily != "") {
            if (bundle != null)
                update(bundle!!)
            else
                insertDaily(title, textDaily)
        }
        Log.i(TAG, "onDestroyView: true")
        _binding = null
    }

    private fun insertDaily(titleDaily: String, text: String) {
        viewMoodel.insertDaily(
            DailyEntitie(
                0,
                titleDaily,
                text,
                viewMoodel.getDateTimeUi(binding.timeDate.hour, binding.timeDate.minute)
            )
        )
    }

    private fun update(id: Int) {
        viewMoodel.updateDaily(
            DailyEntitie(
                id,
                binding.editTitle.text.toString(),
                binding.editTextDaily.text.toString(),
                viewMoodel.getDateTimeUi(binding.timeDate.hour, binding.timeDate.minute)
            )
        )
}

    private fun getDaily(id: Int) {
        val daily = viewMoodel.getDaily(id)
        binding.editTitle.setText(daily.text)
        binding.timeDate.hour = daily.dateTime.hour
        binding.timeDate.minute = daily.dateTime.minute
        binding.editTextDaily.setText(daily.text)
        binding.textDate.text = daily.dateTime.format(DateTimeFormatter.ofPattern(Constants.DateOrDateTime.date))
    }

    //tamo codando tamo codando?
    fun bundleId_Fragment(){
        if (bundle != null)
            getDaily(bundle!!)
        else
            binding.textDate.text = LocalDate.now().format(DateTimeFormatter.ofPattern(Constants.DateOrDateTime.date))
    }
}