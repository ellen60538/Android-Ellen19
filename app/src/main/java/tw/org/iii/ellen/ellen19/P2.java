package tw.org.iii.ellen.ellen19;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;


public class P2 extends Fragment {

    private View mainView ;
    private ViewFlipper flipper ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null){
            mainView = inflater.inflate(R.layout.fragment_p2, container, false) ;
            flipper = mainView.findViewById(R.id.flipper) ;
            MyFlipperListeren myFlipperListeren = new MyFlipperListeren() ;
            View f0 = flipper.getChildAt(0 );
            View f1 = flipper.getChildAt(1) ;
            View f2 = flipper.getChildAt(2) ;
            View f3 = flipper.getChildAt(3) ;
            View f4 = flipper.getChildAt(4) ;
            f0.setOnClickListener(myFlipperListeren) ;
            f1.setOnClickListener(myFlipperListeren) ;
            f2.setOnClickListener(myFlipperListeren) ;
            f3.setOnClickListener(myFlipperListeren) ;
            f4.setOnClickListener(myFlipperListeren) ;

        }

        return mainView ;
    }

    private class MyFlipperListeren implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            flipper.showNext() ;
        }
    }

}
