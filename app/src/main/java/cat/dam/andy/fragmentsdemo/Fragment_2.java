package cat.dam.andy.fragmentsdemo;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView imageView;

    public Fragment_2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_2.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_2 newInstance(String param1, String param2) {
        Fragment_2 fragment = new Fragment_2();
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
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_2, container, false);
        View root = inflater.inflate(R.layout.fragment_2, container, false);
        imageView = root.findViewById(R.id.img_zebra);
        imageView.setOnClickListener(v->{
            if (imageView.getDrawable().getConstantState().equals(ContextCompat.getDrawable(getActivity(),R.drawable.zebra).getConstantState())){
                Toast.makeText(getContext(), "Zebra to Unicorn", Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.unicorn);
            }
            else {
                Toast.makeText(getContext(), "I'm already Unicorn", Toast.LENGTH_SHORT).show();
            }

        });
        return root;
    }
}