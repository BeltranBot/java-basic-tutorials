public class Test {

	public void run() throws ServerException {
		// Some kind of return value from complex process!
		int code = 1;

		if (code != 0) {
			// something's wrong!
			// throw new IOException("Could not connect to server");
			throw new ServerException("Could not connect to server");

		}

		System.out.println("Running Successfully");
	}

}
