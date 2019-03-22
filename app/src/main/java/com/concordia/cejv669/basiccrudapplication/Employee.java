package com.concordia.cejv669.basiccrudapplication;

public class Employee {
    public static final String TABLE_NAME = "employee";

    public static final String COLUMN_ID = "emp_id";
    public static final String COLUMN_FIRSTNAME = "first_name";
    public static final String COLUMN_LASTNAME = "last_name";
    public static final String COLUMN_INSURED = "insured";

    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_ID + " INTEGER," +
                    COLUMN_FIRSTNAME + " TEXT," +
                    COLUMN_LASTNAME + " TEXT," +
                    COLUMN_INSURED + " INTEGER)";

    private Integer id;
    private String firstName;
    private String lastName;
    private boolean isInsured;

    public Employee() {
    }

    public Employee(Integer id, String firstName, String lastName, boolean isInsured) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInsured = isInsured;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isInsured() {
        return isInsured;
    }

    public void setInsured(boolean insured) {
        isInsured = insured;
    }
}
