package vn.edu.usth.usthweather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.widget.ImageView;

public class ForecastFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        // Set the background color of the layout
        int color = 0x2000FF00; // Example color #2000FF00
        layout.setBackgroundColor(color);

        // Create a new TextView
        TextView textView = new TextView(getActivity());
        textView.setText("Thursday");
        textView.setTextSize(18);
        textView.setTextColor(Color.BLACK);

        // Create a new ImageView
        ImageView imageView = new ImageView(getActivity());
        imageView.setImageResource(R.drawable.cloud);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        // Add the TextView and ImageView to the LinearLayout
        layout.addView(textView);
        layout.addView(imageView);

        // Return the layout as the root view of this fragment
        return layout;
    }
}
