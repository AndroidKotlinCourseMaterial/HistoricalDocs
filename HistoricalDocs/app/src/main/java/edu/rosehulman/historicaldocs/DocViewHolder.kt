package edu.rosehulman.historicaldocs

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.row_view_doc.view.*

class DocViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleTextView = itemView.document_title_text_view

    fun bind(doc: Doc) {
        titleTextView.text = doc.title
    }
}