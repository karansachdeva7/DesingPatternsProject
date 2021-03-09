package creational.singleton;

public class SingletonClass {
	private static volatile SingletonClass mSingletonClass = null;
	
	private SingletonClass() {}
	
	public static SingletonClass getInstance() {
		if(mSingletonClass == null) {
			//to make thread safe
			synchronized(SingletonClass.class) {
				if(mSingletonClass == null) {
					mSingletonClass = new SingletonClass();
				}
			}
		}
		return mSingletonClass;
	}

}
