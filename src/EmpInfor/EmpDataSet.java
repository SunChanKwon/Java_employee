package EmpInfor;

import java.util.HashMap;

public class EmpDataSet {
    public static HashMap<String, EmpVo> empList = new HashMap<String, EmpVo> ();  //객체 생성했다.


    public EmpDataSet(){

    }

    public static void basicEmpSet(){
        empList.put("홍길동",new EmpVo("1111","홍길동","010-2740-7662",5000,"2020-05-05"));
        empList.put("이순신",new EmpVo("2222","이순신","010-2740-7662",6000,"2020-05-02"));
        empList.put("강감찬",new EmpVo("3333","강감찬","010-2740-7662",5000,"2020-05-03"));
        empList.put("권길동",new EmpVo("4444","권길동","010-2740-7662",4000,"2020-05-07"));
        empList.put("박길동",new EmpVo("5555","박길동","010-2740-7662",1200,"2020-05-12"));
    }
}
