package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by stacyzolnikov on 7/5/16.
 */
public class CustomRecyclerViewAdapter2 extends RecyclerView.Adapter<CustomViewHolder2> {
    List<CustomObject2> customObjectList2;

    public CustomRecyclerViewAdapter2(List<CustomObject2> customObjects2) {
        customObjectList2 = customObjects2;
    }

    @Override
    public CustomViewHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.custom_view_2, parent, false);
        CustomViewHolder2 viewHolder2 = new CustomViewHolder2(parentView);
        return viewHolder2;
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder2 holder, final int position) {
        final int myPosition = position;
//        CustomObject2 customObject2 = customObject2List.get(position);
        holder.mtextView4.setText(customObjectList2.get(position).getText2());
        holder.mtextView5.setText(customObjectList2.get(position).getColor2());
        holder.mtextView6.setText(customObjectList2.get(position).getDescription2());
        holder.mcard2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked on row " + myPosition, Toast.LENGTH_SHORT).show();
                if (holder.mcheckBox.isChecked()) {

                    holder.mcheckBox.setChecked(false);
                    //customObjectList2.get(position).setCheckbox2(false);

                } else {

                    holder.mcheckBox.setChecked(true);
                   // customObjectList2.get(position).setCheckbox2(true);

                }

            }


        });
         // holder.mcheckBox.setChecked(customObjectList2.get(position).getCheckbox2());

    }

    @Override
    public int getItemCount() {
        if (customObjectList2 == null) {
            return 0;
        } else {
            return customObjectList2.size();
        }
    }
}
