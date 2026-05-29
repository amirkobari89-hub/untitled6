import java.util.Random;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int pass = 1234;
    pass = Integer.parseInt(IO.readln("enter pass :"));


    if (pass == 1234) {
        System.out.println(" your wellcom");
    }
    else {
        System.out.println("invalid pass");
        pass = Integer.parseInt(IO.readln("enter pass :"));
        if (pass == 1234) {
            System.out.println(" your wellcom");
        } else {
            System.out.println("invalid pass");
            pass = Integer.parseInt(IO.readln("enter pass :"));
            if (pass == 1234) {
                System.out.println("your wellcom");
            } else {
                System.out.println("look id");
            }
        }
    }



}
