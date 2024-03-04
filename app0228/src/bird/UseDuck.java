package bird;

class UseDuck{
	public static void main(String[] args) {
		//Duck d = new Duck(); //(가)
		//Bird b=d; //(나)
		//Duck c=b; //(다)
		
		Bird k = new Bird(); //(라)
        Duck m = (Duck)k;//(마)
	}

}
