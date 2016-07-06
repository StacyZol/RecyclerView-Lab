package example.com.recyclerviewlab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by stacyzolnikov on 7/5/16.
 */
public class CustomViewHolder1 extends RecyclerView.ViewHolder {
    public TextView mtextView;
    public TextView mtextView2;
    public TextView mtextView3;
    public LinearLayout mcard1;


    public CustomViewHolder1(View itemView) {
        super(itemView);

        mtextView = (TextView) itemView.findViewById(R.id.greenbox1);
        mtextView2 = (TextView) itemView.findViewById(R.id.textview1);
        mtextView3 = (TextView) itemView.findViewById(R.id.description1);
        mcard1 = (LinearLayout) itemView.findViewById(R.id.card1);
    }
    public Context getContext() {
        return mtextView.getContext();
    }
    }

