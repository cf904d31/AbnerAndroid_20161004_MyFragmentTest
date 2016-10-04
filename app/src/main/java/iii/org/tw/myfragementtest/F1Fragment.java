package iii.org.tw.myfragementtest;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class F1Fragment extends Fragment {
    private TextView textView;
    private Button button;
    private MainActivity main;

    public F1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        main = (MainActivity) getActivity();
        View view = inflater.inflate(R.layout.fragment_f1, container, false);
        textView = (TextView) view.findViewById(R.id.text_f1);
        button = (Button)view.findViewById(R.id.button_f1);
        textView.setText("Hello Abner! I am f1");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.getF2();
            }
        });

        return view;
    }

}
