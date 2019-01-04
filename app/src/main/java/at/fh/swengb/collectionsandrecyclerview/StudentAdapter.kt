package at.fh.swengb.collectionsandrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_student.view.*

class StudentAdapter(): RecyclerView.Adapter<StudentViewHolder>() {
    var studentList = listOf<Student>()

    fun updateList(newList: List<Student>) {
        studentList = newList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): StudentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val studentItemView = inflater.inflate(R.layout.item_student, parent, false)
        return StudentViewHolder(studentItemView)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    override fun onBindViewHolder(viewHolder: StudentViewHolder, position: Int) {
        val student = studentList[position]
        viewHolder.bindItem(student)
    }

}

class StudentViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bindItem(student: Student) {
        itemView.student_name.text = student.name
    }
}

