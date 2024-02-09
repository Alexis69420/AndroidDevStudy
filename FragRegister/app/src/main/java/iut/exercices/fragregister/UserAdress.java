package iut.exercices.fragregister;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UserAdress#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UserAdress extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button modify;

    public UserAdress() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UserAdress.
     */
    // TODO: Rename and change types and number of parameters
    public static UserAdress newInstance(String param1, String param2) {
        UserAdress fragment = new UserAdress();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View nonRootView = inflater.inflate(R.layout.fragment_user_adress, container, false);
        this.modify = nonRootView.findViewById(R.id.button2);
        this.modify.setOnClickListener(onModify);
        return nonRootView;

    }

    private View.OnClickListener onModify = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            EditText hNumber = getView().findViewById(R.id.hNumber);
            EditText street = getView().findViewById(R.id.street);
            EditText pCode = getView().findViewById(R.id.pCode);
            EditText city = getView().findViewById(R.id.city);
            TextView hNumberView = getActivity().findViewById(R.id.hNumberView);
            TextView streetView = getActivity().findViewById(R.id.streetView);
            TextView pCodeView = getActivity().findViewById(R.id.pCodeView);
            TextView cityView = getActivity().findViewById(R.id.cityView);
            hNumberView.setText(hNumber.getText());
            streetView.setText(street.getText());
            pCodeView.setText(pCode.getText());
            cityView.setText(city.getText());
        }
    };
}