package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by stacyzolnikov on 7/5/16.
 */
public class CustomViewHolder2 extends RecyclerView.ViewHolder {
    public TextView mtextView4;
    public TextView mtextView5;
    public TextView mtextView6;
    public CheckBox mcheckBox;
    public LinearLayout mcard2;

    public CustomViewHolder2(View itemView) {
        super(itemView);

        mtextView4 = (TextView) itemView.findViewById(R.id.textview2);
        mtextView5 = (TextView) itemView.findViewById(R.id.greenbox2);
        mtextView6 = (TextView) itemView.findViewById(R.id.description2);
        mcheckBox = (CheckBox) itemView.findViewById(R.id.checkbox2);
        mcard2 = (LinearLayout) itemView.findViewById(R.id.card2);

    }
}
