package EmpInfor;

public class EmpVo {
    private String empNo;//사원번호
    private String empName;//사원명
    private String tel;    // 연락처
    private int    sal;   //연봉
    private String hireDate;//입사일

    public EmpVo() {

    }
    public EmpVo(String empNo, String empName, String tel, int sal, String hireDate)
    {
        this.empNo=empNo;
        this.empName=empName;
        this.tel=tel;
        this.sal=sal;
        this.hireDate=hireDate;
    }
//이름



    public void emPrint(){
        System.out.printf("%5s %10s %20s %10d %10s\n",empNo,empName,tel,sal,hireDate);

    }
    public static void titlePrint(){
        System.out.printf("%-10s %-10s %-20s %-15s %10s\n","사원번호","사원명","연락처","급여","입사일");
        System.out.println("-----------------------------------------------------------------------------");
    }

    public String getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public String getTel() {
        return tel;
    }

    public int getSal() {
        return sal;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
