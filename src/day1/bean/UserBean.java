package day1.bean;

public class UserBean {
//    员工信息的对应类
    private Integer id;
    private String username;
    private String password;
    private String realname;
    private String img;

    public UserBean() {
    }

    public UserBean(Integer id, String username, String password, String realname, String img) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.img = img;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", img='" + img + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
