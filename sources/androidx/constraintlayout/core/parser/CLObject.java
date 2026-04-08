package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {

    /* JADX INFO: compiled from: Proguard */
    public static class CLObjectIterator implements Iterator<CLKey> {

        /* JADX INFO: renamed from: a */
        public CLObject f21533a;

        /* JADX INFO: renamed from: b */
        public int f21534b;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f21534b < this.f21533a.f21527f.size();
        }

        @Override // java.util.Iterator
        public final CLKey next() {
            CLKey cLKey = (CLKey) this.f21533a.f21527f.get(this.f21534b);
            this.f21534b++;
            return cLKey;
        }
    }

    /* JADX INFO: renamed from: E */
    public final CLObject m6962E() {
        return (CLObject) super.mo6944k();
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ CLElement mo6942a() {
        return m6962E();
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public final Object clone() {
        return (CLObject) super.mo6944k();
    }

    @Override // java.lang.Iterable
    public final Iterator<CLKey> iterator() {
        CLObjectIterator cLObjectIterator = new CLObjectIterator();
        cLObjectIterator.f21534b = 0;
        cLObjectIterator.f21533a = this;
        return cLObjectIterator;
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ CLContainer mo6944k() {
        return m6962E();
    }
}
