package jana_week1_homework;

public class Getmarks {

     int value;
    public Getmarks(int value) {
//        this.value = value;
        if(value < 45){
            System.out.println("Your grade is : F");
        } else if ( value<54) {
            System.out.println("Your grade is : D");
        } else if (value <64) {
            System.out.println("Your grade is : C");
        } else if (value <74) {
            System.out.println("Your grade is : B");

        }
        else{
            System.out.println("Your grade is : A");
        }
    }

//     void createGrade (){
//        if(value < 45){
//            System.out.println("Your grade is : F");
//        } else if ( value<54) {
//            System.out.println("Your grade is : D");
//        } else if (value <64) {
//            System.out.println("Your grade is : C");
//        } else if (value <74) {
//            System.out.println("Your grade is : B");
//
//        } else if (value < 100) {
//            System.out.println("Your grade is : A");
//        }
//     }
}
