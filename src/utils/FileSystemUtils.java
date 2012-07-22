package utils;

import java.io.File;

public final class FileSystemUtils {

	private FileSystemUtils() {
	}

	public static final String getCanonicalPath(final String path) {
		final File file = new File(path);
		try {
			return file.getCanonicalPath();
		} catch (final Exception exc) {
			throw new RuntimeException(exc);
		}
	}

	public static final String runCommand(final String command, final String path) {
		return "master";
	}

}
