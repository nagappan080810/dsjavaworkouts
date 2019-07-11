package com.nagappans.dsalgolab;

import org.junit.Test;

import static org.junit.Assert.*;

public class LruCacheTest {

    @Test
    public void testLruCache() {
        LruCache<String, Integer> lruCache = new LruCache();
        lruCache.put("nagappans", 50);
        assertTrue(lruCache.get("nagappans")==50);
        assertNull(lruCache.get("unknown"));
        lruCache.put("murugan", 60);
        lruCache.put("rajesh", 70);
        lruCache.put("kabilan", 80);
        assertNull(lruCache.get("nagappans"));
    }
}
