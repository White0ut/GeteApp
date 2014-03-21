package edu.wmich.gete;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import edu.wmich.geteapp.R;

public class ProfileFrag extends Fragment {
	
	public ProfileFrag(){}
	
	View mProfile;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.test, container, false);
		return view;
	}

}
