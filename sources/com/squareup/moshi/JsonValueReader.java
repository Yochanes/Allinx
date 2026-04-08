package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class JsonValueReader extends JsonReader {

    /* JADX INFO: renamed from: b */
    public static final Object f43387b = new Object();

    /* JADX INFO: compiled from: Proguard */
    public static final class JsonIterator implements Iterator<Object>, Cloneable {

        /* JADX INFO: renamed from: a */
        public final JsonReader.Token f43388a;

        /* JADX INFO: renamed from: b */
        public final Object[] f43389b;

        /* JADX INFO: renamed from: c */
        public int f43390c;

        public JsonIterator(JsonReader.Token token, Object[] objArr, int i) {
            this.f43388a = token;
            this.f43389b = objArr;
            this.f43390c = i;
        }

        public final Object clone() {
            return new JsonIterator(this.f43388a, this.f43389b, this.f43390c);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f43390c < this.f43389b.length;
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i = this.f43390c;
            this.f43390c = i + 1;
            return this.f43389b[i];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Arrays.fill((Object[]) null, 0, this.f43383a, (Object) null);
        throw null;
    }
}
