package net.imknown.bettertextclockbackportlibrary;

public class DateFormatCompat {

    /**
     * @deprecated Use a literal {@code '} instead.
     * @removed
     */
    @Deprecated
    public  static final char    QUOTE                  =    '\'';

    /**
     * @deprecated Use a literal {@code 's'} instead.
     * @removed
     */
    @Deprecated
    public  static final char    SECONDS                =    's';

	/**
	 * Indicates whether the specified format string contains seconds.
	 *
	 * Always returns false if the input format is null.
	 *
	 * @param inFormat
	 *            the format string, as described in {@link android.text.format.DateFormat}
	 *
	 * @return true if the format string contains {@link #SECONDS}, false otherwise
	 *
	 * @hide
	 */
	public static boolean hasSeconds(CharSequence inFormat) {
		return hasDesignator(inFormat, SECONDS);
	}

	/**
	 * Test if a format string contains the given designator. Always returns {@code false} if the input format is {@code null}.
	 *
	 * @hide
	 */
	public static boolean hasDesignator(CharSequence inFormat, char designator) {
		if (inFormat == null)
			return false;

		final int length = inFormat.length();

		int c;
		int count;

		for (int i = 0; i < length; i += count) {
			count = 1;
			c = inFormat.charAt(i);

			if (c == QUOTE) {
				count = skipQuotedText(inFormat, i, length);
			} else if (c == designator) {
				return true;
			}
		}

		return false;
	}

	private static int skipQuotedText(CharSequence s, int i, int len) {
		if (i + 1 < len && s.charAt(i + 1) == QUOTE) {
			return 2;
		}

		int count = 1;
		// skip leading quote
		i++;

		while (i < len) {
			char c = s.charAt(i);

			if (c == QUOTE) {
				count++;
				// QUOTEQUOTE -> QUOTE
				if (i + 1 < len && s.charAt(i + 1) == QUOTE) {
					i++;
				} else {
					break;
				}
			} else {
				i++;
				count++;
			}
		}

		return count;
	}
}
