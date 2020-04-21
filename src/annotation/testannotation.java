package annotation;


@myannotation
@mysimpleannotation("bbb")
public class testannotation {
    
    @mysimpleannotation(value = "aaa")
    @myannotation(studentAge = 20,studentName = "jiajia")
    public void test(){

    }
}
