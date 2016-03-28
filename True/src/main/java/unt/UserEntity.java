package unt;

import javax.persistence.*;


@Entity
@Table(name = "User", schema = "", catalog = "")
public class UserEntity {
    private int id;
    private String name;
    private int age;
    private int isAdmin;
    private String createdData;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 0)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "age", nullable = false)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "isAdmin", nullable = false)
    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Basic
    @Column(name = "createdData", nullable = false, length = 0)
    public String getCreatedData() {
        return createdData;
    }

    public void setCreatedData(String createdData) {
        this.createdData = createdData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (age != that.age) return false;
        if (isAdmin != that.isAdmin) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (createdData != null ? !createdData.equals(that.createdData) : that.createdData != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + isAdmin;
        result = 31 * result + (createdData != null ? createdData.hashCode() : 0);
        return result;
    }
}
