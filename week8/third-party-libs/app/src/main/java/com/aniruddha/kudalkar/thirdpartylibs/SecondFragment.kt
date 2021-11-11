package com.aniruddha.kudalkar.thirdpartylibs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.aniruddha.kudalkar.thirdpartylibs.databinding.FragmentSecondBinding
import com.anychart.AnyChart
import com.anychart.enums.HoverMode

import com.anychart.enums.TooltipPositionMode

import com.anychart.chart.common.dataentry.ValueDataEntry

import com.anychart.chart.common.dataentry.DataEntry

import android.R

import com.anychart.AnyChartView
import com.anychart.charts.Cartesian
import com.anychart.core.cartesian.series.Column
import com.anychart.enums.Anchor
import com.anychart.enums.Position


/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.chart.setProgressBar(binding.progressBar)

        val cartesian: Cartesian = AnyChart.column()

        val data: MutableList<DataEntry> = ArrayList()
        data.add(ValueDataEntry("Rouge", 80540))
        data.add(ValueDataEntry("Foundation", 94190))
        data.add(ValueDataEntry("Mascara", 102610))
        data.add(ValueDataEntry("Lip gloss", 110430))
        data.add(ValueDataEntry("Lipstick", 128000))
        data.add(ValueDataEntry("Nail polish", 143760))
        data.add(ValueDataEntry("Eyebrow pencil", 170670))
        data.add(ValueDataEntry("Eyeliner", 213210))
        data.add(ValueDataEntry("Eyeshadows", 249980))

        val column: Column = cartesian.column(data)

        column.tooltip()
            .titleFormat("{%X}")
            .position(Position.CENTER_BOTTOM)
            .anchor(Anchor.CENTER_BOTTOM)
            .offsetX(0.0)
            .offsetY(5.0)
            .format("\${%Value}{groupsSeparator: }")

        cartesian.animation(true)
        cartesian.title("Top 10 Cosmetic Products by Revenue")

        cartesian.yScale().minimum(0.0)

        cartesian.yAxis(0).labels().format("\${%Value}{groupsSeparator: }")

        cartesian.tooltip().positionMode(TooltipPositionMode.POINT)
        cartesian.interactivity().hoverMode(HoverMode.BY_X)

        cartesian.xAxis(0).title("Product")
        cartesian.yAxis(0).title("Revenue")

        binding.chart.setChart(cartesian)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}