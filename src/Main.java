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



/*
    int save = 100_000;
    IO.println(" منوی بانک :");
    IO.println("۱ . مشاهده موجودی");
    IO.println("۲.برداشت پول");
    IO.println("۳.واریز پول");
    IO.println("۴.خروج");
    int input = Integer.parseInt(IO.readln("گزینه انتخاب کنید :"));
    int variz, bardasht;
    if (input == 1) {
        System.out.println(save);
    } else if (input == 2) {
        bardasht = Integer.parseInt(IO.readln("مقدار برداش را وارد کنید :"));
        if (bardasht > save) {
            System.out.println("عدم موجودی ");
        }
        else {

            save -= bardasht;
            System.out.println("موجودی حساب : " + save);
        }
    }
    else if (input == 3) {
        variz = Integer.parseInt(IO.readln("مقدار واریز را وارد کنید :"));
        save += variz;
        System.out.println("موجودی حساب : " + save);
    } else if (input == 4) {
        System.out.println("خروج از برنامه");

    }
    else {
        System.out.println("مقدار نا معتبر");
    }
*/




    /*boolean tak;۷

    int alan = Integer.parseInt(IO.readln("tabaghe kononi"));
    int boro = Integer.parseInt(IO.readln("tabaghe more nazar ra vared kon"));

    if (tak = false) {

        if (boro == 1) {
            IO.println("tabaghe 1");
        } else if (boro == 2) {
            IO.readln("tabaghe 2");
        } else if (boro == 3) {
            IO.readln("tabaghe 3");
        } else if (boro == 4) {
            ;
            IO.readln("tabaghe 4");
        } else if (boro == 5) {
            IO.readln("tabaghe 5");
        } else {
            IO.readln("na motabar");
            IO.readln("tabaghe khare az mahdodeh");
        }
    } else  {
        System.out.println("fuk");
    }*/





    /*int in = Integer.parseInt(IO.readln("meghdar masraf vared kon = " ));
    int sum = 0;


    if (in > 0 && in < 20) {
        sum = (in * 500);
        IO.println("hazineh = " + sum);
        IO.println("moshtarak kam masraf");
    }
    else if (in >= 10 && in <= 40  ) {
        sum =(in * 700);
        IO.println("hazineh =" + sum);
        IO.println("moshtara motevaset");
    }
    else  {
        sum = (in * 1000 );
        IO.println("hazineh =" + sum );
        IO.println("moshtarak por masraf");
    }
    */
}
