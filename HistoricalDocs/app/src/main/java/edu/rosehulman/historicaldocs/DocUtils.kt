package edu.rosehulman.historicaldocs

import android.content.Context
import java.io.IOException
import java.util.*
import org.apache.commons.io.IOUtils


object DocUtils {
    fun loadDocs(context: Context?): ArrayList<Doc> {
        val titles = arrayOf(
            "Ten Commandments",
            "The Suffering Servant",
            "Sermon on the Mount",
            "Magna Carta",
            "Mayflower Compact",
            "Give Me Liberty",
            "Declaration of Independence",
            "US Constitution",
            "I Have a Dream"
        )
        val resources = arrayOf(
            R.raw.ten_commandments,
            R.raw.the_suffering_servant,
            R.raw.sermon_on_the_mount,
            R.raw.magna_carta,
            R.raw.mayflower_compact,
            R.raw.give_me_liberty,
            R.raw.declaration_of_independence,
            R.raw.constitution,
            R.raw.i_have_a_dream
        )
        val docs = ArrayList<Doc>()
        for (i in titles.indices) {
            val stream = context?.resources?.openRawResource(resources[i])
            var s: String? = null
            try {
                s = IOUtils.toString(stream)
            } catch (e: IOException) {
                e.printStackTrace()
            }

            IOUtils.closeQuietly(stream) // don't forget to close your streams
            val doc = Doc(titles[i], s!!)
            docs.add(doc)
        }
        return docs
    }
}

