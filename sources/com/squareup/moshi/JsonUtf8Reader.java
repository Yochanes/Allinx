package com.squareup.moshi;

import okio.ByteString;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class JsonUtf8Reader extends JsonReader {
    static {
        ByteString.Companion companion = ByteString.f57840d;
        ByteString.Companion.m21633c("'\\");
        ByteString.Companion.m21633c("\"\\");
        ByteString.Companion.m21633c("{}[]:, \n\t\r\f/\\;#=");
        ByteString.Companion.m21633c("\n\r");
        ByteString.Companion.m21633c("*/");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    public final String toString() {
        return "JsonReader(" + ((Object) null) + ")";
    }
}
