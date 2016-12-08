package com.RNFetchBlob;

import java.io.File;

/**
 * Created by raymond on 8/12/2016.
 */

public interface RNFetchLocalFileCacheProvider {
    /**
     * Determine if file already exist
     * @param url
     * @return
     */
    File getLocalFileCache(String url);
}
