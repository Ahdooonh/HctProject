package android.sas.ita.hctproject.student_info;

import android.content.Context;
import android.sas.ita.hctproject.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sasmob on 11/26/2017.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder> {
    Context mContext;
    ArrayList<Student_info> infoArrayList;
    public StudentAdapter(Context mContext,ArrayList<Student_info> infoArrayList){
        this.mContext=mContext;
        this.infoArrayList=infoArrayList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater =(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.student_cardview,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
      Student_info student=infoArrayList.get(position);
        holder.name.setText(student.getName());
        holder.image.setImageResource(student.getStudent_image());
    }

    @Override
    public int getItemCount() {
        return infoArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView image;
        public MyViewHolder(View itemView) {
            super(itemView);

            name=(TextView) itemView.findViewById(R.id.name);
            image=(ImageView) itemView.findViewById(R.id.image);
        }
    }
}
