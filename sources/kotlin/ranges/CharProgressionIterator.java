package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class CharProgressionIterator extends CharIterator {

    /* JADX INFO: renamed from: a */
    public final int f51679a;

    /* JADX INFO: renamed from: b */
    public final int f51680b;

    /* JADX INFO: renamed from: c */
    public boolean f51681c;

    /* JADX INFO: renamed from: d */
    public int f51682d;

    public CharProgressionIterator(char c2, char c3, int i) {
        this.f51679a = i;
        this.f51680b = c3;
        boolean z2 = false;
        if (i <= 0 ? Intrinsics.m18601i(c2, c3) >= 0 : Intrinsics.m18601i(c2, c3) <= 0) {
            z2 = true;
        }
        this.f51681c = z2;
        this.f51682d = z2 ? c2 : c3;
    }

    @Override // kotlin.collections.CharIterator
    /* JADX INFO: renamed from: c */
    public final char mo18395c() {
        int i = this.f51682d;
        if (i != this.f51680b) {
            this.f51682d = this.f51679a + i;
        } else {
            if (!this.f51681c) {
                throw new NoSuchElementException();
            }
            this.f51681c = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51681c;
    }
}
