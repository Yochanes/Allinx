package io.ktor.util.collections.internal;

import io.ktor.util.collections.ConcurrentList;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/util/collections/internal/ConcurrentListSlice;", "T", "Lkotlin/collections/AbstractMutableList;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ConcurrentListSlice<T> extends AbstractMutableList<T> {

    /* JADX INFO: renamed from: a */
    public final ConcurrentList f46550a;

    /* JADX INFO: renamed from: b */
    public final int f46551b;

    /* JADX INFO: renamed from: c */
    public final int f46552c;

    public ConcurrentListSlice(ConcurrentList concurrentList, int i, int i2) {
        this.f46550a = concurrentList;
        this.f46551b = i;
        this.f46552c = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        throw new IllegalStateException("Unsupported append in ConcurrentList slice");
    }

    @Override // kotlin.collections.AbstractMutableList
    /* JADX INFO: renamed from: c */
    public final int getF51486c() {
        return Math.min(this.f46550a.size(), this.f46552c - this.f46551b);
    }

    @Override // kotlin.collections.AbstractMutableList
    /* JADX INFO: renamed from: e */
    public final Object mo4621e(int i) {
        throw new IllegalStateException("Unsupported remove in ConcurrentList slice");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f46550a.get(this.f46551b + i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f46550a.set(this.f46551b + i, obj);
    }
}
