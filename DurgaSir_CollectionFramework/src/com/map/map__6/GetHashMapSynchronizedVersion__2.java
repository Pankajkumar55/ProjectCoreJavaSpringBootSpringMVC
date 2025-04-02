package com.map.map__6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GetHashMapSynchronizedVersion__2 {
	public static void main(String[] args) {
//		How to get synchronized version of HashMap

		HashMap hm = new HashMap();

		Map m = Collections.synchronizedMap(hm);
//	synchronized                    non-synchronized

	}

}
