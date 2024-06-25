package chap06.section3;

public class KCustomerAccess {
    public static void main(String[] args){
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();
        KCustomer.Companion.login(); // 애노테이션을 사용하지 않을 때 접근 방법

        KJob kjob = KCustomer.JOB;
        System.out.println(kjob.getTitle());

        KCustomer.JOB.setTitle("Accountant");
        System.out.println(KCustomer.JOB.getTitle());
    }
}
