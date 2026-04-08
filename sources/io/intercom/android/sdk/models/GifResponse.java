package io.intercom.android.sdk.models;

import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class GifResponse {
    private final List<Block> results;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
        List<Block> results;

        public GifResponse build() {
            return new GifResponse(this.results);
        }
    }

    public GifResponse(List<Block> list) {
        this.results = list;
    }

    public List<Block> results() {
        return this.results;
    }
}
