
public class Engine<T> implements Car<T>{
    private T value;
     public void carr(T value) {
          this.value = value;
     }
	@Override
	public void start() {
		System.out.println(value);

	}
	@Override
	public void stop() {
		System.out.println(value);

	}

}
