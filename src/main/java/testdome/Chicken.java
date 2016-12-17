package testdome;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

interface IBird {
	Egg Lay();
}

public class Chicken implements IBird {
	public Chicken() {
	}

	@Override
	public Egg Lay() {
		return new Egg(Chicken::new);
	}

	public static void main(String[] args) throws Exception {
		Chicken chicken = new Chicken();
		System.out.println(chicken instanceof IBird);
		Egg egg = chicken.Lay();
		IBird bird = egg.Hatch();
		System.out.println(bird instanceof Chicken);
		egg.Hatch();
	}

}

class Egg {
	private ExecutorService executor = Executors.newSingleThreadExecutor();
	private Future<IBird> future;
	private boolean hatched = false;

	public Egg(Callable<IBird> createBird) {
		future = executor.submit(createBird);
	}

	public IBird Hatch() throws Exception {
		if (!hatched) {
			hatched = true;
			return future.get();
		} else {
			throw new IllegalStateException();
		}
	}
}
