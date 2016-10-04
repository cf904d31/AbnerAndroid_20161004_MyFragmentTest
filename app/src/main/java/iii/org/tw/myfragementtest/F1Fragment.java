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

    public F1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_f1, container, false);
        textView = (TextView) view.findViewById(R.id.text_f1);
        button = (Button)view.findViewById(R.id.button_f1);
        textView.setText("Hello Abner! I am f1");

        return view;
    }

}
