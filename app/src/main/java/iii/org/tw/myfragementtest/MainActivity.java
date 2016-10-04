package iii.org.tw.myfragementtest;

import android.app.FragmentTransaction;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr;
    private FragmentTransaction tran;
    private F1Fragment f1;
    private F2Fragment f2;
    boolean isF1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = new F1Fragment();
        f2 = new F2Fragment();

        fmgr = getFragmentManager();
        tran = fmgr.beginTransaction();
        tran.add(R.id.container,f1);
        tran.commit();

        isF1 = true;
    }

    public void test1(View v) {
        isF1 = !isF1;
        fmgr = getFragmentManager();
        tran = fmgr.beginTransaction();
        tran.replace(R.id.container,isF1?f1:f2);
        tran.commit();
    }

    public void b1(View v) {

    }

    public void b2(View v) {

    }
}
