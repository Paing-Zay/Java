class Vehical {
	protected String color = "black";
	public void hok() {
		System.out.println("khkhlk");
	}
}
 class Car extends Vehical {
	private String name = "hight";
	public static void main(String[] args) {
		Car myCarName = new Car();
		myCarName.hok();

		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println(myCarName.color +"---"+ myCarName.name);

	}

}
