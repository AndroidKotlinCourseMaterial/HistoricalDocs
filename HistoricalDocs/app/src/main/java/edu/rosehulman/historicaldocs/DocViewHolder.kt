package edu.rosehulman.historicaldocs

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.row_view_doc.view.*

class DocViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val titleTextView = itemView.document_title_text_view as TextView

    fun bind(doc: Doc) {
        titleTextView.text = doc.title
    }
}