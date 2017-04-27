package com.dmt.damiti.fragmentchangeorientationkpt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StudentInfomation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infomation);

        Intent intent = getIntent();

        SinhVien sinhVien = (SinhVien) intent.getSerializableExtra("thongTinSinhVien");

        FragmentStudentInfo studentInfo = (FragmentStudentInfo)
                getFragmentManager().findFragmentById(R.id.fragmentChiTiet);

        studentInfo.SetInfo(sinhVien);
    }
}
