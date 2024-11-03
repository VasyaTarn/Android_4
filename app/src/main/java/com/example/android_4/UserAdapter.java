package com.example.android_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class UserAdapter extends ArrayAdapter<UserModel> {
    private LayoutInflater inflater;

    public UserAdapter(Context context, List<UserModel> users) {
        super(context, R.layout.user_item, users);
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.user_item, parent, false);
        }

        UserModel user = getItem(position);

        ImageView avatar = convertView.findViewById(R.id.avatar);
        TextView name = convertView.findViewById(R.id.name);
        TextView age = convertView.findViewById(R.id.age);
        TextView location = convertView.findViewById(R.id.location);

        avatar.setImageResource(user.getAvatarResId());
        name.setText(user.getFirstName() + " " + user.getLastName());
        age.setText("Age: " + user.getAge());
        location.setText(user.getCity() + ", " + user.getCountry());

        return convertView;
    }

}
