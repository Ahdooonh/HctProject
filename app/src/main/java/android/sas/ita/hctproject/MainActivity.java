package android.sas.ita.hctproject;

import android.content.res.TypedArray;
import android.sas.ita.hctproject.student_info.StudentAdapter;
import android.sas.ita.hctproject.student_info.Student_info;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     String[] studentName;
    TypedArray studentImage;
    RecyclerView recycler;
    ArrayList<Student_info> studentInfoArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentInfoArrayList = new ArrayList<>();
        recycler =(RecyclerView)findViewById(R.id.recyclerView);
        studentName=getResources().getStringArray(R.array.student_names);
        studentImage=getResources().obtainTypedArray(R.array.random_imgs);
        createStudentList();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager
                (this, LinearLayoutManager.VERTICAL,false);
        recycler.setLayoutManager(layoutManager);
        StudentAdapter adapter = new StudentAdapter(this,studentInfoArrayList);
        recycler.setAdapter(adapter);
    }

    private void createStudentList() {
        for(int i=0;i<studentName.length;i++)
        {
            Student_info st = new Student_info();
            st.setName(studentName[i]);
            st.setStudent_image(studentImage.getResourceId(i,-1));
            studentInfoArrayList.add(st);

        }

    }
}
