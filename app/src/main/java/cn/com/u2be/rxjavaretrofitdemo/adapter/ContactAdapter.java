package cn.com.u2be.rxjavaretrofitdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import cn.com.u2be.rxjavaretrofitdemo.R;
import cn.com.u2be.rxjavaretrofitdemo.entity.Contact;

/**
 * Created by alek on 2016/7/11.
 */
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private List<Contact> contactList;

    public ContactAdapter(List<Contact> contactList) {
        this.contactList = contactList;
    }


    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, null));
    }

    @Override
    public void onBindViewHolder(ContactAdapter.ViewHolder holder, int position) {
        holder.tvName.setText(contactList.get(position).getName());
        holder.tvTel.setText(contactList.get(position).getTelephone());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public void setContacts(List<Contact> contacts) {
        this.contactList = contacts;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvTel;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvTel = (TextView) itemView.findViewById(R.id.tv_tel);
        }
    }

}
