package android.activitydynamicfragmentlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

public class DynamicFragment extends Fragment {

    private static final String TAG = "FRAGMENT : ";
    private int i = 0;

    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        Log.i(TAG, "onInflate");
        super.onInflate(context, attrs, savedInstanceState);
        Log.i(TAG, "onInflate" + " End");
    }

    @Override
    public void onAttach(Context context) {
        i++;
        Log.i(TAG, "onAttach" + " i = " + i);
        super.onAttach(context);
        Log.i(TAG, "onAttach" + " End");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        i++;
        Log.i(TAG, "onCreate" + " i = " + i);
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        Log.i(TAG, "onCreate" + " End");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        i++;
        Log.i(TAG, "onCreateView" + " i = " + i);
        View view = inflater.inflate(R.layout.dynamic_fragment, container, false);
        Log.i(TAG, "onCreateView" + " End");
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        i++;
        Log.i(TAG, "onActivityCreated" + " i = " + i);
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, "onActivityCreated" + " End");
    }

    @Override
    public void onStart() {
        Log.i(TAG, "onStart");
        super.onStart();
        Log.i(TAG, "onStart" + " End");
    }

    @Override
    public void onResume() {
        Log.i(TAG, "onResume");
        super.onResume();
        Log.i(TAG, "onResume" + " End");
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Log.i(TAG, "onCreateOptionsMenu");
        super.onCreateOptionsMenu(menu, inflater);
        Log.i(TAG, "onCreateOptionsMenu" + " End");
    }

    @Override
    public void onPause() {
        Log.i(TAG, "onPause");
        super.onPause();
        Log.i(TAG, "onPause" + " End");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.i(TAG, "onSaveInstanceState");
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState" + " End");
    }

    @Override
    public void onStop() {
        Log.i(TAG, "onStop");
        super.onStop();
        Log.i(TAG, "onStop" + " End");
    }

    @Override
    public void onDestroyView() {
        Log.i(TAG, "onDestroyView" + " i = " + i);
        super.onDestroyView();
        Log.i(TAG, "onDestroyView" + " End");
    }


    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy" + " i = " + i);
        super.onDestroy();
        Log.i(TAG, "onDestroy" + " End");
    }

    @Override
    public void onDetach() {
        Log.i(TAG, "onDetach" + " i = " + i);
        super.onDetach();
        Log.i(TAG, "onDetach" + " End");
    }
}
