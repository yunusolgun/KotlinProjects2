package com.robusttech.retrofitkotlin.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.robusttech.retrofitkotlin.R
import com.robusttech.retrofitkotlin.databinding.RowLayoutBinding
import com.robusttech.retrofitkotlin.model.CryptoModel



class RecyclerViewAdapter(private val cryptoList: ArrayList<CryptoModel>, private val listener: Listener): RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>() {

    interface Listener {
        fun onItemClick(cryptoModel: CryptoModel)
    }

    private var colors: Array<String> = arrayOf("#13bd27","#29c1e1","#b129e1","#d3df13","#f6bd0c","#a1fb93","#0d9de3","#ffe48f")

    class RowHolder(val layoutBinding: RowLayoutBinding) : RecyclerView.ViewHolder(layoutBinding.root) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val rowLayoutBinding = RowLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        //val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
        return RowHolder(rowLayoutBinding)
    }

    override fun getItemCount(): Int {
        return cryptoList.count()
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.layoutBinding.textName.text = cryptoList[position].currency
        holder.layoutBinding.textPrice.text = cryptoList[position].price
        holder.itemView.setBackgroundColor(Color.parseColor(colors[position % 8]))
        holder.itemView.setOnClickListener {
            listener.onItemClick(cryptoList[position])
        }
    }


}