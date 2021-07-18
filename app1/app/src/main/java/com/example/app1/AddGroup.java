package com.example.app1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AddGroup extends Fragment {
    String Gname;
    String Gday;
    String Gplace;
    String Myname;
    String Fname;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        View v= inflater.inflate(R.layout.add_group,container,false);

        TextView F=(TextView) v.findViewById(R.id.FName);

        Button FaddB = (Button) v.findViewById(R.id.FaddB);
        FaddB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast myToast = Toast.makeText(getActivity().getApplicationContext(),"그룹멤버 추가 버튼", Toast.LENGTH_SHORT);
                myToast.show();
                //F.setText("");
            }
        });

        Button GaddB = (Button) v.findViewById(R.id.GaddB);
        GaddB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //내용저장
                EditText N = (EditText) v.findViewById(R.id.Name);
                Gname=N.getText().toString();
                EditText D = (EditText) v.findViewById(R.id.GDay);
                Gday=D.getText().toString();
                EditText P = (EditText) v.findViewById(R.id.GPlace);
                Gplace=P.getText().toString();
                EditText M = (EditText) v.findViewById(R.id.MyName);
                Myname=M.getText().toString();

                Fname=F.getText().toString();
                //내용 전송 추가해야함


                Toast myToast = Toast.makeText(getActivity().getApplicationContext(),"그룹을 추가했습니다.", Toast.LENGTH_SHORT);
                myToast.show();
                ((MainActivity)getActivity()).addGroup2();
            }
        });

        return v;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}