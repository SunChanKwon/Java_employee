import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import EmpInfor.EmpDataSet;
import EmpInfor.EmpVo;

public class EmpManager {
    Scanner scan = new Scanner(System.in);
    String meunTitle="메뉴[1.사원목록 전체,2.사원추가,3.사원수정,4사원삭제,5.종료]";
    int count=0;
    public EmpManager(){

    }
    public void employeeStart(){
        boolean logResult=false;
        do{ //로그인 하는 기능 구현
            String userid = inData("아이디");
            String userpwd = inData("비밀번호");
            Login log =new Login();
            logResult =log.LoginCheck(userid,userpwd);
        }while(!logResult);
       //로그인 성공하면 오는곳
        System.out.println("관리자 로그인 성공");
        EmpDataSet.basicEmpSet();
        allEmpList();
        EmpPorcessStart();
    }
    public void EmpPorcessStart()
    {
        do{
           String meun =inData(meunTitle);
           if(meun.equals("1"))//전체사원목록 보여주기
           {
               System.out.println("전체사원목록 보여주기");
               allEmpList();
           }
           else if(meun.equals("2"))//사원추가
           {
                empInster();
               System.out.println("추가된 사원목록 확인하기");
               allEmpList();
           }
           else if(meun.equals("3"))//사원수정
           {
                empUpdate();
                System.out.println("변경된 사원목록 확인하기");
               allEmpList();
           }
           else if(meun.equals("4"))//사원삭제
           {
               empDelete();
           }
           else if(meun.equals("5"))//종료
           {
               System.out.println("프로그램 종료합니다");
                System.exit(0);
           }
           else{
               System.out.println("메뉴를 잘못 입력하셧습니다");
               System.out.println("다시 입력하세요");
           }
        }while(true);
    }
    public void empDelete()
    {
        String delName = inData("수정할 사원명 입력");
        EmpDataSet.empList.remove(delName);
    }
    public void empUpdate()
    {
        String editName = inData("수정할 사원명입력");
       String editMeun =inData("수정할 필드선택[1.연락처 2.급여]");

       
        if(editMeun.equals("1"))//전화번호 수정
        {
            TelUpdata(editName);
        }
        else if(editMeun.equals("2"))//연봉 수정S
        {
           salUpadat(editName);
        }else{
            System.out.println("메뉴를 잘못 선택하셧습니다. 다시 입력하세요");
        }   
    }
    //연락처 수정
    public void TelUpdata(String username){
        String tel = inData("수정할 연락처를 입력해주세요");
        EmpVo vo=EmpDataSet.empList.get(username); //username 담겨집니다. //입력한 키값만 가져와서 값을 비교해줌
        vo.setTel(tel);
    }
    //연봉 수정
    public void  salUpadat(String username)
    {
        int sal = Integer.parseInt(inData("수정할 급여 입력"));
        EmpVo vo = EmpDataSet.empList.get(username);
        vo.setSal(sal);
    }

    //연락처 수정
    public void empInster(){
    //1명의 사원정보를 저장할 Vo객체 생성하기
        EmpVo vo = new EmpVo();

        vo.setEmpNo(inData("사원번호"));
        vo.setEmpName(inData("사원번호"));
        vo.setTel(inData("연락처"));
        do {
            boolean State = true;
            try {
                vo.setSal(Integer.parseInt(inData("급여")));
            }catch (NumberFormatException number)
            {
                State =false;
                System.out.print("급여는 숫자로만 입력해주세요");
            }
            if(State==true) break;

        }while(true);

        vo.setHireDate(inData("입사일"));
        EmpDataSet.empList.put(vo.getEmpName(),vo);
    }

    public void allEmpList()
    {
        //EmpVo.titlePrint();
        Collection<EmpVo> list =EmpDataSet.empList.values();
        Iterator<EmpVo> ii =list.iterator();

        while(ii.hasNext())
        {
            EmpVo vo = ii.next();
            vo.emPrint();
        }
    }


    //사원전체 목록 출력하기
    //콘솔에서 문자열 입력 받는 메소드
    public String inData(String msg){
        System.out.println(msg+"->");
        return scan.nextLine();
    }
}
