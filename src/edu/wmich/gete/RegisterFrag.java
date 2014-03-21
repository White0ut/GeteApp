package edu.wmich.gete;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import edu.wmich.geteapp.R;

public class RegisterFrag extends Fragment {
	
	public RegisterFrag(){}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View profile = inflater.inflate(R.layout.register_frag, container, false);
		return profile;
	}
}
 