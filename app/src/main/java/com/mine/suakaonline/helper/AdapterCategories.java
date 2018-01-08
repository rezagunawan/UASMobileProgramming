// Adapter Untuk Kategori
// Romi Rosmawati

package com.mine.suakaonline.helper;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mine.suakaonline.R;
import com.mine.suakaonline.model.JsonCategoriesModel;
import java.util.List;

public class AdapterCategories extends BaseAdapter {

    private Context context;
    private List<JsonCategoriesModel> jsonCategoriesDataList;
    private Font font;

    public AdapterCategories(Context context, List<JsonCategoriesModel> jsonCategoriesDataList) {
        this.context = context;
        this.jsonCategoriesDataList = jsonCategoriesDataList;
    }

    @Override
    public int getCount() {
        return jsonCategoriesDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return jsonCategoriesDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.categories_row_sample_layout, null);

//            holder.categoriesDescription = (TextView) convertView.findViewById(R.id.categories_description);
            holder.categoriesName = (TextView) convertView.findViewById(R.id.categories_name);

            font  = new Font();
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        String[] color = {
                            "#F44336", "#E91E63", "#9C27B0", "#673AB7", "#3F51B5", "#2196F3", "#03A9F4",
                            "#00BCD4", "#4CAF50", "#8BC34A", "#CDDC39", "#FFEB3B", "#FFC107", "#FF9800",
                            "#FF5722", "#607D8B",
                            "#D32F2F", "#7B1FA2", "#512DA8", "#303F9F", "#1976D2", "#0288D1", "#0097A7",
                            "#388E3C", "#FBC02D", "#FFA000", "#F57C00", "#E64A19", "#FFCDD2"

        };
        int acak_warna = (int)(Math.random()*color.length);

        LinearLayout li;
        li = (LinearLayout) convertView.findViewById(R.id.list_kategori);
        li.setBackgroundColor(Color.parseColor(color[acak_warna]));

//        holder.categoriesDescription.setText(jsonCategoriesDataList.get(position).getCategoriesDescription());
        holder.categoriesName.setText(jsonCategoriesDataList.get(position).getCategoriesName());

//        font.setFont(context,holder.categoriesDescription);
//        font.setFont(context,holder.categoriesName);
            return convertView;
        }
    private class ViewHolder{
        private TextView categoriesName;
//        private TextView categoriesDescription;
    }
}