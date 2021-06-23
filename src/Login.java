public class Login {
    private final String USERID ="1";
    private final String USERPWD ="1";

    public Login(){

    }
    //로그인 체크 구현하기 (true:로그인 성공, false 로그인 실패)
    public boolean LoginCheck(String userid,String userpwd)
    {
        if(userid.equals(USERID) && userpwd.equals(userpwd))
        {
            return true;
        }
        else
        {
            return false;
        }
//        if(this.USERID ==USERID && this.USERPWD==USERPWD)
//        {
//            return true;
//        }
//        else {
//            return false;
//        }
    }
}
