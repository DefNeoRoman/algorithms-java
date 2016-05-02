package CtCI.Ch03.StacksAndQueues.Q3_01_Three_in_One.solution;

public class FullStackException extends Exception {
	private static final long serialVersionUID = 1L;

	public FullStackException(){
        super();
    }

    public FullStackException(String message){
        super(message);
    }
}
