import java.util.Scanner;

/**
 * Test
 */
public class Test {
    String user ="baebsae";//사용자
    String grade ="3학년"; //학년
    String half = "3반"; //반
    String number = "10번"; //번호
    String name = "야호";
    String sujong = "";

    /**
     * InnerTest
     */ 
    public void Viewall() { //전체조회
        System.out.println(user);
        System.out.println(grade);
        System.out.println(half);
        System.out.println(number);
        System.out.println(name);
    }
    public void correction() { //사용자 수정0
        Scanner sc = new Scanner(System.in);
        System.out.println("새로운 사용자 이름을 작성하세요.");
        sujong = sc.next();
        user = sujong;
        System.out.println(sujong);
    }
    



}