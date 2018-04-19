package com.alex.tools;

import java.util.UUID;

/**
 * Created by Shishkov A.V. on 19.04.18.
 */
public final class Helper {
	public static String normalizeUuid(UUID id) {
		return id.toString().toUpperCase().replace("-", "");
	}
}
