package cn.com.u2be.rxjavaretrofitdemo.entity;

/**
 * Created by alek on 2016/7/11.
 */
public class Contact {
    //{"id":2,"contact":null,"email":"songjiang@163.com","name":"宋江","remark":null,"telephone":"18665946362"}


    private int id;
    private String contact, name, email, remark, telephone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
