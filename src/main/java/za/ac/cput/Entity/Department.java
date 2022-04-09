package za.ac.cput.Entity;

public class Department {
    private String departmentId;
    private String departmentName;
    private int departmentSize;

    private Department(Builder builder){
        this.departmentId = builder.departmentId;
        this.departmentName = builder.departmentName;
        this.departmentSize = builder.departmentSize;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentSize() {
        return departmentSize;
    }

    public void setDepartmentSize(int departmentSize) {
        this.departmentSize = departmentSize;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentSize=" + departmentSize +
                '}';
    }

    public static class Builder {
        private String departmentId;
        private String departmentName;
        private int departmentSize;

        public Builder setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public Builder setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }

        public Builder setDepartmentSize(int departmentSize) {
            this.departmentSize = departmentSize;
            return this;
        }

        public Builder copy(Department department) {
            this.departmentId = department.departmentId;
            this.departmentName = department.departmentName;
            this.departmentSize = department.departmentSize;
            return this;
        }

        public Department build() {
            return new Department(this);
        }
    }
}
