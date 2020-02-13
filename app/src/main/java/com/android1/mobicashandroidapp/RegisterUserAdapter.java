package com.android1.mobicashandroidapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class RegisterUserAdapter extends ArrayAdapter<User> {

    private Context context;
    private List<User> users;

    public RegisterUserAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<User> objects){
        super(context, resource, objects);
        this.context = context;
        this.users = objects;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_user,parent,false);

        TextView txtUserEmail = (TextView) rowView.findViewById(R.id.txtUserEmail);
        TextView txtUserName = (TextView) rowView.findViewById(R.id.txtUserName);
        TextView txtUserPhone = (TextView) rowView.findViewById(R.id.txtUserPhone);
        TextView txtUserGender = (TextView) rowView.findViewById(R.id.txtUsergender);

//        rowView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //start Activity User Form
//                Intent intent = new Intent(context, Register.class);
//                intent.putExtra("user_id", String.valueOf(users.get(pos).getId()));
//                intent.putExtra("user_name", users.get(pos).getName());
//                context.startActivity(intent);
//            }
//        });
//
//        return rowView;
        return super.getView(position, convertView, parent);
    }
}
