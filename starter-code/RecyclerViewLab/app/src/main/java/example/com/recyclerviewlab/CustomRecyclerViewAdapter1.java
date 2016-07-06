package example.com.recyclerviewlab;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by stacyzolnikov on 7/5/16.
 */
public class CustomRecyclerViewAdapter1 extends RecyclerView.Adapter<CustomViewHolder1> {
    List<CustomObject1> customObjectList1;

    public CustomRecyclerViewAdapter1 (List<CustomObject1> customObjects1){
        customObjectList1 = customObjects1;
    }

    @Override
    public CustomViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
      LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.custom_view_1, parent, false);
        CustomViewHolder1 viewHolder = new CustomViewHolder1(parentView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(CustomViewHolder1 holder, int position) {
        final int myPosition = position;
        CustomObject1 customObject1 = customObjectList1.get(position);
//        holder.mtextView.setText(customObject1.text1);
        holder.mtextView.setBackgroundColor(ContextCompat.getColor(holder.getContext(),customObject1.getColor1()));
        //holder.mtextView.(customObject1.getColor1());
        holder.mtextView2.setText(customObject1.description1);
        holder.mtextView3.setText(customObject1.getText1());
//        holder.mtextView3.setBackgroundColor(customObject1.getColor1());
        holder.mcard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked on row " + myPosition, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return customObjectList1.size();
    }
}
