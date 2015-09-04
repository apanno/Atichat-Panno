package app12values.atichatpanno.iiivalues;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by LeeAtiNoPanno on 03/09/2015.
 */
public class MyAdapter extends BaseAdapter {

    //Explicit
    private Context objContext;
    private int[] valuesInts;
    private String[] valuesStrings;

    public MyAdapter(Context objContext, int[] valuesInts, String[] valuesStrings) {
        this.objContext = objContext;
        this.valuesInts = valuesInts;
        this.valuesStrings = valuesStrings;
    }

    @Override
    public int getCount() {
        return valuesStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        //show Icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imvShowIcon);
        iconImageView.setBackgroundResource(valuesInts[position]);

        //show Title
        TextView titleTextView = (TextView) view1.findViewById(R.id.txtShowTitle);
        titleTextView.setText(valuesInts[position]);


        return view1;
    } // getView

}  // Main Class
