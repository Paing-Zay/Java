
public class Modifier {
    static void myName() {
    	System.out.println("Yangon");
    }

    static void myCity() {
    	System.out.println("paa");
    }
	public static void main(String[] args) {
//		myName();
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Modifier mainCall = new Modifier();
		mainCall.myCity();
		mainCall.myName();;
	}

}
