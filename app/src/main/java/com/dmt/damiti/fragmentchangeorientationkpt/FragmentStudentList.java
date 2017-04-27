package com.dmt.damiti.fragmentchangeorientationkpt;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by TienMinh on 12-Apr-17.
 */

public class FragmentStudentList extends ListFragment {

    ArrayList<SinhVien> arraySinhVien;
    StudentAdapter adapter;

    TruyenSinhVien truyenSV;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        truyenSV = (TruyenSinhVien) getActivity();

        arraySinhVien = new ArrayList<>();
        AddArraySV();
        adapter = new StudentAdapter(getActivity(), R.layout.row_student, arraySinhVien);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_student_list, container, false);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        truyenSV.DataStudent(arraySinhVien.get(position));
    }

    private void AddArraySV(){
        arraySinhVien.add(new SinhVien("Nguyễn Văn A", 1999, "Hà Nội", "nva@yahoo.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn B", 1996, "Hà Nam", "nvb@yahoo.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn C", 1991, "Cao Bằng", "nvc@yahoo.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn D", 1990, "Huế", "nvd@yahoo.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn E", 1993, "Quảng Ninh", "nve@yahoo.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn F", 1992, "Vĩnh Long", "nvf@yahoo.com"));

    }
}
