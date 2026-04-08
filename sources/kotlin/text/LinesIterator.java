package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/text/LinesIterator;", "", "", "State", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class LinesIterator implements Iterator<String>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final String f55189a;

    /* JADX INFO: renamed from: b */
    public int f55190b;

    /* JADX INFO: renamed from: c */
    public int f55191c;

    /* JADX INFO: renamed from: d */
    public int f55192d;

    /* JADX INFO: renamed from: f */
    public int f55193f;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m18302d2 = {"Lkotlin/text/LinesIterator$State;", "", "", "UNKNOWN", "I", "HAS_NEXT", "EXHAUSTED", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class State {
    }

    public LinesIterator(String string) {
        Intrinsics.m18599g(string, "string");
        this.f55189a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f55190b;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f55193f < 0) {
            this.f55190b = 2;
            return false;
        }
        String str = this.f55189a;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.f55191c; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f55190b = 1;
                this.f55193f = i;
                this.f55192d = length;
                return true;
            }
        }
        i = -1;
        this.f55190b = 1;
        this.f55193f = i;
        this.f55192d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f55190b = 0;
        int i = this.f55192d;
        int i2 = this.f55191c;
        this.f55191c = this.f55193f + i;
        return this.f55189a.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
